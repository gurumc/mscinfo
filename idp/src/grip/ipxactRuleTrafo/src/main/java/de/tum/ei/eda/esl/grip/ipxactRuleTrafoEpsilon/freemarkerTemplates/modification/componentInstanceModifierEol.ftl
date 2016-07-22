<#-- the template input is an "componentInstance" type variable -->
<#-- the template output is an eol for ModifierNE -->
<#-- the ModifierNE changes VLNV of componentInstance-->
if(ComponentInstanceType.all.size() == 1) {
	var instance = ComponentInstanceType.all.first();
	instance.instanceName = "${getInstanceName()}";
	
	if(instance.componentRef.isUndefined()) {
		var lib = new LibraryRefType;
		lib.vendor = "${getComponentRef().getVendor()}";
		lib.library = "${getComponentRef().getLibrary()}";
		lib.name = "${getComponentRef().getName()}";
		lib.version = "${getComponentRef().getVersion()}";
		instance.componentRef=lib;
	} else {
		var lib = instance.componentRef;
		lib.vendor = "${getComponentRef().getVendor()}";
		lib.library = "${getComponentRef().getLibrary()}";
		lib.name = "${getComponentRef().getName()}";
		lib.version = "${getComponentRef().getVersion()}";
	}
	
} else {
	"Input model must be ONE componentInstanceType model !!!".println();
}

