/**
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit.spirit.BuildCommandType;
import org.spiritconsortium.xml.schema.spirit.spirit.CommandType;
import org.spiritconsortium.xml.schema.spirit.spirit.FlagsType;
import org.spiritconsortium.xml.schema.spirit.spirit.ReplaceDefaultFlagsType1;
import org.spiritconsortium.xml.schema.spirit.spirit.TargetNameType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Command Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BuildCommandTypeImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BuildCommandTypeImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BuildCommandTypeImpl#getReplaceDefaultFlags <em>Replace Default Flags</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BuildCommandTypeImpl#getTargetName <em>Target Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildCommandTypeImpl extends MinimalEObjectImpl.Container implements BuildCommandType {
	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected CommandType command;

	/**
	 * The cached value of the '{@link #getFlags() <em>Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected FlagsType flags;

	/**
	 * The cached value of the '{@link #getReplaceDefaultFlags() <em>Replace Default Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaceDefaultFlags()
	 * @generated
	 * @ordered
	 */
	protected ReplaceDefaultFlagsType1 replaceDefaultFlags;

	/**
	 * The cached value of the '{@link #getTargetName() <em>Target Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetName()
	 * @generated
	 * @ordered
	 */
	protected TargetNameType targetName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildCommandTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return spiritPackage.eINSTANCE.getBuildCommandType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandType getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommand(CommandType newCommand, NotificationChain msgs) {
		CommandType oldCommand = command;
		command = newCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, spiritPackage.BUILD_COMMAND_TYPE__COMMAND, oldCommand, newCommand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(CommandType newCommand) {
		if (newCommand != command) {
			NotificationChain msgs = null;
			if (command != null)
				msgs = ((InternalEObject)command).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BUILD_COMMAND_TYPE__COMMAND, null, msgs);
			if (newCommand != null)
				msgs = ((InternalEObject)newCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BUILD_COMMAND_TYPE__COMMAND, null, msgs);
			msgs = basicSetCommand(newCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BUILD_COMMAND_TYPE__COMMAND, newCommand, newCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagsType getFlags() {
		return flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlags(FlagsType newFlags, NotificationChain msgs) {
		FlagsType oldFlags = flags;
		flags = newFlags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, spiritPackage.BUILD_COMMAND_TYPE__FLAGS, oldFlags, newFlags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlags(FlagsType newFlags) {
		if (newFlags != flags) {
			NotificationChain msgs = null;
			if (flags != null)
				msgs = ((InternalEObject)flags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BUILD_COMMAND_TYPE__FLAGS, null, msgs);
			if (newFlags != null)
				msgs = ((InternalEObject)newFlags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BUILD_COMMAND_TYPE__FLAGS, null, msgs);
			msgs = basicSetFlags(newFlags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BUILD_COMMAND_TYPE__FLAGS, newFlags, newFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceDefaultFlagsType1 getReplaceDefaultFlags() {
		return replaceDefaultFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplaceDefaultFlags(ReplaceDefaultFlagsType1 newReplaceDefaultFlags, NotificationChain msgs) {
		ReplaceDefaultFlagsType1 oldReplaceDefaultFlags = replaceDefaultFlags;
		replaceDefaultFlags = newReplaceDefaultFlags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, spiritPackage.BUILD_COMMAND_TYPE__REPLACE_DEFAULT_FLAGS, oldReplaceDefaultFlags, newReplaceDefaultFlags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplaceDefaultFlags(ReplaceDefaultFlagsType1 newReplaceDefaultFlags) {
		if (newReplaceDefaultFlags != replaceDefaultFlags) {
			NotificationChain msgs = null;
			if (replaceDefaultFlags != null)
				msgs = ((InternalEObject)replaceDefaultFlags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BUILD_COMMAND_TYPE__REPLACE_DEFAULT_FLAGS, null, msgs);
			if (newReplaceDefaultFlags != null)
				msgs = ((InternalEObject)newReplaceDefaultFlags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BUILD_COMMAND_TYPE__REPLACE_DEFAULT_FLAGS, null, msgs);
			msgs = basicSetReplaceDefaultFlags(newReplaceDefaultFlags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BUILD_COMMAND_TYPE__REPLACE_DEFAULT_FLAGS, newReplaceDefaultFlags, newReplaceDefaultFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetNameType getTargetName() {
		return targetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetName(TargetNameType newTargetName, NotificationChain msgs) {
		TargetNameType oldTargetName = targetName;
		targetName = newTargetName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, spiritPackage.BUILD_COMMAND_TYPE__TARGET_NAME, oldTargetName, newTargetName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetName(TargetNameType newTargetName) {
		if (newTargetName != targetName) {
			NotificationChain msgs = null;
			if (targetName != null)
				msgs = ((InternalEObject)targetName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BUILD_COMMAND_TYPE__TARGET_NAME, null, msgs);
			if (newTargetName != null)
				msgs = ((InternalEObject)newTargetName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - spiritPackage.BUILD_COMMAND_TYPE__TARGET_NAME, null, msgs);
			msgs = basicSetTargetName(newTargetName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.BUILD_COMMAND_TYPE__TARGET_NAME, newTargetName, newTargetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case spiritPackage.BUILD_COMMAND_TYPE__COMMAND:
				return basicSetCommand(null, msgs);
			case spiritPackage.BUILD_COMMAND_TYPE__FLAGS:
				return basicSetFlags(null, msgs);
			case spiritPackage.BUILD_COMMAND_TYPE__REPLACE_DEFAULT_FLAGS:
				return basicSetReplaceDefaultFlags(null, msgs);
			case spiritPackage.BUILD_COMMAND_TYPE__TARGET_NAME:
				return basicSetTargetName(null, msgs);
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
			case spiritPackage.BUILD_COMMAND_TYPE__COMMAND:
				return getCommand();
			case spiritPackage.BUILD_COMMAND_TYPE__FLAGS:
				return getFlags();
			case spiritPackage.BUILD_COMMAND_TYPE__REPLACE_DEFAULT_FLAGS:
				return getReplaceDefaultFlags();
			case spiritPackage.BUILD_COMMAND_TYPE__TARGET_NAME:
				return getTargetName();
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
			case spiritPackage.BUILD_COMMAND_TYPE__COMMAND:
				setCommand((CommandType)newValue);
				return;
			case spiritPackage.BUILD_COMMAND_TYPE__FLAGS:
				setFlags((FlagsType)newValue);
				return;
			case spiritPackage.BUILD_COMMAND_TYPE__REPLACE_DEFAULT_FLAGS:
				setReplaceDefaultFlags((ReplaceDefaultFlagsType1)newValue);
				return;
			case spiritPackage.BUILD_COMMAND_TYPE__TARGET_NAME:
				setTargetName((TargetNameType)newValue);
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
			case spiritPackage.BUILD_COMMAND_TYPE__COMMAND:
				setCommand((CommandType)null);
				return;
			case spiritPackage.BUILD_COMMAND_TYPE__FLAGS:
				setFlags((FlagsType)null);
				return;
			case spiritPackage.BUILD_COMMAND_TYPE__REPLACE_DEFAULT_FLAGS:
				setReplaceDefaultFlags((ReplaceDefaultFlagsType1)null);
				return;
			case spiritPackage.BUILD_COMMAND_TYPE__TARGET_NAME:
				setTargetName((TargetNameType)null);
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
			case spiritPackage.BUILD_COMMAND_TYPE__COMMAND:
				return command != null;
			case spiritPackage.BUILD_COMMAND_TYPE__FLAGS:
				return flags != null;
			case spiritPackage.BUILD_COMMAND_TYPE__REPLACE_DEFAULT_FLAGS:
				return replaceDefaultFlags != null;
			case spiritPackage.BUILD_COMMAND_TYPE__TARGET_NAME:
				return targetName != null;
		}
		return super.eIsSet(featureID);
	}

} //BuildCommandTypeImpl
