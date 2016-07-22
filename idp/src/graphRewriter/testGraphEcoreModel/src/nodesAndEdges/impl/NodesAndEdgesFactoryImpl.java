/**
 */
package nodesAndEdges.impl;

import nodesAndEdges.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodesAndEdgesFactoryImpl extends EFactoryImpl implements NodesAndEdgesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NodesAndEdgesFactory init() {
		try {
			NodesAndEdgesFactory theNodesAndEdgesFactory = (NodesAndEdgesFactory)EPackage.Registry.INSTANCE.getEFactory(NodesAndEdgesPackage.eNS_URI);
			if (theNodesAndEdgesFactory != null) {
				return theNodesAndEdgesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NodesAndEdgesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesAndEdgesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NodesAndEdgesPackage.COLORED_NODE: return createColoredNode();
			case NodesAndEdgesPackage.NODE: return createNode();
			case NodesAndEdgesPackage.NODE_TO_STRING: return createNode_toString();
			case NodesAndEdgesPackage.COLORED_NODE_TO_STRING: return createColoredNode_toString();
			case NodesAndEdgesPackage.EDGE: return createEdge();
			case NodesAndEdgesPackage.EDGE_TO_STRING: return createEdge_toString();
			case NodesAndEdgesPackage.SHAPED_NODE: return createShapedNode();
			case NodesAndEdgesPackage.SHAPED_NODE_TO_STRING: return createShapedNode_toString();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case NodesAndEdgesPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case NodesAndEdgesPackage.EDGE_VIEW_TYPE:
				return createEdgeViewTypeFromString(eDataType, initialValue);
			case NodesAndEdgesPackage.SHAPE:
				return createShapeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case NodesAndEdgesPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case NodesAndEdgesPackage.EDGE_VIEW_TYPE:
				return convertEdgeViewTypeToString(eDataType, instanceValue);
			case NodesAndEdgesPackage.SHAPE:
				return convertShapeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColoredNode createColoredNode() {
		ColoredNodeImpl coloredNode = new ColoredNodeImpl();
		return coloredNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node_toString createNode_toString() {
		Node_toStringImpl node_toString = new Node_toStringImpl();
		return node_toString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColoredNode_toString createColoredNode_toString() {
		ColoredNode_toStringImpl coloredNode_toString = new ColoredNode_toStringImpl();
		return coloredNode_toString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge_toString createEdge_toString() {
		Edge_toStringImpl edge_toString = new Edge_toStringImpl();
		return edge_toString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapedNode createShapedNode() {
		ShapedNodeImpl shapedNode = new ShapedNodeImpl();
		return shapedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapedNode_toString createShapedNode_toString() {
		ShapedNode_toStringImpl shapedNode_toString = new ShapedNode_toStringImpl();
		return shapedNode_toString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		Color result = Color.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeViewType createEdgeViewTypeFromString(EDataType eDataType, String initialValue) {
		EdgeViewType result = EdgeViewType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeViewTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape createShapeFromString(EDataType eDataType, String initialValue) {
		Shape result = Shape.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShapeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesAndEdgesPackage getNodesAndEdgesPackage() {
		return (NodesAndEdgesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NodesAndEdgesPackage getPackage() {
		return NodesAndEdgesPackage.eINSTANCE;
	}

} //NodesAndEdgesFactoryImpl
