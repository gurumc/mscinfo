/**
 */
package nodesAndEdges;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nodesAndEdges.Edge#getName <em>Name</em>}</li>
 *   <li>{@link nodesAndEdges.Edge#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see nodesAndEdges.NodesAndEdgesPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nodesAndEdges.NodesAndEdgesPackage#getEdge_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nodesAndEdges.Edge#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link nodesAndEdges.EdgeViewType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see nodesAndEdges.EdgeViewType
	 * @see #setType(EdgeViewType)
	 * @see nodesAndEdges.NodesAndEdgesPackage#getEdge_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EdgeViewType getType();

	/**
	 * Sets the value of the '{@link nodesAndEdges.Edge#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see nodesAndEdges.EdgeViewType
	 * @see #getType()
	 * @generated
	 */
	void setType(EdgeViewType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if(this.type.equals(EdgeViewType.dashline)) {\n\t\treturn String.valueOf(\"dashline\");\n\t} else if(this.type.equals(EdgeViewType.solidline)) {\n\t\treturn String.valueOf(\"solidline\");\n\t} else {\n\t\treturn String.valueOf(\"unknown\");\n\t}\n'"
	 * @generated
	 */
	String toString();

} // Edge
