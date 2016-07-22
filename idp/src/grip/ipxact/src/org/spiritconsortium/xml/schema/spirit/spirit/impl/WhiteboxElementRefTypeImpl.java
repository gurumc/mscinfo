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

import org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementRefType;
import org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxPathType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Whitebox Element Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.WhiteboxElementRefTypeImpl#getWhiteboxPath <em>Whitebox Path</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.WhiteboxElementRefTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhiteboxElementRefTypeImpl extends MinimalEObjectImpl.Container implements WhiteboxElementRefType {
	/**
	 * The cached value of the '{@link #getWhiteboxPath() <em>Whitebox Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhiteboxPath()
	 * @generated
	 * @ordered
	 */
	protected EList<WhiteboxPathType> whiteboxPath;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhiteboxElementRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return spiritPackage.eINSTANCE.getWhiteboxElementRefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WhiteboxPathType> getWhiteboxPath() {
		if (whiteboxPath == null) {
			whiteboxPath = new EObjectContainmentEList<WhiteboxPathType>(WhiteboxPathType.class, this, spiritPackage.WHITEBOX_ELEMENT_REF_TYPE__WHITEBOX_PATH);
		}
		return whiteboxPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.WHITEBOX_ELEMENT_REF_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case spiritPackage.WHITEBOX_ELEMENT_REF_TYPE__WHITEBOX_PATH:
				return ((InternalEList<?>)getWhiteboxPath()).basicRemove(otherEnd, msgs);
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
			case spiritPackage.WHITEBOX_ELEMENT_REF_TYPE__WHITEBOX_PATH:
				return getWhiteboxPath();
			case spiritPackage.WHITEBOX_ELEMENT_REF_TYPE__NAME:
				return getName();
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
			case spiritPackage.WHITEBOX_ELEMENT_REF_TYPE__WHITEBOX_PATH:
				getWhiteboxPath().clear();
				getWhiteboxPath().addAll((Collection<? extends WhiteboxPathType>)newValue);
				return;
			case spiritPackage.WHITEBOX_ELEMENT_REF_TYPE__NAME:
				setName((String)newValue);
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
			case spiritPackage.WHITEBOX_ELEMENT_REF_TYPE__WHITEBOX_PATH:
				getWhiteboxPath().clear();
				return;
			case spiritPackage.WHITEBOX_ELEMENT_REF_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case spiritPackage.WHITEBOX_ELEMENT_REF_TYPE__WHITEBOX_PATH:
				return whiteboxPath != null && !whiteboxPath.isEmpty();
			case spiritPackage.WHITEBOX_ELEMENT_REF_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WhiteboxElementRefTypeImpl
