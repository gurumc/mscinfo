/**
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit.spirit.TestConstraintType;
import org.spiritconsortium.xml.schema.spirit.spirit.TestableType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testable Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.TestableTypeImpl#isValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.TestableTypeImpl#getTestConstraint <em>Test Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestableTypeImpl extends MinimalEObjectImpl.Container implements TestableType {
	/**
	 * The default value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected boolean value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getTestConstraint() <em>Test Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final TestConstraintType TEST_CONSTRAINT_EDEFAULT = TestConstraintType.UNCONSTRAINED;

	/**
	 * The cached value of the '{@link #getTestConstraint() <em>Test Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestConstraint()
	 * @generated
	 * @ordered
	 */
	protected TestConstraintType testConstraint = TEST_CONSTRAINT_EDEFAULT;

	/**
	 * This is true if the Test Constraint attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean testConstraintESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return spiritPackage.eINSTANCE.getTestableType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(boolean newValue) {
		boolean oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.TESTABLE_TYPE__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		boolean oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, spiritPackage.TESTABLE_TYPE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
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
	public TestConstraintType getTestConstraint() {
		return testConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestConstraint(TestConstraintType newTestConstraint) {
		TestConstraintType oldTestConstraint = testConstraint;
		testConstraint = newTestConstraint == null ? TEST_CONSTRAINT_EDEFAULT : newTestConstraint;
		boolean oldTestConstraintESet = testConstraintESet;
		testConstraintESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.TESTABLE_TYPE__TEST_CONSTRAINT, oldTestConstraint, testConstraint, !oldTestConstraintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTestConstraint() {
		TestConstraintType oldTestConstraint = testConstraint;
		boolean oldTestConstraintESet = testConstraintESet;
		testConstraint = TEST_CONSTRAINT_EDEFAULT;
		testConstraintESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, spiritPackage.TESTABLE_TYPE__TEST_CONSTRAINT, oldTestConstraint, TEST_CONSTRAINT_EDEFAULT, oldTestConstraintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTestConstraint() {
		return testConstraintESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case spiritPackage.TESTABLE_TYPE__VALUE:
				return isValue();
			case spiritPackage.TESTABLE_TYPE__TEST_CONSTRAINT:
				return getTestConstraint();
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
			case spiritPackage.TESTABLE_TYPE__VALUE:
				setValue((Boolean)newValue);
				return;
			case spiritPackage.TESTABLE_TYPE__TEST_CONSTRAINT:
				setTestConstraint((TestConstraintType)newValue);
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
			case spiritPackage.TESTABLE_TYPE__VALUE:
				unsetValue();
				return;
			case spiritPackage.TESTABLE_TYPE__TEST_CONSTRAINT:
				unsetTestConstraint();
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
			case spiritPackage.TESTABLE_TYPE__VALUE:
				return isSetValue();
			case spiritPackage.TESTABLE_TYPE__TEST_CONSTRAINT:
				return isSetTestConstraint();
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
		result.append(", testConstraint: ");
		if (testConstraintESet) result.append(testConstraint); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TestableTypeImpl
