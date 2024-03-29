/**
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit.spirit.CellClassType;
import org.spiritconsortium.xml.schema.spirit.spirit.CellClassValueType;
import org.spiritconsortium.xml.schema.spirit.spirit.CellStrengthValueType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell Class Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.CellClassTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.CellClassTypeImpl#getCellStrength <em>Cell Strength</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CellClassTypeImpl extends MinimalEObjectImpl.Container implements CellClassType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final CellClassValueType VALUE_EDEFAULT = CellClassValueType.COMBINATIONAL;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected CellClassValueType value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getCellStrength() <em>Cell Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellStrength()
	 * @generated
	 * @ordered
	 */
	protected static final CellStrengthValueType CELL_STRENGTH_EDEFAULT = CellStrengthValueType.LOW;

	/**
	 * The cached value of the '{@link #getCellStrength() <em>Cell Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellStrength()
	 * @generated
	 * @ordered
	 */
	protected CellStrengthValueType cellStrength = CELL_STRENGTH_EDEFAULT;

	/**
	 * This is true if the Cell Strength attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cellStrengthESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellClassTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return spiritPackage.eINSTANCE.getCellClassType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellClassValueType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(CellClassValueType newValue) {
		CellClassValueType oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.CELL_CLASS_TYPE__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		CellClassValueType oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, spiritPackage.CELL_CLASS_TYPE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellStrengthValueType getCellStrength() {
		return cellStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellStrength(CellStrengthValueType newCellStrength) {
		CellStrengthValueType oldCellStrength = cellStrength;
		cellStrength = newCellStrength == null ? CELL_STRENGTH_EDEFAULT : newCellStrength;
		boolean oldCellStrengthESet = cellStrengthESet;
		cellStrengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.CELL_CLASS_TYPE__CELL_STRENGTH, oldCellStrength, cellStrength, !oldCellStrengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCellStrength() {
		CellStrengthValueType oldCellStrength = cellStrength;
		boolean oldCellStrengthESet = cellStrengthESet;
		cellStrength = CELL_STRENGTH_EDEFAULT;
		cellStrengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, spiritPackage.CELL_CLASS_TYPE__CELL_STRENGTH, oldCellStrength, CELL_STRENGTH_EDEFAULT, oldCellStrengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCellStrength() {
		return cellStrengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case spiritPackage.CELL_CLASS_TYPE__VALUE:
				return getValue();
			case spiritPackage.CELL_CLASS_TYPE__CELL_STRENGTH:
				return getCellStrength();
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
			case spiritPackage.CELL_CLASS_TYPE__VALUE:
				setValue((CellClassValueType)newValue);
				return;
			case spiritPackage.CELL_CLASS_TYPE__CELL_STRENGTH:
				setCellStrength((CellStrengthValueType)newValue);
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
			case spiritPackage.CELL_CLASS_TYPE__VALUE:
				unsetValue();
				return;
			case spiritPackage.CELL_CLASS_TYPE__CELL_STRENGTH:
				unsetCellStrength();
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
			case spiritPackage.CELL_CLASS_TYPE__VALUE:
				return isSetValue();
			case spiritPackage.CELL_CLASS_TYPE__CELL_STRENGTH:
				return isSetCellStrength();
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
		result.append(" (value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(", cellStrength: ");
		if (cellStrengthESet) result.append(cellStrength); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CellClassTypeImpl
