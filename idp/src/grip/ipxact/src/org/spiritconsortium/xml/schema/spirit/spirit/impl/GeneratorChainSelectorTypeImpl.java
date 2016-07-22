/**
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit.spirit.GeneratorChainSelectorType;
import org.spiritconsortium.xml.schema.spirit.spirit.GroupSelectorType;
import org.spiritconsortium.xml.schema.spirit.spirit.LibraryRefType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Chain Selector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.GeneratorChainSelectorTypeImpl#getGroupSelector <em>Group Selector</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.GeneratorChainSelectorTypeImpl#getGeneratorChainRef <em>Generator Chain Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.GeneratorChainSelectorTypeImpl#isUnique <em>Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorChainSelectorTypeImpl extends MinimalEObjectImpl.Container implements GeneratorChainSelectorType {
	/**
	 * The cached value of the '{@link #getGroupSelector() <em>Group Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupSelector()
	 * @generated
	 * @ordered
	 */
	protected GroupSelectorType groupSelector;

	/**
	 * The cached value of the '{@link #getGeneratorChainRef() <em>Generator Chain Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorChainRef()
	 * @generated
	 * @ordered
	 */
	protected LibraryRefType generatorChainRef;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * This is true if the Unique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorChainSelectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return spiritPackage.eINSTANCE.getGeneratorChainSelectorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupSelectorType getGroupSelector() {
		return groupSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupSelector(GroupSelectorType newGroupSelector, NotificationChain msgs) {
		GroupSelectorType oldGroupSelector = groupSelector;
		groupSelector = newGroupSelector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GROUP_SELECTOR, oldGroupSelector, newGroupSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupSelector(GroupSelectorType newGroupSelector) {
		if (newGroupSelector != groupSelector) {
			NotificationChain msgs = null;
			if (groupSelector != null)
				msgs = ((InternalEObject)groupSelector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GROUP_SELECTOR, null, msgs);
			if (newGroupSelector != null)
				msgs = ((InternalEObject)newGroupSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GROUP_SELECTOR, null, msgs);
			msgs = basicSetGroupSelector(newGroupSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GROUP_SELECTOR, newGroupSelector, newGroupSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryRefType getGeneratorChainRef() {
		return generatorChainRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratorChainRef(LibraryRefType newGeneratorChainRef, NotificationChain msgs) {
		LibraryRefType oldGeneratorChainRef = generatorChainRef;
		generatorChainRef = newGeneratorChainRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GENERATOR_CHAIN_REF, oldGeneratorChainRef, newGeneratorChainRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorChainRef(LibraryRefType newGeneratorChainRef) {
		if (newGeneratorChainRef != generatorChainRef) {
			NotificationChain msgs = null;
			if (generatorChainRef != null)
				msgs = ((InternalEObject)generatorChainRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GENERATOR_CHAIN_REF, null, msgs);
			if (newGeneratorChainRef != null)
				msgs = ((InternalEObject)newGeneratorChainRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GENERATOR_CHAIN_REF, null, msgs);
			msgs = basicSetGeneratorChainRef(newGeneratorChainRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GENERATOR_CHAIN_REF, newGeneratorChainRef, newGeneratorChainRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		boolean oldUniqueESet = uniqueESet;
		uniqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__UNIQUE, oldUnique, unique, !oldUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnique() {
		boolean oldUnique = unique;
		boolean oldUniqueESet = uniqueESet;
		unique = UNIQUE_EDEFAULT;
		uniqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__UNIQUE, oldUnique, UNIQUE_EDEFAULT, oldUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnique() {
		return uniqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GROUP_SELECTOR:
				return basicSetGroupSelector(null, msgs);
			case spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GENERATOR_CHAIN_REF:
				return basicSetGeneratorChainRef(null, msgs);
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
			case spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GROUP_SELECTOR:
				return getGroupSelector();
			case spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GENERATOR_CHAIN_REF:
				return getGeneratorChainRef();
			case spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__UNIQUE:
				return isUnique();
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
			case spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GROUP_SELECTOR:
				setGroupSelector((GroupSelectorType)newValue);
				return;
			case spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GENERATOR_CHAIN_REF:
				setGeneratorChainRef((LibraryRefType)newValue);
				return;
			case spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__UNIQUE:
				setUnique((Boolean)newValue);
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
			case spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GROUP_SELECTOR:
				setGroupSelector((GroupSelectorType)null);
				return;
			case spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GENERATOR_CHAIN_REF:
				setGeneratorChainRef((LibraryRefType)null);
				return;
			case spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__UNIQUE:
				unsetUnique();
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
			case spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GROUP_SELECTOR:
				return groupSelector != null;
			case spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__GENERATOR_CHAIN_REF:
				return generatorChainRef != null;
			case spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE__UNIQUE:
				return isSetUnique();
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
		result.append(" (unique: ");
		if (uniqueESet) result.append(unique); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GeneratorChainSelectorTypeImpl
