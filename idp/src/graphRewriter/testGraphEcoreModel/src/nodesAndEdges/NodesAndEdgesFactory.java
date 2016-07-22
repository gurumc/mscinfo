/**
 */
package nodesAndEdges;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nodesAndEdges.NodesAndEdgesPackage
 * @generated
 */
public interface NodesAndEdgesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NodesAndEdgesFactory eINSTANCE = nodesAndEdges.impl.NodesAndEdgesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Colored Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colored Node</em>'.
	 * @generated
	 */
	ColoredNode createColoredNode();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Node to String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node to String</em>'.
	 * @generated
	 */
	Node_toString createNode_toString();

	/**
	 * Returns a new object of class '<em>Colored Node to String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colored Node to String</em>'.
	 * @generated
	 */
	ColoredNode_toString createColoredNode_toString();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	Edge createEdge();

	/**
	 * Returns a new object of class '<em>Edge to String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge to String</em>'.
	 * @generated
	 */
	Edge_toString createEdge_toString();

	/**
	 * Returns a new object of class '<em>Shaped Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shaped Node</em>'.
	 * @generated
	 */
	ShapedNode createShapedNode();

	/**
	 * Returns a new object of class '<em>Shaped Node to String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shaped Node to String</em>'.
	 * @generated
	 */
	ShapedNode_toString createShapedNode_toString();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NodesAndEdgesPackage getNodesAndEdgesPackage();

} //NodesAndEdgesFactory
