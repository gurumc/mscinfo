<#-- the template input is an "ExternalPortReferenceType" type variable -->
<#-- the template output is an eol for CreatorNE -->
<#-- the CreatorNE creates output "ExternalPortReferenceType" -->
var element = new ExternalPortReferenceType;
element.portRef = "${getPortRef()}";
element.left = new Native("java.math.BigInteger")("${getLeft()}");
element.right = new Native("java.math.BigInteger")("${getRight()}");
ExternalPortReferenceType.all.add(element);