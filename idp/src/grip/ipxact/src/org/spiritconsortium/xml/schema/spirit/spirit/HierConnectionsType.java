/**
 */
package org.spiritconsortium.xml.schema.spirit.spirit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hier Connections Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.HierConnectionsType#getHierConnection <em>Hier Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage#getHierConnectionsType()
 * @model extendedMetaData="name='hierConnections_._type' kind='elementOnly'"
 * @generated
 */
public interface HierConnectionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Hier Connection</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.HierConnectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a hierarchy connection
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hier Connection</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage#getHierConnectionsType_HierConnection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hierConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HierConnectionType> getHierConnection();

} // HierConnectionsType
