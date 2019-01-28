/**
 */
package graph_Pattern_Matching_Master_Project.impl;

import graph_Pattern_Matching_Master_Project.EMFGraph;
import graph_Pattern_Matching_Master_Project.EMFVertex;
import graph_Pattern_Matching_Master_Project.Entry;
import graph_Pattern_Matching_Master_Project.Graph_Pattern_Matching_Master_ProjectPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.EMFVertexImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.EMFVertexImpl#getName <em>Name</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.EMFVertexImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMFVertexImpl extends MinimalEObjectImpl.Container implements EMFVertex {
	/**
	 * The cached value of the '{@link #getGraph() <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraph()
	 * @generated
	 * @ordered
	 */
	protected EMFGraph graph;

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
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<Entry> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFVertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graph_Pattern_Matching_Master_ProjectPackage.Literals.EMF_VERTEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFGraph getGraph() {
		if (graph != null && graph.eIsProxy()) {
			InternalEObject oldGraph = (InternalEObject) graph;
			graph = (EMFGraph) eResolveProxy(oldGraph);
			if (graph != oldGraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__GRAPH, oldGraph, graph));
			}
		}
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFGraph basicGetGraph() {
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraph(EMFGraph newGraph, NotificationChain msgs) {
		EMFGraph oldGraph = graph;
		graph = newGraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__GRAPH, oldGraph, newGraph);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraph(EMFGraph newGraph) {
		if (newGraph != graph) {
			NotificationChain msgs = null;
			if (graph != null)
				msgs = ((InternalEObject) graph).eInverseRemove(this,
						Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__VERTICES, EMFGraph.class, msgs);
			if (newGraph != null)
				msgs = ((InternalEObject) newGraph).eInverseAdd(this,
						Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__VERTICES, EMFGraph.class, msgs);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__GRAPH, newGraph, newGraph));
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
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<Entry>(Entry.class, this,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__GRAPH:
			if (graph != null)
				msgs = ((InternalEObject) graph).eInverseRemove(this,
						Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__VERTICES, EMFGraph.class, msgs);
			return basicSetGraph((EMFGraph) otherEnd, msgs);
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
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__GRAPH:
			return basicSetGraph(null, msgs);
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__ENTRIES:
			return ((InternalEList<?>) getEntries()).basicRemove(otherEnd, msgs);
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
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__GRAPH:
			if (resolve)
				return getGraph();
			return basicGetGraph();
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__NAME:
			return getName();
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__ENTRIES:
			return getEntries();
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
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__GRAPH:
			setGraph((EMFGraph) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__NAME:
			setName((String) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__ENTRIES:
			getEntries().clear();
			getEntries().addAll((Collection<? extends Entry>) newValue);
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
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__GRAPH:
			setGraph((EMFGraph) null);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__ENTRIES:
			getEntries().clear();
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
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__GRAPH:
			return graph != null;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_VERTEX__ENTRIES:
			return entries != null && !entries.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

} //EMFVertexImpl
