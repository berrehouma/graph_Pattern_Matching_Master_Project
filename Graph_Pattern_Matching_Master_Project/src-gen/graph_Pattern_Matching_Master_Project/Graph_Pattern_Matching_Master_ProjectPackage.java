/**
 */
package graph_Pattern_Matching_Master_Project;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectFactory
 * @model kind="package"
 * @generated
 */
public interface Graph_Pattern_Matching_Master_ProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graph_Pattern_Matching_Master_Project";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.univ-guelma.dz/graph_Pattern_Matching_Master_Project";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graph_Pattern_Matching_Master_Project";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Graph_Pattern_Matching_Master_ProjectPackage eINSTANCE = graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link graph_Pattern_Matching_Master_Project.impl.EMFGraphImpl <em>EMF Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_Pattern_Matching_Master_Project.impl.EMFGraphImpl
	 * @see graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl#getEMFGraph()
	 * @generated
	 */
	int EMF_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_GRAPH__EDGES = 0;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_GRAPH__VERTICES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_GRAPH__NAME = 2;

	/**
	 * The feature id for the '<em><b>Direct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_GRAPH__DIRECT = 3;

	/**
	 * The feature id for the '<em><b>Multiple Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_GRAPH__MULTIPLE_GRAPH = 4;

	/**
	 * The feature id for the '<em><b>Weighted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_GRAPH__WEIGHTED = 5;

	/**
	 * The feature id for the '<em><b>With Loops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_GRAPH__WITH_LOOPS = 6;

	/**
	 * The number of structural features of the '<em>EMF Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_GRAPH_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Is Connected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_GRAPH___IS_CONNECTED = 0;

	/**
	 * The number of operations of the '<em>EMF Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_GRAPH_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link graph_Pattern_Matching_Master_Project.impl.EMFVertexImpl <em>EMF Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_Pattern_Matching_Master_Project.impl.EMFVertexImpl
	 * @see graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl#getEMFVertex()
	 * @generated
	 */
	int EMF_VERTEX = 1;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VERTEX__GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VERTEX__NAME = 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VERTEX__ENTRIES = 2;

	/**
	 * The number of structural features of the '<em>EMF Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VERTEX_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EMF Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_VERTEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graph_Pattern_Matching_Master_Project.impl.EMFEdgeImpl <em>EMF Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_Pattern_Matching_Master_Project.impl.EMFEdgeImpl
	 * @see graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl#getEMFEdge()
	 * @generated
	 */
	int EMF_EDGE = 2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EDGE__GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EDGE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EDGE__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EDGE__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EDGE__ENTRIES = 4;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EDGE__WEIGHT = 5;

	/**
	 * The number of structural features of the '<em>EMF Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EDGE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>EMF Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_EDGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graph_Pattern_Matching_Master_Project.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_Pattern_Matching_Master_Project.impl.EntryImpl
	 * @see graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link graph_Pattern_Matching_Master_Project.EMFGraph <em>EMF Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Graph</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFGraph
	 * @generated
	 */
	EClass getEMFGraph();

	/**
	 * Returns the meta object for the reference list '{@link graph_Pattern_Matching_Master_Project.EMFGraph#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edges</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFGraph#getEdges()
	 * @see #getEMFGraph()
	 * @generated
	 */
	EReference getEMFGraph_Edges();

	/**
	 * Returns the meta object for the reference list '{@link graph_Pattern_Matching_Master_Project.EMFGraph#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vertices</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFGraph#getVertices()
	 * @see #getEMFGraph()
	 * @generated
	 */
	EReference getEMFGraph_Vertices();

	/**
	 * Returns the meta object for the attribute '{@link graph_Pattern_Matching_Master_Project.EMFGraph#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFGraph#getName()
	 * @see #getEMFGraph()
	 * @generated
	 */
	EAttribute getEMFGraph_Name();

	/**
	 * Returns the meta object for the attribute '{@link graph_Pattern_Matching_Master_Project.EMFGraph#isDirect <em>Direct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direct</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFGraph#isDirect()
	 * @see #getEMFGraph()
	 * @generated
	 */
	EAttribute getEMFGraph_Direct();

	/**
	 * Returns the meta object for the attribute '{@link graph_Pattern_Matching_Master_Project.EMFGraph#isMultipleGraph <em>Multiple Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Graph</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFGraph#isMultipleGraph()
	 * @see #getEMFGraph()
	 * @generated
	 */
	EAttribute getEMFGraph_MultipleGraph();

	/**
	 * Returns the meta object for the attribute '{@link graph_Pattern_Matching_Master_Project.EMFGraph#isWeighted <em>Weighted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weighted</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFGraph#isWeighted()
	 * @see #getEMFGraph()
	 * @generated
	 */
	EAttribute getEMFGraph_Weighted();

	/**
	 * Returns the meta object for the attribute '{@link graph_Pattern_Matching_Master_Project.EMFGraph#isWithLoops <em>With Loops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Loops</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFGraph#isWithLoops()
	 * @see #getEMFGraph()
	 * @generated
	 */
	EAttribute getEMFGraph_WithLoops();

	/**
	 * Returns the meta object for the '{@link graph_Pattern_Matching_Master_Project.EMFGraph#isConnected() <em>Is Connected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Connected</em>' operation.
	 * @see graph_Pattern_Matching_Master_Project.EMFGraph#isConnected()
	 * @generated
	 */
	EOperation getEMFGraph__IsConnected();

	/**
	 * Returns the meta object for class '{@link graph_Pattern_Matching_Master_Project.EMFVertex <em>EMF Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Vertex</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFVertex
	 * @generated
	 */
	EClass getEMFVertex();

	/**
	 * Returns the meta object for the reference '{@link graph_Pattern_Matching_Master_Project.EMFVertex#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFVertex#getGraph()
	 * @see #getEMFVertex()
	 * @generated
	 */
	EReference getEMFVertex_Graph();

	/**
	 * Returns the meta object for the attribute '{@link graph_Pattern_Matching_Master_Project.EMFVertex#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFVertex#getName()
	 * @see #getEMFVertex()
	 * @generated
	 */
	EAttribute getEMFVertex_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_Pattern_Matching_Master_Project.EMFVertex#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFVertex#getEntries()
	 * @see #getEMFVertex()
	 * @generated
	 */
	EReference getEMFVertex_Entries();

	/**
	 * Returns the meta object for class '{@link graph_Pattern_Matching_Master_Project.EMFEdge <em>EMF Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Edge</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFEdge
	 * @generated
	 */
	EClass getEMFEdge();

	/**
	 * Returns the meta object for the reference '{@link graph_Pattern_Matching_Master_Project.EMFEdge#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFEdge#getGraph()
	 * @see #getEMFEdge()
	 * @generated
	 */
	EReference getEMFEdge_Graph();

	/**
	 * Returns the meta object for the reference '{@link graph_Pattern_Matching_Master_Project.EMFEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFEdge#getSource()
	 * @see #getEMFEdge()
	 * @generated
	 */
	EReference getEMFEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link graph_Pattern_Matching_Master_Project.EMFEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFEdge#getTarget()
	 * @see #getEMFEdge()
	 * @generated
	 */
	EReference getEMFEdge_Target();

	/**
	 * Returns the meta object for the attribute '{@link graph_Pattern_Matching_Master_Project.EMFEdge#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFEdge#getLabel()
	 * @see #getEMFEdge()
	 * @generated
	 */
	EAttribute getEMFEdge_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_Pattern_Matching_Master_Project.EMFEdge#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFEdge#getEntries()
	 * @see #getEMFEdge()
	 * @generated
	 */
	EReference getEMFEdge_Entries();

	/**
	 * Returns the meta object for the attribute '{@link graph_Pattern_Matching_Master_Project.EMFEdge#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see graph_Pattern_Matching_Master_Project.EMFEdge#getWeight()
	 * @see #getEMFEdge()
	 * @generated
	 */
	EAttribute getEMFEdge_Weight();

	/**
	 * Returns the meta object for class '{@link graph_Pattern_Matching_Master_Project.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link graph_Pattern_Matching_Master_Project.Entry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Entry#getKey()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link graph_Pattern_Matching_Master_Project.Entry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see graph_Pattern_Matching_Master_Project.Entry#getValue()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Graph_Pattern_Matching_Master_ProjectFactory getGraph_Pattern_Matching_Master_ProjectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link graph_Pattern_Matching_Master_Project.impl.EMFGraphImpl <em>EMF Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_Pattern_Matching_Master_Project.impl.EMFGraphImpl
		 * @see graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl#getEMFGraph()
		 * @generated
		 */
		EClass EMF_GRAPH = eINSTANCE.getEMFGraph();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_GRAPH__EDGES = eINSTANCE.getEMFGraph_Edges();

		/**
		 * The meta object literal for the '<em><b>Vertices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_GRAPH__VERTICES = eINSTANCE.getEMFGraph_Vertices();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_GRAPH__NAME = eINSTANCE.getEMFGraph_Name();

		/**
		 * The meta object literal for the '<em><b>Direct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_GRAPH__DIRECT = eINSTANCE.getEMFGraph_Direct();

		/**
		 * The meta object literal for the '<em><b>Multiple Graph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_GRAPH__MULTIPLE_GRAPH = eINSTANCE.getEMFGraph_MultipleGraph();

		/**
		 * The meta object literal for the '<em><b>Weighted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_GRAPH__WEIGHTED = eINSTANCE.getEMFGraph_Weighted();

		/**
		 * The meta object literal for the '<em><b>With Loops</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_GRAPH__WITH_LOOPS = eINSTANCE.getEMFGraph_WithLoops();

		/**
		 * The meta object literal for the '<em><b>Is Connected</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMF_GRAPH___IS_CONNECTED = eINSTANCE.getEMFGraph__IsConnected();

		/**
		 * The meta object literal for the '{@link graph_Pattern_Matching_Master_Project.impl.EMFVertexImpl <em>EMF Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_Pattern_Matching_Master_Project.impl.EMFVertexImpl
		 * @see graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl#getEMFVertex()
		 * @generated
		 */
		EClass EMF_VERTEX = eINSTANCE.getEMFVertex();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_VERTEX__GRAPH = eINSTANCE.getEMFVertex_Graph();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_VERTEX__NAME = eINSTANCE.getEMFVertex_Name();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_VERTEX__ENTRIES = eINSTANCE.getEMFVertex_Entries();

		/**
		 * The meta object literal for the '{@link graph_Pattern_Matching_Master_Project.impl.EMFEdgeImpl <em>EMF Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_Pattern_Matching_Master_Project.impl.EMFEdgeImpl
		 * @see graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl#getEMFEdge()
		 * @generated
		 */
		EClass EMF_EDGE = eINSTANCE.getEMFEdge();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_EDGE__GRAPH = eINSTANCE.getEMFEdge_Graph();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_EDGE__SOURCE = eINSTANCE.getEMFEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_EDGE__TARGET = eINSTANCE.getEMFEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_EDGE__LABEL = eINSTANCE.getEMFEdge_Label();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_EDGE__ENTRIES = eINSTANCE.getEMFEdge_Entries();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_EDGE__WEIGHT = eINSTANCE.getEMFEdge_Weight();

		/**
		 * The meta object literal for the '{@link graph_Pattern_Matching_Master_Project.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_Pattern_Matching_Master_Project.impl.EntryImpl
		 * @see graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__KEY = eINSTANCE.getEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__VALUE = eINSTANCE.getEntry_Value();

	}

} //Graph_Pattern_Matching_Master_ProjectPackage
