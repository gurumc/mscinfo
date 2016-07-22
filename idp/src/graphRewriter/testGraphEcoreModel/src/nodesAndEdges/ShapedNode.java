/**
 */
package nodesAndEdges;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shaped Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nodesAndEdges.ShapedNode#getSize <em>Size</em>}</li>
 *   <li>{@link nodesAndEdges.ShapedNode#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see nodesAndEdges.NodesAndEdgesPackage#getShapedNode()
 * @model
 * @generated
 */
public interface ShapedNode extends Node {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(float)
	 * @see nodesAndEdges.NodesAndEdgesPackage#getShapedNode_Size()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	float getSize();

	/**
	 * Sets the value of the '{@link nodesAndEdges.ShapedNode#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(float value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * The literals are from the enumeration {@link nodesAndEdges.Shape}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see nodesAndEdges.Shape
	 * @see #setShape(Shape)
	 * @see nodesAndEdges.NodesAndEdgesPackage#getShapedNode_Shape()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Shape getShape();

	/**
	 * Sets the value of the '{@link nodesAndEdges.ShapedNode#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see nodesAndEdges.Shape
	 * @see #getShape()
	 * @generated
	 */
	void setShape(Shape value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return this.getName()+\":\"+this.getShape()+\",\"+this.getSize();\n'"
	 * @generated
	 */
	String toString();

} // ShapedNode
