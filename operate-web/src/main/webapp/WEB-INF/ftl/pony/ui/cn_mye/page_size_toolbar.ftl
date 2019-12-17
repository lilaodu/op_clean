<#macro page_size_toolbar pageSize=20 url="" count=0 style="">
	<div class="page_title" style=${style!''}>
		每页显示 
		<a class="page_btn cursor <#if pageSize==20>active</#if>" href="${url}?pageSize=20">20</a>
		<a class="page_btn cursor <#if pageSize==40>active</#if>" href="${url}?pageSize=40">40</a>
		<a class="page_btn  cursor <#if pageSize==60>active</#if>" href="${url}?pageSize=60">60</a>
		<a class="page_btn cursor  <#if pageSize==100>active</#if>" href="${url}?pageSize=100">100</a>
		&nbsp;&nbsp;&nbsp;总共 &nbsp;${count!0}&nbsp;条纪录
	</div>
</#macro>