/**
 */
package graph_Pattern_Matching_Master_Project.impl;

import graph_Pattern_Matching_Master_Project.EMFEdge;
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
 * An implementation of the model object '<em><b>EMF Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.EMFEdgeImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.EMFEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.EMFEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.EMFEdgeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.EMFEdgeImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link graph_Pattern_Matching_Master_Project.impl.EMFEdgeImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMFEdgeImpl extends MinimalEObjectImpl.Container implements EMFEdge {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EMFVertex source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EMFVertex target;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

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
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graph_Pattern_Matching_Master_ProjectPackage.Literals.EMF_EDGE;
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
							Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__GRAPH, oldGraph, graph));
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
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__GRAPH, oldGraph, newGraph);
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
						Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__EDGES, EMFGraph.class, msgs);
			if (newGraph != null)
				msgs = ((InternalEObject) newGraph).eInverseAdd(this,
						Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__EDGES, EMFGraph.class, msgs);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__GRAPH, newGraph, newGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFVertex getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (EMFVertex) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFVertex basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EMFVertex newSource) {
		EMFVertex oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFVertex getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (EMFVertex) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFVertex basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(EMFVertex newTarget) {
		EMFVertex oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<Entry>(Entry.class, this,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__GRAPH:
			if (graph != null)
				msgs = ((InternalEObject) graph).eInverseRemove(this,
						Graph_Pattern_Matching_Master_ProjectPackage.EMF_GRAPH__EDGES, EMFGraph.class, msgs);
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
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__GRAPH:
			return basicSetGraph(null, msgs);
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__ENTRIES:
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
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__GRAPH:
			if (resolve)
				return getGraph();
			return basicGetGraph();
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__LABEL:
			return getLabel();
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__ENTRIES:
			return getEntries();
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__WEIGHT:
			return getWeight();
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
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__GRAPH:
			setGraph((EMFGraph) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__SOURCE:
			setSource((EMFVertex) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__TARGET:
			setTarget((EMFVertex) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__LABEL:
			setLabel((String) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__ENTRIES:
			getEntries().clear();
			getEntries().addAll((Collection<? extends Entry>) newValue);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__WEIGHT:
			setWeight((Double) newValue);
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
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__GRAPH:
			setGraph((EMFGraph) null);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__SOURCE:
			setSource((EMFVertex) null);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__TARGET:
			setTarget((EMFVertex) null);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__ENTRIES:
			getEntries().clear();
			return;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
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
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__GRAPH:
			return graph != null;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__SOURCE:
			return source != null;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__TARGET:
			return target != null;
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__ENTRIES:
			return entries != null && !entries.isEmpty();
		case Graph_Pattern_Matching_Master_ProjectPackage.EMF_EDGE__WEIGHT:
			return weight != WEIGHT_EDEFAULT;
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
		result.append(" (label: ");
		result.append(label);
		result.append(", weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //EMFEdgeImpl
