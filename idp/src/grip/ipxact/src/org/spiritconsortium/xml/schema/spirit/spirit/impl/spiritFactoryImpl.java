/**
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.spiritconsortium.xml.schema.spirit.spirit.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class spiritFactoryImpl extends EFactoryImpl implements spiritFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static spiritFactory init() {
		try {
			spiritFactory thespiritFactory = (spiritFactory)EPackage.Registry.INSTANCE.getEFactory(spiritPackage.eNS_URI);
			if (thespiritFactory != null) {
				return thespiritFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new spiritFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public spiritFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case spiritPackage.ABSTRACTION_DEFINITION_TYPE: return createAbstractionDefinitionType();
			case spiritPackage.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE: return createAbstractionDefPortConstraintsType();
			case spiritPackage.ABSTRACTOR_BUS_INTERFACE_TYPE: return createAbstractorBusInterfaceType();
			case spiritPackage.ABSTRACTOR_GENERATORS_TYPE: return createAbstractorGeneratorsType();
			case spiritPackage.ABSTRACTOR_INTERFACES_TYPE: return createAbstractorInterfacesType();
			case spiritPackage.ABSTRACTOR_MODEL_TYPE: return createAbstractorModelType();
			case spiritPackage.ABSTRACTOR_MODE_TYPE1: return createAbstractorModeType1();
			case spiritPackage.ABSTRACTOR_PORT_TYPE: return createAbstractorPortType();
			case spiritPackage.ABSTRACTOR_PORT_WIRE_TYPE: return createAbstractorPortWireType();
			case spiritPackage.ABSTRACTORS_TYPE: return createAbstractorsType();
			case spiritPackage.ABSTRACTOR_TYPE: return createAbstractorType();
			case spiritPackage.ABSTRACTOR_TYPE1: return createAbstractorType1();
			case spiritPackage.ABSTRACTOR_VIEW_TYPE: return createAbstractorViewType();
			case spiritPackage.ADDRESS_BANK_TYPE: return createAddressBankType();
			case spiritPackage.ADDRESS_BLOCK_TYPE: return createAddressBlockType();
			case spiritPackage.ADDRESS_OFFSET_TYPE: return createAddressOffsetType();
			case spiritPackage.ADDRESS_SPACE_REF_TYPE: return createAddressSpaceRefType();
			case spiritPackage.ADDRESS_SPACES_TYPE: return createAddressSpacesType();
			case spiritPackage.ADDRESS_SPACE_TYPE: return createAddressSpaceType();
			case spiritPackage.ADDR_SPACE_REF_TYPE: return createAddrSpaceRefType();
			case spiritPackage.AD_HOC_CONNECTIONS_TYPE: return createAdHocConnectionsType();
			case spiritPackage.AD_HOC_CONNECTION_TYPE: return createAdHocConnectionType();
			case spiritPackage.ALTERNATE_GROUPS_TYPE: return createAlternateGroupsType();
			case spiritPackage.ALTERNATE_REGISTERS_TYPE: return createAlternateRegistersType();
			case spiritPackage.ALTERNATE_REGISTER_TYPE: return createAlternateRegisterType();
			case spiritPackage.ARGUMENT_TYPE: return createArgumentType();
			case spiritPackage.BANKED_BANK_TYPE: return createBankedBankType();
			case spiritPackage.BANKED_BLOCK_TYPE: return createBankedBlockType();
			case spiritPackage.BANKED_SUBSPACE_TYPE: return createBankedSubspaceType();
			case spiritPackage.BASE_ADDRESSES_TYPE: return createBaseAddressesType();
			case spiritPackage.BASE_ADDRESS_TYPE: return createBaseAddressType();
			case spiritPackage.BASE_ADDRESS_TYPE1: return createBaseAddressType1();
			case spiritPackage.BIT_STEERING_TYPE1: return createBitSteeringType1();
			case spiritPackage.BIT_WIDTH_TYPE: return createBitWidthType();
			case spiritPackage.BRIDGE_TYPE: return createBridgeType();
			case spiritPackage.BUILD_COMMAND_TYPE: return createBuildCommandType();
			case spiritPackage.BUS_DEFINITION_TYPE: return createBusDefinitionType();
			case spiritPackage.BUS_INTERFACES_TYPE: return createBusInterfacesType();
			case spiritPackage.BUS_INTERFACE_TYPE: return createBusInterfaceType();
			case spiritPackage.CELL_CLASS_TYPE: return createCellClassType();
			case spiritPackage.CELL_FUNCTION_TYPE: return createCellFunctionType();
			case spiritPackage.CELL_SPECIFICATION_TYPE: return createCellSpecificationType();
			case spiritPackage.CHANNELS_TYPE: return createChannelsType();
			case spiritPackage.CHANNEL_TYPE: return createChannelType();
			case spiritPackage.CHOICES_TYPE: return createChoicesType();
			case spiritPackage.CHOICE_TYPE: return createChoiceType();
			case spiritPackage.CLOCK_DRIVER_TYPE: return createClockDriverType();
			case spiritPackage.CLOCK_DRIVER_TYPE1: return createClockDriverType1();
			case spiritPackage.CLOCK_PERIOD_TYPE: return createClockPeriodType();
			case spiritPackage.CLOCK_PULSE_DURATION_TYPE: return createClockPulseDurationType();
			case spiritPackage.CLOCK_PULSE_OFFSET_TYPE: return createClockPulseOffsetType();
			case spiritPackage.CLOCK_PULSE_VALUE_TYPE: return createClockPulseValueType();
			case spiritPackage.COMMAND_LINE_SWITCH_TYPE: return createCommandLineSwitchType();
			case spiritPackage.COMMAND_TYPE: return createCommandType();
			case spiritPackage.COMMAND_TYPE1: return createCommandType1();
			case spiritPackage.COMMAND_TYPE2: return createCommandType2();
			case spiritPackage.COMPONENT_GENERATORS_TYPE: return createComponentGeneratorsType();
			case spiritPackage.COMPONENT_GENERATOR_TYPE: return createComponentGeneratorType();
			case spiritPackage.COMPONENT_INSTANCES_TYPE: return createComponentInstancesType();
			case spiritPackage.COMPONENT_INSTANCE_TYPE: return createComponentInstanceType();
			case spiritPackage.COMPONENT_TYPE: return createComponentType();
			case spiritPackage.CONFIGURABLE_ELEMENT_VALUES_TYPE: return createConfigurableElementValuesType();
			case spiritPackage.CONFIGURABLE_ELEMENT_VALUE_TYPE: return createConfigurableElementValueType();
			case spiritPackage.CONNECTION_TYPE: return createConnectionType();
			case spiritPackage.CONSTRAINT_SETS_TYPE: return createConstraintSetsType();
			case spiritPackage.CONSTRAINT_SET_TYPE: return createConstraintSetType();
			case spiritPackage.CPUS_TYPE: return createCpusType();
			case spiritPackage.CPU_TYPE: return createCpuType();
			case spiritPackage.DEFAULT_VALUE_TYPE: return createDefaultValueType();
			case spiritPackage.DESIGN_CONFIGURATION_TYPE: return createDesignConfigurationType();
			case spiritPackage.DESIGN_TYPE: return createDesignType();
			case spiritPackage.DISABLED_TYPE: return createDisabledType();
			case spiritPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case spiritPackage.DRIVE_CONSTRAINT_TYPE: return createDriveConstraintType();
			case spiritPackage.DRIVER_TYPE: return createDriverType();
			case spiritPackage.ENABLE_TYPE: return createEnableType();
			case spiritPackage.ENUMERATED_VALUES_TYPE: return createEnumeratedValuesType();
			case spiritPackage.ENUMERATED_VALUE_TYPE: return createEnumeratedValueType();
			case spiritPackage.ENUMERATION_TYPE: return createEnumerationType();
			case spiritPackage.EXECUTABLE_IMAGE_TYPE: return createExecutableImageType();
			case spiritPackage.EXTERNAL_PORT_REFERENCE_TYPE: return createExternalPortReferenceType();
			case spiritPackage.FIELD_TYPE: return createFieldType();
			case spiritPackage.FILE_BUILDER_TYPE: return createFileBuilderType();
			case spiritPackage.FILE_BUILDER_TYPE1: return createFileBuilderType1();
			case spiritPackage.FILE_SET_REF_GROUP_TYPE: return createFileSetRefGroupType();
			case spiritPackage.FILE_SET_REF_GROUP_TYPE1: return createFileSetRefGroupType1();
			case spiritPackage.FILE_SET_REF_TYPE: return createFileSetRefType();
			case spiritPackage.FILE_SETS_TYPE: return createFileSetsType();
			case spiritPackage.FILE_SET_TYPE: return createFileSetType();
			case spiritPackage.FILE_TYPE: return createFileType();
			case spiritPackage.FLAGS_TYPE: return createFlagsType();
			case spiritPackage.FLAGS_TYPE1: return createFlagsType1();
			case spiritPackage.FLAGS_TYPE2: return createFlagsType2();
			case spiritPackage.FUNCTION_TYPE: return createFunctionType();
			case spiritPackage.GENERATOR_CHAIN_CONFIGURATION_TYPE: return createGeneratorChainConfigurationType();
			case spiritPackage.GENERATOR_CHAIN_SELECTOR_TYPE: return createGeneratorChainSelectorType();
			case spiritPackage.GENERATOR_CHAIN_TYPE: return createGeneratorChainType();
			case spiritPackage.GENERATOR_SELECTOR_TYPE: return createGeneratorSelectorType();
			case spiritPackage.GENERATOR_TYPE: return createGeneratorType();
			case spiritPackage.GENERATOR_TYPE1: return createGeneratorType1();
			case spiritPackage.GROUP_SELECTOR_TYPE: return createGroupSelectorType();
			case spiritPackage.HIER_CONNECTIONS_TYPE: return createHierConnectionsType();
			case spiritPackage.HIER_CONNECTION_TYPE: return createHierConnectionType();
			case spiritPackage.HIER_INTERFACE: return createHierInterface();
			case spiritPackage.INSTANCE_GENERATOR_TYPE: return createInstanceGeneratorType();
			case spiritPackage.INTERCONNECTION_CONFIGURATION_TYPE: return createInterconnectionConfigurationType();
			case spiritPackage.INTERCONNECTIONS_TYPE: return createInterconnectionsType();
			case spiritPackage.INTERCONNECTION_TYPE: return createInterconnectionType();
			case spiritPackage.INTERFACE: return createInterface();
			case spiritPackage.INTERNAL_PORT_REFERENCE_TYPE: return createInternalPortReferenceType();
			case spiritPackage.IS_INCLUDE_FILE_TYPE: return createIsIncludeFileType();
			case spiritPackage.LANGUAGE_TOOLS_TYPE: return createLanguageToolsType();
			case spiritPackage.LANGUAGE_TYPE: return createLanguageType();
			case spiritPackage.LANGUAGE_TYPE1: return createLanguageType1();
			case spiritPackage.LEFT_TYPE: return createLeftType();
			case spiritPackage.LEFT_TYPE1: return createLeftType1();
			case spiritPackage.LEFT_TYPE2: return createLeftType2();
			case spiritPackage.LEFT_TYPE11: return createLeftType11();
			case spiritPackage.LIBRARY_REF_TYPE: return createLibraryRefType();
			case spiritPackage.LINKER_COMMAND_FILE_TYPE: return createLinkerCommandFileType();
			case spiritPackage.LINKER_FLAGS_TYPE: return createLinkerFlagsType();
			case spiritPackage.LINKER_TYPE: return createLinkerType();
			case spiritPackage.LOAD_CONSTRAINT_TYPE: return createLoadConstraintType();
			case spiritPackage.LOCAL_MEMORY_MAP_TYPE: return createLocalMemoryMapType();
			case spiritPackage.LOGICAL_NAME_TYPE: return createLogicalNameType();
			case spiritPackage.LOGICAL_PORT_TYPE: return createLogicalPortType();
			case spiritPackage.LOGICAL_PORT_TYPE1: return createLogicalPortType1();
			case spiritPackage.MASK_TYPE: return createMaskType();
			case spiritPackage.MASK_TYPE1: return createMaskType1();
			case spiritPackage.MASTER_TYPE: return createMasterType();
			case spiritPackage.MAXIMUM_TYPE: return createMaximumType();
			case spiritPackage.MEMORY_MAP_REF_TYPE: return createMemoryMapRefType();
			case spiritPackage.MEMORY_MAPS_TYPE: return createMemoryMapsType();
			case spiritPackage.MEMORY_MAP_TYPE: return createMemoryMapType();
			case spiritPackage.MEMORY_REMAP_TYPE: return createMemoryRemapType();
			case spiritPackage.MINIMUM_TYPE: return createMinimumType();
			case spiritPackage.MIRRORED_MASTER_TYPE: return createMirroredMasterType();
			case spiritPackage.MIRRORED_SLAVE_TYPE: return createMirroredSlaveType();
			case spiritPackage.MIRRORED_SYSTEM_TYPE: return createMirroredSystemType();
			case spiritPackage.MODEL_PARAMETERS_TYPE: return createModelParametersType();
			case spiritPackage.MODEL_PARAMETERS_TYPE1: return createModelParametersType1();
			case spiritPackage.MODEL_TYPE: return createModelType();
			case spiritPackage.MONITOR_INTERCONNECTION_TYPE: return createMonitorInterconnectionType();
			case spiritPackage.MONITOR_TYPE: return createMonitorType();
			case spiritPackage.NAME_TYPE: return createNameType();
			case spiritPackage.NAME_TYPE1: return createNameType1();
			case spiritPackage.NAME_TYPE2: return createNameType2();
			case spiritPackage.NAME_VALUE_PAIR_TYPE: return createNameValuePairType();
			case spiritPackage.NAME_VALUE_TYPE_TYPE: return createNameValueTypeType();
			case spiritPackage.ON_MASTER_TYPE: return createOnMasterType();
			case spiritPackage.ON_MASTER_TYPE1: return createOnMasterType1();
			case spiritPackage.ON_SLAVE_TYPE: return createOnSlaveType();
			case spiritPackage.ON_SLAVE_TYPE1: return createOnSlaveType1();
			case spiritPackage.ON_SYSTEM_TYPE: return createOnSystemType();
			case spiritPackage.ON_SYSTEM_TYPE1: return createOnSystemType1();
			case spiritPackage.OTHER_CLOCK_DRIVER_TYPE: return createOtherClockDriverType();
			case spiritPackage.OTHER_CLOCKS: return createOtherClocks();
			case spiritPackage.PARAMETERS_TYPE: return createParametersType();
			case spiritPackage.PARAMETERS_TYPE1: return createParametersType1();
			case spiritPackage.PHASE_TYPE: return createPhaseType();
			case spiritPackage.PHYSICAL_PORT_TYPE: return createPhysicalPortType();
			case spiritPackage.PHYSICAL_PORT_TYPE1: return createPhysicalPortType1();
			case spiritPackage.PORT_ACCESS_TYPE: return createPortAccessType();
			case spiritPackage.PORT_DECLARATION_TYPE: return createPortDeclarationType();
			case spiritPackage.PORT_MAPS_TYPE: return createPortMapsType();
			case spiritPackage.PORT_MAPS_TYPE1: return createPortMapsType1();
			case spiritPackage.PORT_MAP_TYPE: return createPortMapType();
			case spiritPackage.PORT_MAP_TYPE1: return createPortMapType1();
			case spiritPackage.PORTS_TYPE: return createPortsType();
			case spiritPackage.PORTS_TYPE1: return createPortsType1();
			case spiritPackage.PORTS_TYPE11: return createPortsType11();
			case spiritPackage.PORT_TRANSACTIONAL_TYPE: return createPortTransactionalType();
			case spiritPackage.PORT_TYPE: return createPortType();
			case spiritPackage.PORT_TYPE1: return createPortType1();
			case spiritPackage.PORT_WIRE_TYPE: return createPortWireType();
			case spiritPackage.QUALIFIER_TYPE: return createQualifierType();
			case spiritPackage.QUALIFIER_TYPE1: return createQualifierType1();
			case spiritPackage.RANGE_TYPE: return createRangeType();
			case spiritPackage.RANGE_TYPE1: return createRangeType1();
			case spiritPackage.RANGE_TYPE11: return createRangeType11();
			case spiritPackage.RANGE_TYPE2: return createRangeType2();
			case spiritPackage.REGISTER_FILE_TYPE: return createRegisterFileType();
			case spiritPackage.REGISTER_TYPE: return createRegisterType();
			case spiritPackage.REMAP_ADDRESS_TYPE: return createRemapAddressType();
			case spiritPackage.REMAP_PORTS_TYPE: return createRemapPortsType();
			case spiritPackage.REMAP_PORT_TYPE: return createRemapPortType();
			case spiritPackage.REMAP_STATES_TYPE: return createRemapStatesType();
			case spiritPackage.REMAP_STATE_TYPE: return createRemapStateType();
			case spiritPackage.REPLACE_DEFAULT_FLAGS_TYPE: return createReplaceDefaultFlagsType();
			case spiritPackage.REPLACE_DEFAULT_FLAGS_TYPE1: return createReplaceDefaultFlagsType1();
			case spiritPackage.REPLACE_DEFAULT_FLAGS_TYPE2: return createReplaceDefaultFlagsType2();
			case spiritPackage.REQUIRES_DRIVER_TYPE: return createRequiresDriverType();
			case spiritPackage.RESET_TYPE: return createResetType();
			case spiritPackage.RESET_TYPE1: return createResetType1();
			case spiritPackage.RESOLVED_LIBRARY_REF_TYPE: return createResolvedLibraryRefType();
			case spiritPackage.RIGHT_TYPE: return createRightType();
			case spiritPackage.RIGHT_TYPE1: return createRightType1();
			case spiritPackage.RIGHT_TYPE2: return createRightType2();
			case spiritPackage.RIGHT_TYPE11: return createRightType11();
			case spiritPackage.SEGMENTS_TYPE: return createSegmentsType();
			case spiritPackage.SEGMENT_TYPE: return createSegmentType();
			case spiritPackage.SERVICE_TYPE: return createServiceType();
			case spiritPackage.SERVICE_TYPE1: return createServiceType1();
			case spiritPackage.SERVICE_TYPE_DEFS_TYPE: return createServiceTypeDefsType();
			case spiritPackage.SERVICE_TYPE_DEF_TYPE: return createServiceTypeDefType();
			case spiritPackage.SINGLE_SHOT_DRIVER_TYPE: return createSingleShotDriverType();
			case spiritPackage.SINGLE_SHOT_DURATION_TYPE: return createSingleShotDurationType();
			case spiritPackage.SINGLE_SHOT_OFFSET_TYPE: return createSingleShotOffsetType();
			case spiritPackage.SINGLE_SHOT_VALUE_TYPE: return createSingleShotValueType();
			case spiritPackage.SIZE_TYPE: return createSizeType();
			case spiritPackage.SLAVE_TYPE: return createSlaveType();
			case spiritPackage.SOURCE_FILE_TYPE: return createSourceFileType();
			case spiritPackage.SOURCE_NAME_TYPE: return createSourceNameType();
			case spiritPackage.SUBSPACE_REF_TYPE: return createSubspaceRefType();
			case spiritPackage.SYSTEM_GROUP_NAMES_TYPE: return createSystemGroupNamesType();
			case spiritPackage.SYSTEM_TYPE: return createSystemType();
			case spiritPackage.TARGET_NAME_TYPE: return createTargetNameType();
			case spiritPackage.TESTABLE_TYPE: return createTestableType();
			case spiritPackage.TIMING_CONSTRAINT_TYPE: return createTimingConstraintType();
			case spiritPackage.TRANSACTIONAL_TYPE: return createTransactionalType();
			case spiritPackage.TRANSPORT_METHODS_TYPE: return createTransportMethodsType();
			case spiritPackage.TRANS_TYPE_DEF_TYPE: return createTransTypeDefType();
			case spiritPackage.TYPE_NAME_TYPE: return createTypeNameType();
			case spiritPackage.TYPE_NAME_TYPE1: return createTypeNameType1();
			case spiritPackage.TYPE_NAME_TYPE11: return createTypeNameType11();
			case spiritPackage.TYPE_NAME_TYPE2: return createTypeNameType2();
			case spiritPackage.VALUE_MASK_CONFIG_TYPE: return createValueMaskConfigType();
			case spiritPackage.VALUE_TYPE: return createValueType();
			case spiritPackage.VALUE_TYPE1: return createValueType1();
			case spiritPackage.VALUE_TYPE2: return createValueType2();
			case spiritPackage.VECTOR_TYPE: return createVectorType();
			case spiritPackage.VECTOR_TYPE1: return createVectorType1();
			case spiritPackage.VECTOR_TYPE2: return createVectorType2();
			case spiritPackage.VECTOR_TYPE11: return createVectorType11();
			case spiritPackage.VENDOR_EXTENSIONS_TYPE: return createVendorExtensionsType();
			case spiritPackage.VIEW_CONFIGURATION_TYPE: return createViewConfigurationType();
			case spiritPackage.VIEWS_TYPE: return createViewsType();
			case spiritPackage.VIEWS_TYPE1: return createViewsType1();
			case spiritPackage.VIEW_TYPE: return createViewType();
			case spiritPackage.WHITEBOX_ELEMENT_REFS_TYPE: return createWhiteboxElementRefsType();
			case spiritPackage.WHITEBOX_ELEMENT_REF_TYPE: return createWhiteboxElementRefType();
			case spiritPackage.WHITEBOX_ELEMENTS_TYPE: return createWhiteboxElementsType();
			case spiritPackage.WHITEBOX_ELEMENT_TYPE: return createWhiteboxElementType();
			case spiritPackage.WHITEBOX_PATH_TYPE: return createWhiteboxPathType();
			case spiritPackage.WIDTH_TYPE: return createWidthType();
			case spiritPackage.WIRE_TYPE: return createWireType();
			case spiritPackage.WIRE_TYPE_DEFS_TYPE: return createWireTypeDefsType();
			case spiritPackage.WIRE_TYPE_DEF_TYPE: return createWireTypeDefType();
			case spiritPackage.WRITE_VALUE_CONSTRAINT_TYPE: return createWriteValueConstraintType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case spiritPackage.ABSTRACTOR_MODE_TYPE:
				return createAbstractorModeTypeFromString(eDataType, initialValue);
			case spiritPackage.ACCESS_TYPE:
				return createAccessTypeFromString(eDataType, initialValue);
			case spiritPackage.API_TYPE_TYPE:
				return createApiTypeTypeFromString(eDataType, initialValue);
			case spiritPackage.BANK_ALIGNMENT_TYPE:
				return createBankAlignmentTypeFromString(eDataType, initialValue);
			case spiritPackage.BIT_STEERING_TYPE:
				return createBitSteeringTypeFromString(eDataType, initialValue);
			case spiritPackage.CELL_CLASS_VALUE_TYPE:
				return createCellClassValueTypeFromString(eDataType, initialValue);
			case spiritPackage.CELL_FUNCTION_VALUE_TYPE:
				return createCellFunctionValueTypeFromString(eDataType, initialValue);
			case spiritPackage.CELL_STRENGTH_VALUE_TYPE:
				return createCellStrengthValueTypeFromString(eDataType, initialValue);
			case spiritPackage.COMPONENT_PORT_DIRECTION_TYPE:
				return createComponentPortDirectionTypeFromString(eDataType, initialValue);
			case spiritPackage.DATA_TYPE_TYPE:
				return createDataTypeTypeFromString(eDataType, initialValue);
			case spiritPackage.DELAY_VALUE_TYPE:
				return createDelayValueTypeFromString(eDataType, initialValue);
			case spiritPackage.DELAY_VALUE_UNIT_TYPE:
				return createDelayValueUnitTypeFromString(eDataType, initialValue);
			case spiritPackage.DIRECTION_TYPE:
				return createDirectionTypeFromString(eDataType, initialValue);
			case spiritPackage.DRIVER_TYPE_TYPE:
				return createDriverTypeTypeFromString(eDataType, initialValue);
			case spiritPackage.EDGE_VALUE_TYPE:
				return createEdgeValueTypeFromString(eDataType, initialValue);
			case spiritPackage.ENDIANESS_TYPE:
				return createEndianessTypeFromString(eDataType, initialValue);
			case spiritPackage.FILE_TYPE_TYPE:
				return createFileTypeTypeFromString(eDataType, initialValue);
			case spiritPackage.FORMAT_TYPE:
				return createFormatTypeFromString(eDataType, initialValue);
			case spiritPackage.INITIATIVE_TYPE:
				return createInitiativeTypeFromString(eDataType, initialValue);
			case spiritPackage.INITIATIVE_TYPE1:
				return createInitiativeType1FromString(eDataType, initialValue);
			case spiritPackage.INTERFACE_MODE_TYPE:
				return createInterfaceModeTypeFromString(eDataType, initialValue);
			case spiritPackage.MODIFIED_WRITE_VALUE_TYPE:
				return createModifiedWriteValueTypeFromString(eDataType, initialValue);
			case spiritPackage.MULTIPLE_GROUP_SELECTION_OPERATOR_TYPE:
				return createMultipleGroupSelectionOperatorTypeFromString(eDataType, initialValue);
			case spiritPackage.PORT_ACCESS_TYPE_TYPE:
				return createPortAccessTypeTypeFromString(eDataType, initialValue);
			case spiritPackage.PRESENCE_TYPE:
				return createPresenceTypeFromString(eDataType, initialValue);
			case spiritPackage.RANGE_TYPE_TYPE:
				return createRangeTypeTypeFromString(eDataType, initialValue);
			case spiritPackage.READ_ACTION_TYPE:
				return createReadActionTypeFromString(eDataType, initialValue);
			case spiritPackage.RESOLVE_TYPE:
				return createResolveTypeFromString(eDataType, initialValue);
			case spiritPackage.RETURN_TYPE_TYPE:
				return createReturnTypeTypeFromString(eDataType, initialValue);
			case spiritPackage.SCOPE_TYPE:
				return createScopeTypeFromString(eDataType, initialValue);
			case spiritPackage.TEST_CONSTRAINT_TYPE:
				return createTestConstraintTypeFromString(eDataType, initialValue);
			case spiritPackage.TRANSPORT_METHOD_TYPE:
				return createTransportMethodTypeFromString(eDataType, initialValue);
			case spiritPackage.USAGE_TYPE:
				return createUsageTypeFromString(eDataType, initialValue);
			case spiritPackage.USAGE_TYPE1:
				return createUsageType1FromString(eDataType, initialValue);
			case spiritPackage.USAGE_TYPE_TYPE:
				return createUsageTypeTypeFromString(eDataType, initialValue);
			case spiritPackage.WHITEBOX_TYPE_TYPE:
				return createWhiteboxTypeTypeFromString(eDataType, initialValue);
			case spiritPackage.ABSTRACTOR_MODE_TYPE_OBJECT:
				return createAbstractorModeTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.ACCESS_TYPE1:
				return createAccessType1FromString(eDataType, initialValue);
			case spiritPackage.ACCESS_TYPE_OBJECT:
				return createAccessTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.API_TYPE_TYPE_OBJECT:
				return createApiTypeTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.BANK_ALIGNMENT_TYPE_OBJECT:
				return createBankAlignmentTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.BIT_STEERING_TYPE_OBJECT:
				return createBitSteeringTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.CELL_CLASS_VALUE_TYPE_OBJECT:
				return createCellClassValueTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.CELL_FUNCTION_VALUE_TYPE_OBJECT:
				return createCellFunctionValueTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.CELL_STRENGTH_VALUE_TYPE_OBJECT:
				return createCellStrengthValueTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.COMPONENT_PORT_DIRECTION_TYPE_OBJECT:
				return createComponentPortDirectionTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.CONFIGURABLE_DOUBLE:
				return createConfigurableDoubleFromString(eDataType, initialValue);
			case spiritPackage.DATA_TYPE_TYPE_OBJECT:
				return createDataTypeTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.DELAY_PERCENTAGE_TYPE:
				return createDelayPercentageTypeFromString(eDataType, initialValue);
			case spiritPackage.DELAY_PERCENTAGE_TYPE_OBJECT:
				return createDelayPercentageTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.DELAY_VALUE_TYPE_OBJECT:
				return createDelayValueTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.DELAY_VALUE_UNIT_TYPE_OBJECT:
				return createDelayValueUnitTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.DIRECTION_TYPE_OBJECT:
				return createDirectionTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.DOUBLE_LIST:
				return createDoubleListFromString(eDataType, initialValue);
			case spiritPackage.DRIVER_TYPE_TYPE_OBJECT:
				return createDriverTypeTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.EDGE_VALUE_TYPE_OBJECT:
				return createEdgeValueTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.ENDIANESS_TYPE_OBJECT:
				return createEndianessTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.ENV_IDENTIFIER_TYPE:
				return createEnvIdentifierTypeFromString(eDataType, initialValue);
			case spiritPackage.ENV_IDENTIFIER_TYPE1:
				return createEnvIdentifierType1FromString(eDataType, initialValue);
			case spiritPackage.FILE_TYPE_TYPE_OBJECT:
				return createFileTypeTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.FORMAT_TYPE_OBJECT:
				return createFormatTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.INITIATIVE_TYPE_OBJECT:
				return createInitiativeTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.INITIATIVE_TYPE_OBJECT1:
				return createInitiativeTypeObject1FromString(eDataType, initialValue);
			case spiritPackage.INSTANCE_PATH:
				return createInstancePathFromString(eDataType, initialValue);
			case spiritPackage.INTERFACE_MODE_TYPE_OBJECT:
				return createInterfaceModeTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.MODIFIED_WRITE_VALUE_TYPE_OBJECT:
				return createModifiedWriteValueTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.MULTIPLE_GROUP_SELECTION_OPERATOR_TYPE_OBJECT:
				return createMultipleGroupSelectionOperatorTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.NON_NEGATIVE_FLOAT:
				return createNonNegativeFloatFromString(eDataType, initialValue);
			case spiritPackage.NON_NEGATIVE_FLOAT_OBJECT:
				return createNonNegativeFloatObjectFromString(eDataType, initialValue);
			case spiritPackage.PORT_ACCESS_TYPE_TYPE_OBJECT:
				return createPortAccessTypeTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.PORT_NAME:
				return createPortNameFromString(eDataType, initialValue);
			case spiritPackage.PRESENCE_TYPE_OBJECT:
				return createPresenceTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.RANGE_TYPE_TYPE_OBJECT:
				return createRangeTypeTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.READ_ACTION_TYPE_OBJECT:
				return createReadActionTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.RESOLVE_TYPE_OBJECT:
				return createResolveTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.RETURN_TYPE_TYPE_OBJECT:
				return createReturnTypeTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.SCALED_INTEGER:
				return createScaledIntegerFromString(eDataType, initialValue);
			case spiritPackage.SCALED_NON_NEGATIVE_INTEGER:
				return createScaledNonNegativeIntegerFromString(eDataType, initialValue);
			case spiritPackage.SCALED_POSITIVE_INTEGER:
				return createScaledPositiveIntegerFromString(eDataType, initialValue);
			case spiritPackage.SCOPE_TYPE_OBJECT:
				return createScopeTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.SPIRIT_URI:
				return createSpiritURIFromString(eDataType, initialValue);
			case spiritPackage.TEST_CONSTRAINT_TYPE_OBJECT:
				return createTestConstraintTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.TRANSPORT_METHOD_TYPE_OBJECT:
				return createTransportMethodTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.USAGE_TYPE_OBJECT:
				return createUsageTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.USAGE_TYPE_OBJECT1:
				return createUsageTypeObject1FromString(eDataType, initialValue);
			case spiritPackage.USAGE_TYPE_TYPE_OBJECT:
				return createUsageTypeTypeObjectFromString(eDataType, initialValue);
			case spiritPackage.WHITEBOX_TYPE_TYPE_OBJECT:
				return createWhiteboxTypeTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case spiritPackage.ABSTRACTOR_MODE_TYPE:
				return convertAbstractorModeTypeToString(eDataType, instanceValue);
			case spiritPackage.ACCESS_TYPE:
				return convertAccessTypeToString(eDataType, instanceValue);
			case spiritPackage.API_TYPE_TYPE:
				return convertApiTypeTypeToString(eDataType, instanceValue);
			case spiritPackage.BANK_ALIGNMENT_TYPE:
				return convertBankAlignmentTypeToString(eDataType, instanceValue);
			case spiritPackage.BIT_STEERING_TYPE:
				return convertBitSteeringTypeToString(eDataType, instanceValue);
			case spiritPackage.CELL_CLASS_VALUE_TYPE:
				return convertCellClassValueTypeToString(eDataType, instanceValue);
			case spiritPackage.CELL_FUNCTION_VALUE_TYPE:
				return convertCellFunctionValueTypeToString(eDataType, instanceValue);
			case spiritPackage.CELL_STRENGTH_VALUE_TYPE:
				return convertCellStrengthValueTypeToString(eDataType, instanceValue);
			case spiritPackage.COMPONENT_PORT_DIRECTION_TYPE:
				return convertComponentPortDirectionTypeToString(eDataType, instanceValue);
			case spiritPackage.DATA_TYPE_TYPE:
				return convertDataTypeTypeToString(eDataType, instanceValue);
			case spiritPackage.DELAY_VALUE_TYPE:
				return convertDelayValueTypeToString(eDataType, instanceValue);
			case spiritPackage.DELAY_VALUE_UNIT_TYPE:
				return convertDelayValueUnitTypeToString(eDataType, instanceValue);
			case spiritPackage.DIRECTION_TYPE:
				return convertDirectionTypeToString(eDataType, instanceValue);
			case spiritPackage.DRIVER_TYPE_TYPE:
				return convertDriverTypeTypeToString(eDataType, instanceValue);
			case spiritPackage.EDGE_VALUE_TYPE:
				return convertEdgeValueTypeToString(eDataType, instanceValue);
			case spiritPackage.ENDIANESS_TYPE:
				return convertEndianessTypeToString(eDataType, instanceValue);
			case spiritPackage.FILE_TYPE_TYPE:
				return convertFileTypeTypeToString(eDataType, instanceValue);
			case spiritPackage.FORMAT_TYPE:
				return convertFormatTypeToString(eDataType, instanceValue);
			case spiritPackage.INITIATIVE_TYPE:
				return convertInitiativeTypeToString(eDataType, instanceValue);
			case spiritPackage.INITIATIVE_TYPE1:
				return convertInitiativeType1ToString(eDataType, instanceValue);
			case spiritPackage.INTERFACE_MODE_TYPE:
				return convertInterfaceModeTypeToString(eDataType, instanceValue);
			case spiritPackage.MODIFIED_WRITE_VALUE_TYPE:
				return convertModifiedWriteValueTypeToString(eDataType, instanceValue);
			case spiritPackage.MULTIPLE_GROUP_SELECTION_OPERATOR_TYPE:
				return convertMultipleGroupSelectionOperatorTypeToString(eDataType, instanceValue);
			case spiritPackage.PORT_ACCESS_TYPE_TYPE:
				return convertPortAccessTypeTypeToString(eDataType, instanceValue);
			case spiritPackage.PRESENCE_TYPE:
				return convertPresenceTypeToString(eDataType, instanceValue);
			case spiritPackage.RANGE_TYPE_TYPE:
				return convertRangeTypeTypeToString(eDataType, instanceValue);
			case spiritPackage.READ_ACTION_TYPE:
				return convertReadActionTypeToString(eDataType, instanceValue);
			case spiritPackage.RESOLVE_TYPE:
				return convertResolveTypeToString(eDataType, instanceValue);
			case spiritPackage.RETURN_TYPE_TYPE:
				return convertReturnTypeTypeToString(eDataType, instanceValue);
			case spiritPackage.SCOPE_TYPE:
				return convertScopeTypeToString(eDataType, instanceValue);
			case spiritPackage.TEST_CONSTRAINT_TYPE:
				return convertTestConstraintTypeToString(eDataType, instanceValue);
			case spiritPackage.TRANSPORT_METHOD_TYPE:
				return convertTransportMethodTypeToString(eDataType, instanceValue);
			case spiritPackage.USAGE_TYPE:
				return convertUsageTypeToString(eDataType, instanceValue);
			case spiritPackage.USAGE_TYPE1:
				return convertUsageType1ToString(eDataType, instanceValue);
			case spiritPackage.USAGE_TYPE_TYPE:
				return convertUsageTypeTypeToString(eDataType, instanceValue);
			case spiritPackage.WHITEBOX_TYPE_TYPE:
				return convertWhiteboxTypeTypeToString(eDataType, instanceValue);
			case spiritPackage.ABSTRACTOR_MODE_TYPE_OBJECT:
				return convertAbstractorModeTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.ACCESS_TYPE1:
				return convertAccessType1ToString(eDataType, instanceValue);
			case spiritPackage.ACCESS_TYPE_OBJECT:
				return convertAccessTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.API_TYPE_TYPE_OBJECT:
				return convertApiTypeTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.BANK_ALIGNMENT_TYPE_OBJECT:
				return convertBankAlignmentTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.BIT_STEERING_TYPE_OBJECT:
				return convertBitSteeringTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.CELL_CLASS_VALUE_TYPE_OBJECT:
				return convertCellClassValueTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.CELL_FUNCTION_VALUE_TYPE_OBJECT:
				return convertCellFunctionValueTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.CELL_STRENGTH_VALUE_TYPE_OBJECT:
				return convertCellStrengthValueTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.COMPONENT_PORT_DIRECTION_TYPE_OBJECT:
				return convertComponentPortDirectionTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.CONFIGURABLE_DOUBLE:
				return convertConfigurableDoubleToString(eDataType, instanceValue);
			case spiritPackage.DATA_TYPE_TYPE_OBJECT:
				return convertDataTypeTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.DELAY_PERCENTAGE_TYPE:
				return convertDelayPercentageTypeToString(eDataType, instanceValue);
			case spiritPackage.DELAY_PERCENTAGE_TYPE_OBJECT:
				return convertDelayPercentageTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.DELAY_VALUE_TYPE_OBJECT:
				return convertDelayValueTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.DELAY_VALUE_UNIT_TYPE_OBJECT:
				return convertDelayValueUnitTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.DIRECTION_TYPE_OBJECT:
				return convertDirectionTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.DOUBLE_LIST:
				return convertDoubleListToString(eDataType, instanceValue);
			case spiritPackage.DRIVER_TYPE_TYPE_OBJECT:
				return convertDriverTypeTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.EDGE_VALUE_TYPE_OBJECT:
				return convertEdgeValueTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.ENDIANESS_TYPE_OBJECT:
				return convertEndianessTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.ENV_IDENTIFIER_TYPE:
				return convertEnvIdentifierTypeToString(eDataType, instanceValue);
			case spiritPackage.ENV_IDENTIFIER_TYPE1:
				return convertEnvIdentifierType1ToString(eDataType, instanceValue);
			case spiritPackage.FILE_TYPE_TYPE_OBJECT:
				return convertFileTypeTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.FORMAT_TYPE_OBJECT:
				return convertFormatTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.INITIATIVE_TYPE_OBJECT:
				return convertInitiativeTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.INITIATIVE_TYPE_OBJECT1:
				return convertInitiativeTypeObject1ToString(eDataType, instanceValue);
			case spiritPackage.INSTANCE_PATH:
				return convertInstancePathToString(eDataType, instanceValue);
			case spiritPackage.INTERFACE_MODE_TYPE_OBJECT:
				return convertInterfaceModeTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.MODIFIED_WRITE_VALUE_TYPE_OBJECT:
				return convertModifiedWriteValueTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.MULTIPLE_GROUP_SELECTION_OPERATOR_TYPE_OBJECT:
				return convertMultipleGroupSelectionOperatorTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.NON_NEGATIVE_FLOAT:
				return convertNonNegativeFloatToString(eDataType, instanceValue);
			case spiritPackage.NON_NEGATIVE_FLOAT_OBJECT:
				return convertNonNegativeFloatObjectToString(eDataType, instanceValue);
			case spiritPackage.PORT_ACCESS_TYPE_TYPE_OBJECT:
				return convertPortAccessTypeTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.PORT_NAME:
				return convertPortNameToString(eDataType, instanceValue);
			case spiritPackage.PRESENCE_TYPE_OBJECT:
				return convertPresenceTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.RANGE_TYPE_TYPE_OBJECT:
				return convertRangeTypeTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.READ_ACTION_TYPE_OBJECT:
				return convertReadActionTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.RESOLVE_TYPE_OBJECT:
				return convertResolveTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.RETURN_TYPE_TYPE_OBJECT:
				return convertReturnTypeTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.SCALED_INTEGER:
				return convertScaledIntegerToString(eDataType, instanceValue);
			case spiritPackage.SCALED_NON_NEGATIVE_INTEGER:
				return convertScaledNonNegativeIntegerToString(eDataType, instanceValue);
			case spiritPackage.SCALED_POSITIVE_INTEGER:
				return convertScaledPositiveIntegerToString(eDataType, instanceValue);
			case spiritPackage.SCOPE_TYPE_OBJECT:
				return convertScopeTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.SPIRIT_URI:
				return convertSpiritURIToString(eDataType, instanceValue);
			case spiritPackage.TEST_CONSTRAINT_TYPE_OBJECT:
				return convertTestConstraintTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.TRANSPORT_METHOD_TYPE_OBJECT:
				return convertTransportMethodTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.USAGE_TYPE_OBJECT:
				return convertUsageTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.USAGE_TYPE_OBJECT1:
				return convertUsageTypeObject1ToString(eDataType, instanceValue);
			case spiritPackage.USAGE_TYPE_TYPE_OBJECT:
				return convertUsageTypeTypeObjectToString(eDataType, instanceValue);
			case spiritPackage.WHITEBOX_TYPE_TYPE_OBJECT:
				return convertWhiteboxTypeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionDefinitionType createAbstractionDefinitionType() {
		AbstractionDefinitionTypeImpl abstractionDefinitionType = new AbstractionDefinitionTypeImpl();
		return abstractionDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionDefPortConstraintsType createAbstractionDefPortConstraintsType() {
		AbstractionDefPortConstraintsTypeImpl abstractionDefPortConstraintsType = new AbstractionDefPortConstraintsTypeImpl();
		return abstractionDefPortConstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorBusInterfaceType createAbstractorBusInterfaceType() {
		AbstractorBusInterfaceTypeImpl abstractorBusInterfaceType = new AbstractorBusInterfaceTypeImpl();
		return abstractorBusInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorGeneratorsType createAbstractorGeneratorsType() {
		AbstractorGeneratorsTypeImpl abstractorGeneratorsType = new AbstractorGeneratorsTypeImpl();
		return abstractorGeneratorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorInterfacesType createAbstractorInterfacesType() {
		AbstractorInterfacesTypeImpl abstractorInterfacesType = new AbstractorInterfacesTypeImpl();
		return abstractorInterfacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorModelType createAbstractorModelType() {
		AbstractorModelTypeImpl abstractorModelType = new AbstractorModelTypeImpl();
		return abstractorModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorModeType1 createAbstractorModeType1() {
		AbstractorModeType1Impl abstractorModeType1 = new AbstractorModeType1Impl();
		return abstractorModeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorPortType createAbstractorPortType() {
		AbstractorPortTypeImpl abstractorPortType = new AbstractorPortTypeImpl();
		return abstractorPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorPortWireType createAbstractorPortWireType() {
		AbstractorPortWireTypeImpl abstractorPortWireType = new AbstractorPortWireTypeImpl();
		return abstractorPortWireType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorsType createAbstractorsType() {
		AbstractorsTypeImpl abstractorsType = new AbstractorsTypeImpl();
		return abstractorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorType createAbstractorType() {
		AbstractorTypeImpl abstractorType = new AbstractorTypeImpl();
		return abstractorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorType1 createAbstractorType1() {
		AbstractorType1Impl abstractorType1 = new AbstractorType1Impl();
		return abstractorType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorViewType createAbstractorViewType() {
		AbstractorViewTypeImpl abstractorViewType = new AbstractorViewTypeImpl();
		return abstractorViewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressBankType createAddressBankType() {
		AddressBankTypeImpl addressBankType = new AddressBankTypeImpl();
		return addressBankType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressBlockType createAddressBlockType() {
		AddressBlockTypeImpl addressBlockType = new AddressBlockTypeImpl();
		return addressBlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressOffsetType createAddressOffsetType() {
		AddressOffsetTypeImpl addressOffsetType = new AddressOffsetTypeImpl();
		return addressOffsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpaceRefType createAddressSpaceRefType() {
		AddressSpaceRefTypeImpl addressSpaceRefType = new AddressSpaceRefTypeImpl();
		return addressSpaceRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpacesType createAddressSpacesType() {
		AddressSpacesTypeImpl addressSpacesType = new AddressSpacesTypeImpl();
		return addressSpacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpaceType createAddressSpaceType() {
		AddressSpaceTypeImpl addressSpaceType = new AddressSpaceTypeImpl();
		return addressSpaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddrSpaceRefType createAddrSpaceRefType() {
		AddrSpaceRefTypeImpl addrSpaceRefType = new AddrSpaceRefTypeImpl();
		return addrSpaceRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocConnectionsType createAdHocConnectionsType() {
		AdHocConnectionsTypeImpl adHocConnectionsType = new AdHocConnectionsTypeImpl();
		return adHocConnectionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocConnectionType createAdHocConnectionType() {
		AdHocConnectionTypeImpl adHocConnectionType = new AdHocConnectionTypeImpl();
		return adHocConnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternateGroupsType createAlternateGroupsType() {
		AlternateGroupsTypeImpl alternateGroupsType = new AlternateGroupsTypeImpl();
		return alternateGroupsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternateRegistersType createAlternateRegistersType() {
		AlternateRegistersTypeImpl alternateRegistersType = new AlternateRegistersTypeImpl();
		return alternateRegistersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternateRegisterType createAlternateRegisterType() {
		AlternateRegisterTypeImpl alternateRegisterType = new AlternateRegisterTypeImpl();
		return alternateRegisterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentType createArgumentType() {
		ArgumentTypeImpl argumentType = new ArgumentTypeImpl();
		return argumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankedBankType createBankedBankType() {
		BankedBankTypeImpl bankedBankType = new BankedBankTypeImpl();
		return bankedBankType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankedBlockType createBankedBlockType() {
		BankedBlockTypeImpl bankedBlockType = new BankedBlockTypeImpl();
		return bankedBlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankedSubspaceType createBankedSubspaceType() {
		BankedSubspaceTypeImpl bankedSubspaceType = new BankedSubspaceTypeImpl();
		return bankedSubspaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseAddressesType createBaseAddressesType() {
		BaseAddressesTypeImpl baseAddressesType = new BaseAddressesTypeImpl();
		return baseAddressesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseAddressType createBaseAddressType() {
		BaseAddressTypeImpl baseAddressType = new BaseAddressTypeImpl();
		return baseAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseAddressType1 createBaseAddressType1() {
		BaseAddressType1Impl baseAddressType1 = new BaseAddressType1Impl();
		return baseAddressType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitSteeringType1 createBitSteeringType1() {
		BitSteeringType1Impl bitSteeringType1 = new BitSteeringType1Impl();
		return bitSteeringType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitWidthType createBitWidthType() {
		BitWidthTypeImpl bitWidthType = new BitWidthTypeImpl();
		return bitWidthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BridgeType createBridgeType() {
		BridgeTypeImpl bridgeType = new BridgeTypeImpl();
		return bridgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildCommandType createBuildCommandType() {
		BuildCommandTypeImpl buildCommandType = new BuildCommandTypeImpl();
		return buildCommandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusDefinitionType createBusDefinitionType() {
		BusDefinitionTypeImpl busDefinitionType = new BusDefinitionTypeImpl();
		return busDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusInterfacesType createBusInterfacesType() {
		BusInterfacesTypeImpl busInterfacesType = new BusInterfacesTypeImpl();
		return busInterfacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusInterfaceType createBusInterfaceType() {
		BusInterfaceTypeImpl busInterfaceType = new BusInterfaceTypeImpl();
		return busInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellClassType createCellClassType() {
		CellClassTypeImpl cellClassType = new CellClassTypeImpl();
		return cellClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellFunctionType createCellFunctionType() {
		CellFunctionTypeImpl cellFunctionType = new CellFunctionTypeImpl();
		return cellFunctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellSpecificationType createCellSpecificationType() {
		CellSpecificationTypeImpl cellSpecificationType = new CellSpecificationTypeImpl();
		return cellSpecificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelsType createChannelsType() {
		ChannelsTypeImpl channelsType = new ChannelsTypeImpl();
		return channelsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelType createChannelType() {
		ChannelTypeImpl channelType = new ChannelTypeImpl();
		return channelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoicesType createChoicesType() {
		ChoicesTypeImpl choicesType = new ChoicesTypeImpl();
		return choicesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceType createChoiceType() {
		ChoiceTypeImpl choiceType = new ChoiceTypeImpl();
		return choiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockDriverType createClockDriverType() {
		ClockDriverTypeImpl clockDriverType = new ClockDriverTypeImpl();
		return clockDriverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockDriverType1 createClockDriverType1() {
		ClockDriverType1Impl clockDriverType1 = new ClockDriverType1Impl();
		return clockDriverType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockPeriodType createClockPeriodType() {
		ClockPeriodTypeImpl clockPeriodType = new ClockPeriodTypeImpl();
		return clockPeriodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockPulseDurationType createClockPulseDurationType() {
		ClockPulseDurationTypeImpl clockPulseDurationType = new ClockPulseDurationTypeImpl();
		return clockPulseDurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockPulseOffsetType createClockPulseOffsetType() {
		ClockPulseOffsetTypeImpl clockPulseOffsetType = new ClockPulseOffsetTypeImpl();
		return clockPulseOffsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockPulseValueType createClockPulseValueType() {
		ClockPulseValueTypeImpl clockPulseValueType = new ClockPulseValueTypeImpl();
		return clockPulseValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandLineSwitchType createCommandLineSwitchType() {
		CommandLineSwitchTypeImpl commandLineSwitchType = new CommandLineSwitchTypeImpl();
		return commandLineSwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandType createCommandType() {
		CommandTypeImpl commandType = new CommandTypeImpl();
		return commandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandType1 createCommandType1() {
		CommandType1Impl commandType1 = new CommandType1Impl();
		return commandType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandType2 createCommandType2() {
		CommandType2Impl commandType2 = new CommandType2Impl();
		return commandType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentGeneratorsType createComponentGeneratorsType() {
		ComponentGeneratorsTypeImpl componentGeneratorsType = new ComponentGeneratorsTypeImpl();
		return componentGeneratorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentGeneratorType createComponentGeneratorType() {
		ComponentGeneratorTypeImpl componentGeneratorType = new ComponentGeneratorTypeImpl();
		return componentGeneratorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstancesType createComponentInstancesType() {
		ComponentInstancesTypeImpl componentInstancesType = new ComponentInstancesTypeImpl();
		return componentInstancesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceType createComponentInstanceType() {
		ComponentInstanceTypeImpl componentInstanceType = new ComponentInstanceTypeImpl();
		return componentInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentType() {
		ComponentTypeImpl componentType = new ComponentTypeImpl();
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurableElementValuesType createConfigurableElementValuesType() {
		ConfigurableElementValuesTypeImpl configurableElementValuesType = new ConfigurableElementValuesTypeImpl();
		return configurableElementValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurableElementValueType createConfigurableElementValueType() {
		ConfigurableElementValueTypeImpl configurableElementValueType = new ConfigurableElementValueTypeImpl();
		return configurableElementValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType createConnectionType() {
		ConnectionTypeImpl connectionType = new ConnectionTypeImpl();
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSetsType createConstraintSetsType() {
		ConstraintSetsTypeImpl constraintSetsType = new ConstraintSetsTypeImpl();
		return constraintSetsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSetType createConstraintSetType() {
		ConstraintSetTypeImpl constraintSetType = new ConstraintSetTypeImpl();
		return constraintSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpusType createCpusType() {
		CpusTypeImpl cpusType = new CpusTypeImpl();
		return cpusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpuType createCpuType() {
		CpuTypeImpl cpuType = new CpuTypeImpl();
		return cpuType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultValueType createDefaultValueType() {
		DefaultValueTypeImpl defaultValueType = new DefaultValueTypeImpl();
		return defaultValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignConfigurationType createDesignConfigurationType() {
		DesignConfigurationTypeImpl designConfigurationType = new DesignConfigurationTypeImpl();
		return designConfigurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignType createDesignType() {
		DesignTypeImpl designType = new DesignTypeImpl();
		return designType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisabledType createDisabledType() {
		DisabledTypeImpl disabledType = new DisabledTypeImpl();
		return disabledType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriveConstraintType createDriveConstraintType() {
		DriveConstraintTypeImpl driveConstraintType = new DriveConstraintTypeImpl();
		return driveConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriverType createDriverType() {
		DriverTypeImpl driverType = new DriverTypeImpl();
		return driverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableType createEnableType() {
		EnableTypeImpl enableType = new EnableTypeImpl();
		return enableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedValuesType createEnumeratedValuesType() {
		EnumeratedValuesTypeImpl enumeratedValuesType = new EnumeratedValuesTypeImpl();
		return enumeratedValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedValueType createEnumeratedValueType() {
		EnumeratedValueTypeImpl enumeratedValueType = new EnumeratedValueTypeImpl();
		return enumeratedValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationType createEnumerationType() {
		EnumerationTypeImpl enumerationType = new EnumerationTypeImpl();
		return enumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableImageType createExecutableImageType() {
		ExecutableImageTypeImpl executableImageType = new ExecutableImageTypeImpl();
		return executableImageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalPortReferenceType createExternalPortReferenceType() {
		ExternalPortReferenceTypeImpl externalPortReferenceType = new ExternalPortReferenceTypeImpl();
		return externalPortReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldType createFieldType() {
		FieldTypeImpl fieldType = new FieldTypeImpl();
		return fieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileBuilderType createFileBuilderType() {
		FileBuilderTypeImpl fileBuilderType = new FileBuilderTypeImpl();
		return fileBuilderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileBuilderType1 createFileBuilderType1() {
		FileBuilderType1Impl fileBuilderType1 = new FileBuilderType1Impl();
		return fileBuilderType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetRefGroupType createFileSetRefGroupType() {
		FileSetRefGroupTypeImpl fileSetRefGroupType = new FileSetRefGroupTypeImpl();
		return fileSetRefGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetRefGroupType1 createFileSetRefGroupType1() {
		FileSetRefGroupType1Impl fileSetRefGroupType1 = new FileSetRefGroupType1Impl();
		return fileSetRefGroupType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetRefType createFileSetRefType() {
		FileSetRefTypeImpl fileSetRefType = new FileSetRefTypeImpl();
		return fileSetRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetsType createFileSetsType() {
		FileSetsTypeImpl fileSetsType = new FileSetsTypeImpl();
		return fileSetsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetType createFileSetType() {
		FileSetTypeImpl fileSetType = new FileSetTypeImpl();
		return fileSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType createFileType() {
		FileTypeImpl fileType = new FileTypeImpl();
		return fileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagsType createFlagsType() {
		FlagsTypeImpl flagsType = new FlagsTypeImpl();
		return flagsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagsType1 createFlagsType1() {
		FlagsType1Impl flagsType1 = new FlagsType1Impl();
		return flagsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlagsType2 createFlagsType2() {
		FlagsType2Impl flagsType2 = new FlagsType2Impl();
		return flagsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType createFunctionType() {
		FunctionTypeImpl functionType = new FunctionTypeImpl();
		return functionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorChainConfigurationType createGeneratorChainConfigurationType() {
		GeneratorChainConfigurationTypeImpl generatorChainConfigurationType = new GeneratorChainConfigurationTypeImpl();
		return generatorChainConfigurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorChainSelectorType createGeneratorChainSelectorType() {
		GeneratorChainSelectorTypeImpl generatorChainSelectorType = new GeneratorChainSelectorTypeImpl();
		return generatorChainSelectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorChainType createGeneratorChainType() {
		GeneratorChainTypeImpl generatorChainType = new GeneratorChainTypeImpl();
		return generatorChainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorSelectorType createGeneratorSelectorType() {
		GeneratorSelectorTypeImpl generatorSelectorType = new GeneratorSelectorTypeImpl();
		return generatorSelectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorType createGeneratorType() {
		GeneratorTypeImpl generatorType = new GeneratorTypeImpl();
		return generatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorType1 createGeneratorType1() {
		GeneratorType1Impl generatorType1 = new GeneratorType1Impl();
		return generatorType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupSelectorType createGroupSelectorType() {
		GroupSelectorTypeImpl groupSelectorType = new GroupSelectorTypeImpl();
		return groupSelectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierConnectionsType createHierConnectionsType() {
		HierConnectionsTypeImpl hierConnectionsType = new HierConnectionsTypeImpl();
		return hierConnectionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierConnectionType createHierConnectionType() {
		HierConnectionTypeImpl hierConnectionType = new HierConnectionTypeImpl();
		return hierConnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierInterface createHierInterface() {
		HierInterfaceImpl hierInterface = new HierInterfaceImpl();
		return hierInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceGeneratorType createInstanceGeneratorType() {
		InstanceGeneratorTypeImpl instanceGeneratorType = new InstanceGeneratorTypeImpl();
		return instanceGeneratorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectionConfigurationType createInterconnectionConfigurationType() {
		InterconnectionConfigurationTypeImpl interconnectionConfigurationType = new InterconnectionConfigurationTypeImpl();
		return interconnectionConfigurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectionsType createInterconnectionsType() {
		InterconnectionsTypeImpl interconnectionsType = new InterconnectionsTypeImpl();
		return interconnectionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectionType createInterconnectionType() {
		InterconnectionTypeImpl interconnectionType = new InterconnectionTypeImpl();
		return interconnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalPortReferenceType createInternalPortReferenceType() {
		InternalPortReferenceTypeImpl internalPortReferenceType = new InternalPortReferenceTypeImpl();
		return internalPortReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsIncludeFileType createIsIncludeFileType() {
		IsIncludeFileTypeImpl isIncludeFileType = new IsIncludeFileTypeImpl();
		return isIncludeFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageToolsType createLanguageToolsType() {
		LanguageToolsTypeImpl languageToolsType = new LanguageToolsTypeImpl();
		return languageToolsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageType createLanguageType() {
		LanguageTypeImpl languageType = new LanguageTypeImpl();
		return languageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageType1 createLanguageType1() {
		LanguageType1Impl languageType1 = new LanguageType1Impl();
		return languageType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftType createLeftType() {
		LeftTypeImpl leftType = new LeftTypeImpl();
		return leftType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftType1 createLeftType1() {
		LeftType1Impl leftType1 = new LeftType1Impl();
		return leftType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftType2 createLeftType2() {
		LeftType2Impl leftType2 = new LeftType2Impl();
		return leftType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftType11 createLeftType11() {
		LeftType11Impl leftType11 = new LeftType11Impl();
		return leftType11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryRefType createLibraryRefType() {
		LibraryRefTypeImpl libraryRefType = new LibraryRefTypeImpl();
		return libraryRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkerCommandFileType createLinkerCommandFileType() {
		LinkerCommandFileTypeImpl linkerCommandFileType = new LinkerCommandFileTypeImpl();
		return linkerCommandFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkerFlagsType createLinkerFlagsType() {
		LinkerFlagsTypeImpl linkerFlagsType = new LinkerFlagsTypeImpl();
		return linkerFlagsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkerType createLinkerType() {
		LinkerTypeImpl linkerType = new LinkerTypeImpl();
		return linkerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadConstraintType createLoadConstraintType() {
		LoadConstraintTypeImpl loadConstraintType = new LoadConstraintTypeImpl();
		return loadConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalMemoryMapType createLocalMemoryMapType() {
		LocalMemoryMapTypeImpl localMemoryMapType = new LocalMemoryMapTypeImpl();
		return localMemoryMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalNameType createLogicalNameType() {
		LogicalNameTypeImpl logicalNameType = new LogicalNameTypeImpl();
		return logicalNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalPortType createLogicalPortType() {
		LogicalPortTypeImpl logicalPortType = new LogicalPortTypeImpl();
		return logicalPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalPortType1 createLogicalPortType1() {
		LogicalPortType1Impl logicalPortType1 = new LogicalPortType1Impl();
		return logicalPortType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaskType createMaskType() {
		MaskTypeImpl maskType = new MaskTypeImpl();
		return maskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaskType1 createMaskType1() {
		MaskType1Impl maskType1 = new MaskType1Impl();
		return maskType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterType createMasterType() {
		MasterTypeImpl masterType = new MasterTypeImpl();
		return masterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaximumType createMaximumType() {
		MaximumTypeImpl maximumType = new MaximumTypeImpl();
		return maximumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapRefType createMemoryMapRefType() {
		MemoryMapRefTypeImpl memoryMapRefType = new MemoryMapRefTypeImpl();
		return memoryMapRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapsType createMemoryMapsType() {
		MemoryMapsTypeImpl memoryMapsType = new MemoryMapsTypeImpl();
		return memoryMapsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapType createMemoryMapType() {
		MemoryMapTypeImpl memoryMapType = new MemoryMapTypeImpl();
		return memoryMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryRemapType createMemoryRemapType() {
		MemoryRemapTypeImpl memoryRemapType = new MemoryRemapTypeImpl();
		return memoryRemapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinimumType createMinimumType() {
		MinimumTypeImpl minimumType = new MinimumTypeImpl();
		return minimumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MirroredMasterType createMirroredMasterType() {
		MirroredMasterTypeImpl mirroredMasterType = new MirroredMasterTypeImpl();
		return mirroredMasterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MirroredSlaveType createMirroredSlaveType() {
		MirroredSlaveTypeImpl mirroredSlaveType = new MirroredSlaveTypeImpl();
		return mirroredSlaveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MirroredSystemType createMirroredSystemType() {
		MirroredSystemTypeImpl mirroredSystemType = new MirroredSystemTypeImpl();
		return mirroredSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelParametersType createModelParametersType() {
		ModelParametersTypeImpl modelParametersType = new ModelParametersTypeImpl();
		return modelParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelParametersType1 createModelParametersType1() {
		ModelParametersType1Impl modelParametersType1 = new ModelParametersType1Impl();
		return modelParametersType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelType() {
		ModelTypeImpl modelType = new ModelTypeImpl();
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorInterconnectionType createMonitorInterconnectionType() {
		MonitorInterconnectionTypeImpl monitorInterconnectionType = new MonitorInterconnectionTypeImpl();
		return monitorInterconnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorType createMonitorType() {
		MonitorTypeImpl monitorType = new MonitorTypeImpl();
		return monitorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType createNameType() {
		NameTypeImpl nameType = new NameTypeImpl();
		return nameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType1 createNameType1() {
		NameType1Impl nameType1 = new NameType1Impl();
		return nameType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType2 createNameType2() {
		NameType2Impl nameType2 = new NameType2Impl();
		return nameType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameValuePairType createNameValuePairType() {
		NameValuePairTypeImpl nameValuePairType = new NameValuePairTypeImpl();
		return nameValuePairType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameValueTypeType createNameValueTypeType() {
		NameValueTypeTypeImpl nameValueTypeType = new NameValueTypeTypeImpl();
		return nameValueTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnMasterType createOnMasterType() {
		OnMasterTypeImpl onMasterType = new OnMasterTypeImpl();
		return onMasterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnMasterType1 createOnMasterType1() {
		OnMasterType1Impl onMasterType1 = new OnMasterType1Impl();
		return onMasterType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnSlaveType createOnSlaveType() {
		OnSlaveTypeImpl onSlaveType = new OnSlaveTypeImpl();
		return onSlaveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnSlaveType1 createOnSlaveType1() {
		OnSlaveType1Impl onSlaveType1 = new OnSlaveType1Impl();
		return onSlaveType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnSystemType createOnSystemType() {
		OnSystemTypeImpl onSystemType = new OnSystemTypeImpl();
		return onSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnSystemType1 createOnSystemType1() {
		OnSystemType1Impl onSystemType1 = new OnSystemType1Impl();
		return onSystemType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherClockDriverType createOtherClockDriverType() {
		OtherClockDriverTypeImpl otherClockDriverType = new OtherClockDriverTypeImpl();
		return otherClockDriverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherClocks createOtherClocks() {
		OtherClocksImpl otherClocks = new OtherClocksImpl();
		return otherClocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersType createParametersType() {
		ParametersTypeImpl parametersType = new ParametersTypeImpl();
		return parametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersType1 createParametersType1() {
		ParametersType1Impl parametersType1 = new ParametersType1Impl();
		return parametersType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseType createPhaseType() {
		PhaseTypeImpl phaseType = new PhaseTypeImpl();
		return phaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPortType createPhysicalPortType() {
		PhysicalPortTypeImpl physicalPortType = new PhysicalPortTypeImpl();
		return physicalPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPortType1 createPhysicalPortType1() {
		PhysicalPortType1Impl physicalPortType1 = new PhysicalPortType1Impl();
		return physicalPortType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortAccessType createPortAccessType() {
		PortAccessTypeImpl portAccessType = new PortAccessTypeImpl();
		return portAccessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDeclarationType createPortDeclarationType() {
		PortDeclarationTypeImpl portDeclarationType = new PortDeclarationTypeImpl();
		return portDeclarationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortMapsType createPortMapsType() {
		PortMapsTypeImpl portMapsType = new PortMapsTypeImpl();
		return portMapsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortMapsType1 createPortMapsType1() {
		PortMapsType1Impl portMapsType1 = new PortMapsType1Impl();
		return portMapsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortMapType createPortMapType() {
		PortMapTypeImpl portMapType = new PortMapTypeImpl();
		return portMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortMapType1 createPortMapType1() {
		PortMapType1Impl portMapType1 = new PortMapType1Impl();
		return portMapType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsType createPortsType() {
		PortsTypeImpl portsType = new PortsTypeImpl();
		return portsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsType1 createPortsType1() {
		PortsType1Impl portsType1 = new PortsType1Impl();
		return portsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsType11 createPortsType11() {
		PortsType11Impl portsType11 = new PortsType11Impl();
		return portsType11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTransactionalType createPortTransactionalType() {
		PortTransactionalTypeImpl portTransactionalType = new PortTransactionalTypeImpl();
		return portTransactionalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortType() {
		PortTypeImpl portType = new PortTypeImpl();
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType1 createPortType1() {
		PortType1Impl portType1 = new PortType1Impl();
		return portType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortWireType createPortWireType() {
		PortWireTypeImpl portWireType = new PortWireTypeImpl();
		return portWireType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierType createQualifierType() {
		QualifierTypeImpl qualifierType = new QualifierTypeImpl();
		return qualifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierType1 createQualifierType1() {
		QualifierType1Impl qualifierType1 = new QualifierType1Impl();
		return qualifierType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType createRangeType() {
		RangeTypeImpl rangeType = new RangeTypeImpl();
		return rangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType1 createRangeType1() {
		RangeType1Impl rangeType1 = new RangeType1Impl();
		return rangeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType11 createRangeType11() {
		RangeType11Impl rangeType11 = new RangeType11Impl();
		return rangeType11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType2 createRangeType2() {
		RangeType2Impl rangeType2 = new RangeType2Impl();
		return rangeType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterFileType createRegisterFileType() {
		RegisterFileTypeImpl registerFileType = new RegisterFileTypeImpl();
		return registerFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterType createRegisterType() {
		RegisterTypeImpl registerType = new RegisterTypeImpl();
		return registerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemapAddressType createRemapAddressType() {
		RemapAddressTypeImpl remapAddressType = new RemapAddressTypeImpl();
		return remapAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemapPortsType createRemapPortsType() {
		RemapPortsTypeImpl remapPortsType = new RemapPortsTypeImpl();
		return remapPortsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemapPortType createRemapPortType() {
		RemapPortTypeImpl remapPortType = new RemapPortTypeImpl();
		return remapPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemapStatesType createRemapStatesType() {
		RemapStatesTypeImpl remapStatesType = new RemapStatesTypeImpl();
		return remapStatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemapStateType createRemapStateType() {
		RemapStateTypeImpl remapStateType = new RemapStateTypeImpl();
		return remapStateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceDefaultFlagsType createReplaceDefaultFlagsType() {
		ReplaceDefaultFlagsTypeImpl replaceDefaultFlagsType = new ReplaceDefaultFlagsTypeImpl();
		return replaceDefaultFlagsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceDefaultFlagsType1 createReplaceDefaultFlagsType1() {
		ReplaceDefaultFlagsType1Impl replaceDefaultFlagsType1 = new ReplaceDefaultFlagsType1Impl();
		return replaceDefaultFlagsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceDefaultFlagsType2 createReplaceDefaultFlagsType2() {
		ReplaceDefaultFlagsType2Impl replaceDefaultFlagsType2 = new ReplaceDefaultFlagsType2Impl();
		return replaceDefaultFlagsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiresDriverType createRequiresDriverType() {
		RequiresDriverTypeImpl requiresDriverType = new RequiresDriverTypeImpl();
		return requiresDriverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetType createResetType() {
		ResetTypeImpl resetType = new ResetTypeImpl();
		return resetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetType1 createResetType1() {
		ResetType1Impl resetType1 = new ResetType1Impl();
		return resetType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolvedLibraryRefType createResolvedLibraryRefType() {
		ResolvedLibraryRefTypeImpl resolvedLibraryRefType = new ResolvedLibraryRefTypeImpl();
		return resolvedLibraryRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightType createRightType() {
		RightTypeImpl rightType = new RightTypeImpl();
		return rightType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightType1 createRightType1() {
		RightType1Impl rightType1 = new RightType1Impl();
		return rightType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightType2 createRightType2() {
		RightType2Impl rightType2 = new RightType2Impl();
		return rightType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightType11 createRightType11() {
		RightType11Impl rightType11 = new RightType11Impl();
		return rightType11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentsType createSegmentsType() {
		SegmentsTypeImpl segmentsType = new SegmentsTypeImpl();
		return segmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentType createSegmentType() {
		SegmentTypeImpl segmentType = new SegmentTypeImpl();
		return segmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceType() {
		ServiceTypeImpl serviceType = new ServiceTypeImpl();
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType1 createServiceType1() {
		ServiceType1Impl serviceType1 = new ServiceType1Impl();
		return serviceType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTypeDefsType createServiceTypeDefsType() {
		ServiceTypeDefsTypeImpl serviceTypeDefsType = new ServiceTypeDefsTypeImpl();
		return serviceTypeDefsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTypeDefType createServiceTypeDefType() {
		ServiceTypeDefTypeImpl serviceTypeDefType = new ServiceTypeDefTypeImpl();
		return serviceTypeDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleShotDriverType createSingleShotDriverType() {
		SingleShotDriverTypeImpl singleShotDriverType = new SingleShotDriverTypeImpl();
		return singleShotDriverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleShotDurationType createSingleShotDurationType() {
		SingleShotDurationTypeImpl singleShotDurationType = new SingleShotDurationTypeImpl();
		return singleShotDurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleShotOffsetType createSingleShotOffsetType() {
		SingleShotOffsetTypeImpl singleShotOffsetType = new SingleShotOffsetTypeImpl();
		return singleShotOffsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleShotValueType createSingleShotValueType() {
		SingleShotValueTypeImpl singleShotValueType = new SingleShotValueTypeImpl();
		return singleShotValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeType createSizeType() {
		SizeTypeImpl sizeType = new SizeTypeImpl();
		return sizeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlaveType createSlaveType() {
		SlaveTypeImpl slaveType = new SlaveTypeImpl();
		return slaveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFileType createSourceFileType() {
		SourceFileTypeImpl sourceFileType = new SourceFileTypeImpl();
		return sourceFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceNameType createSourceNameType() {
		SourceNameTypeImpl sourceNameType = new SourceNameTypeImpl();
		return sourceNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubspaceRefType createSubspaceRefType() {
		SubspaceRefTypeImpl subspaceRefType = new SubspaceRefTypeImpl();
		return subspaceRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemGroupNamesType createSystemGroupNamesType() {
		SystemGroupNamesTypeImpl systemGroupNamesType = new SystemGroupNamesTypeImpl();
		return systemGroupNamesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemType createSystemType() {
		SystemTypeImpl systemType = new SystemTypeImpl();
		return systemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetNameType createTargetNameType() {
		TargetNameTypeImpl targetNameType = new TargetNameTypeImpl();
		return targetNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestableType createTestableType() {
		TestableTypeImpl testableType = new TestableTypeImpl();
		return testableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingConstraintType createTimingConstraintType() {
		TimingConstraintTypeImpl timingConstraintType = new TimingConstraintTypeImpl();
		return timingConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionalType createTransactionalType() {
		TransactionalTypeImpl transactionalType = new TransactionalTypeImpl();
		return transactionalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportMethodsType createTransportMethodsType() {
		TransportMethodsTypeImpl transportMethodsType = new TransportMethodsTypeImpl();
		return transportMethodsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransTypeDefType createTransTypeDefType() {
		TransTypeDefTypeImpl transTypeDefType = new TransTypeDefTypeImpl();
		return transTypeDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeNameType createTypeNameType() {
		TypeNameTypeImpl typeNameType = new TypeNameTypeImpl();
		return typeNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeNameType1 createTypeNameType1() {
		TypeNameType1Impl typeNameType1 = new TypeNameType1Impl();
		return typeNameType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeNameType11 createTypeNameType11() {
		TypeNameType11Impl typeNameType11 = new TypeNameType11Impl();
		return typeNameType11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeNameType2 createTypeNameType2() {
		TypeNameType2Impl typeNameType2 = new TypeNameType2Impl();
		return typeNameType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueMaskConfigType createValueMaskConfigType() {
		ValueMaskConfigTypeImpl valueMaskConfigType = new ValueMaskConfigTypeImpl();
		return valueMaskConfigType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType1 createValueType1() {
		ValueType1Impl valueType1 = new ValueType1Impl();
		return valueType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType2 createValueType2() {
		ValueType2Impl valueType2 = new ValueType2Impl();
		return valueType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorType createVectorType() {
		VectorTypeImpl vectorType = new VectorTypeImpl();
		return vectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorType1 createVectorType1() {
		VectorType1Impl vectorType1 = new VectorType1Impl();
		return vectorType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorType2 createVectorType2() {
		VectorType2Impl vectorType2 = new VectorType2Impl();
		return vectorType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorType11 createVectorType11() {
		VectorType11Impl vectorType11 = new VectorType11Impl();
		return vectorType11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorExtensionsType createVendorExtensionsType() {
		VendorExtensionsTypeImpl vendorExtensionsType = new VendorExtensionsTypeImpl();
		return vendorExtensionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewConfigurationType createViewConfigurationType() {
		ViewConfigurationTypeImpl viewConfigurationType = new ViewConfigurationTypeImpl();
		return viewConfigurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsType createViewsType() {
		ViewsTypeImpl viewsType = new ViewsTypeImpl();
		return viewsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsType1 createViewsType1() {
		ViewsType1Impl viewsType1 = new ViewsType1Impl();
		return viewsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewType createViewType() {
		ViewTypeImpl viewType = new ViewTypeImpl();
		return viewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteboxElementRefsType createWhiteboxElementRefsType() {
		WhiteboxElementRefsTypeImpl whiteboxElementRefsType = new WhiteboxElementRefsTypeImpl();
		return whiteboxElementRefsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteboxElementRefType createWhiteboxElementRefType() {
		WhiteboxElementRefTypeImpl whiteboxElementRefType = new WhiteboxElementRefTypeImpl();
		return whiteboxElementRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteboxElementsType createWhiteboxElementsType() {
		WhiteboxElementsTypeImpl whiteboxElementsType = new WhiteboxElementsTypeImpl();
		return whiteboxElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteboxElementType createWhiteboxElementType() {
		WhiteboxElementTypeImpl whiteboxElementType = new WhiteboxElementTypeImpl();
		return whiteboxElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteboxPathType createWhiteboxPathType() {
		WhiteboxPathTypeImpl whiteboxPathType = new WhiteboxPathTypeImpl();
		return whiteboxPathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidthType createWidthType() {
		WidthTypeImpl widthType = new WidthTypeImpl();
		return widthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireType createWireType() {
		WireTypeImpl wireType = new WireTypeImpl();
		return wireType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireTypeDefsType createWireTypeDefsType() {
		WireTypeDefsTypeImpl wireTypeDefsType = new WireTypeDefsTypeImpl();
		return wireTypeDefsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireTypeDefType createWireTypeDefType() {
		WireTypeDefTypeImpl wireTypeDefType = new WireTypeDefTypeImpl();
		return wireTypeDefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteValueConstraintType createWriteValueConstraintType() {
		WriteValueConstraintTypeImpl writeValueConstraintType = new WriteValueConstraintTypeImpl();
		return writeValueConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorModeType createAbstractorModeTypeFromString(EDataType eDataType, String initialValue) {
		AbstractorModeType result = AbstractorModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstractorModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessTypeFromString(EDataType eDataType, String initialValue) {
		AccessType result = AccessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiTypeType createApiTypeTypeFromString(EDataType eDataType, String initialValue) {
		ApiTypeType result = ApiTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApiTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAlignmentType createBankAlignmentTypeFromString(EDataType eDataType, String initialValue) {
		BankAlignmentType result = BankAlignmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBankAlignmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitSteeringType createBitSteeringTypeFromString(EDataType eDataType, String initialValue) {
		BitSteeringType result = BitSteeringType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBitSteeringTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellClassValueType createCellClassValueTypeFromString(EDataType eDataType, String initialValue) {
		CellClassValueType result = CellClassValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellClassValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellFunctionValueType createCellFunctionValueTypeFromString(EDataType eDataType, String initialValue) {
		CellFunctionValueType result = CellFunctionValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellFunctionValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellStrengthValueType createCellStrengthValueTypeFromString(EDataType eDataType, String initialValue) {
		CellStrengthValueType result = CellStrengthValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellStrengthValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPortDirectionType createComponentPortDirectionTypeFromString(EDataType eDataType, String initialValue) {
		ComponentPortDirectionType result = ComponentPortDirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentPortDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeType createDataTypeTypeFromString(EDataType eDataType, String initialValue) {
		DataTypeType result = DataTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayValueType createDelayValueTypeFromString(EDataType eDataType, String initialValue) {
		DelayValueType result = DelayValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDelayValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayValueUnitType createDelayValueUnitTypeFromString(EDataType eDataType, String initialValue) {
		DelayValueUnitType result = DelayValueUnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDelayValueUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue) {
		DirectionType result = DirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriverTypeType createDriverTypeTypeFromString(EDataType eDataType, String initialValue) {
		DriverTypeType result = DriverTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDriverTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeValueType createEdgeValueTypeFromString(EDataType eDataType, String initialValue) {
		EdgeValueType result = EdgeValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianessType createEndianessTypeFromString(EDataType eDataType, String initialValue) {
		EndianessType result = EndianessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndianessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTypeType createFileTypeTypeFromString(EDataType eDataType, String initialValue) {
		FileTypeType result = FileTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType createFormatTypeFromString(EDataType eDataType, String initialValue) {
		FormatType result = FormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiativeType createInitiativeTypeFromString(EDataType eDataType, String initialValue) {
		InitiativeType result = InitiativeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitiativeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiativeType1 createInitiativeType1FromString(EDataType eDataType, String initialValue) {
		InitiativeType1 result = InitiativeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitiativeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceModeType createInterfaceModeTypeFromString(EDataType eDataType, String initialValue) {
		InterfaceModeType result = InterfaceModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiedWriteValueType createModifiedWriteValueTypeFromString(EDataType eDataType, String initialValue) {
		ModifiedWriteValueType result = ModifiedWriteValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModifiedWriteValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleGroupSelectionOperatorType createMultipleGroupSelectionOperatorTypeFromString(EDataType eDataType, String initialValue) {
		MultipleGroupSelectionOperatorType result = MultipleGroupSelectionOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultipleGroupSelectionOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortAccessTypeType createPortAccessTypeTypeFromString(EDataType eDataType, String initialValue) {
		PortAccessTypeType result = PortAccessTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortAccessTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresenceType createPresenceTypeFromString(EDataType eDataType, String initialValue) {
		PresenceType result = PresenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeTypeType createRangeTypeTypeFromString(EDataType eDataType, String initialValue) {
		RangeTypeType result = RangeTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadActionType createReadActionTypeFromString(EDataType eDataType, String initialValue) {
		ReadActionType result = ReadActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveType createResolveTypeFromString(EDataType eDataType, String initialValue) {
		ResolveType result = ResolveType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResolveTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnTypeType createReturnTypeTypeFromString(EDataType eDataType, String initialValue) {
		ReturnTypeType result = ReturnTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReturnTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType createScopeTypeFromString(EDataType eDataType, String initialValue) {
		ScopeType result = ScopeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestConstraintType createTestConstraintTypeFromString(EDataType eDataType, String initialValue) {
		TestConstraintType result = TestConstraintType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestConstraintTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportMethodType createTransportMethodTypeFromString(EDataType eDataType, String initialValue) {
		TransportMethodType result = TransportMethodType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportMethodTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType createUsageTypeFromString(EDataType eDataType, String initialValue) {
		UsageType result = UsageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType1 createUsageType1FromString(EDataType eDataType, String initialValue) {
		UsageType1 result = UsageType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageTypeType createUsageTypeTypeFromString(EDataType eDataType, String initialValue) {
		UsageTypeType result = UsageTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteboxTypeType createWhiteboxTypeTypeFromString(EDataType eDataType, String initialValue) {
		WhiteboxTypeType result = WhiteboxTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWhiteboxTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractorModeType createAbstractorModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAbstractorModeTypeFromString(spiritPackage.eINSTANCE.getAbstractorModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstractorModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAbstractorModeTypeToString(spiritPackage.eINSTANCE.getAbstractorModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessType1FromString(EDataType eDataType, String initialValue) {
		return createAccessTypeFromString(spiritPackage.eINSTANCE.getAccessType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessType1ToString(EDataType eDataType, Object instanceValue) {
		return convertAccessTypeToString(spiritPackage.eINSTANCE.getAccessType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAccessTypeFromString(spiritPackage.eINSTANCE.getAccessType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccessTypeToString(spiritPackage.eINSTANCE.getAccessType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiTypeType createApiTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createApiTypeTypeFromString(spiritPackage.eINSTANCE.getApiTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApiTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertApiTypeTypeToString(spiritPackage.eINSTANCE.getApiTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAlignmentType createBankAlignmentTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBankAlignmentTypeFromString(spiritPackage.eINSTANCE.getBankAlignmentType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBankAlignmentTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBankAlignmentTypeToString(spiritPackage.eINSTANCE.getBankAlignmentType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitSteeringType createBitSteeringTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBitSteeringTypeFromString(spiritPackage.eINSTANCE.getBitSteeringType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBitSteeringTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBitSteeringTypeToString(spiritPackage.eINSTANCE.getBitSteeringType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellClassValueType createCellClassValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCellClassValueTypeFromString(spiritPackage.eINSTANCE.getCellClassValueType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellClassValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCellClassValueTypeToString(spiritPackage.eINSTANCE.getCellClassValueType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellFunctionValueType createCellFunctionValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCellFunctionValueTypeFromString(spiritPackage.eINSTANCE.getCellFunctionValueType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellFunctionValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCellFunctionValueTypeToString(spiritPackage.eINSTANCE.getCellFunctionValueType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellStrengthValueType createCellStrengthValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCellStrengthValueTypeFromString(spiritPackage.eINSTANCE.getCellStrengthValueType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCellStrengthValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCellStrengthValueTypeToString(spiritPackage.eINSTANCE.getCellStrengthValueType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPortDirectionType createComponentPortDirectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createComponentPortDirectionTypeFromString(spiritPackage.eINSTANCE.getComponentPortDirectionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentPortDirectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertComponentPortDirectionTypeToString(spiritPackage.eINSTANCE.getComponentPortDirectionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createConfigurableDoubleFromString(EDataType eDataType, String initialValue) {
		return createDoubleListFromString(spiritPackage.eINSTANCE.getDoubleList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfigurableDoubleToString(EDataType eDataType, Object instanceValue) {
		return convertDoubleListToString(spiritPackage.eINSTANCE.getDoubleList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeType createDataTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDataTypeTypeFromString(spiritPackage.eINSTANCE.getDataTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataTypeTypeToString(spiritPackage.eINSTANCE.getDataTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createDelayPercentageTypeFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDelayPercentageTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createDelayPercentageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDelayPercentageTypeFromString(spiritPackage.eINSTANCE.getDelayPercentageType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDelayPercentageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDelayPercentageTypeToString(spiritPackage.eINSTANCE.getDelayPercentageType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayValueType createDelayValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDelayValueTypeFromString(spiritPackage.eINSTANCE.getDelayValueType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDelayValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDelayValueTypeToString(spiritPackage.eINSTANCE.getDelayValueType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayValueUnitType createDelayValueUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDelayValueUnitTypeFromString(spiritPackage.eINSTANCE.getDelayValueUnitType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDelayValueUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDelayValueUnitTypeToString(spiritPackage.eINSTANCE.getDelayValueUnitType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType createDirectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDirectionTypeFromString(spiritPackage.eINSTANCE.getDirectionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirectionTypeToString(spiritPackage.eINSTANCE.getDirectionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createDoubleListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Double> result = new ArrayList<Double>();
		for (String item : split(initialValue)) {
			result.add((Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriverTypeType createDriverTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDriverTypeTypeFromString(spiritPackage.eINSTANCE.getDriverTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDriverTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDriverTypeTypeToString(spiritPackage.eINSTANCE.getDriverTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeValueType createEdgeValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEdgeValueTypeFromString(spiritPackage.eINSTANCE.getEdgeValueType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEdgeValueTypeToString(spiritPackage.eINSTANCE.getEdgeValueType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianessType createEndianessTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEndianessTypeFromString(spiritPackage.eINSTANCE.getEndianessType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndianessTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEndianessTypeToString(spiritPackage.eINSTANCE.getEndianessType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEnvIdentifierTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnvIdentifierTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEnvIdentifierType1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnvIdentifierType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTypeType createFileTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFileTypeTypeFromString(spiritPackage.eINSTANCE.getFileTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFileTypeTypeToString(spiritPackage.eINSTANCE.getFileTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType createFormatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFormatTypeFromString(spiritPackage.eINSTANCE.getFormatType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFormatTypeToString(spiritPackage.eINSTANCE.getFormatType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiativeType createInitiativeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInitiativeTypeFromString(spiritPackage.eINSTANCE.getInitiativeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitiativeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInitiativeTypeToString(spiritPackage.eINSTANCE.getInitiativeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiativeType1 createInitiativeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createInitiativeType1FromString(spiritPackage.eINSTANCE.getInitiativeType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitiativeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertInitiativeType1ToString(spiritPackage.eINSTANCE.getInitiativeType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createInstancePathFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstancePathToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceModeType createInterfaceModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInterfaceModeTypeFromString(spiritPackage.eINSTANCE.getInterfaceModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInterfaceModeTypeToString(spiritPackage.eINSTANCE.getInterfaceModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifiedWriteValueType createModifiedWriteValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createModifiedWriteValueTypeFromString(spiritPackage.eINSTANCE.getModifiedWriteValueType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModifiedWriteValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModifiedWriteValueTypeToString(spiritPackage.eINSTANCE.getModifiedWriteValueType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleGroupSelectionOperatorType createMultipleGroupSelectionOperatorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMultipleGroupSelectionOperatorTypeFromString(spiritPackage.eINSTANCE.getMultipleGroupSelectionOperatorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultipleGroupSelectionOperatorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMultipleGroupSelectionOperatorTypeToString(spiritPackage.eINSTANCE.getMultipleGroupSelectionOperatorType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createNonNegativeFloatFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeFloatToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createNonNegativeFloatObjectFromString(EDataType eDataType, String initialValue) {
		return createNonNegativeFloatFromString(spiritPackage.eINSTANCE.getNonNegativeFloat(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeFloatObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNonNegativeFloatToString(spiritPackage.eINSTANCE.getNonNegativeFloat(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortAccessTypeType createPortAccessTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPortAccessTypeTypeFromString(spiritPackage.eINSTANCE.getPortAccessTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortAccessTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPortAccessTypeTypeToString(spiritPackage.eINSTANCE.getPortAccessTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPortNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresenceType createPresenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPresenceTypeFromString(spiritPackage.eINSTANCE.getPresenceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPresenceTypeToString(spiritPackage.eINSTANCE.getPresenceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeTypeType createRangeTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRangeTypeTypeFromString(spiritPackage.eINSTANCE.getRangeTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRangeTypeTypeToString(spiritPackage.eINSTANCE.getRangeTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadActionType createReadActionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReadActionTypeFromString(spiritPackage.eINSTANCE.getReadActionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadActionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReadActionTypeToString(spiritPackage.eINSTANCE.getReadActionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveType createResolveTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createResolveTypeFromString(spiritPackage.eINSTANCE.getResolveType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResolveTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResolveTypeToString(spiritPackage.eINSTANCE.getResolveType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnTypeType createReturnTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReturnTypeTypeFromString(spiritPackage.eINSTANCE.getReturnTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReturnTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReturnTypeTypeToString(spiritPackage.eINSTANCE.getReturnTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScaledIntegerFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScaledIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScaledNonNegativeIntegerFromString(EDataType eDataType, String initialValue) {
		return createScaledIntegerFromString(spiritPackage.eINSTANCE.getScaledInteger(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScaledNonNegativeIntegerToString(EDataType eDataType, Object instanceValue) {
		return convertScaledIntegerToString(spiritPackage.eINSTANCE.getScaledInteger(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScaledPositiveIntegerFromString(EDataType eDataType, String initialValue) {
		return createScaledNonNegativeIntegerFromString(spiritPackage.eINSTANCE.getScaledNonNegativeInteger(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScaledPositiveIntegerToString(EDataType eDataType, Object instanceValue) {
		return convertScaledNonNegativeIntegerToString(spiritPackage.eINSTANCE.getScaledNonNegativeInteger(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType createScopeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createScopeTypeFromString(spiritPackage.eINSTANCE.getScopeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScopeTypeToString(spiritPackage.eINSTANCE.getScopeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSpiritURIFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpiritURIToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.STRING.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestConstraintType createTestConstraintTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTestConstraintTypeFromString(spiritPackage.eINSTANCE.getTestConstraintType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestConstraintTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTestConstraintTypeToString(spiritPackage.eINSTANCE.getTestConstraintType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportMethodType createTransportMethodTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTransportMethodTypeFromString(spiritPackage.eINSTANCE.getTransportMethodType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportMethodTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransportMethodTypeToString(spiritPackage.eINSTANCE.getTransportMethodType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType createUsageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUsageTypeFromString(spiritPackage.eINSTANCE.getUsageType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUsageTypeToString(spiritPackage.eINSTANCE.getUsageType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType1 createUsageTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createUsageType1FromString(spiritPackage.eINSTANCE.getUsageType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertUsageType1ToString(spiritPackage.eINSTANCE.getUsageType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageTypeType createUsageTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUsageTypeTypeFromString(spiritPackage.eINSTANCE.getUsageTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUsageTypeTypeToString(spiritPackage.eINSTANCE.getUsageTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteboxTypeType createWhiteboxTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWhiteboxTypeTypeFromString(spiritPackage.eINSTANCE.getWhiteboxTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWhiteboxTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWhiteboxTypeTypeToString(spiritPackage.eINSTANCE.getWhiteboxTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public spiritPackage getspiritPackage() {
		return (spiritPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static spiritPackage getPackage() {
		return spiritPackage.eINSTANCE;
	}

} //spiritFactoryImpl
