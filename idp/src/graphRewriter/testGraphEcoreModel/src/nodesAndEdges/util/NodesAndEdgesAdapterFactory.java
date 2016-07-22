/**
 */
package nodesAndEdges.util;

import nodesAndEdges.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nodesAndEdges.NodesAndEdgesPackage
 * @generated
 */
public class NodesAndEdgesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NodesAndEdgesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesAndEdgesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NodesAndEdgesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodesAndEdgesSwitch<Adapter> modelSwitch =
		new NodesAndEdgesSwitch<Adapter>() {
			@Override
			public Adapter caseColoredNode(ColoredNode object) {
				return createColoredNodeAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseNode_toString(Node_toString object) {
				return createNode_toStringAdapter();
			}
			@Override
			public Adapter caseColoredNode_toString(ColoredNode_toString object) {
				return createColoredNode_toStringAdapter();
			}
			@Override
			public Adapter caseEdge(Edge object) {
				return createEdgeAdapter();
			}
			@Override
			public Adapter caseEdge_toString(Edge_toString object) {
				return createEdge_toStringAdapter();
			}
			@Override
			public Adapter caseShapedNode(ShapedNode object) {
				return createShapedNodeAdapter();
			}
			@Override
			public Adapter caseShapedNode_toString(ShapedNode_toString object) {
				return createShapedNode_toStringAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link nodesAndEdges.ColoredNode <em>Colored Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nodesAndEdges.ColoredNode
	 * @generated
	 */
	public Adapter createColoredNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nodesAndEdges.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nodesAndEdges.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nodesAndEdges.Node_toString <em>Node to String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nodesAndEdges.Node_toString
	 * @generated
	 */
	public Adapter createNode_toStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nodesAndEdges.ColoredNode_toString <em>Colored Node to String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nodesAndEdges.ColoredNode_toString
	 * @generated
	 */
	public Adapter createColoredNode_toStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nodesAndEdges.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nodesAndEdges.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nodesAndEdges.Edge_toString <em>Edge to String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nodesAndEdges.Edge_toString
	 * @generated
	 */
	public Adapter createEdge_toStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nodesAndEdges.ShapedNode <em>Shaped Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nodesAndEdges.ShapedNode
	 * @generated
	 */
	public Adapter createShapedNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nodesAndEdges.ShapedNode_toString <em>Shaped Node to String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nodesAndEdges.ShapedNode_toString
	 * @generated
	 */
	public Adapter createShapedNode_toStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NodesAndEdgesAdapterFactory
