/**
 */
package de.uni_kassel.vs.cn.planDesigner.alica.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.uni_kassel.vs.cn.planDesigner.alica.AbstractPlan;
import de.uni_kassel.vs.cn.planDesigner.alica.AlicaFactory;
import de.uni_kassel.vs.cn.planDesigner.alica.AlicaPackage;
import de.uni_kassel.vs.cn.planDesigner.alica.AnnotatedPlan;
import de.uni_kassel.vs.cn.planDesigner.alica.Behaviour;
import de.uni_kassel.vs.cn.planDesigner.alica.BehaviourConfiguration;
import de.uni_kassel.vs.cn.planDesigner.alica.BehaviourCreator;
import de.uni_kassel.vs.cn.planDesigner.alica.CapValue;
import de.uni_kassel.vs.cn.planDesigner.alica.Capability;
import de.uni_kassel.vs.cn.planDesigner.alica.CapabilityDefinitionSet;
import de.uni_kassel.vs.cn.planDesigner.alica.Characteristic;
import de.uni_kassel.vs.cn.planDesigner.alica.Condition;
import de.uni_kassel.vs.cn.planDesigner.alica.ConditionCreator;
import de.uni_kassel.vs.cn.planDesigner.alica.Constant;
import de.uni_kassel.vs.cn.planDesigner.alica.ConstraintCreator;
import de.uni_kassel.vs.cn.planDesigner.alica.DomainDescription;
import de.uni_kassel.vs.cn.planDesigner.alica.Edge;
import de.uni_kassel.vs.cn.planDesigner.alica.EntryPoint;
import de.uni_kassel.vs.cn.planDesigner.alica.FailureState;
import de.uni_kassel.vs.cn.planDesigner.alica.Fluent;
import de.uni_kassel.vs.cn.planDesigner.alica.FluentParameters;
import de.uni_kassel.vs.cn.planDesigner.alica.ForallAgents;
import de.uni_kassel.vs.cn.planDesigner.alica.IInhabitable;
import de.uni_kassel.vs.cn.planDesigner.alica.InternalRoleTaskMapping;
import de.uni_kassel.vs.cn.planDesigner.alica.Node;
import de.uni_kassel.vs.cn.planDesigner.alica.Parametrisation;
import de.uni_kassel.vs.cn.planDesigner.alica.Plan;
import de.uni_kassel.vs.cn.planDesigner.alica.PlanElement;
import de.uni_kassel.vs.cn.planDesigner.alica.PlanType;
import de.uni_kassel.vs.cn.planDesigner.alica.Planner;
import de.uni_kassel.vs.cn.planDesigner.alica.Planners;
import de.uni_kassel.vs.cn.planDesigner.alica.PlanningProblem;
import de.uni_kassel.vs.cn.planDesigner.alica.PlanningType;
import de.uni_kassel.vs.cn.planDesigner.alica.PostCondition;
import de.uni_kassel.vs.cn.planDesigner.alica.PreCondition;
import de.uni_kassel.vs.cn.planDesigner.alica.Quantifier;
import de.uni_kassel.vs.cn.planDesigner.alica.Rating;
import de.uni_kassel.vs.cn.planDesigner.alica.Role;
import de.uni_kassel.vs.cn.planDesigner.alica.RoleDefinitionSet;
import de.uni_kassel.vs.cn.planDesigner.alica.RoleSet;
import de.uni_kassel.vs.cn.planDesigner.alica.RoleTaskMapping;
import de.uni_kassel.vs.cn.planDesigner.alica.RuntimeCondition;
import de.uni_kassel.vs.cn.planDesigner.alica.State;
import de.uni_kassel.vs.cn.planDesigner.alica.SuccessState;
import de.uni_kassel.vs.cn.planDesigner.alica.Synchronisation;
import de.uni_kassel.vs.cn.planDesigner.alica.Task;
import de.uni_kassel.vs.cn.planDesigner.alica.TaskGraph;
import de.uni_kassel.vs.cn.planDesigner.alica.TaskRepository;
import de.uni_kassel.vs.cn.planDesigner.alica.TaskWrapper;
import de.uni_kassel.vs.cn.planDesigner.alica.TerminalState;
import de.uni_kassel.vs.cn.planDesigner.alica.Transition;
import de.uni_kassel.vs.cn.planDesigner.alica.UtilityFunctionCreator;
import de.uni_kassel.vs.cn.planDesigner.alica.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlicaPackageImpl extends EPackageImpl implements AlicaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStringToEStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviourConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eLongToDoubleMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleDefinitionSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTaskMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalRoleTaskMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametrisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotatedPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forallAgentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iInhabitableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityDefinitionSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planningProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fluentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plannersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStringToEObjectMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fluentParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviourCreatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionCreatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilityFunctionCreatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintCreatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planningTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.uni_kassel.vs.cn.planDesigner.alica.AlicaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AlicaPackageImpl() {
		super(eNS_URI, AlicaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AlicaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AlicaPackage init() {
		if (isInited) return (AlicaPackage)EPackage.Registry.INSTANCE.getEPackage(AlicaPackage.eNS_URI);

		// Obtain or create and register package
		AlicaPackageImpl theAlicaPackage = (AlicaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AlicaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AlicaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAlicaPackage.createPackageContents();

		// Initialize created meta-data
		theAlicaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAlicaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AlicaPackage.eNS_URI, theAlicaPackage);
		return theAlicaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Msg() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_PreCondition() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_InState() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_OutState() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Synchronisation() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_ConditionString() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_AbstractPlan() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Vars() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Quantifiers() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_PluginName() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Parameters() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCondition__EnsureVariableConsistency__AbstractPlan() {
		return conditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreCondition() {
		return preConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreCondition_Enabled() {
		return (EAttribute)preConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPoint() {
		return entryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryPoint_Task() {
		return (EReference)entryPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryPoint_SuccessRequired() {
		return (EAttribute)entryPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryPoint_State() {
		return (EReference)entryPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryPoint_MinCardinality() {
		return (EAttribute)entryPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryPoint_MaxCardinality() {
		return (EAttribute)entryPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryPoint_Plan() {
		return (EReference)entryPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminalState() {
		return terminalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminalState_PostCondition() {
		return (EReference)terminalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuccessState() {
		return successStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailureState() {
		return failureStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPlan() {
		return abstractPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPlan_Rating() {
		return (EReference)abstractPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPlan_Conditions() {
		return (EReference)abstractPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPlan_MasterPlan() {
		return (EAttribute)abstractPlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPlan_UtilityFunction() {
		return (EAttribute)abstractPlanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPlan_UtilityThreshold() {
		return (EAttribute)abstractPlanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPlan_Vars() {
		return (EReference)abstractPlanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPlan_DestinationPath() {
		return (EAttribute)abstractPlanEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviour() {
		return behaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviour_Configurations() {
		return (EReference)behaviourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviour_DestinationPath() {
		return (EAttribute)behaviourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Plans() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_InPlan() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Parametrisation() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_InTransitions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_OutTransitions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_EntryPoint() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__EnsureParametrisationConsistency() {
		return stateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlan() {
		return planEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlan_Priority() {
		return (EAttribute)planEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlan_States() {
		return (EReference)planEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlan_Transitions() {
		return (EReference)planEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlan_MinCardinality() {
		return (EAttribute)planEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlan_MaxCardinality() {
		return (EAttribute)planEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlan_Synchronisations() {
		return (EReference)planEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlan_EntryPoints() {
		return (EReference)planEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlan__CalculateCardinalities() {
		return planEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlan__EnsureParametrisationConsistency() {
		return planEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanType() {
		return planTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanType_Parametrisation() {
		return (EReference)planTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanType_Plans() {
		return (EReference)planTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlanType__EnsureParametrisationConsistency() {
		return planTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRating() {
		return ratingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostCondition() {
		return postConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeCondition() {
		return runtimeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanElement() {
		return planElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanElement_Id() {
		return (EAttribute)planElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanElement_Name() {
		return (EAttribute)planElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanElement_Comment() {
		return (EAttribute)planElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlanElement__GenerateID() {
		return planElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Description() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStringToEStringMapEntry() {
		return eStringToEStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToEStringMapEntry_Key() {
		return (EAttribute)eStringToEStringMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToEStringMapEntry_Value() {
		return (EAttribute)eStringToEStringMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviourConfiguration() {
		return behaviourConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviourConfiguration_Parameters() {
		return (EReference)behaviourConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviourConfiguration_Deferring() {
		return (EAttribute)behaviourConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviourConfiguration_Frequency() {
		return (EAttribute)behaviourConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviourConfiguration_Behaviour() {
		return (EReference)behaviourConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviourConfiguration_EventDriven() {
		return (EAttribute)behaviourConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Characteristics() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSet() {
		return roleSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleSet_UsableWithPlanID() {
		return (EAttribute)roleSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleSet_Default() {
		return (EAttribute)roleSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleSet_Mappings() {
		return (EReference)roleSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELongToDoubleMapEntry() {
		return eLongToDoubleMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELongToDoubleMapEntry_Key() {
		return (EAttribute)eLongToDoubleMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELongToDoubleMapEntry_Value() {
		return (EAttribute)eLongToDoubleMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleDefinitionSet() {
		return roleDefinitionSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleDefinitionSet_Roles() {
		return (EReference)roleDefinitionSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleTaskMapping() {
		return roleTaskMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleTaskMapping_TaskPriorities() {
		return (EReference)roleTaskMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleTaskMapping_Role() {
		return (EReference)roleTaskMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristic() {
		return characteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristic_Weight() {
		return (EAttribute)characteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristic_Capability() {
		return (EReference)characteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacteristic_Value() {
		return (EReference)characteristicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskGraph() {
		return taskGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskGraph_Nodes() {
		return (EReference)taskGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskGraph_Edges() {
		return (EReference)taskGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_From() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_To() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskWrapper() {
		return taskWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskWrapper_Task() {
		return (EReference)taskWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskWrapper_Mappings() {
		return (EReference)taskWrapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalRoleTaskMapping() {
		return internalRoleTaskMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalRoleTaskMapping_Role() {
		return (EReference)internalRoleTaskMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalRoleTaskMapping_Priority() {
		return (EAttribute)internalRoleTaskMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_InEdge() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_OutEdge() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskRepository() {
		return taskRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRepository_Tasks() {
		return (EReference)taskRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRepository_DefaultTask() {
		return (EReference)taskRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTaskRepository__CreateDefaultTask() {
		return taskRepositoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronisation() {
		return synchronisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronisation_SynchedTransitions() {
		return (EReference)synchronisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronisation_TalkTimeout() {
		return (EAttribute)synchronisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronisation_SyncTimeout() {
		return (EAttribute)synchronisationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronisation_FailOnSyncTimeOut() {
		return (EAttribute)synchronisationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametrisation() {
		return parametrisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametrisation_Subplan() {
		return (EReference)parametrisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametrisation_Subvar() {
		return (EReference)parametrisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametrisation_Var() {
		return (EReference)parametrisationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotatedPlan() {
		return annotatedPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotatedPlan_Plan() {
		return (EReference)annotatedPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotatedPlan_Activated() {
		return (EAttribute)annotatedPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantifier() {
		return quantifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifier_Scope() {
		return (EReference)quantifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantifier_Sorts() {
		return (EAttribute)quantifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForallAgents() {
		return forallAgentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIInhabitable() {
		return iInhabitableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_CapValues() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapValue() {
		return capValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityDefinitionSet() {
		return capabilityDefinitionSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityDefinitionSet_Capabilities() {
		return (EReference)capabilityDefinitionSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanningProblem() {
		return planningProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanningProblem_Plans() {
		return (EReference)planningProblemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanningProblem_Planner() {
		return (EReference)planningProblemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanningProblem_AlternativePlan() {
		return (EReference)planningProblemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanningProblem_WaitPlan() {
		return (EReference)planningProblemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanningProblem_UpdateRate() {
		return (EAttribute)planningProblemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanningProblem_DistributeProblem() {
		return (EAttribute)planningProblemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanningProblem_PlanningType() {
		return (EAttribute)planningProblemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanningProblem_Requirements() {
		return (EAttribute)planningProblemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanningProblem_PlannerParams() {
		return (EAttribute)planningProblemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanner() {
		return plannerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanner_Type() {
		return (EAttribute)plannerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanner_Name() {
		return (EAttribute)plannerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanner_Parameters() {
		return (EAttribute)plannerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanner_Command() {
		return (EAttribute)plannerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFluent() {
		return fluentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFluent_Name() {
		return (EAttribute)fluentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFluent_Formula() {
		return (EReference)fluentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainDescription() {
		return domainDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainDescription_Fluents() {
		return (EReference)domainDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainDescription_Constants() {
		return (EReference)domainDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainDescription_Types() {
		return (EAttribute)domainDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainDescription_Name() {
		return (EAttribute)domainDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanners() {
		return plannersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanners_Planners() {
		return (EReference)plannersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanners_Name() {
		return (EAttribute)plannersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStringToEObjectMapEntry() {
		return eStringToEObjectMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToEObjectMapEntry_Key() {
		return (EAttribute)eStringToEObjectMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToEObjectMapEntry_Value() {
		return (EAttribute)eStringToEObjectMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFluentParameters() {
		return fluentParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFluentParameters_Parameter() {
		return (EAttribute)fluentParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFluentParameters_Type() {
		return (EAttribute)fluentParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_Name() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_Type() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviourCreator() {
		return behaviourCreatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviourCreator_Behaviours() {
		return (EReference)behaviourCreatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionCreator() {
		return conditionCreatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionCreator_Conditions() {
		return (EReference)conditionCreatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionCreator_Plans() {
		return (EReference)conditionCreatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtilityFunctionCreator() {
		return utilityFunctionCreatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtilityFunctionCreator_Conditions() {
		return (EReference)utilityFunctionCreatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtilityFunctionCreator_Plans() {
		return (EReference)utilityFunctionCreatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintCreator() {
		return constraintCreatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintCreator_Conditions() {
		return (EReference)constraintCreatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintCreator_Plans() {
		return (EReference)constraintCreatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanningType() {
		return planningTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlicaFactory getAlicaFactory() {
		return (AlicaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__MSG);
		createEReference(transitionEClass, TRANSITION__PRE_CONDITION);
		createEReference(transitionEClass, TRANSITION__IN_STATE);
		createEReference(transitionEClass, TRANSITION__OUT_STATE);
		createEReference(transitionEClass, TRANSITION__SYNCHRONISATION);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__CONDITION_STRING);
		createEReference(conditionEClass, CONDITION__ABSTRACT_PLAN);
		createEReference(conditionEClass, CONDITION__VARS);
		createEReference(conditionEClass, CONDITION__QUANTIFIERS);
		createEAttribute(conditionEClass, CONDITION__PLUGIN_NAME);
		createEReference(conditionEClass, CONDITION__PARAMETERS);
		createEOperation(conditionEClass, CONDITION___ENSURE_VARIABLE_CONSISTENCY__ABSTRACTPLAN);

		preConditionEClass = createEClass(PRE_CONDITION);
		createEAttribute(preConditionEClass, PRE_CONDITION__ENABLED);

		entryPointEClass = createEClass(ENTRY_POINT);
		createEReference(entryPointEClass, ENTRY_POINT__TASK);
		createEAttribute(entryPointEClass, ENTRY_POINT__SUCCESS_REQUIRED);
		createEReference(entryPointEClass, ENTRY_POINT__STATE);
		createEAttribute(entryPointEClass, ENTRY_POINT__MIN_CARDINALITY);
		createEAttribute(entryPointEClass, ENTRY_POINT__MAX_CARDINALITY);
		createEReference(entryPointEClass, ENTRY_POINT__PLAN);

		terminalStateEClass = createEClass(TERMINAL_STATE);
		createEReference(terminalStateEClass, TERMINAL_STATE__POST_CONDITION);

		successStateEClass = createEClass(SUCCESS_STATE);

		failureStateEClass = createEClass(FAILURE_STATE);

		abstractPlanEClass = createEClass(ABSTRACT_PLAN);
		createEReference(abstractPlanEClass, ABSTRACT_PLAN__RATING);
		createEReference(abstractPlanEClass, ABSTRACT_PLAN__CONDITIONS);
		createEAttribute(abstractPlanEClass, ABSTRACT_PLAN__MASTER_PLAN);
		createEAttribute(abstractPlanEClass, ABSTRACT_PLAN__UTILITY_FUNCTION);
		createEAttribute(abstractPlanEClass, ABSTRACT_PLAN__UTILITY_THRESHOLD);
		createEReference(abstractPlanEClass, ABSTRACT_PLAN__VARS);
		createEAttribute(abstractPlanEClass, ABSTRACT_PLAN__DESTINATION_PATH);

		behaviourEClass = createEClass(BEHAVIOUR);
		createEReference(behaviourEClass, BEHAVIOUR__CONFIGURATIONS);
		createEAttribute(behaviourEClass, BEHAVIOUR__DESTINATION_PATH);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__PLANS);
		createEReference(stateEClass, STATE__IN_PLAN);
		createEReference(stateEClass, STATE__PARAMETRISATION);
		createEReference(stateEClass, STATE__IN_TRANSITIONS);
		createEReference(stateEClass, STATE__OUT_TRANSITIONS);
		createEReference(stateEClass, STATE__ENTRY_POINT);
		createEOperation(stateEClass, STATE___ENSURE_PARAMETRISATION_CONSISTENCY);

		planEClass = createEClass(PLAN);
		createEAttribute(planEClass, PLAN__PRIORITY);
		createEReference(planEClass, PLAN__STATES);
		createEReference(planEClass, PLAN__TRANSITIONS);
		createEAttribute(planEClass, PLAN__MIN_CARDINALITY);
		createEAttribute(planEClass, PLAN__MAX_CARDINALITY);
		createEReference(planEClass, PLAN__SYNCHRONISATIONS);
		createEReference(planEClass, PLAN__ENTRY_POINTS);
		createEOperation(planEClass, PLAN___CALCULATE_CARDINALITIES);
		createEOperation(planEClass, PLAN___ENSURE_PARAMETRISATION_CONSISTENCY);

		planTypeEClass = createEClass(PLAN_TYPE);
		createEReference(planTypeEClass, PLAN_TYPE__PARAMETRISATION);
		createEReference(planTypeEClass, PLAN_TYPE__PLANS);
		createEOperation(planTypeEClass, PLAN_TYPE___ENSURE_PARAMETRISATION_CONSISTENCY);

		ratingEClass = createEClass(RATING);

		postConditionEClass = createEClass(POST_CONDITION);

		runtimeConditionEClass = createEClass(RUNTIME_CONDITION);

		planElementEClass = createEClass(PLAN_ELEMENT);
		createEAttribute(planElementEClass, PLAN_ELEMENT__ID);
		createEAttribute(planElementEClass, PLAN_ELEMENT__NAME);
		createEAttribute(planElementEClass, PLAN_ELEMENT__COMMENT);
		createEOperation(planElementEClass, PLAN_ELEMENT___GENERATE_ID);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__DESCRIPTION);

		eStringToEStringMapEntryEClass = createEClass(ESTRING_TO_ESTRING_MAP_ENTRY);
		createEAttribute(eStringToEStringMapEntryEClass, ESTRING_TO_ESTRING_MAP_ENTRY__KEY);
		createEAttribute(eStringToEStringMapEntryEClass, ESTRING_TO_ESTRING_MAP_ENTRY__VALUE);

		behaviourConfigurationEClass = createEClass(BEHAVIOUR_CONFIGURATION);
		createEReference(behaviourConfigurationEClass, BEHAVIOUR_CONFIGURATION__PARAMETERS);
		createEAttribute(behaviourConfigurationEClass, BEHAVIOUR_CONFIGURATION__DEFERRING);
		createEAttribute(behaviourConfigurationEClass, BEHAVIOUR_CONFIGURATION__FREQUENCY);
		createEReference(behaviourConfigurationEClass, BEHAVIOUR_CONFIGURATION__BEHAVIOUR);
		createEAttribute(behaviourConfigurationEClass, BEHAVIOUR_CONFIGURATION__EVENT_DRIVEN);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__CHARACTERISTICS);

		roleSetEClass = createEClass(ROLE_SET);
		createEAttribute(roleSetEClass, ROLE_SET__USABLE_WITH_PLAN_ID);
		createEAttribute(roleSetEClass, ROLE_SET__DEFAULT);
		createEReference(roleSetEClass, ROLE_SET__MAPPINGS);

		eLongToDoubleMapEntryEClass = createEClass(ELONG_TO_DOUBLE_MAP_ENTRY);
		createEAttribute(eLongToDoubleMapEntryEClass, ELONG_TO_DOUBLE_MAP_ENTRY__KEY);
		createEAttribute(eLongToDoubleMapEntryEClass, ELONG_TO_DOUBLE_MAP_ENTRY__VALUE);

		roleDefinitionSetEClass = createEClass(ROLE_DEFINITION_SET);
		createEReference(roleDefinitionSetEClass, ROLE_DEFINITION_SET__ROLES);

		roleTaskMappingEClass = createEClass(ROLE_TASK_MAPPING);
		createEReference(roleTaskMappingEClass, ROLE_TASK_MAPPING__TASK_PRIORITIES);
		createEReference(roleTaskMappingEClass, ROLE_TASK_MAPPING__ROLE);

		characteristicEClass = createEClass(CHARACTERISTIC);
		createEAttribute(characteristicEClass, CHARACTERISTIC__WEIGHT);
		createEReference(characteristicEClass, CHARACTERISTIC__CAPABILITY);
		createEReference(characteristicEClass, CHARACTERISTIC__VALUE);

		taskGraphEClass = createEClass(TASK_GRAPH);
		createEReference(taskGraphEClass, TASK_GRAPH__NODES);
		createEReference(taskGraphEClass, TASK_GRAPH__EDGES);

		edgeEClass = createEClass(EDGE);
		createEReference(edgeEClass, EDGE__FROM);
		createEReference(edgeEClass, EDGE__TO);

		taskWrapperEClass = createEClass(TASK_WRAPPER);
		createEReference(taskWrapperEClass, TASK_WRAPPER__TASK);
		createEReference(taskWrapperEClass, TASK_WRAPPER__MAPPINGS);

		internalRoleTaskMappingEClass = createEClass(INTERNAL_ROLE_TASK_MAPPING);
		createEReference(internalRoleTaskMappingEClass, INTERNAL_ROLE_TASK_MAPPING__ROLE);
		createEAttribute(internalRoleTaskMappingEClass, INTERNAL_ROLE_TASK_MAPPING__PRIORITY);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__IN_EDGE);
		createEReference(nodeEClass, NODE__OUT_EDGE);

		taskRepositoryEClass = createEClass(TASK_REPOSITORY);
		createEReference(taskRepositoryEClass, TASK_REPOSITORY__TASKS);
		createEReference(taskRepositoryEClass, TASK_REPOSITORY__DEFAULT_TASK);
		createEOperation(taskRepositoryEClass, TASK_REPOSITORY___CREATE_DEFAULT_TASK);

		synchronisationEClass = createEClass(SYNCHRONISATION);
		createEReference(synchronisationEClass, SYNCHRONISATION__SYNCHED_TRANSITIONS);
		createEAttribute(synchronisationEClass, SYNCHRONISATION__TALK_TIMEOUT);
		createEAttribute(synchronisationEClass, SYNCHRONISATION__SYNC_TIMEOUT);
		createEAttribute(synchronisationEClass, SYNCHRONISATION__FAIL_ON_SYNC_TIME_OUT);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__TYPE);

		parametrisationEClass = createEClass(PARAMETRISATION);
		createEReference(parametrisationEClass, PARAMETRISATION__SUBPLAN);
		createEReference(parametrisationEClass, PARAMETRISATION__SUBVAR);
		createEReference(parametrisationEClass, PARAMETRISATION__VAR);

		annotatedPlanEClass = createEClass(ANNOTATED_PLAN);
		createEReference(annotatedPlanEClass, ANNOTATED_PLAN__PLAN);
		createEAttribute(annotatedPlanEClass, ANNOTATED_PLAN__ACTIVATED);

		quantifierEClass = createEClass(QUANTIFIER);
		createEReference(quantifierEClass, QUANTIFIER__SCOPE);
		createEAttribute(quantifierEClass, QUANTIFIER__SORTS);

		forallAgentsEClass = createEClass(FORALL_AGENTS);

		iInhabitableEClass = createEClass(IINHABITABLE);

		capabilityEClass = createEClass(CAPABILITY);
		createEReference(capabilityEClass, CAPABILITY__CAP_VALUES);

		capValueEClass = createEClass(CAP_VALUE);

		capabilityDefinitionSetEClass = createEClass(CAPABILITY_DEFINITION_SET);
		createEReference(capabilityDefinitionSetEClass, CAPABILITY_DEFINITION_SET__CAPABILITIES);

		planningProblemEClass = createEClass(PLANNING_PROBLEM);
		createEReference(planningProblemEClass, PLANNING_PROBLEM__PLANS);
		createEReference(planningProblemEClass, PLANNING_PROBLEM__PLANNER);
		createEReference(planningProblemEClass, PLANNING_PROBLEM__ALTERNATIVE_PLAN);
		createEReference(planningProblemEClass, PLANNING_PROBLEM__WAIT_PLAN);
		createEAttribute(planningProblemEClass, PLANNING_PROBLEM__UPDATE_RATE);
		createEAttribute(planningProblemEClass, PLANNING_PROBLEM__DISTRIBUTE_PROBLEM);
		createEAttribute(planningProblemEClass, PLANNING_PROBLEM__PLANNING_TYPE);
		createEAttribute(planningProblemEClass, PLANNING_PROBLEM__REQUIREMENTS);
		createEAttribute(planningProblemEClass, PLANNING_PROBLEM__PLANNER_PARAMS);

		plannerEClass = createEClass(PLANNER);
		createEAttribute(plannerEClass, PLANNER__TYPE);
		createEAttribute(plannerEClass, PLANNER__NAME);
		createEAttribute(plannerEClass, PLANNER__PARAMETERS);
		createEAttribute(plannerEClass, PLANNER__COMMAND);

		fluentEClass = createEClass(FLUENT);
		createEAttribute(fluentEClass, FLUENT__NAME);
		createEReference(fluentEClass, FLUENT__FORMULA);

		domainDescriptionEClass = createEClass(DOMAIN_DESCRIPTION);
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__FLUENTS);
		createEAttribute(domainDescriptionEClass, DOMAIN_DESCRIPTION__TYPES);
		createEAttribute(domainDescriptionEClass, DOMAIN_DESCRIPTION__NAME);
		createEReference(domainDescriptionEClass, DOMAIN_DESCRIPTION__CONSTANTS);

		plannersEClass = createEClass(PLANNERS);
		createEReference(plannersEClass, PLANNERS__PLANNERS);
		createEAttribute(plannersEClass, PLANNERS__NAME);

		eStringToEObjectMapEntryEClass = createEClass(ESTRING_TO_EOBJECT_MAP_ENTRY);
		createEAttribute(eStringToEObjectMapEntryEClass, ESTRING_TO_EOBJECT_MAP_ENTRY__KEY);
		createEAttribute(eStringToEObjectMapEntryEClass, ESTRING_TO_EOBJECT_MAP_ENTRY__VALUE);

		fluentParametersEClass = createEClass(FLUENT_PARAMETERS);
		createEAttribute(fluentParametersEClass, FLUENT_PARAMETERS__PARAMETER);
		createEAttribute(fluentParametersEClass, FLUENT_PARAMETERS__TYPE);

		constantEClass = createEClass(CONSTANT);
		createEAttribute(constantEClass, CONSTANT__NAME);
		createEAttribute(constantEClass, CONSTANT__TYPE);

		behaviourCreatorEClass = createEClass(BEHAVIOUR_CREATOR);
		createEReference(behaviourCreatorEClass, BEHAVIOUR_CREATOR__BEHAVIOURS);

		conditionCreatorEClass = createEClass(CONDITION_CREATOR);
		createEReference(conditionCreatorEClass, CONDITION_CREATOR__CONDITIONS);
		createEReference(conditionCreatorEClass, CONDITION_CREATOR__PLANS);

		utilityFunctionCreatorEClass = createEClass(UTILITY_FUNCTION_CREATOR);
		createEReference(utilityFunctionCreatorEClass, UTILITY_FUNCTION_CREATOR__CONDITIONS);
		createEReference(utilityFunctionCreatorEClass, UTILITY_FUNCTION_CREATOR__PLANS);

		constraintCreatorEClass = createEClass(CONSTRAINT_CREATOR);
		createEReference(constraintCreatorEClass, CONSTRAINT_CREATOR__CONDITIONS);
		createEReference(constraintCreatorEClass, CONSTRAINT_CREATOR__PLANS);

		// Create enums
		planningTypeEEnum = createEEnum(PLANNING_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		transitionEClass.getESuperTypes().add(this.getPlanElement());
		conditionEClass.getESuperTypes().add(this.getPlanElement());
		preConditionEClass.getESuperTypes().add(this.getCondition());
		entryPointEClass.getESuperTypes().add(this.getIInhabitable());
		terminalStateEClass.getESuperTypes().add(this.getState());
		successStateEClass.getESuperTypes().add(this.getTerminalState());
		failureStateEClass.getESuperTypes().add(this.getTerminalState());
		abstractPlanEClass.getESuperTypes().add(this.getPlanElement());
		abstractPlanEClass.getESuperTypes().add(this.getIInhabitable());
		behaviourEClass.getESuperTypes().add(this.getPlanElement());
		stateEClass.getESuperTypes().add(this.getPlanElement());
		stateEClass.getESuperTypes().add(this.getIInhabitable());
		planEClass.getESuperTypes().add(this.getAbstractPlan());
		planTypeEClass.getESuperTypes().add(this.getAbstractPlan());
		ratingEClass.getESuperTypes().add(this.getPlanElement());
		postConditionEClass.getESuperTypes().add(this.getCondition());
		runtimeConditionEClass.getESuperTypes().add(this.getCondition());
		taskEClass.getESuperTypes().add(this.getPlanElement());
		eStringToEStringMapEntryEClass.getESuperTypes().add(this.getPlanElement());
		behaviourConfigurationEClass.getESuperTypes().add(this.getAbstractPlan());
		roleEClass.getESuperTypes().add(this.getPlanElement());
		roleSetEClass.getESuperTypes().add(this.getPlanElement());
		eLongToDoubleMapEntryEClass.getESuperTypes().add(this.getPlanElement());
		roleDefinitionSetEClass.getESuperTypes().add(this.getPlanElement());
		roleTaskMappingEClass.getESuperTypes().add(this.getPlanElement());
		characteristicEClass.getESuperTypes().add(this.getPlanElement());
		taskWrapperEClass.getESuperTypes().add(this.getNode());
		taskRepositoryEClass.getESuperTypes().add(this.getPlanElement());
		synchronisationEClass.getESuperTypes().add(this.getPlanElement());
		variableEClass.getESuperTypes().add(this.getPlanElement());
		parametrisationEClass.getESuperTypes().add(this.getPlanElement());
		annotatedPlanEClass.getESuperTypes().add(this.getPlanElement());
		quantifierEClass.getESuperTypes().add(this.getPlanElement());
		forallAgentsEClass.getESuperTypes().add(this.getQuantifier());
		iInhabitableEClass.getESuperTypes().add(this.getPlanElement());
		capabilityEClass.getESuperTypes().add(this.getPlanElement());
		capValueEClass.getESuperTypes().add(this.getPlanElement());
		capabilityDefinitionSetEClass.getESuperTypes().add(this.getPlanElement());
		planningProblemEClass.getESuperTypes().add(this.getAbstractPlan());
		eStringToEObjectMapEntryEClass.getESuperTypes().add(this.getPlanElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Msg(), ecorePackage.getEString(), "msg", "", 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_PreCondition(), this.getPreCondition(), null, "preCondition", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_InState(), this.getState(), this.getState_OutTransitions(), "inState", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_OutState(), this.getState(), this.getState_InTransitions(), "outState", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Synchronisation(), this.getSynchronisation(), this.getSynchronisation_SynchedTransitions(), "synchronisation", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_ConditionString(), ecorePackage.getEString(), "conditionString", "", 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_AbstractPlan(), this.getAbstractPlan(), this.getAbstractPlan_Conditions(), "abstractPlan", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Vars(), this.getVariable(), null, "vars", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Quantifiers(), this.getQuantifier(), null, "quantifiers", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_PluginName(), ecorePackage.getEString(), "pluginName", "DefaultPlugin", 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Parameters(), this.getEStringToEObjectMapEntry(), null, "parameters", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCondition__EnsureVariableConsistency__AbstractPlan(), null, "ensureVariableConsistency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractPlan(), "parentPlan", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(preConditionEClass, PreCondition.class, "PreCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreCondition_Enabled(), ecorePackage.getEBoolean(), "enabled", "true", 0, 1, PreCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryPointEClass, EntryPoint.class, "EntryPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryPoint_Task(), this.getTask(), null, "task", null, 1, 1, EntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryPoint_SuccessRequired(), ecorePackage.getEBoolean(), "successRequired", "false", 0, 1, EntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryPoint_State(), this.getState(), this.getState_EntryPoint(), "state", null, 0, 1, EntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryPoint_MinCardinality(), ecorePackage.getEInt(), "minCardinality", "0", 1, 1, EntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryPoint_MaxCardinality(), ecorePackage.getEInt(), "maxCardinality", "2147483647", 1, 1, EntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryPoint_Plan(), this.getPlan(), this.getPlan_EntryPoints(), "plan", null, 1, 1, EntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminalStateEClass, TerminalState.class, "TerminalState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminalState_PostCondition(), this.getPostCondition(), null, "postCondition", null, 0, 1, TerminalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(successStateEClass, SuccessState.class, "SuccessState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(failureStateEClass, FailureState.class, "FailureState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractPlanEClass, AbstractPlan.class, "AbstractPlan", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractPlan_Rating(), this.getRating(), null, "rating", null, 0, 1, AbstractPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractPlan_Conditions(), this.getCondition(), this.getCondition_AbstractPlan(), "conditions", null, 0, -1, AbstractPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPlan_MasterPlan(), ecorePackage.getEBoolean(), "masterPlan", "false", 0, 1, AbstractPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPlan_UtilityFunction(), ecorePackage.getEString(), "utilityFunction", "", 0, 1, AbstractPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPlan_UtilityThreshold(), ecorePackage.getEDouble(), "utilityThreshold", "0.1", 0, 1, AbstractPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractPlan_Vars(), this.getVariable(), null, "vars", null, 0, -1, AbstractPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPlan_DestinationPath(), ecorePackage.getEString(), "destinationPath", "", 0, 1, AbstractPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviourEClass, Behaviour.class, "Behaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviour_Configurations(), this.getBehaviourConfiguration(), this.getBehaviourConfiguration_Behaviour(), "configurations", null, 1, -1, Behaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviour_DestinationPath(), ecorePackage.getEString(), "destinationPath", "", 0, 1, Behaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Plans(), this.getAbstractPlan(), null, "plans", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_InPlan(), this.getPlan(), this.getPlan_States(), "inPlan", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Parametrisation(), this.getParametrisation(), null, "parametrisation", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_InTransitions(), this.getTransition(), this.getTransition_OutState(), "inTransitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_OutTransitions(), this.getTransition(), this.getTransition_InState(), "outTransitions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_EntryPoint(), this.getEntryPoint(), this.getEntryPoint_State(), "entryPoint", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getState__EnsureParametrisationConsistency(), null, "ensureParametrisationConsistency", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(planEClass, Plan.class, "Plan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlan_Priority(), ecorePackage.getEDouble(), "priority", "0.0", 0, 1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlan_States(), this.getState(), this.getState_InPlan(), "states", null, 0, -1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlan_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlan_MinCardinality(), ecorePackage.getEInt(), "minCardinality", "0", 0, 1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlan_MaxCardinality(), ecorePackage.getEInt(), "maxCardinality", "2147483647", 0, 1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlan_Synchronisations(), this.getSynchronisation(), null, "synchronisations", null, 0, -1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlan_EntryPoints(), this.getEntryPoint(), this.getEntryPoint_Plan(), "entryPoints", null, 0, -1, Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPlan__CalculateCardinalities(), null, "calculateCardinalities", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlan__EnsureParametrisationConsistency(), null, "ensureParametrisationConsistency", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(planTypeEClass, PlanType.class, "PlanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlanType_Parametrisation(), this.getParametrisation(), null, "parametrisation", null, 0, -1, PlanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanType_Plans(), this.getAnnotatedPlan(), null, "plans", null, 0, -1, PlanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPlanType__EnsureParametrisationConsistency(), null, "ensureParametrisationConsistency", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ratingEClass, Rating.class, "Rating", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postConditionEClass, PostCondition.class, "PostCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runtimeConditionEClass, RuntimeCondition.class, "RuntimeCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(planElementEClass, PlanElement.class, "PlanElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlanElement_Id(), ecorePackage.getELong(), "id", "0", 1, 1, PlanElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanElement_Name(), ecorePackage.getEString(), "name", "", 0, 1, PlanElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanElement_Comment(), ecorePackage.getEString(), "comment", "", 0, 1, PlanElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPlanElement__GenerateID(), ecorePackage.getELong(), "generateID", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Description(), ecorePackage.getEString(), "description", "", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStringToEStringMapEntryEClass, Map.Entry.class, "EStringToEStringMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStringToEStringMapEntry_Key(), ecorePackage.getEString(), "key", "", 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStringToEStringMapEntry_Value(), ecorePackage.getEString(), "value", "", 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviourConfigurationEClass, BehaviourConfiguration.class, "BehaviourConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviourConfiguration_Parameters(), this.getEStringToEStringMapEntry(), null, "parameters", null, 0, -1, BehaviourConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviourConfiguration_Deferring(), ecorePackage.getEInt(), "deferring", "0", 0, 1, BehaviourConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviourConfiguration_Frequency(), ecorePackage.getEInt(), "frequency", "30", 0, 1, BehaviourConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviourConfiguration_Behaviour(), this.getBehaviour(), this.getBehaviour_Configurations(), "behaviour", null, 1, 1, BehaviourConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviourConfiguration_EventDriven(), ecorePackage.getEBoolean(), "eventDriven", "false", 0, 1, BehaviourConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Characteristics(), this.getCharacteristic(), null, "characteristics", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleSetEClass, RoleSet.class, "RoleSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleSet_UsableWithPlanID(), ecorePackage.getELong(), "usableWithPlanID", "0", 1, 1, RoleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleSet_Default(), ecorePackage.getEBoolean(), "default", "false", 0, 1, RoleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleSet_Mappings(), this.getRoleTaskMapping(), null, "mappings", null, 0, -1, RoleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eLongToDoubleMapEntryEClass, Map.Entry.class, "ELongToDoubleMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getELongToDoubleMapEntry_Key(), ecorePackage.getELongObject(), "key", "0", 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELongToDoubleMapEntry_Value(), ecorePackage.getEDoubleObject(), "value", "0", 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleDefinitionSetEClass, RoleDefinitionSet.class, "RoleDefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleDefinitionSet_Roles(), this.getRole(), null, "roles", null, 0, -1, RoleDefinitionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleTaskMappingEClass, RoleTaskMapping.class, "RoleTaskMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleTaskMapping_TaskPriorities(), this.getELongToDoubleMapEntry(), null, "taskPriorities", null, 0, -1, RoleTaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleTaskMapping_Role(), this.getRole(), null, "role", null, 0, 1, RoleTaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characteristicEClass, Characteristic.class, "Characteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacteristic_Weight(), ecorePackage.getEDouble(), "weight", "0", 0, 1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacteristic_Capability(), this.getCapability(), null, "capability", null, 0, 1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacteristic_Value(), this.getCapValue(), null, "value", null, 0, 1, Characteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskGraphEClass, TaskGraph.class, "TaskGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskGraph_Nodes(), this.getNode(), null, "nodes", null, 0, -1, TaskGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskGraph_Edges(), this.getEdge(), null, "edges", null, 0, -1, TaskGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdge_From(), this.getNode(), this.getNode_OutEdge(), "from", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_To(), this.getNode(), this.getNode_InEdge(), "to", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskWrapperEClass, TaskWrapper.class, "TaskWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskWrapper_Task(), this.getTask(), null, "task", null, 0, 1, TaskWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskWrapper_Mappings(), this.getInternalRoleTaskMapping(), null, "mappings", null, 0, -1, TaskWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalRoleTaskMappingEClass, InternalRoleTaskMapping.class, "InternalRoleTaskMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalRoleTaskMapping_Role(), this.getRole(), null, "role", null, 0, 1, InternalRoleTaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalRoleTaskMapping_Priority(), ecorePackage.getEDouble(), "priority", "0.0", 0, 1, InternalRoleTaskMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_InEdge(), this.getEdge(), this.getEdge_To(), "inEdge", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_OutEdge(), this.getEdge(), this.getEdge_From(), "outEdge", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskRepositoryEClass, TaskRepository.class, "TaskRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskRepository_Tasks(), this.getTask(), null, "tasks", null, 0, -1, TaskRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskRepository_DefaultTask(), this.getTask(), null, "defaultTask", null, 0, 1, TaskRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTaskRepository__CreateDefaultTask(), this.getTask(), "createDefaultTask", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(synchronisationEClass, Synchronisation.class, "Synchronisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronisation_SynchedTransitions(), this.getTransition(), this.getTransition_Synchronisation(), "synchedTransitions", null, 0, -1, Synchronisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchronisation_TalkTimeout(), ecorePackage.getEInt(), "talkTimeout", "30", 0, 1, Synchronisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchronisation_SyncTimeout(), ecorePackage.getEInt(), "syncTimeout", "10000", 0, 1, Synchronisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSynchronisation_FailOnSyncTimeOut(), ecorePackage.getEBoolean(), "failOnSyncTimeOut", "false", 0, 1, Synchronisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Type(), ecorePackage.getEString(), "Type", "", 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametrisationEClass, Parametrisation.class, "Parametrisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParametrisation_Subplan(), this.getAbstractPlan(), null, "subplan", null, 1, 1, Parametrisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParametrisation_Subvar(), this.getVariable(), null, "subvar", null, 1, 1, Parametrisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParametrisation_Var(), this.getVariable(), null, "var", null, 0, 1, Parametrisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedPlanEClass, AnnotatedPlan.class, "AnnotatedPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedPlan_Plan(), this.getPlan(), null, "plan", null, 0, 1, AnnotatedPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotatedPlan_Activated(), ecorePackage.getEBoolean(), "activated", "true", 0, 1, AnnotatedPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantifierEClass, Quantifier.class, "Quantifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantifier_Scope(), this.getIInhabitable(), null, "scope", null, 0, 1, Quantifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantifier_Sorts(), ecorePackage.getEString(), "sorts", "", 0, -1, Quantifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forallAgentsEClass, ForallAgents.class, "ForallAgents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iInhabitableEClass, IInhabitable.class, "IInhabitable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapability_CapValues(), this.getCapValue(), null, "capValues", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capValueEClass, CapValue.class, "CapValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(capabilityDefinitionSetEClass, CapabilityDefinitionSet.class, "CapabilityDefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityDefinitionSet_Capabilities(), this.getCapability(), null, "capabilities", null, 0, -1, CapabilityDefinitionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planningProblemEClass, PlanningProblem.class, "PlanningProblem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlanningProblem_Plans(), this.getAbstractPlan(), null, "plans", null, 0, -1, PlanningProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPlanningProblem_Planner(), this.getPlanner(), null, "planner", null, 0, 1, PlanningProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPlanningProblem_AlternativePlan(), this.getAbstractPlan(), null, "alternativePlan", null, 0, 1, PlanningProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanningProblem_WaitPlan(), this.getAbstractPlan(), null, "waitPlan", null, 0, 1, PlanningProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanningProblem_UpdateRate(), ecorePackage.getEInt(), "updateRate", null, 0, 1, PlanningProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanningProblem_DistributeProblem(), ecorePackage.getEBoolean(), "distributeProblem", "false", 0, 1, PlanningProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanningProblem_PlanningType(), this.getPlanningType(), "planningType", "Online", 1, 1, PlanningProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanningProblem_Requirements(), ecorePackage.getEString(), "requirements", null, 0, 1, PlanningProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanningProblem_PlannerParams(), ecorePackage.getEString(), "plannerParams", null, 0, 1, PlanningProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plannerEClass, Planner.class, "Planner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlanner_Type(), ecorePackage.getEInt(), "type", "-1", 0, 1, Planner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanner_Name(), ecorePackage.getEString(), "name", null, 1, 1, Planner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanner_Parameters(), ecorePackage.getEString(), "parameters", null, 0, 1, Planner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanner_Command(), ecorePackage.getEString(), "command", null, 1, 1, Planner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fluentEClass, Fluent.class, "Fluent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFluent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Fluent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFluent_Formula(), this.getFluentParameters(), null, "formula", null, 0, -1, Fluent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(domainDescriptionEClass, DomainDescription.class, "DomainDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainDescription_Fluents(), this.getFluent(), null, "fluents", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDomainDescription_Types(), ecorePackage.getEString(), "types", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDomainDescription_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainDescription_Constants(), this.getConstant(), null, "constants", null, 0, -1, DomainDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plannersEClass, Planners.class, "Planners", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlanners_Planners(), this.getPlanner(), null, "planners", null, 0, -1, Planners.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPlanners_Name(), ecorePackage.getEString(), "name", null, 0, 1, Planners.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStringToEObjectMapEntryEClass, Map.Entry.class, "EStringToEObjectMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStringToEObjectMapEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStringToEObjectMapEntry_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fluentParametersEClass, FluentParameters.class, "FluentParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFluentParameters_Parameter(), ecorePackage.getEString(), "parameter", null, 0, 1, FluentParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFluentParameters_Type(), ecorePackage.getEString(), "type", null, 0, 1, FluentParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstant_Name(), ecorePackage.getEString(), "name", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstant_Type(), ecorePackage.getEString(), "type", null, 1, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviourCreatorEClass, BehaviourCreator.class, "BehaviourCreator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviourCreator_Behaviours(), this.getBehaviour(), null, "behaviours", null, 0, -1, BehaviourCreator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conditionCreatorEClass, ConditionCreator.class, "ConditionCreator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionCreator_Conditions(), this.getCondition(), null, "conditions", null, 0, -1, ConditionCreator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConditionCreator_Plans(), this.getAbstractPlan(), null, "plans", null, 0, -1, ConditionCreator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(utilityFunctionCreatorEClass, UtilityFunctionCreator.class, "UtilityFunctionCreator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUtilityFunctionCreator_Conditions(), this.getCondition(), null, "conditions", null, 0, -1, UtilityFunctionCreator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUtilityFunctionCreator_Plans(), this.getAbstractPlan(), null, "plans", null, 0, -1, UtilityFunctionCreator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintCreatorEClass, ConstraintCreator.class, "ConstraintCreator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintCreator_Conditions(), this.getCondition(), null, "conditions", null, 0, -1, ConstraintCreator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraintCreator_Plans(), this.getAbstractPlan(), null, "plans", null, 0, -1, ConstraintCreator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(planningTypeEEnum, PlanningType.class, "PlanningType");
		addEEnumLiteral(planningTypeEEnum, PlanningType.ONLINE);
		addEEnumLiteral(planningTypeEEnum, PlanningType.OFFLINE);
		addEEnumLiteral(planningTypeEEnum, PlanningType.INTERACTIVE);

		// Create resource
		createResource(eNS_URI);
	}

} //AlicaPackageImpl
