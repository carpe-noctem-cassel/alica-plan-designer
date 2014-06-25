package de.uni_kassel.vs.cn.planDesigner.ui.actions;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import de.uni_kassel.vs.cn.planDesigner.alica.AlicaFactory;
import de.uni_kassel.vs.cn.planDesigner.alica.util.AlicaSerializationHelper;
import de.uni_kassel.vs.cn.planDesigner.ui.edit.PMLTransactionalEditingDomain;
//import de.uni_kassel.vs.cn.planDesigner.ui.util.RoleDefinitionDialog;
import de.uni_kassel.vs.cn.planDesigner.ui.util.CapabilityDefinitionDialog;
import de.uni_kassel.vs.cn.planDesigner.ui.util.CommonUtils;
import de.uni_kassel.vs.cn.planDesigner.ui.util.PlanDesignerConstants;

public class CapabilityDefinitionAction implements IWorkbenchWindowActionDelegate {
	
	//private ISelection selection;
	
	private IWorkbenchWindow window;

	public void dispose() {
		
	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

	public void run(IAction action) {
		
		
		// Try to open the CapabilityDefinitionSetFile
		IPath path = CommonUtils.getCapabilityDefinitionPath();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IFile capabilityDefFile = root.getFile(path);
		
		PMLTransactionalEditingDomain domain = (PMLTransactionalEditingDomain)TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain(
				PlanDesignerConstants.PML_TRANSACTIONAL_EDITING_DOMAIN_ID);
		
		ResourceSet rSet = domain.getResourceSet();
		final Resource resource;
		
		if(!capabilityDefFile.exists()){
			if(!createCapabilityDefinitionFile(capabilityDefFile))
				return;
			else{
				resource = rSet.createResource(URI.createPlatformResourceURI(path.toString(),
						true));
				domain.getCommandStack().execute(new RecordingCommand(domain){
					@Override
					protected void doExecute() {
						// Add a new CapabilityDefinitionSet
						resource.getContents().add(AlicaFactory.eINSTANCE.createCapabilityDefinitionSet());						
					}
				});

			}
		}else
			resource = rSet.getResource(URI.createPlatformResourceURI(path.toString(),
					true), true);
		
		CapabilityDefinitionDialog cdDialog = new CapabilityDefinitionDialog(window, domain);
		cdDialog.create();
		cdDialog.setInput(resource);
		if(cdDialog.open() == Window.OK){
			try {
				resource.save(AlicaSerializationHelper.getInstance().getLoadSaveOptions());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		resource.eAdapters().clear();
		rSet.getResources().remove(resource);
		rSet = null;
	}

	public void selectionChanged(IAction action, ISelection selection) {
		//this.selection = selection;
	}

	private boolean createCapabilityDefinitionFile(final IFile path){
		RunnableWithResult<Boolean> run = new RunnableWithResult.Impl<Boolean>(){
			public void run() {
				setResult(MessageDialog.openQuestion(window.getShell(), "File not found", "The capability definition file could not be found in\n\n" +
						"\t"+path.toString()+"\n\nShould a new file be created?"));
			}
		};
		
		window.getShell().getDisplay().syncExec(run);
		return run.getResult();
	}
}
