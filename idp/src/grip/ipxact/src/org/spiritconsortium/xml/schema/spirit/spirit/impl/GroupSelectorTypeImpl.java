/**
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.spiritconsortium.xml.schema.spirit.spirit.GroupSelectorType;
import org.spiritconsortium.xml.schema.spirit.spirit.MultipleGroupSelectionOperatorType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Selector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.GroupSelectorTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.GroupSelectorTypeImpl#getMultipleGroupSelectionOperator <em>Multiple Group Selection Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupSelectorTypeImpl extends MinimalEObjectImpl.Container implements GroupSelectorType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> name;

	/**
	 * The default value of the '{@link #getMultipleGroupSelectionOperator() <em>Multiple Group Selection Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleGroupSelectionOperator()
	 * @generated
	 * @ordered
	 */
	protected static final MultipleGroupSelectionOperatorType MULTIPLE_GROUP_SELECTION_OPERATOR_EDEFAULT = MultipleGroupSelectionOperatorType.OR;

	/**
	 * The cached value of the '{@link #getMultipleGroupSelectionOperator() <em>Multiple Group Selection Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleGroupSelectionOperator()
	 * @generated
	 * @ordered
	 */
	protected MultipleGroupSelectionOperatorType multipleGroupSelectionOperator = MULTIPLE_GROUP_SELECTION_OPERATOR_EDEFAULT;

	/**
	 * This is true if the Multiple Group Selection Operator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multipleGroupSelectionOperatorESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupSelectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return spiritPackage.eINSTANCE.getGroupSelectorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getName() {
		if (name == null) {
			name = new EDataTypeEList<String>(String.class, this, spiritPackage.GROUP_SELECTOR_TYPE__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleGroupSelectionOperatorType getMultipleGroupSelectionOperator() {
		return multipleGroupSelectionOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleGroupSelectionOperator(MultipleGroupSelectionOperatorType newMultipleGroupSelectionOperator) {
		MultipleGroupSelectionOperatorType oldMultipleGroupSelectionOperator = multipleGroupSelectionOperator;
		multipleGroupSelectionOperator = newMultipleGroupSelectionOperator == null ? MULTIPLE_GROUP_SELECTION_OPERATOR_EDEFAULT : newMultipleGroupSelectionOperator;
		boolean oldMultipleGroupSelectionOperatorESet = multipleGroupSelectionOperatorESet;
		multipleGroupSelectionOperatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.GROUP_SELECTOR_TYPE__MULTIPLE_GROUP_SELECTION_OPERATOR, oldMultipleGroupSelectionOperator, multipleGroupSelectionOperator, !oldMultipleGroupSelectionOperatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultipleGroupSelectionOperator() {
		MultipleGroupSelectionOperatorType oldMultipleGroupSelectionOperator = multipleGroupSelectionOperator;
		boolean oldMultipleGroupSelectionOperatorESet = multipleGroupSelectionOperatorESet;
		multipleGroupSelectionOperator = MULTIPLE_GROUP_SELECTION_OPERATOR_EDEFAULT;
		multipleGroupSelectionOperatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, spiritPackage.GROUP_SELECTOR_TYPE__MULTIPLE_GROUP_SELECTION_OPERATOR, oldMultipleGroupSelectionOperator, MULTIPLE_GROUP_SELECTION_OPERATOR_EDEFAULT, oldMultipleGroupSelectionOperatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultipleGroupSelectionOperator() {
		return multipleGroupSelectionOperatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case spiritPackage.GROUP_SELECTOR_TYPE__NAME:
				return getName();
			case spiritPackage.GROUP_SELECTOR_TYPE__MULTIPLE_GROUP_SELECTION_OPERATOR:
				return getMultipleGroupSelectionOperator();
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
			case spiritPackage.GROUP_SELECTOR_TYPE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends String>)newValue);
				return;
			case spiritPackage.GROUP_SELECTOR_TYPE__MULTIPLE_GROUP_SELECTION_OPERATOR:
				setMultipleGroupSelectionOperator((MultipleGroupSelectionOperatorType)newValue);
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
			case spiritPackage.GROUP_SELECTOR_TYPE__NAME:
				getName().clear();
				return;
			case spiritPackage.GROUP_SELECTOR_TYPE__MULTIPLE_GROUP_SELECTION_OPERATOR:
				unsetMultipleGroupSelectionOperator();
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
			case spiritPackage.GROUP_SELECTOR_TYPE__NAME:
				return name != null && !name.isEmpty();
			case spiritPackage.GROUP_SELECTOR_TYPE__MULTIPLE_GROUP_SELECTION_OPERATOR:
				return isSetMultipleGroupSelectionOperator();
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
		result.append(", multipleGroupSelectionOperator: ");
		if (multipleGroupSelectionOperatorESet) result.append(multipleGroupSelectionOperator); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GroupSelectorTypeImpl
