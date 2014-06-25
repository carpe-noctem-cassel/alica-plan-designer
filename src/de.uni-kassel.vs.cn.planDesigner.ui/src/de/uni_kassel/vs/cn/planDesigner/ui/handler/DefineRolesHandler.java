package de.uni_kassel.vs.cn.planDesigner.ui.handler;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.uni_kassel.vs.cn.planDesigner.alica.AlicaFactory;
import de.uni_kassel.vs.cn.planDesigner.alica.util.AlicaSerializationHelper;
import de.uni_kassel.vs.cn.planDesigner.ui.edit.PMLTransactionalEditingDomain;
import de.uni_kassel.vs.cn.planDesigner.ui.util.CommonUtils;
import de.uni_kassel.vs.cn.planDesigner.ui.util.PlanDesignerConstants;
import de.uni_kassel.vs.cn.planDesigner.ui.util.RoleDefinitionDialog;

public class DefineRolesHandler extends AbstractHandler {
	IWorkbenchWindow activeWorkbenchWindow;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// Try to open the RoleDefinitionSetFile
		IPath path = CommonUtils.getRoleDefinitionPath();
		IPath caPath = CommonUtils.getCapabilityDefinitionPath();
		activeWorkbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IFile roleDefFile = root.getFile(path);

		PMLTransactionalEditingDomain domain = (PMLTransactionalEditingDomain) TransactionalEditingDomain.Registry.INSTANCE
				.getEditingDomain(PlanDesignerConstants.PML_TRANSACTIONAL_EDITING_DOMAIN_ID);

		ResourceSet rSet = domain.getResourceSet();
		final Resource resRole;

		if (!roleDefFile.exists()) {
			if (!createRoleDefinitionFile(roleDefFile))
				return null;
			else {
				resRole = rSet.createResource(URI.createPlatformResourceURI(
						path.toString(), true));
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						// Add a new RoleDefinitionSet
						resRole.getContents().add(
								AlicaFactory.eINSTANCE
										.createRoleDefinitionSet());

					}
				});

			}
		} else {
			resRole = rSet.getResource(
					URI.createPlatformResourceURI(path.toString(), true), true);

		}
		final Resource resCap;
		IFile caDefFile = root.getFile(caPath);
		if (!caDefFile.exists()) {
			if (!createCapabilityDefinitionFile(caDefFile))
				return null;
			else {
				resCap = rSet.createResource(URI.createPlatformResourceURI(
						caDefFile.toString(), true));
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					@Override
					protected void doExecute() {
						// Add a new CapabilityDefinitionSet
						resCap.getContents().add(
								AlicaFactory.eINSTANCE
										.createCapabilityDefinitionSet());

					}
				});

			}
		} else {
			resCap = rSet.getResource(
					URI.createPlatformResourceURI(caPath.toString(), true),
					true);
		}
		// = rSet.getResource(URI.createPlatformResourceURI(caPath.toString(),
		// true), true);
		RoleDefinitionDialog rdDialog = new RoleDefinitionDialog(activeWorkbenchWindow, domain);
		rdDialog.create();
		rdDialog.setInput(resRole, resCap);
		if (rdDialog.open() == Window.OK) {
			try {
				resRole.save(AlicaSerializationHelper.getInstance()
						.getLoadSaveOptions());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		resRole.eAdapters().clear();
		rSet.getResources().remove(resRole);
		rSet = null;
		return null;
	}

	private boolean createRoleDefinitionFile(final IFile path) {
		RunnableWithResult<Boolean> run = new RunnableWithResult.Impl<Boolean>() {
			public void run() {
				setResult(MessageDialog.openQuestion(activeWorkbenchWindow.getShell(),
						"File not found",
						"The role definition file could not be found in\n\n"
								+ "\t" + path.toString()
								+ "\n\nShould a new file be created?"));
			}
		};

		activeWorkbenchWindow.getShell().getDisplay().syncExec(run);
		return run.getResult();
	}

	private boolean createCapabilityDefinitionFile(final IFile path) {
		RunnableWithResult<Boolean> run = new RunnableWithResult.Impl<Boolean>() {
			public void run() {
				setResult(MessageDialog.openQuestion(activeWorkbenchWindow.getShell(),
						"File not found",
						"The capability definition file could not be found in\n\n"
								+ "\t" + path.toString()
								+ "\n\nShould a new file be created?"));
			}
		};

		activeWorkbenchWindow.getShell().getDisplay().syncExec(run);
		return run.getResult();
	}

}
