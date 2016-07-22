/**
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit.spirit.BitSteeringType;
import org.spiritconsortium.xml.schema.spirit.spirit.BitSteeringType1;
import org.spiritconsortium.xml.schema.spirit.spirit.FormatType;
import org.spiritconsortium.xml.schema.spirit.spirit.RangeTypeType;
import org.spiritconsortium.xml.schema.spirit.spirit.ResolveType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bit Steering Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BitSteeringType1Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BitSteeringType1Impl#getBitStringLength <em>Bit String Length</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BitSteeringType1Impl#getChoiceRef <em>Choice Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BitSteeringType1Impl#getConfigGroups <em>Config Groups</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BitSteeringType1Impl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BitSteeringType1Impl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BitSteeringType1Impl#getId <em>Id</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BitSteeringType1Impl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BitSteeringType1Impl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BitSteeringType1Impl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BitSteeringType1Impl#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BitSteeringType1Impl#getRangeType <em>Range Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BitSteeringType1Impl#getResolve <em>Resolve</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BitSteeringType1Impl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BitSteeringType1Impl extends MinimalEObjectImpl.Container implements BitSteeringType1 {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BitSteeringType VALUE_EDEFAULT = BitSteeringType.ON;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BitSteeringType value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getBitStringLength() <em>Bit String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitStringLength()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BIT_STRING_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBitStringLength() <em>Bit String Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitStringLength()
	 * @generated
	 * @ordered
	 */
	protected BigInteger bitStringLength = BIT_STRING_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getChoiceRef() <em>Choice Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoiceRef()
	 * @generated
	 * @ordered
	 */
	protected static final String CHOICE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChoiceRef() <em>Choice Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoiceRef()
	 * @generated
	 * @ordered
	 */
	protected String choiceRef = CHOICE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigGroups() <em>Config Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigGroups()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> CONFIG_GROUPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigGroups() <em>Config Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigGroups()
	 * @generated
	 * @ordered
	 */
	protected List<String> configGroups = CONFIG_GROUPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDependency() <em>Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected String dependency = DEPENDENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final FormatType FORMAT_EDEFAULT = FormatType.STRING;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected FormatType format = FORMAT_EDEFAULT;

	/**
	 * This is true if the Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean formatESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected String maximum = MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected String minimum = MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final float ORDER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected float order = ORDER_EDEFAULT;

	/**
	 * This is true if the Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean orderESet;

	/**
	 * The default value of the '{@link #getPrompt() <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrompt()
	 * @generated
	 * @ordered
	 */
	protected static final String PROMPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrompt() <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrompt()
	 * @generated
	 * @ordered
	 */
	protected String prompt = PROMPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRangeType() <em>Range Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeType()
	 * @generated
	 * @ordered
	 */
	protected static final RangeTypeType RANGE_TYPE_EDEFAULT = RangeTypeType.FLOAT;

	/**
	 * The cached value of the '{@link #getRangeType() <em>Range Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeType()
	 * @generated
	 * @ordered
	 */
	protected RangeTypeType rangeType = RANGE_TYPE_EDEFAULT;

	/**
	 * This is true if the Range Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rangeTypeESet;

	/**
	 * The default value of the '{@link #getResolve() <em>Resolve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolve()
	 * @generated
	 * @ordered
	 */
	protected static final ResolveType RESOLVE_EDEFAULT = ResolveType.IMMEDIATE;

	/**
	 * The cached value of the '{@link #getResolve() <em>Resolve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolve()
	 * @generated
	 * @ordered
	 */
	protected ResolveType resolve = RESOLVE_EDEFAULT;

	/**
	 * This is true if the Resolve attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resolveESet;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitSteeringType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return spiritPackage.eINSTANCE.getBitSteeringType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitSteeringType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(BitSteeringType newValue) {
		BitSteeringType oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BIT_STEERING_TYPE1__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		BitSteeringType oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, spiritPackage.BIT_STEERING_TYPE1__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
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
	public BigInteger getBitStringLength() {
		return bitStringLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitStringLength(BigInteger newBitStringLength) {
		BigInteger oldBitStringLength = bitStringLength;
		bitStringLength = newBitStringLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BIT_STEERING_TYPE1__BIT_STRING_LENGTH, oldBitStringLength, bitStringLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChoiceRef() {
		return choiceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoiceRef(String newChoiceRef) {
		String oldChoiceRef = choiceRef;
		choiceRef = newChoiceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BIT_STEERING_TYPE1__CHOICE_REF, oldChoiceRef, choiceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getConfigGroups() {
		return configGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigGroups(List<String> newConfigGroups) {
		List<String> oldConfigGroups = configGroups;
		configGroups = newConfigGroups;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BIT_STEERING_TYPE1__CONFIG_GROUPS, oldConfigGroups, configGroups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDependency() {
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependency(String newDependency) {
		String oldDependency = dependency;
		dependency = newDependency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BIT_STEERING_TYPE1__DEPENDENCY, oldDependency, dependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(FormatType newFormat) {
		FormatType oldFormat = format;
		format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
		boolean oldFormatESet = formatESet;
		formatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BIT_STEERING_TYPE1__FORMAT, oldFormat, format, !oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFormat() {
		FormatType oldFormat = format;
		boolean oldFormatESet = formatESet;
		format = FORMAT_EDEFAULT;
		formatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, spiritPackage.BIT_STEERING_TYPE1__FORMAT, oldFormat, FORMAT_EDEFAULT, oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFormat() {
		return formatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BIT_STEERING_TYPE1__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(String newMaximum) {
		String oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BIT_STEERING_TYPE1__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(String newMinimum) {
		String oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BIT_STEERING_TYPE1__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(float newOrder) {
		float oldOrder = order;
		order = newOrder;
		boolean oldOrderESet = orderESet;
		orderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BIT_STEERING_TYPE1__ORDER, oldOrder, order, !oldOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrder() {
		float oldOrder = order;
		boolean oldOrderESet = orderESet;
		order = ORDER_EDEFAULT;
		orderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, spiritPackage.BIT_STEERING_TYPE1__ORDER, oldOrder, ORDER_EDEFAULT, oldOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrder() {
		return orderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrompt() {
		return prompt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrompt(String newPrompt) {
		String oldPrompt = prompt;
		prompt = newPrompt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BIT_STEERING_TYPE1__PROMPT, oldPrompt, prompt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeTypeType getRangeType() {
		return rangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeType(RangeTypeType newRangeType) {
		RangeTypeType oldRangeType = rangeType;
		rangeType = newRangeType == null ? RANGE_TYPE_EDEFAULT : newRangeType;
		boolean oldRangeTypeESet = rangeTypeESet;
		rangeTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BIT_STEERING_TYPE1__RANGE_TYPE, oldRangeType, rangeType, !oldRangeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRangeType() {
		RangeTypeType oldRangeType = rangeType;
		boolean oldRangeTypeESet = rangeTypeESet;
		rangeType = RANGE_TYPE_EDEFAULT;
		rangeTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, spiritPackage.BIT_STEERING_TYPE1__RANGE_TYPE, oldRangeType, RANGE_TYPE_EDEFAULT, oldRangeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRangeType() {
		return rangeTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveType getResolve() {
		return resolve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolve(ResolveType newResolve) {
		ResolveType oldResolve = resolve;
		resolve = newResolve == null ? RESOLVE_EDEFAULT : newResolve;
		boolean oldResolveESet = resolveESet;
		resolveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BIT_STEERING_TYPE1__RESOLVE, oldResolve, resolve, !oldResolveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResolve() {
		ResolveType oldResolve = resolve;
		boolean oldResolveESet = resolveESet;
		resolve = RESOLVE_EDEFAULT;
		resolveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, spiritPackage.BIT_STEERING_TYPE1__RESOLVE, oldResolve, RESOLVE_EDEFAULT, oldResolveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResolve() {
		return resolveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, spiritPackage.BIT_STEERING_TYPE1__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case spiritPackage.BIT_STEERING_TYPE1__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case spiritPackage.BIT_STEERING_TYPE1__VALUE:
				return getValue();
			case spiritPackage.BIT_STEERING_TYPE1__BIT_STRING_LENGTH:
				return getBitStringLength();
			case spiritPackage.BIT_STEERING_TYPE1__CHOICE_REF:
				return getChoiceRef();
			case spiritPackage.BIT_STEERING_TYPE1__CONFIG_GROUPS:
				return getConfigGroups();
			case spiritPackage.BIT_STEERING_TYPE1__DEPENDENCY:
				return getDependency();
			case spiritPackage.BIT_STEERING_TYPE1__FORMAT:
				return getFormat();
			case spiritPackage.BIT_STEERING_TYPE1__ID:
				return getId();
			case spiritPackage.BIT_STEERING_TYPE1__MAXIMUM:
				return getMaximum();
			case spiritPackage.BIT_STEERING_TYPE1__MINIMUM:
				return getMinimum();
			case spiritPackage.BIT_STEERING_TYPE1__ORDER:
				return getOrder();
			case spiritPackage.BIT_STEERING_TYPE1__PROMPT:
				return getPrompt();
			case spiritPackage.BIT_STEERING_TYPE1__RANGE_TYPE:
				return getRangeType();
			case spiritPackage.BIT_STEERING_TYPE1__RESOLVE:
				return getResolve();
			case spiritPackage.BIT_STEERING_TYPE1__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case spiritPackage.BIT_STEERING_TYPE1__VALUE:
				setValue((BitSteeringType)newValue);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__BIT_STRING_LENGTH:
				setBitStringLength((BigInteger)newValue);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__CHOICE_REF:
				setChoiceRef((String)newValue);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__CONFIG_GROUPS:
				setConfigGroups((List<String>)newValue);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__DEPENDENCY:
				setDependency((String)newValue);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__FORMAT:
				setFormat((FormatType)newValue);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__ID:
				setId((String)newValue);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__MAXIMUM:
				setMaximum((String)newValue);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__MINIMUM:
				setMinimum((String)newValue);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__ORDER:
				setOrder((Float)newValue);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__PROMPT:
				setPrompt((String)newValue);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__RANGE_TYPE:
				setRangeType((RangeTypeType)newValue);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__RESOLVE:
				setResolve((ResolveType)newValue);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case spiritPackage.BIT_STEERING_TYPE1__VALUE:
				unsetValue();
				return;
			case spiritPackage.BIT_STEERING_TYPE1__BIT_STRING_LENGTH:
				setBitStringLength(BIT_STRING_LENGTH_EDEFAULT);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__CHOICE_REF:
				setChoiceRef(CHOICE_REF_EDEFAULT);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__CONFIG_GROUPS:
				setConfigGroups(CONFIG_GROUPS_EDEFAULT);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__DEPENDENCY:
				setDependency(DEPENDENCY_EDEFAULT);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__FORMAT:
				unsetFormat();
				return;
			case spiritPackage.BIT_STEERING_TYPE1__ID:
				setId(ID_EDEFAULT);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__ORDER:
				unsetOrder();
				return;
			case spiritPackage.BIT_STEERING_TYPE1__PROMPT:
				setPrompt(PROMPT_EDEFAULT);
				return;
			case spiritPackage.BIT_STEERING_TYPE1__RANGE_TYPE:
				unsetRangeType();
				return;
			case spiritPackage.BIT_STEERING_TYPE1__RESOLVE:
				unsetResolve();
				return;
			case spiritPackage.BIT_STEERING_TYPE1__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case spiritPackage.BIT_STEERING_TYPE1__VALUE:
				return isSetValue();
			case spiritPackage.BIT_STEERING_TYPE1__BIT_STRING_LENGTH:
				return BIT_STRING_LENGTH_EDEFAULT == null ? bitStringLength != null : !BIT_STRING_LENGTH_EDEFAULT.equals(bitStringLength);
			case spiritPackage.BIT_STEERING_TYPE1__CHOICE_REF:
				return CHOICE_REF_EDEFAULT == null ? choiceRef != null : !CHOICE_REF_EDEFAULT.equals(choiceRef);
			case spiritPackage.BIT_STEERING_TYPE1__CONFIG_GROUPS:
				return CONFIG_GROUPS_EDEFAULT == null ? configGroups != null : !CONFIG_GROUPS_EDEFAULT.equals(configGroups);
			case spiritPackage.BIT_STEERING_TYPE1__DEPENDENCY:
				return DEPENDENCY_EDEFAULT == null ? dependency != null : !DEPENDENCY_EDEFAULT.equals(dependency);
			case spiritPackage.BIT_STEERING_TYPE1__FORMAT:
				return isSetFormat();
			case spiritPackage.BIT_STEERING_TYPE1__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case spiritPackage.BIT_STEERING_TYPE1__MAXIMUM:
				return MAXIMUM_EDEFAULT == null ? maximum != null : !MAXIMUM_EDEFAULT.equals(maximum);
			case spiritPackage.BIT_STEERING_TYPE1__MINIMUM:
				return MINIMUM_EDEFAULT == null ? minimum != null : !MINIMUM_EDEFAULT.equals(minimum);
			case spiritPackage.BIT_STEERING_TYPE1__ORDER:
				return isSetOrder();
			case spiritPackage.BIT_STEERING_TYPE1__PROMPT:
				return PROMPT_EDEFAULT == null ? prompt != null : !PROMPT_EDEFAULT.equals(prompt);
			case spiritPackage.BIT_STEERING_TYPE1__RANGE_TYPE:
				return isSetRangeType();
			case spiritPackage.BIT_STEERING_TYPE1__RESOLVE:
				return isSetResolve();
			case spiritPackage.BIT_STEERING_TYPE1__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(", bitStringLength: ");
		result.append(bitStringLength);
		result.append(", choiceRef: ");
		result.append(choiceRef);
		result.append(", configGroups: ");
		result.append(configGroups);
		result.append(", dependency: ");
		result.append(dependency);
		result.append(", format: ");
		if (formatESet) result.append(format); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", minimum: ");
		result.append(minimum);
		result.append(", order: ");
		if (orderESet) result.append(order); else result.append("<unset>");
		result.append(", prompt: ");
		result.append(prompt);
		result.append(", rangeType: ");
		if (rangeTypeESet) result.append(rangeType); else result.append("<unset>");
		result.append(", resolve: ");
		if (resolveESet) result.append(resolve); else result.append("<unset>");
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //BitSteeringType1Impl
