<#macro navigation adminUser>
<script type="text/javascript">
window.onresize = resize;
function resize() {
    var height = $(window).height()-150;
	$(".auto_height").css("height",height);
	$("#history_a").click(function(){
		$("#historys_").toggle();
	});
}
$(document).ready(function() {
	resize();
});

</script>
<div class="navigation">
	<ul class="main">
		<li>
			<a id="menu_deviceManagement" href="#deviceManagement"><span class="icom-puzzle"></span><span class="text">设备管理</span></a>
		</li>
		<li>
			<a id="menu_roomManagement" href="#roomManagement"><span class="icom-home"></span><span class="text">房间管理</span></a>
		</li>
		<li>
			<a id="menu_mediatorManagement" href="#mediatorManagement"><span class="icom-box"></span><span class="text">网关管理</span></a>
		</li>
		<li>
			<a id="menu_dataAnalysis" href="#dataAnalysis"><span class="icom-stats-up"></span><span class="text">数据分析</span></a>
		</li>
		<li>
			<a id="menu_systemSetting" href="#systemSetting"><span class="icom-cog"></span><span class="text">系统设置</span></a>
		</li>
		<li>
			<a id="menu_index" href="#default"><span class="icom-user"></span><span class="text">帐号设置</span></a>
		</li>
	</ul>
	<div class="control"></div>
	<div class="submain">
		<div id="default">
			<div class="widget-fluid userInfo clearfix">
				<div class="image">
					<img src="${base}/res/images/examples/users/dmitry.jpg"
						class="img-polaroid" />
				</div>
				<div class="name"><i class="icon-user"></i> Welcome, ${adminUser.entName!''}</div>
				<ul class="menuList">
					<li><a href="javascript:showLoading();location.href='index.html';"><span class="icon-cog"></span> 设置</a></li>
					<!--<li><a href="#"><span class="icon-comment"></span> 消息</a></li>-->
					<li><a href="exit.html"><span class="icon-share-alt"></span> 退出</a></li>
				</ul>
				<div class="text"></div>
			</div>
			<div class="dr">
				<span></span>
			</div>
		</div>
		
		<div id="roomManagement">
			<div class="menu">
				<a href="javascript:showLoading();location.href='roomManage.html';"><span class="icon-th-list"></span> 房间列表</a>
			</div>
			<div class="menu">
				<a href="javascript:showLoading();location.href='roomSort.html';"><span class="icon-th-list"></span> 房间排序</a>
			</div>
			<div class="dr">
				<span></span>
			</div>
		</div>
		<div id="deviceManagement">
			<div class="menu" style="margin:10px;border-top:none;">
				房间列表：
			</div>
			<div class="menu">
				<a href="javascript:showLoading();location.href='allDevice.html';" style="width:140px;"><span class="icon-th-list"></span> 所有房间</a>
			</div>
			<#if room_list?? && (room_list?size>0)>
			<div class="auto_height" style="overflow:auto;">
				<#list room_list as room>
				<div class="menu">
					<a href="javascript:showLoading();location.href='deviceManage.html?roomId=${room.id!''}';" style="width:140px;"><span class="icon-th-list"></span> ${room.name!''}</a>
				</div>
				</#list>
			</div>
			</#if>
			<div class="dr">
				<span></span>
			</div>
		</div>
		<div id="mediatorManagement">
			<div class="menu">
				<a href="javascript:showLoading();location.href='mediator.html';"><span class="icon-th-list"></span> 网关列表</a>
			</div>
			<div class="dr">
				<span></span>
			</div>
		</div>
		<div id="dataAnalysis">
			<div class="menu">
				<a href="javascript:showLoading();location.href='acMateAnalysis.html';"><span class="icon-th-list"></span> 用电量统计</a>
			</div>
			<div class="menu">
				<a href="javascript:showLoading();location.href='dataAnalysis.html';"><span class="icon-th-list"></span> 历史数据</a>
			</div>
			<div class="menu">
				<a href="#" id="history_a"><span class="icon-th-list"></span> 历史数据图</a>
			</div>
			<#if room_list?? && (room_list?size>0)>
			<div id="historys_" class="auto_height" style="overflow:auto;display:none;">
				<#list room_list as room>
				<div class="menu">
					<a href="javascript:showLoading();location.href='viewHistoryByRoom.html?roomId=${room.id!''}';" style="width:140px;"><span class="icon-th-list"></span> ${room.name!''}</a>
				</div>
				</#list>
			</div>
			</#if>
			<!--
			<div class="menu" style="">
				<a href="#"><span class="icon-th-list"></span> 决策支持</a>
			</div>-->
			<div class="dr">
				<span></span>
			</div>
		</div>
		<div id="systemSetting">
			<div class="menu">
				<a href="javascript:showLoading();location.href='entMemberLog.html';"><span class="icon-th-list"></span> 日志功能</a>
			</div>
			<div class="menu">
				<a href="javascript:showLoading();location.href='entAction.html';"><span class="icon-th-list"></span> 权限管理</a>
			</div>
			<div class="menu">
				<a href="javascript:showLoading();location.href='entMemberList.html';"><span class="icon-th-list"></span> 账号管理</a>
			</div>
			<div class="menu">
				<a href="javascript:showLoading();location.href='entRole.html';"><span class="icon-th-list"></span> 角色管理</a>
			</div>
			<div class="dr">
				<span></span>
			</div>
		</div>
	</div>
</div>
<#include "notify.ftl"/>
</#macro>