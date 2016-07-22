<#-- the template input is an "Ad" type variable -->
<#-- the template output is an eol for ModifierNE -->
<#-- the ModifierNE changes EClass-->
if(EClass.all.size() == 1) {
	var connection = EClass.all.first();
	connection.name = "${getName()}";	
} else {
	"Input model must be ONE AdhocConnectionType model !!!".println();
}