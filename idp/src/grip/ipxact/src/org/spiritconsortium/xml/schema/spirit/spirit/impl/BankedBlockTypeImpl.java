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

import org.spiritconsortium.xml.schema.spirit.spirit.AccessType;
import org.spiritconsortium.xml.schema.spirit.spirit.BankedBlockType;
import org.spiritconsortium.xml.schema.spirit.spirit.ParametersType1;
import org.spiritconsortium.xml.schema.spirit.spirit.RangeType2;
import org.spiritconsortium.xml.schema.spirit.spirit.RegisterFileType;
import org.spiritconsortium.xml.schema.spirit.spirit.RegisterType;
import org.spiritconsortium.xml.schema.spirit.spirit.UsageType1;
import org.spiritconsortium.xml.schema.spirit.spirit.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit.spirit.WidthType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Banked Block Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BankedBlockTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BankedBlockTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BankedBlockTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BankedBlockTypeImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BankedBlockTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BankedBlockTypeImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BankedBlockTypeImpl#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BankedBlockTypeImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BankedBlockTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BankedBlockTypeImpl#getRegister <em>Register</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BankedBlockTypeImpl#getRegisterFile <em>Register File</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BankedBlockTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BankedBlockTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BankedBlockTypeImpl extends MinimalEObjectImpl.Container implements BankedBlockType {
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
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected RangeType2 range;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected WidthType width;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final UsageType1 USAGE_EDEFAULT = UsageType1.MEMORY;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected UsageType1 usage = USAGE_EDEFAULT;

	/**
	 * This is true if the Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usageESet;

	/**
	 * The default value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean volatile_ = VOLATILE_EDEFAULT;

	/**
	 * This is true if the Volatile attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean volatileESet;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final AccessType ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected AccessType access = ACCESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected ParametersType1 parameters;

	/**
	 * The cached value of the '{@link #getRegister() <em>Register</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegister()
	 * @generated
	 * @ordered
	 */
	protected EList<RegisterType> register;

	/**
	 * The cached value of the '{@link #getRegisterFile() <em>Register File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterFile()
	 * @generated
	 * @ordered
	 */
	protected EList<RegisterFileType> registerFile;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankedBlockTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return spiritPackage.eINSTANCE.getBankedBlockType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BANKED_BLOCK_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BANKED_BLOCK_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BANKED_BLOCK_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType2 getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(RangeType2 newRange, NotificationChain msgs) {
		RangeType2 oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, spiritPackage.BANKED_BLOCK_TYPE__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(RangeType2 newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BANKED_BLOCK_TYPE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BANKED_BLOCK_TYPE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BANKED_BLOCK_TYPE__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidthType getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidth(WidthType newWidth, NotificationChain msgs) {
		WidthType oldWidth = width;
		width = newWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, spiritPackage.BANKED_BLOCK_TYPE__WIDTH, oldWidth, newWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(WidthType newWidth) {
		if (newWidth != width) {
			NotificationChain msgs = null;
			if (width != null)
				msgs = ((InternalEObject)width).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BANKED_BLOCK_TYPE__WIDTH, null, msgs);
			if (newWidth != null)
				msgs = ((InternalEObject)newWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BANKED_BLOCK_TYPE__WIDTH, null, msgs);
			msgs = basicSetWidth(newWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BANKED_BLOCK_TYPE__WIDTH, newWidth, newWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType1 getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(UsageType1 newUsage) {
		UsageType1 oldUsage = usage;
		usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
		boolean oldUsageESet = usageESet;
		usageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BANKED_BLOCK_TYPE__USAGE, oldUsage, usage, !oldUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsage() {
		UsageType1 oldUsage = usage;
		boolean oldUsageESet = usageESet;
		usage = USAGE_EDEFAULT;
		usageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, spiritPackage.BANKED_BLOCK_TYPE__USAGE, oldUsage, USAGE_EDEFAULT, oldUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsage() {
		return usageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVolatile() {
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatile(boolean newVolatile) {
		boolean oldVolatile = volatile_;
		volatile_ = newVolatile;
		boolean oldVolatileESet = volatileESet;
		volatileESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BANKED_BLOCK_TYPE__VOLATILE, oldVolatile, volatile_, !oldVolatileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVolatile() {
		boolean oldVolatile = volatile_;
		boolean oldVolatileESet = volatileESet;
		volatile_ = VOLATILE_EDEFAULT;
		volatileESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, spiritPackage.BANKED_BLOCK_TYPE__VOLATILE, oldVolatile, VOLATILE_EDEFAULT, oldVolatileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVolatile() {
		return volatileESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(AccessType newAccess) {
		AccessType oldAccess = access;
		access = newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BANKED_BLOCK_TYPE__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersType1 getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(ParametersType1 newParameters, NotificationChain msgs) {
		ParametersType1 oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, spiritPackage.BANKED_BLOCK_TYPE__PARAMETERS, oldParameters, newParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(ParametersType1 newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BANKED_BLOCK_TYPE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BANKED_BLOCK_TYPE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BANKED_BLOCK_TYPE__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegisterType> getRegister() {
		if (register == null) {
			register = new EObjectContainmentEList<RegisterType>(RegisterType.class, this, spiritPackage.BANKED_BLOCK_TYPE__REGISTER);
		}
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegisterFileType> getRegisterFile() {
		if (registerFile == null) {
			registerFile = new EObjectContainmentEList<RegisterFileType>(RegisterFileType.class, this, spiritPackage.BANKED_BLOCK_TYPE__REGISTER_FILE);
		}
		return registerFile;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, spiritPackage.BANKED_BLOCK_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BANKED_BLOCK_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BANKED_BLOCK_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BANKED_BLOCK_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BANKED_BLOCK_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case spiritPackage.BANKED_BLOCK_TYPE__RANGE:
				return basicSetRange(null, msgs);
			case spiritPackage.BANKED_BLOCK_TYPE__WIDTH:
				return basicSetWidth(null, msgs);
			case spiritPackage.BANKED_BLOCK_TYPE__PARAMETERS:
				return basicSetParameters(null, msgs);
			case spiritPackage.BANKED_BLOCK_TYPE__REGISTER:
				return ((InternalEList<?>)getRegister()).basicRemove(otherEnd, msgs);
			case spiritPackage.BANKED_BLOCK_TYPE__REGISTER_FILE:
				return ((InternalEList<?>)getRegisterFile()).basicRemove(otherEnd, msgs);
			case spiritPackage.BANKED_BLOCK_TYPE__VENDOR_EXTENSIONS:
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
			case spiritPackage.BANKED_BLOCK_TYPE__NAME:
				return getName();
			case spiritPackage.BANKED_BLOCK_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case spiritPackage.BANKED_BLOCK_TYPE__DESCRIPTION:
				return getDescription();
			case spiritPackage.BANKED_BLOCK_TYPE__RANGE:
				return getRange();
			case spiritPackage.BANKED_BLOCK_TYPE__WIDTH:
				return getWidth();
			case spiritPackage.BANKED_BLOCK_TYPE__USAGE:
				return getUsage();
			case spiritPackage.BANKED_BLOCK_TYPE__VOLATILE:
				return isVolatile();
			case spiritPackage.BANKED_BLOCK_TYPE__ACCESS:
				return getAccess();
			case spiritPackage.BANKED_BLOCK_TYPE__PARAMETERS:
				return getParameters();
			case spiritPackage.BANKED_BLOCK_TYPE__REGISTER:
				return getRegister();
			case spiritPackage.BANKED_BLOCK_TYPE__REGISTER_FILE:
				return getRegisterFile();
			case spiritPackage.BANKED_BLOCK_TYPE__VENDOR_EXTENSIONS:
				return getVendorExtensions();
			case spiritPackage.BANKED_BLOCK_TYPE__ID:
				return getId();
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
			case spiritPackage.BANKED_BLOCK_TYPE__NAME:
				setName((String)newValue);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__RANGE:
				setRange((RangeType2)newValue);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__WIDTH:
				setWidth((WidthType)newValue);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__USAGE:
				setUsage((UsageType1)newValue);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__VOLATILE:
				setVolatile((Boolean)newValue);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__ACCESS:
				setAccess((AccessType)newValue);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__PARAMETERS:
				setParameters((ParametersType1)newValue);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__REGISTER:
				getRegister().clear();
				getRegister().addAll((Collection<? extends RegisterType>)newValue);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__REGISTER_FILE:
				getRegisterFile().clear();
				getRegisterFile().addAll((Collection<? extends RegisterFileType>)newValue);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)newValue);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__ID:
				setId((String)newValue);
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
			case spiritPackage.BANKED_BLOCK_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__RANGE:
				setRange((RangeType2)null);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__WIDTH:
				setWidth((WidthType)null);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__USAGE:
				unsetUsage();
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__VOLATILE:
				unsetVolatile();
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__PARAMETERS:
				setParameters((ParametersType1)null);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__REGISTER:
				getRegister().clear();
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__REGISTER_FILE:
				getRegisterFile().clear();
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)null);
				return;
			case spiritPackage.BANKED_BLOCK_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case spiritPackage.BANKED_BLOCK_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case spiritPackage.BANKED_BLOCK_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case spiritPackage.BANKED_BLOCK_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case spiritPackage.BANKED_BLOCK_TYPE__RANGE:
				return range != null;
			case spiritPackage.BANKED_BLOCK_TYPE__WIDTH:
				return width != null;
			case spiritPackage.BANKED_BLOCK_TYPE__USAGE:
				return isSetUsage();
			case spiritPackage.BANKED_BLOCK_TYPE__VOLATILE:
				return isSetVolatile();
			case spiritPackage.BANKED_BLOCK_TYPE__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case spiritPackage.BANKED_BLOCK_TYPE__PARAMETERS:
				return parameters != null;
			case spiritPackage.BANKED_BLOCK_TYPE__REGISTER:
				return register != null && !register.isEmpty();
			case spiritPackage.BANKED_BLOCK_TYPE__REGISTER_FILE:
				return registerFile != null && !registerFile.isEmpty();
			case spiritPackage.BANKED_BLOCK_TYPE__VENDOR_EXTENSIONS:
				return vendorExtensions != null;
			case spiritPackage.BANKED_BLOCK_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", description: ");
		result.append(description);
		result.append(", usage: ");
		if (usageESet) result.append(usage); else result.append("<unset>");
		result.append(", volatile: ");
		if (volatileESet) result.append(volatile_); else result.append("<unset>");
		result.append(", access: ");
		result.append(access);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //BankedBlockTypeImpl
