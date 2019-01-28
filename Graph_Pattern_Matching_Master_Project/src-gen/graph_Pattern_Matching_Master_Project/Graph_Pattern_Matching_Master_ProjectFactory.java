/**
 */
package graph_Pattern_Matching_Master_Project;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage
 * @generated
 */
public interface Graph_Pattern_Matching_Master_ProjectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Graph_Pattern_Matching_Master_ProjectFactory eINSTANCE = graph_Pattern_Matching_Master_Project.impl.Graph_Pattern_Matching_Master_ProjectFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>EMF Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Graph</em>'.
	 * @generated
	 */
	EMFGraph createEMFGraph();

	/**
	 * Returns a new object of class '<em>EMF Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Vertex</em>'.
	 * @generated
	 */
	EMFVertex createEMFVertex();

	/**
	 * Returns a new object of class '<em>EMF Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Edge</em>'.
	 * @generated
	 */
	EMFEdge createEMFEdge();

	/**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
	Entry createEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Graph_Pattern_Matching_Master_ProjectPackage getGraph_Pattern_Matching_Master_ProjectPackage();

} //Graph_Pattern_Matching_Master_ProjectFactory
