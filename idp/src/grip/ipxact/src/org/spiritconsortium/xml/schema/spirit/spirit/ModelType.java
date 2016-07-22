/**
 */
package org.spiritconsortium.xml.schema.spirit.spirit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model information.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.ModelType#getViews <em>Views</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.ModelType#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.ModelType#getModelParameters <em>Model Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage#getModelType()
 * @model extendedMetaData="name='modelType' kind='elementOnly'"
 * @generated
 */
public interface ModelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * View container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Views</em>' containment reference.
	 * @see #setViews(ViewsType1)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage#getModelType_Views()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='views' namespace='##targetNamespace'"
	 * @generated
	 */
	ViewsType1 getViews();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.ModelType#getViews <em>Views</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Views</em>' containment reference.
	 * @see #getViews()
	 * @generated
	 */
	void setViews(ViewsType1 value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Port container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference.
	 * @see #setPorts(PortsType11)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage#getModelType_Ports()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ports' namespace='##targetNamespace'"
	 * @generated
	 */
	PortsType11 getPorts();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.ModelType#getPorts <em>Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' containment reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(PortsType11 value);

	/**
	 * Returns the value of the '<em><b>Model Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Model parameter name value pairs container
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Parameters</em>' containment reference.
	 * @see #setModelParameters(ModelParametersType1)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage#getModelType_ModelParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modelParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelParametersType1 getModelParameters();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.ModelType#getModelParameters <em>Model Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Parameters</em>' containment reference.
	 * @see #getModelParameters()
	 * @generated
	 */
	void setModelParameters(ModelParametersType1 value);

} // ModelType
