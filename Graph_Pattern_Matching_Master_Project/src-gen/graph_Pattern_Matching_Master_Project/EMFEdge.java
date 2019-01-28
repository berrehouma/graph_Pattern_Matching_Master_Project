/**
 */
package graph_Pattern_Matching_Master_Project;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph_Pattern_Matching_Master_Project.EMFEdge#getGraph <em>Graph</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.EMFEdge#getSource <em>Source</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.EMFEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.EMFEdge#getLabel <em>Label</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.EMFEdge#getEntries <em>Entries</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.EMFEdge#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getEMFEdge()
 * @model
 * @generated
 */
public interface EMFEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>Graph</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link graph_Pattern_Matching_Master_Project.EMFGraph#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' reference.
	 * @see #setGraph(EMFGraph)
	 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getEMFEdge_Graph()
	 * @see graph_Pattern_Matching_Master_Project.EMFGraph#getEdges
	 * @model opposite="edges" required="true"
	 * @generated
	 */
	EMFGraph getGraph();

	/**
	 * Sets the value of the '{@link graph_Pattern_Matching_Master_Project.EMFEdge#getGraph <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(EMFGraph value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EMFVertex)
	 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getEMFEdge_Source()
	 * @model required="true"
	 * @generated
	 */
	EMFVertex getSource();

	/**
	 * Sets the value of the '{@link graph_Pattern_Matching_Master_Project.EMFEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EMFVertex value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EMFVertex)
	 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getEMFEdge_Target()
	 * @model required="true"
	 * @generated
	 */
	EMFVertex getTarget();

	/**
	 * Sets the value of the '{@link graph_Pattern_Matching_Master_Project.EMFEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EMFVertex value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getEMFEdge_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link graph_Pattern_Matching_Master_Project.EMFEdge#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link graph_Pattern_Matching_Master_Project.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getEMFEdge_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entry> getEntries();

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage#getEMFEdge_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link graph_Pattern_Matching_Master_Project.EMFEdge#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

} // EMFEdge
