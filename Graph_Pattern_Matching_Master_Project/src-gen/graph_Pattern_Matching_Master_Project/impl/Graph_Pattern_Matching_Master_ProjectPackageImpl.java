/**
 */
package graph_Pattern_Matching_Master_Project.impl;

import graph_Pattern_Matching_Master_Project.EMFEdge;
import graph_Pattern_Matching_Master_Project.EMFGraph;
import graph_Pattern_Matching_Master_Project.EMFVertex;
import graph_Pattern_Matching_Master_Project.Entry;
import graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectFactory;
import graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Graph_Pattern_Matching_Master_ProjectPackageImpl extends EPackageImpl
		implements Graph_Pattern_Matching_Master_ProjectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfVertexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryEClass = null;

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
	 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Graph_Pattern_Matching_Master_ProjectPackageImpl() {
		super(eNS_URI, Graph_Pattern_Matching_Master_ProjectFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Graph_Pattern_Matching_Master_ProjectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Graph_Pattern_Matching_Master_ProjectPackage init() {
		if (isInited)
			return (Graph_Pattern_Matching_Master_ProjectPackage) EPackage.Registry.INSTANCE
					.getEPackage(Graph_Pattern_Matching_Master_ProjectPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGraph_Pattern_Matching_Master_ProjectPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Graph_Pattern_Matching_Master_ProjectPackageImpl theGraph_Pattern_Matching_Master_ProjectPackage = registeredGraph_Pattern_Matching_Master_ProjectPackage instanceof Graph_Pattern_Matching_Master_ProjectPackageImpl
				? (Graph_Pattern_Matching_Master_ProjectPackageImpl) registeredGraph_Pattern_Matching_Master_ProjectPackage
				: new Graph_Pattern_Matching_Master_ProjectPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGraph_Pattern_Matching_Master_ProjectPackage.createPackageContents();

		// Initialize created meta-data
		theGraph_Pattern_Matching_Master_ProjectPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGraph_Pattern_Matching_Master_ProjectPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Graph_Pattern_Matching_Master_ProjectPackage.eNS_URI,
				theGraph_Pattern_Matching_Master_ProjectPackage);
		return theGraph_Pattern_Matching_Master_ProjectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFGraph() {
		return emfGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFGraph_Edges() {
		return (EReference) emfGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFGraph_Vertices() {
		return (EReference) emfGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFGraph_Name() {
		return (EAttribute) emfGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFGraph_Direct() {
		return (EAttribute) emfGraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFGraph_MultipleGraph() {
		return (EAttribute) emfGraphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFGraph_Weighted() {
		return (EAttribute) emfGraphEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFGraph_WithLoops() {
		return (EAttribute) emfGraphEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEMFGraph__IsConnected() {
		return emfGraphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFVertex() {
		return emfVertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFVertex_Graph() {
		return (EReference) emfVertexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFVertex_Name() {
		return (EAttribute) emfVertexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFVertex_Entries() {
		return (EReference) emfVertexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMFEdge() {
		return emfEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFEdge_Graph() {
		return (EReference) emfEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFEdge_Source() {
		return (EReference) emfEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFEdge_Target() {
		return (EReference) emfEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFEdge_Label() {
		return (EAttribute) emfEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEMFEdge_Entries() {
		return (EReference) emfEdgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMFEdge_Weight() {
		return (EAttribute) emfEdgeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntry() {
		return entryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Key() {
		return (EAttribute) entryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Value() {
		return (EAttribute) entryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph_Pattern_Matching_Master_ProjectFactory getGraph_Pattern_Matching_Master_ProjectFactory() {
		return (Graph_Pattern_Matching_Master_ProjectFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		emfGraphEClass = createEClass(EMF_GRAPH);
		createEReference(emfGraphEClass, EMF_GRAPH__EDGES);
		createEReference(emfGraphEClass, EMF_GRAPH__VERTICES);
		createEAttribute(emfGraphEClass, EMF_GRAPH__NAME);
		createEAttribute(emfGraphEClass, EMF_GRAPH__DIRECT);
		createEAttribute(emfGraphEClass, EMF_GRAPH__MULTIPLE_GRAPH);
		createEAttribute(emfGraphEClass, EMF_GRAPH__WEIGHTED);
		createEAttribute(emfGraphEClass, EMF_GRAPH__WITH_LOOPS);
		createEOperation(emfGraphEClass, EMF_GRAPH___IS_CONNECTED);

		emfVertexEClass = createEClass(EMF_VERTEX);
		createEReference(emfVertexEClass, EMF_VERTEX__GRAPH);
		createEAttribute(emfVertexEClass, EMF_VERTEX__NAME);
		createEReference(emfVertexEClass, EMF_VERTEX__ENTRIES);

		emfEdgeEClass = createEClass(EMF_EDGE);
		createEReference(emfEdgeEClass, EMF_EDGE__GRAPH);
		createEReference(emfEdgeEClass, EMF_EDGE__SOURCE);
		createEReference(emfEdgeEClass, EMF_EDGE__TARGET);
		createEAttribute(emfEdgeEClass, EMF_EDGE__LABEL);
		createEReference(emfEdgeEClass, EMF_EDGE__ENTRIES);
		createEAttribute(emfEdgeEClass, EMF_EDGE__WEIGHT);

		entryEClass = createEClass(ENTRY);
		createEAttribute(entryEClass, ENTRY__KEY);
		createEAttribute(entryEClass, ENTRY__VALUE);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(emfGraphEClass, EMFGraph.class, "EMFGraph", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFGraph_Edges(), this.getEMFEdge(), this.getEMFEdge_Graph(), "edges", null, 0, -1,
				EMFGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFGraph_Vertices(), this.getEMFVertex(), this.getEMFVertex_Graph(), "vertices", null, 0, -1,
				EMFGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFGraph_Name(), ecorePackage.getEString(), "name", null, 0, 1, EMFGraph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFGraph_Direct(), ecorePackage.getEBoolean(), "direct", null, 0, 1, EMFGraph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFGraph_MultipleGraph(), ecorePackage.getEBoolean(), "multipleGraph", "false", 0, 1,
				EMFGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFGraph_Weighted(), ecorePackage.getEBoolean(), "weighted", null, 0, 1, EMFGraph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFGraph_WithLoops(), ecorePackage.getEBoolean(), "withLoops", null, 0, 1, EMFGraph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEMFGraph__IsConnected(), ecorePackage.getEBoolean(), "isConnected", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(emfVertexEClass, EMFVertex.class, "EMFVertex", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFVertex_Graph(), this.getEMFGraph(), this.getEMFGraph_Vertices(), "graph", null, 1, 1,
				EMFVertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFVertex_Name(), ecorePackage.getEString(), "name", null, 0, 1, EMFVertex.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFVertex_Entries(), this.getEntry(), null, "entries", null, 0, -1, EMFVertex.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfEdgeEClass, EMFEdge.class, "EMFEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFEdge_Graph(), this.getEMFGraph(), this.getEMFGraph_Edges(), "graph", null, 1, 1,
				EMFEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFEdge_Source(), this.getEMFVertex(), null, "source", null, 1, 1, EMFEdge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFEdge_Target(), this.getEMFVertex(), null, "target", null, 1, 1, EMFEdge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFEdge_Label(), ecorePackage.getEString(), "label", null, 0, 1, EMFEdge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEMFEdge_Entries(), this.getEntry(), null, "entries", null, 0, -1, EMFEdge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFEdge_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, EMFEdge.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryEClass, Entry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Entry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, Entry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Graph_Pattern_Matching_Master_ProjectPackageImpl
