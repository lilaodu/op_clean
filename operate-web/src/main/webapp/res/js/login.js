
$(document).ready(function() {
	 //定义回车事件  
    if (document.addEventListener) {//如果是Firefox  
        document.addEventListener("keypress", ieHandler, true);  
    }else {  
        document.attachEvent("onkeypress", ieHandler);  
    }  
    function ieHandler(evt) {  
        if (evt.keyCode == 13) {  
        	$("#btnLogin").click();  
        }  
    }
});

function changeLanguage(language){
    $.ajax({   
        type: "POST",   
        url: "changelanguage.html",
        data: "langType="+language, 
        dataType:'json',
        success: function(data){
        	window.location.reload();
        },error:function(XmlHttpRequest, textStatus, errorThrown){
        	alert("change lang error!");
		}  
    });
}

function verification() {
	var basePath = $("#base_path").val();
	var img = basePath+"/imageValidServlet?d=" + new Date() * 1;
	$("#verification_id").attr("src", img);
}
