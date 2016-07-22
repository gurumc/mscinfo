<#-- the template input is an "AdHocConnectionType" type variable -->
<#-- the template output is an eol for CreatorNE -->
<#-- the CreatorNE creates output "EClass" -->
var element = new EClass;
element.name = "${getName()}";
EClass.all.add(element);