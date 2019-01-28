/**
 */
package graph_Pattern_Matching_Master_Project.impl;

import graph_Pattern_Matching_Master_Project.EMFEdge;
import graph_Pattern_Matching_Master_Project.EMFGraph;
import graph_Pattern_Matching_Master_Project.EMFVertex;
import graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.EMFGraphImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.EMFGraphImpl#getVertices <em>Vertices</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.EMFGraphImpl#getName <em>Name</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.EMFGraphImpl#isDirect <em>Direct</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.EMFGraphImpl#isMultipleGraph <em>Multiple Graph</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.EMFGraphImpl#isWeighted <em>Weighted</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.EMFGraphImpl#isWithLoops <em>With Loops</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMFGraphImpl extends MinimalEObjectImpl.Container implements EMFGraph {
	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<EMFEdge> edges;

	/**
	 * The cached value of the '{@link #getVertices() <em>Vertices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertices()
	 * @generated
	 * @ordered
	 */
	protected EList<EMFVertex> vertices;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isDirect() <em>Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIRECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDirect() <em>Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirect()
	 * @generated
	 * @ordered
	 */
	protected boolean direct = DIRECT_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultipleGraph() <em>Multiple Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleGraph()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_GRAPH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultipleGraph() <em>Multiple Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleGraph()
	 * @generated
	 * @ordered
	 */
	protected boolean multipleGraph = MULTIPLE_GRAPH_EDEFAULT;

	/**
	 * The default value of the '{@link #isWeighted() <em>Weighted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWeighted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WEIGHTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWeighted() <em>Weighted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWeighted()
	 * @generated
	 * @ordered
	 */
	protected boolean weighted = WEIGHTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isWithLoops() <em>With Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithLoops()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WITH_LOOPS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWithLoops() <em>With Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithLoops()
	 * @generated
	 * @ordered
	 */
	protected boolean withLoops = WITH_LOOPS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graph_Pattern_Matching_Master_ProjectPackage.Literals.EMF_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMFEdge> getEdges() {
		if (edges == null) {
			edges = new EObjectWithInverseResolvingEList<EMFEdge>(EMFEdge.class, this,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__EDGES,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__GRAPH);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMFVertex> getVertices() {
		if (vertices == null) {
			vertices = new EObjectWithInverseResolvingEList<EMFVertex>(EMFVertex.class, this,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__VERTICES,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__GRAPH);
		}
		return vertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDirect() {
		return direct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirect(boolean newDirect) {
		boolean oldDirect = direct;
		direct = newDirect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__DIRECT, oldDirect, direct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultipleGraph() {
		return multipleGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleGraph(boolean newMultipleGraph) {
		boolean oldMultipleGraph = multipleGraph;
		multipleGraph = newMultipleGraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__MULTIPLE_GRAPH, oldMultipleGraph,
					multipleGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWeighted() {
		return weighted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeighted(boolean newWeighted) {
		boolean oldWeighted = weighted;
		weighted = newWeighted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__WEIGHTED, oldWeighted, weighted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWithLoops() {
		return withLoops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithLoops(boolean newWithLoops) {
		boolean oldWithLoops = withLoops;
		withLoops = newWithLoops;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__WITH_LOOPS, oldWithLoops, withLoops));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConnected() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__EDGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEdges()).basicAdd(otherEnd, msgs);
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__VERTICES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVertices()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__EDGES:
			return ((InternalEList<?>) getEdges()).basicRemove(otherEnd, msgs);
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__VERTICES:
			return ((InternalEList<?>) getVertices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__EDGES:
			return getEdges();
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__VERTICES:
			return getVertices();
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__NAME:
			return getName();
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__DIRECT:
			return isDirect();
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__MULTIPLE_GRAPH:
			return isMultipleGraph();
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__WEIGHTED:
			return isWeighted();
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__WITH_LOOPS:
			return isWithLoops();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__EDGES:
			getEdges().clear();
			getEdges().addAll((Collection<? extends EMFEdge>) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__VERTICES:
			getVertices().clear();
			getVertices().addAll((Collection<? extends EMFVertex>) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__NAME:
			setName((String) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__DIRECT:
			setDirect((Boolean) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__MULTIPLE_GRAPH:
			setMultipleGraph((Boolean) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__WEIGHTED:
			setWeighted((Boolean) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__WITH_LOOPS:
			setWithLoops((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__EDGES:
			getEdges().clear();
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__VERTICES:
			getVertices().clear();
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__DIRECT:
			setDirect(DIRECT_EDEFAULT);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__MULTIPLE_GRAPH:
			setMultipleGraph(MULTIPLE_GRAPH_EDEFAULT);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__WEIGHTED:
			setWeighted(WEIGHTED_EDEFAULT);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__WITH_LOOPS:
			setWithLoops(WITH_LOOPS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__EDGES:
			return edges != null && !edges.isEmpty();
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__VERTICES:
			return vertices != null && !vertices.isEmpty();
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__DIRECT:
			return direct != DIRECT_EDEFAULT;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__MULTIPLE_GRAPH:
			return multipleGraph != MULTIPLE_GRAPH_EDEFAULT;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__WEIGHTED:
			return weighted != WEIGHTED_EDEFAULT;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__WITH_LOOPS:
			return withLoops != WITH_LOOPS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH___IS_CONNECTED:
			return isConnected();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", direct: ");
		result.append(direct);
		result.append(", multipleGraph: ");
		result.append(multipleGraph);
		result.append(", weighted: ");
		result.append(weighted);
		result.append(", withLoops: ");
		result.append(withLoops);
		result.append(')');
		return result.toString();
	}

} //EMFGraphImpl
