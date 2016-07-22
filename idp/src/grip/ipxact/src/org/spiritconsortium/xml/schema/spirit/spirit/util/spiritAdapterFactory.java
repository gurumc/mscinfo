/**
 */
package org.spiritconsortium.xml.schema.spirit.spirit.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.spiritconsortium.xml.schema.spirit.spirit.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit.spiritPackage
 * @generated
 */
public class spiritAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static spiritPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public spiritAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = spiritPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected spiritSwitch<Adapter> modelSwitch =
		new spiritSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractionDefinitionType(AbstractionDefinitionType object) {
				return createAbstractionDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseAbstractionDefPortConstraintsType(AbstractionDefPortConstraintsType object) {
				return createAbstractionDefPortConstraintsTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorBusInterfaceType(AbstractorBusInterfaceType object) {
				return createAbstractorBusInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorGeneratorsType(AbstractorGeneratorsType object) {
				return createAbstractorGeneratorsTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorInterfacesType(AbstractorInterfacesType object) {
				return createAbstractorInterfacesTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorModelType(AbstractorModelType object) {
				return createAbstractorModelTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorModeType1(AbstractorModeType1 object) {
				return createAbstractorModeType1Adapter();
			}
			@Override
			public Adapter caseAbstractorPortType(AbstractorPortType object) {
				return createAbstractorPortTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorPortWireType(AbstractorPortWireType object) {
				return createAbstractorPortWireTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorsType(AbstractorsType object) {
				return createAbstractorsTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorType(AbstractorType object) {
				return createAbstractorTypeAdapter();
			}
			@Override
			public Adapter caseAbstractorType1(AbstractorType1 object) {
				return createAbstractorType1Adapter();
			}
			@Override
			public Adapter caseAbstractorViewType(AbstractorViewType object) {
				return createAbstractorViewTypeAdapter();
			}
			@Override
			public Adapter caseAddressBankType(AddressBankType object) {
				return createAddressBankTypeAdapter();
			}
			@Override
			public Adapter caseAddressBlockType(AddressBlockType object) {
				return createAddressBlockTypeAdapter();
			}
			@Override
			public Adapter caseAddressOffsetType(AddressOffsetType object) {
				return createAddressOffsetTypeAdapter();
			}
			@Override
			public Adapter caseAddressSpaceRefType(AddressSpaceRefType object) {
				return createAddressSpaceRefTypeAdapter();
			}
			@Override
			public Adapter caseAddressSpacesType(AddressSpacesType object) {
				return createAddressSpacesTypeAdapter();
			}
			@Override
			public Adapter caseAddressSpaceType(AddressSpaceType object) {
				return createAddressSpaceTypeAdapter();
			}
			@Override
			public Adapter caseAddrSpaceRefType(AddrSpaceRefType object) {
				return createAddrSpaceRefTypeAdapter();
			}
			@Override
			public Adapter caseAdHocConnectionsType(AdHocConnectionsType object) {
				return createAdHocConnectionsTypeAdapter();
			}
			@Override
			public Adapter caseAdHocConnectionType(AdHocConnectionType object) {
				return createAdHocConnectionTypeAdapter();
			}
			@Override
			public Adapter caseAlternateGroupsType(AlternateGroupsType object) {
				return createAlternateGroupsTypeAdapter();
			}
			@Override
			public Adapter caseAlternateRegistersType(AlternateRegistersType object) {
				return createAlternateRegistersTypeAdapter();
			}
			@Override
			public Adapter caseAlternateRegisterType(AlternateRegisterType object) {
				return createAlternateRegisterTypeAdapter();
			}
			@Override
			public Adapter caseArgumentType(ArgumentType object) {
				return createArgumentTypeAdapter();
			}
			@Override
			public Adapter caseBankedBankType(BankedBankType object) {
				return createBankedBankTypeAdapter();
			}
			@Override
			public Adapter caseBankedBlockType(BankedBlockType object) {
				return createBankedBlockTypeAdapter();
			}
			@Override
			public Adapter caseBankedSubspaceType(BankedSubspaceType object) {
				return createBankedSubspaceTypeAdapter();
			}
			@Override
			public Adapter caseBaseAddressesType(BaseAddressesType object) {
				return createBaseAddressesTypeAdapter();
			}
			@Override
			public Adapter caseBaseAddressType(BaseAddressType object) {
				return createBaseAddressTypeAdapter();
			}
			@Override
			public Adapter caseBaseAddressType1(BaseAddressType1 object) {
				return createBaseAddressType1Adapter();
			}
			@Override
			public Adapter caseBitSteeringType1(BitSteeringType1 object) {
				return createBitSteeringType1Adapter();
			}
			@Override
			public Adapter caseBitWidthType(BitWidthType object) {
				return createBitWidthTypeAdapter();
			}
			@Override
			public Adapter caseBridgeType(BridgeType object) {
				return createBridgeTypeAdapter();
			}
			@Override
			public Adapter caseBuildCommandType(BuildCommandType object) {
				return createBuildCommandTypeAdapter();
			}
			@Override
			public Adapter caseBusDefinitionType(BusDefinitionType object) {
				return createBusDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseBusInterfacesType(BusInterfacesType object) {
				return createBusInterfacesTypeAdapter();
			}
			@Override
			public Adapter caseBusInterfaceType(BusInterfaceType object) {
				return createBusInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseCellClassType(CellClassType object) {
				return createCellClassTypeAdapter();
			}
			@Override
			public Adapter caseCellFunctionType(CellFunctionType object) {
				return createCellFunctionTypeAdapter();
			}
			@Override
			public Adapter caseCellSpecificationType(CellSpecificationType object) {
				return createCellSpecificationTypeAdapter();
			}
			@Override
			public Adapter caseChannelsType(ChannelsType object) {
				return createChannelsTypeAdapter();
			}
			@Override
			public Adapter caseChannelType(ChannelType object) {
				return createChannelTypeAdapter();
			}
			@Override
			public Adapter caseChoicesType(ChoicesType object) {
				return createChoicesTypeAdapter();
			}
			@Override
			public Adapter caseChoiceType(ChoiceType object) {
				return createChoiceTypeAdapter();
			}
			@Override
			public Adapter caseClockDriverType(ClockDriverType object) {
				return createClockDriverTypeAdapter();
			}
			@Override
			public Adapter caseClockDriverType1(ClockDriverType1 object) {
				return createClockDriverType1Adapter();
			}
			@Override
			public Adapter caseClockPeriodType(ClockPeriodType object) {
				return createClockPeriodTypeAdapter();
			}
			@Override
			public Adapter caseClockPulseDurationType(ClockPulseDurationType object) {
				return createClockPulseDurationTypeAdapter();
			}
			@Override
			public Adapter caseClockPulseOffsetType(ClockPulseOffsetType object) {
				return createClockPulseOffsetTypeAdapter();
			}
			@Override
			public Adapter caseClockPulseValueType(ClockPulseValueType object) {
				return createClockPulseValueTypeAdapter();
			}
			@Override
			public Adapter caseCommandLineSwitchType(CommandLineSwitchType object) {
				return createCommandLineSwitchTypeAdapter();
			}
			@Override
			public Adapter caseCommandType(CommandType object) {
				return createCommandTypeAdapter();
			}
			@Override
			public Adapter caseCommandType1(CommandType1 object) {
				return createCommandType1Adapter();
			}
			@Override
			public Adapter caseCommandType2(CommandType2 object) {
				return createCommandType2Adapter();
			}
			@Override
			public Adapter caseComponentGeneratorsType(ComponentGeneratorsType object) {
				return createComponentGeneratorsTypeAdapter();
			}
			@Override
			public Adapter caseComponentGeneratorType(ComponentGeneratorType object) {
				return createComponentGeneratorTypeAdapter();
			}
			@Override
			public Adapter caseComponentInstancesType(ComponentInstancesType object) {
				return createComponentInstancesTypeAdapter();
			}
			@Override
			public Adapter caseComponentInstanceType(ComponentInstanceType object) {
				return createComponentInstanceTypeAdapter();
			}
			@Override
			public Adapter caseComponentType(ComponentType object) {
				return createComponentTypeAdapter();
			}
			@Override
			public Adapter caseConfigurableElementValuesType(ConfigurableElementValuesType object) {
				return createConfigurableElementValuesTypeAdapter();
			}
			@Override
			public Adapter caseConfigurableElementValueType(ConfigurableElementValueType object) {
				return createConfigurableElementValueTypeAdapter();
			}
			@Override
			public Adapter caseConnectionType(ConnectionType object) {
				return createConnectionTypeAdapter();
			}
			@Override
			public Adapter caseConstraintSetsType(ConstraintSetsType object) {
				return createConstraintSetsTypeAdapter();
			}
			@Override
			public Adapter caseConstraintSetType(ConstraintSetType object) {
				return createConstraintSetTypeAdapter();
			}
			@Override
			public Adapter caseCpusType(CpusType object) {
				return createCpusTypeAdapter();
			}
			@Override
			public Adapter caseCpuType(CpuType object) {
				return createCpuTypeAdapter();
			}
			@Override
			public Adapter caseDefaultValueType(DefaultValueType object) {
				return createDefaultValueTypeAdapter();
			}
			@Override
			public Adapter caseDesignConfigurationType(DesignConfigurationType object) {
				return createDesignConfigurationTypeAdapter();
			}
			@Override
			public Adapter caseDesignType(DesignType object) {
				return createDesignTypeAdapter();
			}
			@Override
			public Adapter caseDisabledType(DisabledType object) {
				return createDisabledTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDriveConstraintType(DriveConstraintType object) {
				return createDriveConstraintTypeAdapter();
			}
			@Override
			public Adapter caseDriverType(DriverType object) {
				return createDriverTypeAdapter();
			}
			@Override
			public Adapter caseEnableType(EnableType object) {
				return createEnableTypeAdapter();
			}
			@Override
			public Adapter caseEnumeratedValuesType(EnumeratedValuesType object) {
				return createEnumeratedValuesTypeAdapter();
			}
			@Override
			public Adapter caseEnumeratedValueType(EnumeratedValueType object) {
				return createEnumeratedValueTypeAdapter();
			}
			@Override
			public Adapter caseEnumerationType(EnumerationType object) {
				return createEnumerationTypeAdapter();
			}
			@Override
			public Adapter caseExecutableImageType(ExecutableImageType object) {
				return createExecutableImageTypeAdapter();
			}
			@Override
			public Adapter caseExternalPortReferenceType(ExternalPortReferenceType object) {
				return createExternalPortReferenceTypeAdapter();
			}
			@Override
			public Adapter caseFieldType(FieldType object) {
				return createFieldTypeAdapter();
			}
			@Override
			public Adapter caseFileBuilderType(FileBuilderType object) {
				return createFileBuilderTypeAdapter();
			}
			@Override
			public Adapter caseFileBuilderType1(FileBuilderType1 object) {
				return createFileBuilderType1Adapter();
			}
			@Override
			public Adapter caseFileSetRefGroupType(FileSetRefGroupType object) {
				return createFileSetRefGroupTypeAdapter();
			}
			@Override
			public Adapter caseFileSetRefGroupType1(FileSetRefGroupType1 object) {
				return createFileSetRefGroupType1Adapter();
			}
			@Override
			public Adapter caseFileSetRefType(FileSetRefType object) {
				return createFileSetRefTypeAdapter();
			}
			@Override
			public Adapter caseFileSetsType(FileSetsType object) {
				return createFileSetsTypeAdapter();
			}
			@Override
			public Adapter caseFileSetType(FileSetType object) {
				return createFileSetTypeAdapter();
			}
			@Override
			public Adapter caseFileType(FileType object) {
				return createFileTypeAdapter();
			}
			@Override
			public Adapter caseFlagsType(FlagsType object) {
				return createFlagsTypeAdapter();
			}
			@Override
			public Adapter caseFlagsType1(FlagsType1 object) {
				return createFlagsType1Adapter();
			}
			@Override
			public Adapter caseFlagsType2(FlagsType2 object) {
				return createFlagsType2Adapter();
			}
			@Override
			public Adapter caseFunctionType(FunctionType object) {
				return createFunctionTypeAdapter();
			}
			@Override
			public Adapter caseGeneratorChainConfigurationType(GeneratorChainConfigurationType object) {
				return createGeneratorChainConfigurationTypeAdapter();
			}
			@Override
			public Adapter caseGeneratorChainSelectorType(GeneratorChainSelectorType object) {
				return createGeneratorChainSelectorTypeAdapter();
			}
			@Override
			public Adapter caseGeneratorChainType(GeneratorChainType object) {
				return createGeneratorChainTypeAdapter();
			}
			@Override
			public Adapter caseGeneratorSelectorType(GeneratorSelectorType object) {
				return createGeneratorSelectorTypeAdapter();
			}
			@Override
			public Adapter caseGeneratorType(GeneratorType object) {
				return createGeneratorTypeAdapter();
			}
			@Override
			public Adapter caseGeneratorType1(GeneratorType1 object) {
				return createGeneratorType1Adapter();
			}
			@Override
			public Adapter caseGroupSelectorType(GroupSelectorType object) {
				return createGroupSelectorTypeAdapter();
			}
			@Override
			public Adapter caseHierConnectionsType(HierConnectionsType object) {
				return createHierConnectionsTypeAdapter();
			}
			@Override
			public Adapter caseHierConnectionType(HierConnectionType object) {
				return createHierConnectionTypeAdapter();
			}
			@Override
			public Adapter caseHierInterface(HierInterface object) {
				return createHierInterfaceAdapter();
			}
			@Override
			public Adapter caseInstanceGeneratorType(InstanceGeneratorType object) {
				return createInstanceGeneratorTypeAdapter();
			}
			@Override
			public Adapter caseInterconnectionConfigurationType(InterconnectionConfigurationType object) {
				return createInterconnectionConfigurationTypeAdapter();
			}
			@Override
			public Adapter caseInterconnectionsType(InterconnectionsType object) {
				return createInterconnectionsTypeAdapter();
			}
			@Override
			public Adapter caseInterconnectionType(InterconnectionType object) {
				return createInterconnectionTypeAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseInternalPortReferenceType(InternalPortReferenceType object) {
				return createInternalPortReferenceTypeAdapter();
			}
			@Override
			public Adapter caseIsIncludeFileType(IsIncludeFileType object) {
				return createIsIncludeFileTypeAdapter();
			}
			@Override
			public Adapter caseLanguageToolsType(LanguageToolsType object) {
				return createLanguageToolsTypeAdapter();
			}
			@Override
			public Adapter caseLanguageType(LanguageType object) {
				return createLanguageTypeAdapter();
			}
			@Override
			public Adapter caseLanguageType1(LanguageType1 object) {
				return createLanguageType1Adapter();
			}
			@Override
			public Adapter caseLeftType(LeftType object) {
				return createLeftTypeAdapter();
			}
			@Override
			public Adapter caseLeftType1(LeftType1 object) {
				return createLeftType1Adapter();
			}
			@Override
			public Adapter caseLeftType2(LeftType2 object) {
				return createLeftType2Adapter();
			}
			@Override
			public Adapter caseLeftType11(LeftType11 object) {
				return createLeftType11Adapter();
			}
			@Override
			public Adapter caseLibraryRefType(LibraryRefType object) {
				return createLibraryRefTypeAdapter();
			}
			@Override
			public Adapter caseLinkerCommandFileType(LinkerCommandFileType object) {
				return createLinkerCommandFileTypeAdapter();
			}
			@Override
			public Adapter caseLinkerFlagsType(LinkerFlagsType object) {
				return createLinkerFlagsTypeAdapter();
			}
			@Override
			public Adapter caseLinkerType(LinkerType object) {
				return createLinkerTypeAdapter();
			}
			@Override
			public Adapter caseLoadConstraintType(LoadConstraintType object) {
				return createLoadConstraintTypeAdapter();
			}
			@Override
			public Adapter caseLocalMemoryMapType(LocalMemoryMapType object) {
				return createLocalMemoryMapTypeAdapter();
			}
			@Override
			public Adapter caseLogicalNameType(LogicalNameType object) {
				return createLogicalNameTypeAdapter();
			}
			@Override
			public Adapter caseLogicalPortType(LogicalPortType object) {
				return createLogicalPortTypeAdapter();
			}
			@Override
			public Adapter caseLogicalPortType1(LogicalPortType1 object) {
				return createLogicalPortType1Adapter();
			}
			@Override
			public Adapter caseMaskType(MaskType object) {
				return createMaskTypeAdapter();
			}
			@Override
			public Adapter caseMaskType1(MaskType1 object) {
				return createMaskType1Adapter();
			}
			@Override
			public Adapter caseMasterType(MasterType object) {
				return createMasterTypeAdapter();
			}
			@Override
			public Adapter caseMaximumType(MaximumType object) {
				return createMaximumTypeAdapter();
			}
			@Override
			public Adapter caseMemoryMapRefType(MemoryMapRefType object) {
				return createMemoryMapRefTypeAdapter();
			}
			@Override
			public Adapter caseMemoryMapsType(MemoryMapsType object) {
				return createMemoryMapsTypeAdapter();
			}
			@Override
			public Adapter caseMemoryMapType(MemoryMapType object) {
				return createMemoryMapTypeAdapter();
			}
			@Override
			public Adapter caseMemoryRemapType(MemoryRemapType object) {
				return createMemoryRemapTypeAdapter();
			}
			@Override
			public Adapter caseMinimumType(MinimumType object) {
				return createMinimumTypeAdapter();
			}
			@Override
			public Adapter caseMirroredMasterType(MirroredMasterType object) {
				return createMirroredMasterTypeAdapter();
			}
			@Override
			public Adapter caseMirroredSlaveType(MirroredSlaveType object) {
				return createMirroredSlaveTypeAdapter();
			}
			@Override
			public Adapter caseMirroredSystemType(MirroredSystemType object) {
				return createMirroredSystemTypeAdapter();
			}
			@Override
			public Adapter caseModelParametersType(ModelParametersType object) {
				return createModelParametersTypeAdapter();
			}
			@Override
			public Adapter caseModelParametersType1(ModelParametersType1 object) {
				return createModelParametersType1Adapter();
			}
			@Override
			public Adapter caseModelType(ModelType object) {
				return createModelTypeAdapter();
			}
			@Override
			public Adapter caseMonitorInterconnectionType(MonitorInterconnectionType object) {
				return createMonitorInterconnectionTypeAdapter();
			}
			@Override
			public Adapter caseMonitorType(MonitorType object) {
				return createMonitorTypeAdapter();
			}
			@Override
			public Adapter caseNameType(NameType object) {
				return createNameTypeAdapter();
			}
			@Override
			public Adapter caseNameType1(NameType1 object) {
				return createNameType1Adapter();
			}
			@Override
			public Adapter caseNameType2(NameType2 object) {
				return createNameType2Adapter();
			}
			@Override
			public Adapter caseNameValuePairType(NameValuePairType object) {
				return createNameValuePairTypeAdapter();
			}
			@Override
			public Adapter caseNameValueTypeType(NameValueTypeType object) {
				return createNameValueTypeTypeAdapter();
			}
			@Override
			public Adapter caseOnMasterType(OnMasterType object) {
				return createOnMasterTypeAdapter();
			}
			@Override
			public Adapter caseOnMasterType1(OnMasterType1 object) {
				return createOnMasterType1Adapter();
			}
			@Override
			public Adapter caseOnSlaveType(OnSlaveType object) {
				return createOnSlaveTypeAdapter();
			}
			@Override
			public Adapter caseOnSlaveType1(OnSlaveType1 object) {
				return createOnSlaveType1Adapter();
			}
			@Override
			public Adapter caseOnSystemType(OnSystemType object) {
				return createOnSystemTypeAdapter();
			}
			@Override
			public Adapter caseOnSystemType1(OnSystemType1 object) {
				return createOnSystemType1Adapter();
			}
			@Override
			public Adapter caseOtherClockDriverType(OtherClockDriverType object) {
				return createOtherClockDriverTypeAdapter();
			}
			@Override
			public Adapter caseOtherClocks(OtherClocks object) {
				return createOtherClocksAdapter();
			}
			@Override
			public Adapter caseParametersType(ParametersType object) {
				return createParametersTypeAdapter();
			}
			@Override
			public Adapter caseParametersType1(ParametersType1 object) {
				return createParametersType1Adapter();
			}
			@Override
			public Adapter casePhaseType(PhaseType object) {
				return createPhaseTypeAdapter();
			}
			@Override
			public Adapter casePhysicalPortType(PhysicalPortType object) {
				return createPhysicalPortTypeAdapter();
			}
			@Override
			public Adapter casePhysicalPortType1(PhysicalPortType1 object) {
				return createPhysicalPortType1Adapter();
			}
			@Override
			public Adapter casePortAccessType(PortAccessType object) {
				return createPortAccessTypeAdapter();
			}
			@Override
			public Adapter casePortDeclarationType(PortDeclarationType object) {
				return createPortDeclarationTypeAdapter();
			}
			@Override
			public Adapter casePortMapsType(PortMapsType object) {
				return createPortMapsTypeAdapter();
			}
			@Override
			public Adapter casePortMapsType1(PortMapsType1 object) {
				return createPortMapsType1Adapter();
			}
			@Override
			public Adapter casePortMapType(PortMapType object) {
				return createPortMapTypeAdapter();
			}
			@Override
			public Adapter casePortMapType1(PortMapType1 object) {
				return createPortMapType1Adapter();
			}
			@Override
			public Adapter casePortsType(PortsType object) {
				return createPortsTypeAdapter();
			}
			@Override
			public Adapter casePortsType1(PortsType1 object) {
				return createPortsType1Adapter();
			}
			@Override
			public Adapter casePortsType11(PortsType11 object) {
				return createPortsType11Adapter();
			}
			@Override
			public Adapter casePortTransactionalType(PortTransactionalType object) {
				return createPortTransactionalTypeAdapter();
			}
			@Override
			public Adapter casePortType(PortType object) {
				return createPortTypeAdapter();
			}
			@Override
			public Adapter casePortType1(PortType1 object) {
				return createPortType1Adapter();
			}
			@Override
			public Adapter casePortWireType(PortWireType object) {
				return createPortWireTypeAdapter();
			}
			@Override
			public Adapter caseQualifierType(QualifierType object) {
				return createQualifierTypeAdapter();
			}
			@Override
			public Adapter caseQualifierType1(QualifierType1 object) {
				return createQualifierType1Adapter();
			}
			@Override
			public Adapter caseRangeType(RangeType object) {
				return createRangeTypeAdapter();
			}
			@Override
			public Adapter caseRangeType1(RangeType1 object) {
				return createRangeType1Adapter();
			}
			@Override
			public Adapter caseRangeType11(RangeType11 object) {
				return createRangeType11Adapter();
			}
			@Override
			public Adapter caseRangeType2(RangeType2 object) {
				return createRangeType2Adapter();
			}
			@Override
			public Adapter caseRegisterFileType(RegisterFileType object) {
				return createRegisterFileTypeAdapter();
			}
			@Override
			public Adapter caseRegisterType(RegisterType object) {
				return createRegisterTypeAdapter();
			}
			@Override
			public Adapter caseRemapAddressType(RemapAddressType object) {
				return createRemapAddressTypeAdapter();
			}
			@Override
			public Adapter caseRemapPortsType(RemapPortsType object) {
				return createRemapPortsTypeAdapter();
			}
			@Override
			public Adapter caseRemapPortType(RemapPortType object) {
				return createRemapPortTypeAdapter();
			}
			@Override
			public Adapter caseRemapStatesType(RemapStatesType object) {
				return createRemapStatesTypeAdapter();
			}
			@Override
			public Adapter caseRemapStateType(RemapStateType object) {
				return createRemapStateTypeAdapter();
			}
			@Override
			public Adapter caseReplaceDefaultFlagsType(ReplaceDefaultFlagsType object) {
				return createReplaceDefaultFlagsTypeAdapter();
			}
			@Override
			public Adapter caseReplaceDefaultFlagsType1(ReplaceDefaultFlagsType1 object) {
				return createReplaceDefaultFlagsType1Adapter();
			}
			@Override
			public Adapter caseReplaceDefaultFlagsType2(ReplaceDefaultFlagsType2 object) {
				return createReplaceDefaultFlagsType2Adapter();
			}
			@Override
			public Adapter caseRequiresDriverType(RequiresDriverType object) {
				return createRequiresDriverTypeAdapter();
			}
			@Override
			public Adapter caseResetType(ResetType object) {
				return createResetTypeAdapter();
			}
			@Override
			public Adapter caseResetType1(ResetType1 object) {
				return createResetType1Adapter();
			}
			@Override
			public Adapter caseResolvedLibraryRefType(ResolvedLibraryRefType object) {
				return createResolvedLibraryRefTypeAdapter();
			}
			@Override
			public Adapter caseRightType(RightType object) {
				return createRightTypeAdapter();
			}
			@Override
			public Adapter caseRightType1(RightType1 object) {
				return createRightType1Adapter();
			}
			@Override
			public Adapter caseRightType2(RightType2 object) {
				return createRightType2Adapter();
			}
			@Override
			public Adapter caseRightType11(RightType11 object) {
				return createRightType11Adapter();
			}
			@Override
			public Adapter caseSegmentsType(SegmentsType object) {
				return createSegmentsTypeAdapter();
			}
			@Override
			public Adapter caseSegmentType(SegmentType object) {
				return createSegmentTypeAdapter();
			}
			@Override
			public Adapter caseServiceType(ServiceType object) {
				return createServiceTypeAdapter();
			}
			@Override
			public Adapter caseServiceType1(ServiceType1 object) {
				return createServiceType1Adapter();
			}
			@Override
			public Adapter caseServiceTypeDefsType(ServiceTypeDefsType object) {
				return createServiceTypeDefsTypeAdapter();
			}
			@Override
			public Adapter caseServiceTypeDefType(ServiceTypeDefType object) {
				return createServiceTypeDefTypeAdapter();
			}
			@Override
			public Adapter caseSingleShotDriverType(SingleShotDriverType object) {
				return createSingleShotDriverTypeAdapter();
			}
			@Override
			public Adapter caseSingleShotDurationType(SingleShotDurationType object) {
				return createSingleShotDurationTypeAdapter();
			}
			@Override
			public Adapter caseSingleShotOffsetType(SingleShotOffsetType object) {
				return createSingleShotOffsetTypeAdapter();
			}
			@Override
			public Adapter caseSingleShotValueType(SingleShotValueType object) {
				return createSingleShotValueTypeAdapter();
			}
			@Override
			public Adapter caseSizeType(SizeType object) {
				return createSizeTypeAdapter();
			}
			@Override
			public Adapter caseSlaveType(SlaveType object) {
				return createSlaveTypeAdapter();
			}
			@Override
			public Adapter caseSourceFileType(SourceFileType object) {
				return createSourceFileTypeAdapter();
			}
			@Override
			public Adapter caseSourceNameType(SourceNameType object) {
				return createSourceNameTypeAdapter();
			}
			@Override
			public Adapter caseSubspaceRefType(SubspaceRefType object) {
				return createSubspaceRefTypeAdapter();
			}
			@Override
			public Adapter caseSystemGroupNamesType(SystemGroupNamesType object) {
				return createSystemGroupNamesTypeAdapter();
			}
			@Override
			public Adapter caseSystemType(SystemType object) {
				return createSystemTypeAdapter();
			}
			@Override
			public Adapter caseTargetNameType(TargetNameType object) {
				return createTargetNameTypeAdapter();
			}
			@Override
			public Adapter caseTestableType(TestableType object) {
				return createTestableTypeAdapter();
			}
			@Override
			public Adapter caseTimingConstraintType(TimingConstraintType object) {
				return createTimingConstraintTypeAdapter();
			}
			@Override
			public Adapter caseTransactionalType(TransactionalType object) {
				return createTransactionalTypeAdapter();
			}
			@Override
			public Adapter caseTransportMethodsType(TransportMethodsType object) {
				return createTransportMethodsTypeAdapter();
			}
			@Override
			public Adapter caseTransTypeDefType(TransTypeDefType object) {
				return createTransTypeDefTypeAdapter();
			}
			@Override
			public Adapter caseTypeNameType(TypeNameType object) {
				return createTypeNameTypeAdapter();
			}
			@Override
			public Adapter caseTypeNameType1(TypeNameType1 object) {
				return createTypeNameType1Adapter();
			}
			@Override
			public Adapter caseTypeNameType11(TypeNameType11 object) {
				return createTypeNameType11Adapter();
			}
			@Override
			public Adapter caseTypeNameType2(TypeNameType2 object) {
				return createTypeNameType2Adapter();
			}
			@Override
			public Adapter caseValueMaskConfigType(ValueMaskConfigType object) {
				return createValueMaskConfigTypeAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseValueType1(ValueType1 object) {
				return createValueType1Adapter();
			}
			@Override
			public Adapter caseValueType2(ValueType2 object) {
				return createValueType2Adapter();
			}
			@Override
			public Adapter caseVectorType(VectorType object) {
				return createVectorTypeAdapter();
			}
			@Override
			public Adapter caseVectorType1(VectorType1 object) {
				return createVectorType1Adapter();
			}
			@Override
			public Adapter caseVectorType2(VectorType2 object) {
				return createVectorType2Adapter();
			}
			@Override
			public Adapter caseVectorType11(VectorType11 object) {
				return createVectorType11Adapter();
			}
			@Override
			public Adapter caseVendorExtensionsType(VendorExtensionsType object) {
				return createVendorExtensionsTypeAdapter();
			}
			@Override
			public Adapter caseViewConfigurationType(ViewConfigurationType object) {
				return createViewConfigurationTypeAdapter();
			}
			@Override
			public Adapter caseViewsType(ViewsType object) {
				return createViewsTypeAdapter();
			}
			@Override
			public Adapter caseViewsType1(ViewsType1 object) {
				return createViewsType1Adapter();
			}
			@Override
			public Adapter caseViewType(ViewType object) {
				return createViewTypeAdapter();
			}
			@Override
			public Adapter caseWhiteboxElementRefsType(WhiteboxElementRefsType object) {
				return createWhiteboxElementRefsTypeAdapter();
			}
			@Override
			public Adapter caseWhiteboxElementRefType(WhiteboxElementRefType object) {
				return createWhiteboxElementRefTypeAdapter();
			}
			@Override
			public Adapter caseWhiteboxElementsType(WhiteboxElementsType object) {
				return createWhiteboxElementsTypeAdapter();
			}
			@Override
			public Adapter caseWhiteboxElementType(WhiteboxElementType object) {
				return createWhiteboxElementTypeAdapter();
			}
			@Override
			public Adapter caseWhiteboxPathType(WhiteboxPathType object) {
				return createWhiteboxPathTypeAdapter();
			}
			@Override
			public Adapter caseWidthType(WidthType object) {
				return createWidthTypeAdapter();
			}
			@Override
			public Adapter caseWireType(WireType object) {
				return createWireTypeAdapter();
			}
			@Override
			public Adapter caseWireTypeDefsType(WireTypeDefsType object) {
				return createWireTypeDefsTypeAdapter();
			}
			@Override
			public Adapter caseWireTypeDefType(WireTypeDefType object) {
				return createWireTypeDefTypeAdapter();
			}
			@Override
			public Adapter caseWriteValueConstraintType(WriteValueConstraintType object) {
				return createWriteValueConstraintTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractionDefinitionType <em>Abstraction Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractionDefinitionType
	 * @generated
	 */
	public Adapter createAbstractionDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractionDefPortConstraintsType <em>Abstraction Def Port Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractionDefPortConstraintsType
	 * @generated
	 */
	public Adapter createAbstractionDefPortConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorBusInterfaceType <em>Abstractor Bus Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorBusInterfaceType
	 * @generated
	 */
	public Adapter createAbstractorBusInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorGeneratorsType <em>Abstractor Generators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorGeneratorsType
	 * @generated
	 */
	public Adapter createAbstractorGeneratorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorInterfacesType <em>Abstractor Interfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorInterfacesType
	 * @generated
	 */
	public Adapter createAbstractorInterfacesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorModelType <em>Abstractor Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorModelType
	 * @generated
	 */
	public Adapter createAbstractorModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorModeType1 <em>Abstractor Mode Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorModeType1
	 * @generated
	 */
	public Adapter createAbstractorModeType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorPortType <em>Abstractor Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorPortType
	 * @generated
	 */
	public Adapter createAbstractorPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorPortWireType <em>Abstractor Port Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorPortWireType
	 * @generated
	 */
	public Adapter createAbstractorPortWireTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorsType <em>Abstractors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorsType
	 * @generated
	 */
	public Adapter createAbstractorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorType <em>Abstractor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorType
	 * @generated
	 */
	public Adapter createAbstractorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorType1 <em>Abstractor Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorType1
	 * @generated
	 */
	public Adapter createAbstractorType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType <em>Abstractor View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType
	 * @generated
	 */
	public Adapter createAbstractorViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType <em>Address Bank Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType
	 * @generated
	 */
	public Adapter createAddressBankTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBlockType <em>Address Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AddressBlockType
	 * @generated
	 */
	public Adapter createAddressBlockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressOffsetType <em>Address Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AddressOffsetType
	 * @generated
	 */
	public Adapter createAddressOffsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressSpaceRefType <em>Address Space Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AddressSpaceRefType
	 * @generated
	 */
	public Adapter createAddressSpaceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressSpacesType <em>Address Spaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AddressSpacesType
	 * @generated
	 */
	public Adapter createAddressSpacesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressSpaceType <em>Address Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AddressSpaceType
	 * @generated
	 */
	public Adapter createAddressSpaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddrSpaceRefType <em>Addr Space Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AddrSpaceRefType
	 * @generated
	 */
	public Adapter createAddrSpaceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionsType <em>Ad Hoc Connections Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionsType
	 * @generated
	 */
	public Adapter createAdHocConnectionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionType <em>Ad Hoc Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionType
	 * @generated
	 */
	public Adapter createAdHocConnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AlternateGroupsType <em>Alternate Groups Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AlternateGroupsType
	 * @generated
	 */
	public Adapter createAlternateGroupsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AlternateRegistersType <em>Alternate Registers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AlternateRegistersType
	 * @generated
	 */
	public Adapter createAlternateRegistersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AlternateRegisterType <em>Alternate Register Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AlternateRegisterType
	 * @generated
	 */
	public Adapter createAlternateRegisterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ArgumentType <em>Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ArgumentType
	 * @generated
	 */
	public Adapter createArgumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BankedBankType <em>Banked Bank Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BankedBankType
	 * @generated
	 */
	public Adapter createBankedBankTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BankedBlockType <em>Banked Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BankedBlockType
	 * @generated
	 */
	public Adapter createBankedBlockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BankedSubspaceType <em>Banked Subspace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BankedSubspaceType
	 * @generated
	 */
	public Adapter createBankedSubspaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BaseAddressesType <em>Base Addresses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BaseAddressesType
	 * @generated
	 */
	public Adapter createBaseAddressesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BaseAddressType <em>Base Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BaseAddressType
	 * @generated
	 */
	public Adapter createBaseAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BaseAddressType1 <em>Base Address Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BaseAddressType1
	 * @generated
	 */
	public Adapter createBaseAddressType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BitSteeringType1 <em>Bit Steering Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BitSteeringType1
	 * @generated
	 */
	public Adapter createBitSteeringType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BitWidthType <em>Bit Width Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BitWidthType
	 * @generated
	 */
	public Adapter createBitWidthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BridgeType <em>Bridge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BridgeType
	 * @generated
	 */
	public Adapter createBridgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BuildCommandType <em>Build Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BuildCommandType
	 * @generated
	 */
	public Adapter createBuildCommandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BusDefinitionType <em>Bus Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BusDefinitionType
	 * @generated
	 */
	public Adapter createBusDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BusInterfacesType <em>Bus Interfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BusInterfacesType
	 * @generated
	 */
	public Adapter createBusInterfacesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BusInterfaceType <em>Bus Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BusInterfaceType
	 * @generated
	 */
	public Adapter createBusInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CellClassType <em>Cell Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CellClassType
	 * @generated
	 */
	public Adapter createCellClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CellFunctionType <em>Cell Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CellFunctionType
	 * @generated
	 */
	public Adapter createCellFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CellSpecificationType <em>Cell Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CellSpecificationType
	 * @generated
	 */
	public Adapter createCellSpecificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ChannelsType <em>Channels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ChannelsType
	 * @generated
	 */
	public Adapter createChannelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ChannelType
	 * @generated
	 */
	public Adapter createChannelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ChoicesType <em>Choices Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ChoicesType
	 * @generated
	 */
	public Adapter createChoicesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ChoiceType <em>Choice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ChoiceType
	 * @generated
	 */
	public Adapter createChoiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ClockDriverType <em>Clock Driver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ClockDriverType
	 * @generated
	 */
	public Adapter createClockDriverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ClockDriverType1 <em>Clock Driver Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ClockDriverType1
	 * @generated
	 */
	public Adapter createClockDriverType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ClockPeriodType <em>Clock Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ClockPeriodType
	 * @generated
	 */
	public Adapter createClockPeriodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ClockPulseDurationType <em>Clock Pulse Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ClockPulseDurationType
	 * @generated
	 */
	public Adapter createClockPulseDurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ClockPulseOffsetType <em>Clock Pulse Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ClockPulseOffsetType
	 * @generated
	 */
	public Adapter createClockPulseOffsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ClockPulseValueType <em>Clock Pulse Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ClockPulseValueType
	 * @generated
	 */
	public Adapter createClockPulseValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CommandLineSwitchType <em>Command Line Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CommandLineSwitchType
	 * @generated
	 */
	public Adapter createCommandLineSwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CommandType <em>Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CommandType
	 * @generated
	 */
	public Adapter createCommandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CommandType1 <em>Command Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CommandType1
	 * @generated
	 */
	public Adapter createCommandType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CommandType2 <em>Command Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CommandType2
	 * @generated
	 */
	public Adapter createCommandType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ComponentGeneratorsType <em>Component Generators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ComponentGeneratorsType
	 * @generated
	 */
	public Adapter createComponentGeneratorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ComponentGeneratorType <em>Component Generator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ComponentGeneratorType
	 * @generated
	 */
	public Adapter createComponentGeneratorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstancesType <em>Component Instances Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstancesType
	 * @generated
	 */
	public Adapter createComponentInstancesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType <em>Component Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType
	 * @generated
	 */
	public Adapter createComponentInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ConfigurableElementValuesType <em>Configurable Element Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ConfigurableElementValuesType
	 * @generated
	 */
	public Adapter createConfigurableElementValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ConfigurableElementValueType <em>Configurable Element Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ConfigurableElementValueType
	 * @generated
	 */
	public Adapter createConfigurableElementValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ConnectionType
	 * @generated
	 */
	public Adapter createConnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ConstraintSetsType <em>Constraint Sets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ConstraintSetsType
	 * @generated
	 */
	public Adapter createConstraintSetsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ConstraintSetType <em>Constraint Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ConstraintSetType
	 * @generated
	 */
	public Adapter createConstraintSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CpusType <em>Cpus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CpusType
	 * @generated
	 */
	public Adapter createCpusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CpuType <em>Cpu Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CpuType
	 * @generated
	 */
	public Adapter createCpuTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.DefaultValueType <em>Default Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DefaultValueType
	 * @generated
	 */
	public Adapter createDefaultValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.DesignConfigurationType <em>Design Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DesignConfigurationType
	 * @generated
	 */
	public Adapter createDesignConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.DesignType <em>Design Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DesignType
	 * @generated
	 */
	public Adapter createDesignTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.DisabledType <em>Disabled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DisabledType
	 * @generated
	 */
	public Adapter createDisabledTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.DriveConstraintType <em>Drive Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DriveConstraintType
	 * @generated
	 */
	public Adapter createDriveConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.DriverType <em>Driver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DriverType
	 * @generated
	 */
	public Adapter createDriverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.EnableType <em>Enable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.EnableType
	 * @generated
	 */
	public Adapter createEnableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.EnumeratedValuesType <em>Enumerated Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.EnumeratedValuesType
	 * @generated
	 */
	public Adapter createEnumeratedValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.EnumeratedValueType <em>Enumerated Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.EnumeratedValueType
	 * @generated
	 */
	public Adapter createEnumeratedValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.EnumerationType
	 * @generated
	 */
	public Adapter createEnumerationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ExecutableImageType <em>Executable Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ExecutableImageType
	 * @generated
	 */
	public Adapter createExecutableImageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ExternalPortReferenceType <em>External Port Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ExternalPortReferenceType
	 * @generated
	 */
	public Adapter createExternalPortReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FieldType
	 * @generated
	 */
	public Adapter createFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FileBuilderType <em>File Builder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FileBuilderType
	 * @generated
	 */
	public Adapter createFileBuilderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FileBuilderType1 <em>File Builder Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FileBuilderType1
	 * @generated
	 */
	public Adapter createFileBuilderType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefGroupType <em>File Set Ref Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefGroupType
	 * @generated
	 */
	public Adapter createFileSetRefGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefGroupType1 <em>File Set Ref Group Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefGroupType1
	 * @generated
	 */
	public Adapter createFileSetRefGroupType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefType <em>File Set Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefType
	 * @generated
	 */
	public Adapter createFileSetRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FileSetsType <em>File Sets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FileSetsType
	 * @generated
	 */
	public Adapter createFileSetsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FileSetType <em>File Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FileSetType
	 * @generated
	 */
	public Adapter createFileSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FileType
	 * @generated
	 */
	public Adapter createFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FlagsType <em>Flags Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FlagsType
	 * @generated
	 */
	public Adapter createFlagsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FlagsType1 <em>Flags Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FlagsType1
	 * @generated
	 */
	public Adapter createFlagsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FlagsType2 <em>Flags Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FlagsType2
	 * @generated
	 */
	public Adapter createFlagsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FunctionType
	 * @generated
	 */
	public Adapter createFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.GeneratorChainConfigurationType <em>Generator Chain Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.GeneratorChainConfigurationType
	 * @generated
	 */
	public Adapter createGeneratorChainConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.GeneratorChainSelectorType <em>Generator Chain Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.GeneratorChainSelectorType
	 * @generated
	 */
	public Adapter createGeneratorChainSelectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.GeneratorChainType <em>Generator Chain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.GeneratorChainType
	 * @generated
	 */
	public Adapter createGeneratorChainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.GeneratorSelectorType <em>Generator Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.GeneratorSelectorType
	 * @generated
	 */
	public Adapter createGeneratorSelectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.GeneratorType <em>Generator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.GeneratorType
	 * @generated
	 */
	public Adapter createGeneratorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.GeneratorType1 <em>Generator Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.GeneratorType1
	 * @generated
	 */
	public Adapter createGeneratorType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.GroupSelectorType <em>Group Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.GroupSelectorType
	 * @generated
	 */
	public Adapter createGroupSelectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.HierConnectionsType <em>Hier Connections Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.HierConnectionsType
	 * @generated
	 */
	public Adapter createHierConnectionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.HierConnectionType <em>Hier Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.HierConnectionType
	 * @generated
	 */
	public Adapter createHierConnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.HierInterface <em>Hier Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.HierInterface
	 * @generated
	 */
	public Adapter createHierInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.InstanceGeneratorType <em>Instance Generator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.InstanceGeneratorType
	 * @generated
	 */
	public Adapter createInstanceGeneratorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionConfigurationType <em>Interconnection Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionConfigurationType
	 * @generated
	 */
	public Adapter createInterconnectionConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionsType <em>Interconnections Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionsType
	 * @generated
	 */
	public Adapter createInterconnectionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionType <em>Interconnection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionType
	 * @generated
	 */
	public Adapter createInterconnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.InternalPortReferenceType <em>Internal Port Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.InternalPortReferenceType
	 * @generated
	 */
	public Adapter createInternalPortReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.IsIncludeFileType <em>Is Include File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.IsIncludeFileType
	 * @generated
	 */
	public Adapter createIsIncludeFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LanguageToolsType <em>Language Tools Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LanguageToolsType
	 * @generated
	 */
	public Adapter createLanguageToolsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LanguageType <em>Language Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LanguageType
	 * @generated
	 */
	public Adapter createLanguageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LanguageType1 <em>Language Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LanguageType1
	 * @generated
	 */
	public Adapter createLanguageType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LeftType <em>Left Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LeftType
	 * @generated
	 */
	public Adapter createLeftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LeftType1 <em>Left Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LeftType1
	 * @generated
	 */
	public Adapter createLeftType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LeftType2 <em>Left Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LeftType2
	 * @generated
	 */
	public Adapter createLeftType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LeftType11 <em>Left Type11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LeftType11
	 * @generated
	 */
	public Adapter createLeftType11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LibraryRefType <em>Library Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LibraryRefType
	 * @generated
	 */
	public Adapter createLibraryRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LinkerCommandFileType <em>Linker Command File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LinkerCommandFileType
	 * @generated
	 */
	public Adapter createLinkerCommandFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LinkerFlagsType <em>Linker Flags Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LinkerFlagsType
	 * @generated
	 */
	public Adapter createLinkerFlagsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LinkerType <em>Linker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LinkerType
	 * @generated
	 */
	public Adapter createLinkerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LoadConstraintType <em>Load Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LoadConstraintType
	 * @generated
	 */
	public Adapter createLoadConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LocalMemoryMapType <em>Local Memory Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LocalMemoryMapType
	 * @generated
	 */
	public Adapter createLocalMemoryMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LogicalNameType <em>Logical Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LogicalNameType
	 * @generated
	 */
	public Adapter createLogicalNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LogicalPortType <em>Logical Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LogicalPortType
	 * @generated
	 */
	public Adapter createLogicalPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LogicalPortType1 <em>Logical Port Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LogicalPortType1
	 * @generated
	 */
	public Adapter createLogicalPortType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MaskType <em>Mask Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MaskType
	 * @generated
	 */
	public Adapter createMaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MaskType1 <em>Mask Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MaskType1
	 * @generated
	 */
	public Adapter createMaskType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MasterType <em>Master Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MasterType
	 * @generated
	 */
	public Adapter createMasterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MaximumType <em>Maximum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MaximumType
	 * @generated
	 */
	public Adapter createMaximumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapRefType <em>Memory Map Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapRefType
	 * @generated
	 */
	public Adapter createMemoryMapRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapsType <em>Memory Maps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapsType
	 * @generated
	 */
	public Adapter createMemoryMapsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType <em>Memory Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType
	 * @generated
	 */
	public Adapter createMemoryMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryRemapType <em>Memory Remap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MemoryRemapType
	 * @generated
	 */
	public Adapter createMemoryRemapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MinimumType <em>Minimum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MinimumType
	 * @generated
	 */
	public Adapter createMinimumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MirroredMasterType <em>Mirrored Master Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MirroredMasterType
	 * @generated
	 */
	public Adapter createMirroredMasterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MirroredSlaveType <em>Mirrored Slave Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MirroredSlaveType
	 * @generated
	 */
	public Adapter createMirroredSlaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MirroredSystemType <em>Mirrored System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MirroredSystemType
	 * @generated
	 */
	public Adapter createMirroredSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ModelParametersType <em>Model Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ModelParametersType
	 * @generated
	 */
	public Adapter createModelParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ModelParametersType1 <em>Model Parameters Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ModelParametersType1
	 * @generated
	 */
	public Adapter createModelParametersType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ModelType
	 * @generated
	 */
	public Adapter createModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MonitorInterconnectionType <em>Monitor Interconnection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MonitorInterconnectionType
	 * @generated
	 */
	public Adapter createMonitorInterconnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MonitorType <em>Monitor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MonitorType
	 * @generated
	 */
	public Adapter createMonitorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.NameType
	 * @generated
	 */
	public Adapter createNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.NameType1 <em>Name Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.NameType1
	 * @generated
	 */
	public Adapter createNameType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.NameType2 <em>Name Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.NameType2
	 * @generated
	 */
	public Adapter createNameType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.NameValuePairType <em>Name Value Pair Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.NameValuePairType
	 * @generated
	 */
	public Adapter createNameValuePairTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.NameValueTypeType <em>Name Value Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.NameValueTypeType
	 * @generated
	 */
	public Adapter createNameValueTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.OnMasterType <em>On Master Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.OnMasterType
	 * @generated
	 */
	public Adapter createOnMasterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.OnMasterType1 <em>On Master Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.OnMasterType1
	 * @generated
	 */
	public Adapter createOnMasterType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.OnSlaveType <em>On Slave Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.OnSlaveType
	 * @generated
	 */
	public Adapter createOnSlaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.OnSlaveType1 <em>On Slave Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.OnSlaveType1
	 * @generated
	 */
	public Adapter createOnSlaveType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.OnSystemType <em>On System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.OnSystemType
	 * @generated
	 */
	public Adapter createOnSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.OnSystemType1 <em>On System Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.OnSystemType1
	 * @generated
	 */
	public Adapter createOnSystemType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.OtherClockDriverType <em>Other Clock Driver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.OtherClockDriverType
	 * @generated
	 */
	public Adapter createOtherClockDriverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.OtherClocks <em>Other Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.OtherClocks
	 * @generated
	 */
	public Adapter createOtherClocksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ParametersType <em>Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ParametersType
	 * @generated
	 */
	public Adapter createParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ParametersType1 <em>Parameters Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ParametersType1
	 * @generated
	 */
	public Adapter createParametersType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PhaseType <em>Phase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PhaseType
	 * @generated
	 */
	public Adapter createPhaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PhysicalPortType <em>Physical Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PhysicalPortType
	 * @generated
	 */
	public Adapter createPhysicalPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PhysicalPortType1 <em>Physical Port Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PhysicalPortType1
	 * @generated
	 */
	public Adapter createPhysicalPortType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortAccessType <em>Port Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortAccessType
	 * @generated
	 */
	public Adapter createPortAccessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortDeclarationType <em>Port Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortDeclarationType
	 * @generated
	 */
	public Adapter createPortDeclarationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortMapsType <em>Port Maps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortMapsType
	 * @generated
	 */
	public Adapter createPortMapsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortMapsType1 <em>Port Maps Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortMapsType1
	 * @generated
	 */
	public Adapter createPortMapsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortMapType <em>Port Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortMapType
	 * @generated
	 */
	public Adapter createPortMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortMapType1 <em>Port Map Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortMapType1
	 * @generated
	 */
	public Adapter createPortMapType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortsType <em>Ports Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortsType
	 * @generated
	 */
	public Adapter createPortsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortsType1 <em>Ports Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortsType1
	 * @generated
	 */
	public Adapter createPortsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortsType11 <em>Ports Type11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortsType11
	 * @generated
	 */
	public Adapter createPortsType11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortTransactionalType <em>Port Transactional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortTransactionalType
	 * @generated
	 */
	public Adapter createPortTransactionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortType
	 * @generated
	 */
	public Adapter createPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortType1 <em>Port Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortType1
	 * @generated
	 */
	public Adapter createPortType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortWireType <em>Port Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortWireType
	 * @generated
	 */
	public Adapter createPortWireTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.QualifierType <em>Qualifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.QualifierType
	 * @generated
	 */
	public Adapter createQualifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.QualifierType1 <em>Qualifier Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.QualifierType1
	 * @generated
	 */
	public Adapter createQualifierType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RangeType
	 * @generated
	 */
	public Adapter createRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RangeType1 <em>Range Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RangeType1
	 * @generated
	 */
	public Adapter createRangeType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RangeType11 <em>Range Type11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RangeType11
	 * @generated
	 */
	public Adapter createRangeType11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RangeType2 <em>Range Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RangeType2
	 * @generated
	 */
	public Adapter createRangeType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RegisterFileType <em>Register File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RegisterFileType
	 * @generated
	 */
	public Adapter createRegisterFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RegisterType <em>Register Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RegisterType
	 * @generated
	 */
	public Adapter createRegisterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RemapAddressType <em>Remap Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RemapAddressType
	 * @generated
	 */
	public Adapter createRemapAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RemapPortsType <em>Remap Ports Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RemapPortsType
	 * @generated
	 */
	public Adapter createRemapPortsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RemapPortType <em>Remap Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RemapPortType
	 * @generated
	 */
	public Adapter createRemapPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RemapStatesType <em>Remap States Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RemapStatesType
	 * @generated
	 */
	public Adapter createRemapStatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RemapStateType <em>Remap State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RemapStateType
	 * @generated
	 */
	public Adapter createRemapStateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ReplaceDefaultFlagsType <em>Replace Default Flags Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ReplaceDefaultFlagsType
	 * @generated
	 */
	public Adapter createReplaceDefaultFlagsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ReplaceDefaultFlagsType1 <em>Replace Default Flags Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ReplaceDefaultFlagsType1
	 * @generated
	 */
	public Adapter createReplaceDefaultFlagsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ReplaceDefaultFlagsType2 <em>Replace Default Flags Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ReplaceDefaultFlagsType2
	 * @generated
	 */
	public Adapter createReplaceDefaultFlagsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RequiresDriverType <em>Requires Driver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RequiresDriverType
	 * @generated
	 */
	public Adapter createRequiresDriverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ResetType <em>Reset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ResetType
	 * @generated
	 */
	public Adapter createResetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ResetType1 <em>Reset Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ResetType1
	 * @generated
	 */
	public Adapter createResetType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ResolvedLibraryRefType <em>Resolved Library Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ResolvedLibraryRefType
	 * @generated
	 */
	public Adapter createResolvedLibraryRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RightType <em>Right Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RightType
	 * @generated
	 */
	public Adapter createRightTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RightType1 <em>Right Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RightType1
	 * @generated
	 */
	public Adapter createRightType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RightType2 <em>Right Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RightType2
	 * @generated
	 */
	public Adapter createRightType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RightType11 <em>Right Type11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RightType11
	 * @generated
	 */
	public Adapter createRightType11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SegmentsType <em>Segments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SegmentsType
	 * @generated
	 */
	public Adapter createSegmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SegmentType <em>Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SegmentType
	 * @generated
	 */
	public Adapter createSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ServiceType
	 * @generated
	 */
	public Adapter createServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ServiceType1 <em>Service Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ServiceType1
	 * @generated
	 */
	public Adapter createServiceType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ServiceTypeDefsType <em>Service Type Defs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ServiceTypeDefsType
	 * @generated
	 */
	public Adapter createServiceTypeDefsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ServiceTypeDefType <em>Service Type Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ServiceTypeDefType
	 * @generated
	 */
	public Adapter createServiceTypeDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SingleShotDriverType <em>Single Shot Driver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SingleShotDriverType
	 * @generated
	 */
	public Adapter createSingleShotDriverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SingleShotDurationType <em>Single Shot Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SingleShotDurationType
	 * @generated
	 */
	public Adapter createSingleShotDurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SingleShotOffsetType <em>Single Shot Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SingleShotOffsetType
	 * @generated
	 */
	public Adapter createSingleShotOffsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SingleShotValueType <em>Single Shot Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SingleShotValueType
	 * @generated
	 */
	public Adapter createSingleShotValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SizeType <em>Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SizeType
	 * @generated
	 */
	public Adapter createSizeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SlaveType <em>Slave Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SlaveType
	 * @generated
	 */
	public Adapter createSlaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SourceFileType <em>Source File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SourceFileType
	 * @generated
	 */
	public Adapter createSourceFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SourceNameType <em>Source Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SourceNameType
	 * @generated
	 */
	public Adapter createSourceNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SubspaceRefType <em>Subspace Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SubspaceRefType
	 * @generated
	 */
	public Adapter createSubspaceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SystemGroupNamesType <em>System Group Names Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SystemGroupNamesType
	 * @generated
	 */
	public Adapter createSystemGroupNamesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SystemType
	 * @generated
	 */
	public Adapter createSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TargetNameType <em>Target Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TargetNameType
	 * @generated
	 */
	public Adapter createTargetNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TestableType <em>Testable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TestableType
	 * @generated
	 */
	public Adapter createTestableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TimingConstraintType <em>Timing Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TimingConstraintType
	 * @generated
	 */
	public Adapter createTimingConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TransactionalType <em>Transactional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TransactionalType
	 * @generated
	 */
	public Adapter createTransactionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TransportMethodsType <em>Transport Methods Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TransportMethodsType
	 * @generated
	 */
	public Adapter createTransportMethodsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TransTypeDefType <em>Trans Type Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TransTypeDefType
	 * @generated
	 */
	public Adapter createTransTypeDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType <em>Type Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType
	 * @generated
	 */
	public Adapter createTypeNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType1 <em>Type Name Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType1
	 * @generated
	 */
	public Adapter createTypeNameType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType11 <em>Type Name Type11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType11
	 * @generated
	 */
	public Adapter createTypeNameType11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType2 <em>Type Name Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType2
	 * @generated
	 */
	public Adapter createTypeNameType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ValueMaskConfigType <em>Value Mask Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ValueMaskConfigType
	 * @generated
	 */
	public Adapter createValueMaskConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ValueType1 <em>Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ValueType1
	 * @generated
	 */
	public Adapter createValueType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ValueType2 <em>Value Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ValueType2
	 * @generated
	 */
	public Adapter createValueType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.VectorType <em>Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.VectorType
	 * @generated
	 */
	public Adapter createVectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.VectorType1 <em>Vector Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.VectorType1
	 * @generated
	 */
	public Adapter createVectorType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.VectorType2 <em>Vector Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.VectorType2
	 * @generated
	 */
	public Adapter createVectorType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.VectorType11 <em>Vector Type11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.VectorType11
	 * @generated
	 */
	public Adapter createVectorType11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.VendorExtensionsType <em>Vendor Extensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.VendorExtensionsType
	 * @generated
	 */
	public Adapter createVendorExtensionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ViewConfigurationType <em>View Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ViewConfigurationType
	 * @generated
	 */
	public Adapter createViewConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ViewsType <em>Views Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ViewsType
	 * @generated
	 */
	public Adapter createViewsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ViewsType1 <em>Views Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ViewsType1
	 * @generated
	 */
	public Adapter createViewsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ViewType <em>View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ViewType
	 * @generated
	 */
	public Adapter createViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementRefsType <em>Whitebox Element Refs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementRefsType
	 * @generated
	 */
	public Adapter createWhiteboxElementRefsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementRefType <em>Whitebox Element Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementRefType
	 * @generated
	 */
	public Adapter createWhiteboxElementRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementsType <em>Whitebox Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementsType
	 * @generated
	 */
	public Adapter createWhiteboxElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementType <em>Whitebox Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementType
	 * @generated
	 */
	public Adapter createWhiteboxElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxPathType <em>Whitebox Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxPathType
	 * @generated
	 */
	public Adapter createWhiteboxPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WidthType <em>Width Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WidthType
	 * @generated
	 */
	public Adapter createWidthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WireType <em>Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WireType
	 * @generated
	 */
	public Adapter createWireTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WireTypeDefsType <em>Wire Type Defs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WireTypeDefsType
	 * @generated
	 */
	public Adapter createWireTypeDefsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WireTypeDefType <em>Wire Type Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WireTypeDefType
	 * @generated
	 */
	public Adapter createWireTypeDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WriteValueConstraintType <em>Write Value Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WriteValueConstraintType
	 * @generated
	 */
	public Adapter createWriteValueConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //spiritAdapterFactory
