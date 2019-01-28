/**
 */
package graph_Pattern_Matching_Master_Project;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph_Pattern_Matching_Master_Project.EMFGraph#getEdges <em>Edges</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.EMFGraph#getVertices <em>Vertices</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.EMFGraph#getName <em>Name</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.EMFGraph#isDirect <em>Direct</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.EMFGraph#isMultipleGraph <em>Multiple Graph</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.EMFGraph#isWeighted <em>Weighted</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.EMFGraph#isWithLoops <em>With Loops</em>}</li>
 * </ul>
 *
 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getEMFGraph()
 * @model
 * @generated
 */
public interface EMFGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Edges</b></em>' reference list.
	 * The list contents are of type {@link graph_Pattern_Matching_Master_Project.EMFEdge}.
	 * It is bidirectional and its opposite is '{@link graph_Pattern_Matching_Master_Project.EMFEdge#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' reference list.
	 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getEMFGraph_Edges()
	 * @see graph_Pattern_Matching_Master_Project.EMFEdge#getGraph
	 * @model opposite="graph"
	 * @generated
	 */
	EList<EMFEdge> getEdges();

	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' reference list.
	 * The list contents are of type {@link graph_Pattern_Matching_Master_Project.EMFVertex}.
	 * It is bidirectional and its opposite is '{@link graph_Pattern_Matching_Master_Project.EMFVertex#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertices</em>' reference list.
	 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getEMFGraph_Vertices()
	 * @see graph_Pattern_Matching_Master_Project.EMFVertex#getGraph
	 * @model opposite="graph"
	 * @generated
	 */
	EList<EMFVertex> getVertices();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getEMFGraph_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link graph_Pattern_Matching_Master_Project.EMFGraph#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Direct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct</em>' attribute.
	 * @see #setDirect(boolean)
	 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getEMFGraph_Direct()
	 * @model
	 * @generated
	 */
	boolean isDirect();

	/**
	 * Sets the value of the '{@link graph_Pattern_Matching_Master_Project.EMFGraph#isDirect <em>Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct</em>' attribute.
	 * @see #isDirect()
	 * @generated
	 */
	void setDirect(boolean value);

	/**
	 * Returns the value of the '<em><b>Multiple Graph</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Graph</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Graph</em>' attribute.
	 * @see #setMultipleGraph(boolean)
	 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getEMFGraph_MultipleGraph()
	 * @model default="false"
	 * @generated
	 */
	boolean isMultipleGraph();

	/**
	 * Sets the value of the '{@link graph_Pattern_Matching_Master_Project.EMFGraph#isMultipleGraph <em>Multiple Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Graph</em>' attribute.
	 * @see #isMultipleGraph()
	 * @generated
	 */
	void setMultipleGraph(boolean value);

	/**
	 * Returns the value of the '<em><b>Weighted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weighted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weighted</em>' attribute.
	 * @see #setWeighted(boolean)
	 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getEMFGraph_Weighted()
	 * @model
	 * @generated
	 */
	boolean isWeighted();

	/**
	 * Sets the value of the '{@link graph_Pattern_Matching_Master_Project.EMFGraph#isWeighted <em>Weighted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weighted</em>' attribute.
	 * @see #isWeighted()
	 * @generated
	 */
	void setWeighted(boolean value);

	/**
	 * Returns the value of the '<em><b>With Loops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Loops</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Loops</em>' attribute.
	 * @see #setWithLoops(boolean)
	 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getEMFGraph_WithLoops()
	 * @model
	 * @generated
	 */
	boolean isWithLoops();

	/**
	 * Sets the value of the '{@link graph_Pattern_Matching_Master_Project.EMFGraph#isWithLoops <em>With Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Loops</em>' attribute.
	 * @see #isWithLoops()
	 * @generated
	 */
	void setWithLoops(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isConnected();

} // EMFGraph
