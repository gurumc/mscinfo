<#-- the template input is an "Interface" type variable -->
<#-- the template output is an eol for ModifierNE -->
<#-- the ModifierNE has input and output both as "BusInterfaceType" -->
if(BusInterfaceType.all.size() == 1) {
	var busInterface = BusInterfaceType.all.first();
	busInterface.name = "${getBusRef()}";
} else {
	"Input model must be ONE BusInterfaceType model !!!".println();
}