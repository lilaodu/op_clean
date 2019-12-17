<#macro pagination pageView actinUrl> 
<#if pageView.pageindex.endindex!=0>
	<form id="pageinationForm" method="post" action="${actinUrl}">
		<input type="hidden" id="pageNum" name="pageNum" value="${pageNum}" /> 
		<input type="hidden" id="total" name="count" value="${pageView.totalrecord}" /> 
			
	<div class="pagination pagination-centered">
	<div style="width:300px;float:right;margin-left:0px;margin-top:5px;"> 
		 每页 <select id="pageSize" name="pageSize" onchange="changePageSize()" style="width:60px;height:27px;">
			<option <#if pageSize == 15>selected="selected"</#if> >10</option>
			<option <#if pageSize == 20>selected="selected"</#if> >20</option>
			<option <#if pageSize == 30>selected="selected"</#if> >30</option>
			<option <#if pageSize == 50>selected="selected"</#if> >50</option>
			<option <#if pageSize == 100>selected="selected"</#if>>100</option></select>条&nbsp;&nbsp;
			<label style="display:inline">共 ${pageView.totalpage}页，共${pageView.totalrecord}条记录 </label>   
	</div>
	<div style="float:right;margin-left:0px;">
	 <ul>
	 	<#if (pageView.totalpage >5)> 
			<#if pageView.currentpage != 1>
			 	<li><a href="javascript:pageinationView(1)">&laquo;</a></li>
			 	<#if (pageView.currentpage>3)>
		  			<li><a href="javascript:pageinationView(1)">1</a></li>
				  	<#if (pageView.currentpage>4)>
				 	 	<li class="disabled"><span>...</span></li>
				  	</#if>
			  	</#if>						
			<#else>
				 <li class="disabled"><a>&laquo;</a></li>				
			</#if>
			<#list pageView.pageindex.startindex..pageView.pageindex.endindex as index>				
		        <#if pageView.currentpage == index>
		        	 <li class="active"><a>${index}</a></li>
		        <#else>
		        	 <li><a href="javascript:pageinationView(${index})" title="No.${index} page" >${index}</a></li>
		        </#if>  
	    	</#list>  
			<#if pageView.currentpage != pageView.totalpage>
				<#if (pageView.currentpage<pageView.totalpage-2)>
					<#if (pageView.currentpage<pageView.totalpage-3)>
				 	 	<li class="disabled"><span>...</span></li>
				  	</#if>
	  				<li><a href="javascript:pageinationView(${pageView.totalpage})">${pageView.totalpage}</a></li>
			  	</#if>
				 <li><a href="javascript:pageinationView(${pageView.totalpage})">&raquo;</a></li>		
			<#else>
				 <li class="disabled"><a>&raquo;</a></li>	
			</#if>
		<#else>	
			<#if pageView.currentpage != 1>
			 	<li><a href="javascript:pageinationView(1)">&laquo;</a></li>					
			<#else>
				 <li class="disabled"><a>&laquo;</a></li>				
			</#if>
			<#list pageView.pageindex.startindex..pageView.pageindex.endindex as index>				
		        <#if pageView.currentpage == index>
		        	 <li class="active"><a>${index}</a></li>
		        <#else>
		        	 <li><a href="javascript:pageinationView(${index})" title="No.${index} page" >${index}</a></li>
		        </#if>  
	    	</#list>
	    	<#if pageView.currentpage != pageView.totalpage>
				 <li><a href="javascript:pageinationView(${pageView.totalpage})">&raquo;</a></li>		
			<#else>
				 <li class="disabled"><a>&raquo;</a></li>	
			</#if>
		</#if>	
	 </ul>
	 </div>
   </div> 
</form>
<script type="text/javascript">
	function pageinationView(pageNum) {
		document.getElementById("pageNum").value=pageNum;
		document.getElementById("pageinationForm").action= "${actinUrl}"+window.location.search;
		document.getElementById("pageinationForm").submit();
	}
	
	function changePageSize(){
		document.getElementById("pageinationForm").action= "${actinUrl}"+window.location.search;
		document.getElementById("pageinationForm").submit();
	}
</script>
</#if>
</#macro>