<#-- the template input is an "componentInstance" type variable -->
<#-- the template output is an eol for CreatorNE -->
<#-- the CreatorNE creates new componentInstance-->
var instance = new ComponentInstanceType;
instance.instanceName = "${getInstanceName()}";
var lib = new LibraryRefType;
lib.vendor = "${getComponentRef().getVendor()}";
lib.library = "${getComponentRef().getLibrary()}";
lib.name = "${getComponentRef().getName()}";
lib.version = "${getComponentRef().getVersion()}";
instance.componentRef=lib;
ComponentInstanceType.all.add(instance);