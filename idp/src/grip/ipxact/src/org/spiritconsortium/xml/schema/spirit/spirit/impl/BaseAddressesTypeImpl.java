/**
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit.spirit.BaseAddressesType;
import org.spiritconsortium.xml.schema.spirit.spirit.RangeType;
import org.spiritconsortium.xml.schema.spirit.spirit.RemapAddressType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Addresses Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BaseAddressesTypeImpl#getRemapAddress <em>Remap Address</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BaseAddressesTypeImpl#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseAddressesTypeImpl extends MinimalEObjectImpl.Container implements BaseAddressesType {
	/**
	 * The cached value of the '{@link #getRemapAddress() <em>Remap Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemapAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<RemapAddressType> remapAddress;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected RangeType range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseAddressesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return spiritPackage.eINSTANCE.getBaseAddressesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemapAddressType> getRemapAddress() {
		if (remapAddress == null) {
			remapAddress = new EObjectContainmentEList<RemapAddressType>(RemapAddressType.class, this, spiritPackage.BASE_ADDRESSES_TYPE__REMAP_ADDRESS);
		}
		return remapAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(RangeType newRange, NotificationChain msgs) {
		RangeType oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, spiritPackage.BASE_ADDRESSES_TYPE__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(RangeType newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BASE_ADDRESSES_TYPE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BASE_ADDRESSES_TYPE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BASE_ADDRESSES_TYPE__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case spiritPackage.BASE_ADDRESSES_TYPE__REMAP_ADDRESS:
				return ((InternalEList<?>)getRemapAddress()).basicRemove(otherEnd, msgs);
			case spiritPackage.BASE_ADDRESSES_TYPE__RANGE:
				return basicSetRange(null, msgs);
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
			case spiritPackage.BASE_ADDRESSES_TYPE__REMAP_ADDRESS:
				return getRemapAddress();
			case spiritPackage.BASE_ADDRESSES_TYPE__RANGE:
				return getRange();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case spiritPackage.BASE_ADDRESSES_TYPE__REMAP_ADDRESS:
				getRemapAddress().clear();
				getRemapAddress().addAll((Collection<? extends RemapAddressType>)newValue);
				return;
			case spiritPackage.BASE_ADDRESSES_TYPE__RANGE:
				setRange((RangeType)newValue);
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
			case spiritPackage.BASE_ADDRESSES_TYPE__REMAP_ADDRESS:
				getRemapAddress().clear();
				return;
			case spiritPackage.BASE_ADDRESSES_TYPE__RANGE:
				setRange((RangeType)null);
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
			case spiritPackage.BASE_ADDRESSES_TYPE__REMAP_ADDRESS:
				return remapAddress != null && !remapAddress.isEmpty();
			case spiritPackage.BASE_ADDRESSES_TYPE__RANGE:
				return range != null;
		}
		return super.eIsSet(featureID);
	}

} //BaseAddressesTypeImpl
