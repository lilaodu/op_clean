<#-- colType:列类型：1-普通数据列 2-checkbox列 3-操作按钮列：编辑、删除等等 -->
<#-- dataValue:单元格数据-->
<#-- colWidth:列宽度 -->
<#macro li colType dataValue="" id="" align=0 colWidth=0 btnAction="" name="" onclick="" len=37>
	<#if colType ==1>
		<#if colWidth!=0>
		  <#if align==0>
			  <li style="text-align:left;margin:0;width:${colWidth}px;" id="${id}" title="${dataValue}"><#if dataValue?length lt len>${dataValue}<#else>${dataValue[0..len]}...</#if></li>
			<#elseif align==1>
			  <li style="text-align:center;margin:0;width:${colWidth}px;" id="${id}" title="${dataValue}"><#if dataValue?length lt len>${dataValue}<#else>${dataValue[0..len]}...</#if></li>
			<#else>
			    <li style="text-align:right;margin:0;width:${colWidth}px;" id="${id}" title="${dataValue}"><#if dataValue?length lt len>${dataValue}<#else>${dataValue[0..len]}...</#if></li>
			</#if>
		<#else>
			<li class="generalTd" id="${id}" title="${dataValue}"><#if dataValue?length lt len>${dataValue}<#else>${dataValue[0..len-1]}</#if></li>
		</#if>
	<#elseif colType ==2>
		<li class="chkTd"><input type="checkbox" value="${dataValue}" name="${name}" id= "${id}" onclick="${onclick}" /></li>
	<#elseif colType ==3>
		<#if colWidth!=0>
			<li style="text-align:center;width:${colWidth}px;" id="${id}"><a href="javascript:void(0);" <#if btnAction!="">onclick="${btnAction}" </#if>>${dataValue}</a></li>
		<#else>
			<li class="btnTd" id="${id}"><a href="javascript:void(0);" <#if btnAction!="">onclick="${btnAction}"</#if>>${dataValue}</a></li>
		</#if>
	<#elseif colType ==4>
		<#if colWidth!=0>
			<li style="text-align:center;width:${colWidth}px;" id="${id}">
				<#if dataValue==1><img src="${base}/res/store/img/icon/yes.gif"><#else><img src="${base}/res/store/img/icon/no.gif"></#if>
			</li>
		<#else>
		<li class="btnTd" id="${id}"> 
			<#if dataValue==1><img src="${base}/res/store/img/icon/yes.gif"><#else><img src="${base}/res/store/img/icon/no.gif"></#if>
		</li>
		</#if>	
	<#elseif colType ==5>
		<li class="generalTd" id="${id}">${dataValue}</li>
	<#elseif colType ==6>
		<li class="chkTd" id="${id}"><input type="radio" value="${dataValue}" name="${name}" id= "${id}" onclick="${onclick}" /></li>
	<#elseif colType ==7>
		<#if colWidth!=0>
		  <#if align==0>
			  <li style="text-align:left;margin:0;width:${colWidth}px;cursor:pointer;" onclick="${onclick}" id="${id}" title="${dataValue}"><#if dataValue?length lt len>${dataValue}<#else>${dataValue[0..len]}...</#if></li>
			<#elseif align==1>
			  <li style="text-align:center;margin:0;width:${colWidth}px;cursor:pointer;" onclick="${onclick}" id="${id}" title="${dataValue}"><#if dataValue?length lt len>${dataValue}<#else>${dataValue[0..len]}...</#if></li>
			<#else>
			    <li style="text-align:right;margin:0;width:${colWidth}px;cursor:pointer;" onclick="${onclick}" id="${id}" title="${dataValue}"><#if dataValue?length lt len>${dataValue}<#else>${dataValue[0..len]}...</#if></li>
			</#if>
		<#else>
			<li class="generalTd" id="${id}" onclick="${onclick}" title="${dataValue}"><#if dataValue?length lt len>${dataValue}<#else>${dataValue[0..len]}...</#if></li>
		</#if>
	</#if> 
</#macro>


