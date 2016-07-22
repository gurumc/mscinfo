/**
 */
package nodesAndEdges;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see nodesAndEdges.NodesAndEdgesFactory
 * @model kind="package"
 * @generated
 */
public interface NodesAndEdgesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nodesAndEdges";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de_tum_ei_eda_graphgrammar_junggraphmodel_testgraph_graphstructure/de/tum/ei/eda/graphgrammar/junggraphmodel/testgraph/graphstructure/nodesAndEdges.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de_tum_ei_eda_graphgrammar_junggraphmodel_testgraph_graphstructure.de.tum.ei.eda.graphgrammar.junggraphmodel.testgraph.graphstructure.nodesAndEdges";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NodesAndEdgesPackage eINSTANCE = nodesAndEdges.impl.NodesAndEdgesPackageImpl.init();

	/**
	 * The meta object id for the '{@link nodesAndEdges.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nodesAndEdges.impl.NodeImpl
	 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nodesAndEdges.impl.ColoredNodeImpl <em>Colored Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nodesAndEdges.impl.ColoredNodeImpl
	 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getColoredNode()
	 * @generated
	 */
	int COLORED_NODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_NODE__COLOR = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Colored Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_NODE___TO_STRING = NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Colored Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link nodesAndEdges.impl.Node_toStringImpl <em>Node to String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nodesAndEdges.impl.Node_toStringImpl
	 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getNode_toString()
	 * @generated
	 */
	int NODE_TO_STRING = 2;

	/**
	 * The number of structural features of the '<em>Node to String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TO_STRING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Node to String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TO_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nodesAndEdges.impl.ColoredNode_toStringImpl <em>Colored Node to String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nodesAndEdges.impl.ColoredNode_toStringImpl
	 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getColoredNode_toString()
	 * @generated
	 */
	int COLORED_NODE_TO_STRING = 3;

	/**
	 * The number of structural features of the '<em>Colored Node to String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_NODE_TO_STRING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Colored Node to String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_NODE_TO_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nodesAndEdges.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nodesAndEdges.impl.EdgeImpl
	 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___TO_STRING = 0;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link nodesAndEdges.impl.Edge_toStringImpl <em>Edge to String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nodesAndEdges.impl.Edge_toStringImpl
	 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getEdge_toString()
	 * @generated
	 */
	int EDGE_TO_STRING = 5;

	/**
	 * The number of structural features of the '<em>Edge to String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TO_STRING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Edge to String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_TO_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nodesAndEdges.impl.ShapedNodeImpl <em>Shaped Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nodesAndEdges.impl.ShapedNodeImpl
	 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getShapedNode()
	 * @generated
	 */
	int SHAPED_NODE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPED_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPED_NODE__SIZE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPED_NODE__SHAPE = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shaped Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPED_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPED_NODE___TO_STRING = NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shaped Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPED_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link nodesAndEdges.impl.ShapedNode_toStringImpl <em>Shaped Node to String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nodesAndEdges.impl.ShapedNode_toStringImpl
	 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getShapedNode_toString()
	 * @generated
	 */
	int SHAPED_NODE_TO_STRING = 7;

	/**
	 * The number of structural features of the '<em>Shaped Node to String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPED_NODE_TO_STRING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Shaped Node to String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPED_NODE_TO_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nodesAndEdges.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nodesAndEdges.Color
	 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 8;

	/**
	 * The meta object id for the '{@link nodesAndEdges.EdgeViewType <em>Edge View Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nodesAndEdges.EdgeViewType
	 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getEdgeViewType()
	 * @generated
	 */
	int EDGE_VIEW_TYPE = 9;

	/**
	 * The meta object id for the '{@link nodesAndEdges.Shape <em>Shape</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nodesAndEdges.Shape
	 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 10;


	/**
	 * Returns the meta object for class '{@link nodesAndEdges.ColoredNode <em>Colored Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colored Node</em>'.
	 * @see nodesAndEdges.ColoredNode
	 * @generated
	 */
	EClass getColoredNode();

	/**
	 * Returns the meta object for the attribute '{@link nodesAndEdges.ColoredNode#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see nodesAndEdges.ColoredNode#getColor()
	 * @see #getColoredNode()
	 * @generated
	 */
	EAttribute getColoredNode_Color();

	/**
	 * Returns the meta object for the '{@link nodesAndEdges.ColoredNode#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see nodesAndEdges.ColoredNode#toString()
	 * @generated
	 */
	EOperation getColoredNode__ToString();

	/**
	 * Returns the meta object for class '{@link nodesAndEdges.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see nodesAndEdges.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link nodesAndEdges.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nodesAndEdges.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for class '{@link nodesAndEdges.Node_toString <em>Node to String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node to String</em>'.
	 * @see nodesAndEdges.Node_toString
	 * @generated
	 */
	EClass getNode_toString();

	/**
	 * Returns the meta object for class '{@link nodesAndEdges.ColoredNode_toString <em>Colored Node to String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colored Node to String</em>'.
	 * @see nodesAndEdges.ColoredNode_toString
	 * @generated
	 */
	EClass getColoredNode_toString();

	/**
	 * Returns the meta object for class '{@link nodesAndEdges.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see nodesAndEdges.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link nodesAndEdges.Edge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nodesAndEdges.Edge#getName()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Name();

	/**
	 * Returns the meta object for the attribute '{@link nodesAndEdges.Edge#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see nodesAndEdges.Edge#getType()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Type();

	/**
	 * Returns the meta object for the '{@link nodesAndEdges.Edge#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see nodesAndEdges.Edge#toString()
	 * @generated
	 */
	EOperation getEdge__ToString();

	/**
	 * Returns the meta object for class '{@link nodesAndEdges.Edge_toString <em>Edge to String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge to String</em>'.
	 * @see nodesAndEdges.Edge_toString
	 * @generated
	 */
	EClass getEdge_toString();

	/**
	 * Returns the meta object for class '{@link nodesAndEdges.ShapedNode <em>Shaped Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shaped Node</em>'.
	 * @see nodesAndEdges.ShapedNode
	 * @generated
	 */
	EClass getShapedNode();

	/**
	 * Returns the meta object for the attribute '{@link nodesAndEdges.ShapedNode#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see nodesAndEdges.ShapedNode#getSize()
	 * @see #getShapedNode()
	 * @generated
	 */
	EAttribute getShapedNode_Size();

	/**
	 * Returns the meta object for the attribute '{@link nodesAndEdges.ShapedNode#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see nodesAndEdges.ShapedNode#getShape()
	 * @see #getShapedNode()
	 * @generated
	 */
	EAttribute getShapedNode_Shape();

	/**
	 * Returns the meta object for the '{@link nodesAndEdges.ShapedNode#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see nodesAndEdges.ShapedNode#toString()
	 * @generated
	 */
	EOperation getShapedNode__ToString();

	/**
	 * Returns the meta object for class '{@link nodesAndEdges.ShapedNode_toString <em>Shaped Node to String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shaped Node to String</em>'.
	 * @see nodesAndEdges.ShapedNode_toString
	 * @generated
	 */
	EClass getShapedNode_toString();

	/**
	 * Returns the meta object for enum '{@link nodesAndEdges.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see nodesAndEdges.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link nodesAndEdges.EdgeViewType <em>Edge View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Edge View Type</em>'.
	 * @see nodesAndEdges.EdgeViewType
	 * @generated
	 */
	EEnum getEdgeViewType();

	/**
	 * Returns the meta object for enum '{@link nodesAndEdges.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shape</em>'.
	 * @see nodesAndEdges.Shape
	 * @generated
	 */
	EEnum getShape();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NodesAndEdgesFactory getNodesAndEdgesFactory();

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
		 * The meta object literal for the '{@link nodesAndEdges.impl.ColoredNodeImpl <em>Colored Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nodesAndEdges.impl.ColoredNodeImpl
		 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getColoredNode()
		 * @generated
		 */
		EClass COLORED_NODE = eINSTANCE.getColoredNode();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLORED_NODE__COLOR = eINSTANCE.getColoredNode_Color();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLORED_NODE___TO_STRING = eINSTANCE.getColoredNode__ToString();

		/**
		 * The meta object literal for the '{@link nodesAndEdges.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nodesAndEdges.impl.NodeImpl
		 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '{@link nodesAndEdges.impl.Node_toStringImpl <em>Node to String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nodesAndEdges.impl.Node_toStringImpl
		 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getNode_toString()
		 * @generated
		 */
		EClass NODE_TO_STRING = eINSTANCE.getNode_toString();

		/**
		 * The meta object literal for the '{@link nodesAndEdges.impl.ColoredNode_toStringImpl <em>Colored Node to String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nodesAndEdges.impl.ColoredNode_toStringImpl
		 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getColoredNode_toString()
		 * @generated
		 */
		EClass COLORED_NODE_TO_STRING = eINSTANCE.getColoredNode_toString();

		/**
		 * The meta object literal for the '{@link nodesAndEdges.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nodesAndEdges.impl.EdgeImpl
		 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__NAME = eINSTANCE.getEdge_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__TYPE = eINSTANCE.getEdge_Type();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDGE___TO_STRING = eINSTANCE.getEdge__ToString();

		/**
		 * The meta object literal for the '{@link nodesAndEdges.impl.Edge_toStringImpl <em>Edge to String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nodesAndEdges.impl.Edge_toStringImpl
		 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getEdge_toString()
		 * @generated
		 */
		EClass EDGE_TO_STRING = eINSTANCE.getEdge_toString();

		/**
		 * The meta object literal for the '{@link nodesAndEdges.impl.ShapedNodeImpl <em>Shaped Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nodesAndEdges.impl.ShapedNodeImpl
		 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getShapedNode()
		 * @generated
		 */
		EClass SHAPED_NODE = eINSTANCE.getShapedNode();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPED_NODE__SIZE = eINSTANCE.getShapedNode_Size();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPED_NODE__SHAPE = eINSTANCE.getShapedNode_Shape();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHAPED_NODE___TO_STRING = eINSTANCE.getShapedNode__ToString();

		/**
		 * The meta object literal for the '{@link nodesAndEdges.impl.ShapedNode_toStringImpl <em>Shaped Node to String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nodesAndEdges.impl.ShapedNode_toStringImpl
		 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getShapedNode_toString()
		 * @generated
		 */
		EClass SHAPED_NODE_TO_STRING = eINSTANCE.getShapedNode_toString();

		/**
		 * The meta object literal for the '{@link nodesAndEdges.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nodesAndEdges.Color
		 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link nodesAndEdges.EdgeViewType <em>Edge View Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nodesAndEdges.EdgeViewType
		 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getEdgeViewType()
		 * @generated
		 */
		EEnum EDGE_VIEW_TYPE = eINSTANCE.getEdgeViewType();

		/**
		 * The meta object literal for the '{@link nodesAndEdges.Shape <em>Shape</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nodesAndEdges.Shape
		 * @see nodesAndEdges.impl.NodesAndEdgesPackageImpl#getShape()
		 * @generated
		 */
		EEnum SHAPE = eINSTANCE.getShape();

	}

} //NodesAndEdgesPackage
