/**
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit.spirit.InitiativeType1;
import org.spiritconsortium.xml.schema.spirit.spirit.ServiceType1;
import org.spiritconsortium.xml.schema.spirit.spirit.ServiceTypeDefsType;
import org.spiritconsortium.xml.schema.spirit.spirit.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.ServiceType1Impl#getInitiative <em>Initiative</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.ServiceType1Impl#getServiceTypeDefs <em>Service Type Defs</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.ServiceType1Impl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceType1Impl extends MinimalEObjectImpl.Container implements ServiceType1 {
	/**
	 * The default value of the '{@link #getInitiative() <em>Initiative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiative()
	 * @generated
	 * @ordered
	 */
	protected static final InitiativeType1 INITIATIVE_EDEFAULT = InitiativeType1.REQUIRES;

	/**
	 * The cached value of the '{@link #getInitiative() <em>Initiative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiative()
	 * @generated
	 * @ordered
	 */
	protected InitiativeType1 initiative = INITIATIVE_EDEFAULT;

	/**
	 * This is true if the Initiative attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initiativeESet;

	/**
	 * The cached value of the '{@link #getServiceTypeDefs() <em>Service Type Defs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypeDefs()
	 * @generated
	 * @ordered
	 */
	protected ServiceTypeDefsType serviceTypeDefs;

	/**
	 * The cached value of the '{@link #getVendorExtensions() <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorExtensions()
	 * @generated
	 * @ordered
	 */
	protected VendorExtensionsType vendorExtensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return spiritPackage.eINSTANCE.getServiceType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiativeType1 getInitiative() {
		return initiative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiative(InitiativeType1 newInitiative) {
		InitiativeType1 oldInitiative = initiative;
		initiative = newInitiative == null ? INITIATIVE_EDEFAULT : newInitiative;
		boolean oldInitiativeESet = initiativeESet;
		initiativeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.SERVICE_TYPE1__INITIATIVE, oldInitiative, initiative, !oldInitiativeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInitiative() {
		InitiativeType1 oldInitiative = initiative;
		boolean oldInitiativeESet = initiativeESet;
		initiative = INITIATIVE_EDEFAULT;
		initiativeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, spiritPackage.SERVICE_TYPE1__INITIATIVE, oldInitiative, INITIATIVE_EDEFAULT, oldInitiativeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitiative() {
		return initiativeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTypeDefsType getServiceTypeDefs() {
		return serviceTypeDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceTypeDefs(ServiceTypeDefsType newServiceTypeDefs, NotificationChain msgs) {
		ServiceTypeDefsType oldServiceTypeDefs = serviceTypeDefs;
		serviceTypeDefs = newServiceTypeDefs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, spiritPackage.SERVICE_TYPE1__SERVICE_TYPE_DEFS, oldServiceTypeDefs, newServiceTypeDefs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceTypeDefs(ServiceTypeDefsType newServiceTypeDefs) {
		if (newServiceTypeDefs != serviceTypeDefs) {
			NotificationChain msgs = null;
			if (serviceTypeDefs != null)
				msgs = ((InternalEObject)serviceTypeDefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - spiritPackage.SERVICE_TYPE1__SERVICE_TYPE_DEFS, null, msgs);
			if (newServiceTypeDefs != null)
				msgs = ((InternalEObject)newServiceTypeDefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - spiritPackage.SERVICE_TYPE1__SERVICE_TYPE_DEFS, null, msgs);
			msgs = basicSetServiceTypeDefs(newServiceTypeDefs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.SERVICE_TYPE1__SERVICE_TYPE_DEFS, newServiceTypeDefs, newServiceTypeDefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorExtensionsType getVendorExtensions() {
		return vendorExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVendorExtensions(VendorExtensionsType newVendorExtensions, NotificationChain msgs) {
		VendorExtensionsType oldVendorExtensions = vendorExtensions;
		vendorExtensions = newVendorExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, spiritPackage.SERVICE_TYPE1__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendorExtensions(VendorExtensionsType newVendorExtensions) {
		if (newVendorExtensions != vendorExtensions) {
			NotificationChain msgs = null;
			if (vendorExtensions != null)
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - spiritPackage.SERVICE_TYPE1__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - spiritPackage.SERVICE_TYPE1__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.SERVICE_TYPE1__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case spiritPackage.SERVICE_TYPE1__SERVICE_TYPE_DEFS:
				return basicSetServiceTypeDefs(null, msgs);
			case spiritPackage.SERVICE_TYPE1__VENDOR_EXTENSIONS:
				return basicSetVendorExtensions(null, msgs);
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
			case spiritPackage.SERVICE_TYPE1__INITIATIVE:
				return getInitiative();
			case spiritPackage.SERVICE_TYPE1__SERVICE_TYPE_DEFS:
				return getServiceTypeDefs();
			case spiritPackage.SERVICE_TYPE1__VENDOR_EXTENSIONS:
				return getVendorExtensions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case spiritPackage.SERVICE_TYPE1__INITIATIVE:
				setInitiative((InitiativeType1)newValue);
				return;
			case spiritPackage.SERVICE_TYPE1__SERVICE_TYPE_DEFS:
				setServiceTypeDefs((ServiceTypeDefsType)newValue);
				return;
			case spiritPackage.SERVICE_TYPE1__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)newValue);
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
			case spiritPackage.SERVICE_TYPE1__INITIATIVE:
				unsetInitiative();
				return;
			case spiritPackage.SERVICE_TYPE1__SERVICE_TYPE_DEFS:
				setServiceTypeDefs((ServiceTypeDefsType)null);
				return;
			case spiritPackage.SERVICE_TYPE1__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)null);
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
			case spiritPackage.SERVICE_TYPE1__INITIATIVE:
				return isSetInitiative();
			case spiritPackage.SERVICE_TYPE1__SERVICE_TYPE_DEFS:
				return serviceTypeDefs != null;
			case spiritPackage.SERVICE_TYPE1__VENDOR_EXTENSIONS:
				return vendorExtensions != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (initiative: ");
		if (initiativeESet) result.append(initiative); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ServiceType1Impl
