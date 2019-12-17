/**
 * 设置去全局Ajax请求
 */


//获取浏览器cookie信息
var token = getCookie("admin_token");
$.ajaxSetup({
  beforeSend: function(xhr, settings){
	  xhr.setRequestHeader("CSRFToken", token);
  }
});

