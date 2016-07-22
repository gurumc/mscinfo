<#-- the template input is an "InterconnectionType" type variable -->
<#-- the template output is an eol for ModifierNE -->
<#-- the ModifierNE changes EClass-->
if(EClass.all.size() == 1) {
	var interconnect = EClass.all.first();
	interconnect.name = "${getName()}";	
} else {
	"Input model must be ONE InterconnectionType model !!!".println();
}