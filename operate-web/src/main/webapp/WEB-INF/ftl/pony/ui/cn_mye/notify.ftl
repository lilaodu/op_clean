<script src="${base}/res/js/drag.js" type=text/javascript></script>
<div id="loadingBg" style="width:100%; height:100%; left:0px; top:0px; z-index:4444; background-color:#ccc; opacity:0.55; filter:alpha(opacity=55);position:fixed;display:none;"></div>
<div id="loading" class="loading hidden"></div>
<div id="showinfor" class="header showMsg  hidden" style="">
	<div class="showinfor_handle"><span style="float: left;margin-left:5px;color:#f1f1f1;" id="msbtitle">系统提示</span><img src="${base}/res/images/icons/div_close.jpg" width="15" height="15" onclick="hideInfoMsg()" style="float:right;margin: 5px;cursor: pointer;"></div>
	<div id="msbcont" >		
	</div>
</div>
<div id="notify">
<div id="notification" class="notification "  >
		<span class="notify_text">保存成功</span>
		<span class ="div_close" onclick="pop_notification.hide();" title="关闭" class="ico_del"></span>
</div>
</div>
<script language="javascript">
var pop_notification;
$(document).ready(function() {
	pop_notification = new Notify({id:"notification",zindex:"10000"});
	 //缩放窗口时重新定位弹出框及遮罩层的宽度和高度
   // EventUtil.addEvent(window,'resize', function() {
    	//pop_notification.setPosition({id:"notification",speed:"1500",top:"topCenter"});   	
   // });
});
function showNotification(suc_err,notify_con){
	var speed = "1500";
	if(suc_err==1){
		$("#notification").find("span.notify_text").html(notify_con);
		$("#notification").addClass("notyfy-success");
		$("#notification").removeClass("notyfy-error");
	}else{
		speed = "3500";
		$("#notification").find("span.notify_text").html(notify_con);
		$("#notification").addClass("notyfy-error");
		$("#notification").removeClass("notyfy-success");
	}
	 clearTimeout(showFadeTimeouts); 
     clearTimeout(fadeInTimeOut);
     clearTimeout(fadeOutTimeOut);
	pop_notification.show({id:"notification",speed:speed,top:"topCenter"});
}
</script>