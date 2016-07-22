<#-- the template input is an "ExternalPortReferenceType" type variable -->
<#-- the template output is an eol for ModifierNE -->
<#-- the ModifierNE changes ExternalPortReferenceType-->
if(ExternalPortReferenceType.all.size() == 1) {
	var port = ExternalPortReferenceType.all.first();
	port.portRef = "${getPortRef()}";
	<#if ${getLeft().intValue() != 0>
		port.left = new Native("java.math.BigInteger")("${getLeft()}");
	</#if>
	<#if ${getRight().intValue() != 0>
		port.right = new Native("java.math.BigInteger")("${getRight()}");
	</#if>		
} else {
	"Input model must be ONE ExternalPortReferenceType model !!!".println();
}