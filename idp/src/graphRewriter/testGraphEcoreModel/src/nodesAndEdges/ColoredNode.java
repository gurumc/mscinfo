/**
 */
package nodesAndEdges;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colored Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nodesAndEdges.ColoredNode#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see nodesAndEdges.NodesAndEdgesPackage#getColoredNode()
 * @model
 * @generated
 */
public interface ColoredNode extends Node {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link nodesAndEdges.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see nodesAndEdges.Color
	 * @see #setColor(Color)
	 * @see nodesAndEdges.NodesAndEdgesPackage#getColoredNode_Color()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link nodesAndEdges.ColoredNode#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see nodesAndEdges.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return this.getName()+\":\"+this.getColor();\n'"
	 * @generated
	 */
	String toString();

} // ColoredNode
