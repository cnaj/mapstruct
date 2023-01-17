<#--

    Copyright MapStruct Authors.

    Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0

-->
<#-- @ftlvariable name="" type="org.mapstruct.ap.internal.model.common.PropertyAnnotationReflection" -->
<@compress single_line=true>
    <#if method>
        ${containingType.name}.class.getMethod( "${accessorSimpleName}" ).getAnnotation( ${ext.annotation}.class )
    <#else>
        ${containingType.name}.class.getField( "${accessorSimpleName}" ).getAnnotation( ${ext.annotation}.class )
    </#if>
</@compress>
