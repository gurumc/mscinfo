/**
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spiritconsortium.xml.schema.spirit.spirit.CommandType1;
import org.spiritconsortium.xml.schema.spirit.spirit.FileBuilderType;
import org.spiritconsortium.xml.schema.spirit.spirit.FileTypeType;
import org.spiritconsortium.xml.schema.spirit.spirit.FlagsType1;
import org.spiritconsortium.xml.schema.spirit.spirit.ReplaceDefaultFlagsType;
import org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Builder Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.FileBuilderTypeImpl#getFileType <em>File Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.FileBuilderTypeImpl#getUserFileType <em>User File Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.FileBuilderTypeImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.FileBuilderTypeImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.FileBuilderTypeImpl#getReplaceDefaultFlags <em>Replace Default Flags</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileBuilderTypeImpl extends MinimalEObjectImpl.Container implements FileBuilderType {
	/**
	 * The default value of the '{@link #getFileType() <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileType()
	 * @generated
	 * @ordered
	 */
	protected static final FileTypeType FILE_TYPE_EDEFAULT = FileTypeType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getFileType() <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileType()
	 * @generated
	 * @ordered
	 */
	protected FileTypeType fileType = FILE_TYPE_EDEFAULT;

	/**
	 * This is true if the File Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fileTypeESet;

	/**
	 * The default value of the '{@link #getUserFileType() <em>User File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserFileType()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_FILE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserFileType() <em>User File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserFileType()
	 * @generated
	 * @ordered
	 */
	protected String userFileType = USER_FILE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected CommandType1 command;

	/**
	 * The cached value of the '{@link #getFlags() <em>Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected FlagsType1 flags;

	/**
	 * The cached value of the '{@link #getReplaceDefaultFlags() <em>Replace Default Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaceDefaultFlags()
	 * @generated
	 * @ordered
	 */
	protected ReplaceDefaultFlagsType replaceDefaultFlags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileBuilderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return spiritPackage.eINSTANCE.getFileBuilderType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTypeType getFileType() {
		return fileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileType(FileTypeType newFileType) {
		FileTypeType oldFileType = fileType;
		fileType = newFileType == null ? FILE_TYPE_EDEFAULT : newFileType;
		boolean oldFileTypeESet = fileTypeESet;
		fileTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.FILE_BUILDER_TYPE__FILE_TYPE, oldFileType, fileType, !oldFileTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFileType() {
		FileTypeType oldFileType = fileType;
		boolean oldFileTypeESet = fileTypeESet;
		fileType = FILE_TYPE_EDEFAULT;
		fileTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, spiritPackage.FILE_BUILDER_TYPE__FILE_TYPE, oldFileType, FILE_TYPE_EDEFAULT, oldFileTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFileType() {
		return fileTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserFileType() {
		return userFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserFileType(String newUserFileType) {
		String oldUserFileType = userFileType;
		userFileType = newUserFileType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.FILE_BUILDER_TYPE__USER_FILE_TYPE, oldUserFileType, userFileType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandType1 getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommand(CommandType1 newCommand, NotificationChain msgs) {
		CommandType1 oldCommand = command;
		command = newCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, spiritPackage.FILE_BUILDER_TYPE__COMMAND, oldCommand, newCommand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(CommandType1 newCommand) {
		if (newCommand != command) {
			NotificationChain msgs = null;
			if (command != null)
				msgs = ((InternalEObject)command).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - spiritPackage.FILE_BUILDER_TYPE__COMMAND, null, msgs);
			if (newCommand != null)
				msgs = ((InternalEObject)newCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - spiritPackage.FILE_BUILDER_TYPE__COMMAND, null, msgs);
			msgs = basicSetCommand(newCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.FILE_BUILDER_TYPE__COMMAND, newCommand, newCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagsType1 getFlags() {
		return flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlags(FlagsType1 newFlags, NotificationChain msgs) {
		FlagsType1 oldFlags = flags;
		flags = newFlags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, spiritPackage.FILE_BUILDER_TYPE__FLAGS, oldFlags, newFlags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlags(FlagsType1 newFlags) {
		if (newFlags != flags) {
			NotificationChain msgs = null;
			if (flags != null)
				msgs = ((InternalEObject)flags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - spiritPackage.FILE_BUILDER_TYPE__FLAGS, null, msgs);
			if (newFlags != null)
				msgs = ((InternalEObject)newFlags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - spiritPackage.FILE_BUILDER_TYPE__FLAGS, null, msgs);
			msgs = basicSetFlags(newFlags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.FILE_BUILDER_TYPE__FLAGS, newFlags, newFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceDefaultFlagsType getReplaceDefaultFlags() {
		return replaceDefaultFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplaceDefaultFlags(ReplaceDefaultFlagsType newReplaceDefaultFlags, NotificationChain msgs) {
		ReplaceDefaultFlagsType oldReplaceDefaultFlags = replaceDefaultFlags;
		replaceDefaultFlags = newReplaceDefaultFlags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, spiritPackage.FILE_BUILDER_TYPE__REPLACE_DEFAULT_FLAGS, oldReplaceDefaultFlags, newReplaceDefaultFlags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplaceDefaultFlags(ReplaceDefaultFlagsType newReplaceDefaultFlags) {
		if (newReplaceDefaultFlags != replaceDefaultFlags) {
			NotificationChain msgs = null;
			if (replaceDefaultFlags != null)
				msgs = ((InternalEObject)replaceDefaultFlags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - spiritPackage.FILE_BUILDER_TYPE__REPLACE_DEFAULT_FLAGS, null, msgs);
			if (newReplaceDefaultFlags != null)
				msgs = ((InternalEObject)newReplaceDefaultFlags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - spiritPackage.FILE_BUILDER_TYPE__REPLACE_DEFAULT_FLAGS, null, msgs);
			msgs = basicSetReplaceDefaultFlags(newReplaceDefaultFlags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, spiritPackage.FILE_BUILDER_TYPE__REPLACE_DEFAULT_FLAGS, newReplaceDefaultFlags, newReplaceDefaultFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case spiritPackage.FILE_BUILDER_TYPE__COMMAND:
				return basicSetCommand(null, msgs);
			case spiritPackage.FILE_BUILDER_TYPE__FLAGS:
				return basicSetFlags(null, msgs);
			case spiritPackage.FILE_BUILDER_TYPE__REPLACE_DEFAULT_FLAGS:
				return basicSetReplaceDefaultFlags(null, msgs);
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
			case spiritPackage.FILE_BUILDER_TYPE__FILE_TYPE:
				return getFileType();
			case spiritPackage.FILE_BUILDER_TYPE__USER_FILE_TYPE:
				return getUserFileType();
			case spiritPackage.FILE_BUILDER_TYPE__COMMAND:
				return getCommand();
			case spiritPackage.FILE_BUILDER_TYPE__FLAGS:
				return getFlags();
			case spiritPackage.FILE_BUILDER_TYPE__REPLACE_DEFAULT_FLAGS:
				return getReplaceDefaultFlags();
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
			case spiritPackage.FILE_BUILDER_TYPE__FILE_TYPE:
				setFileType((FileTypeType)newValue);
				return;
			case spiritPackage.FILE_BUILDER_TYPE__USER_FILE_TYPE:
				setUserFileType((String)newValue);
				return;
			case spiritPackage.FILE_BUILDER_TYPE__COMMAND:
				setCommand((CommandType1)newValue);
				return;
			case spiritPackage.FILE_BUILDER_TYPE__FLAGS:
				setFlags((FlagsType1)newValue);
				return;
			case spiritPackage.FILE_BUILDER_TYPE__REPLACE_DEFAULT_FLAGS:
				setReplaceDefaultFlags((ReplaceDefaultFlagsType)newValue);
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
			case spiritPackage.FILE_BUILDER_TYPE__FILE_TYPE:
				unsetFileType();
				return;
			case spiritPackage.FILE_BUILDER_TYPE__USER_FILE_TYPE:
				setUserFileType(USER_FILE_TYPE_EDEFAULT);
				return;
			case spiritPackage.FILE_BUILDER_TYPE__COMMAND:
				setCommand((CommandType1)null);
				return;
			case spiritPackage.FILE_BUILDER_TYPE__FLAGS:
				setFlags((FlagsType1)null);
				return;
			case spiritPackage.FILE_BUILDER_TYPE__REPLACE_DEFAULT_FLAGS:
				setReplaceDefaultFlags((ReplaceDefaultFlagsType)null);
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
			case spiritPackage.FILE_BUILDER_TYPE__FILE_TYPE:
				return isSetFileType();
			case spiritPackage.FILE_BUILDER_TYPE__USER_FILE_TYPE:
				return USER_FILE_TYPE_EDEFAULT == null ? userFileType != null : !USER_FILE_TYPE_EDEFAULT.equals(userFileType);
			case spiritPackage.FILE_BUILDER_TYPE__COMMAND:
				return command != null;
			case spiritPackage.FILE_BUILDER_TYPE__FLAGS:
				return flags != null;
			case spiritPackage.FILE_BUILDER_TYPE__REPLACE_DEFAULT_FLAGS:
				return replaceDefaultFlags != null;
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
		result.append(" (fileType: ");
		if (fileTypeESet) result.append(fileType); else result.append("<unset>");
		result.append(", userFileType: ");
		result.append(userFileType);
		result.append(')');
		return result.toString();
	}

} //FileBuilderTypeImpl
