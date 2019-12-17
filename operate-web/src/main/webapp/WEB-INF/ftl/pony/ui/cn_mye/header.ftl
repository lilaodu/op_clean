<#macro header>
<div id="loadingBg" style="width:100%; height:100%; left:0px; top:0px; z-index:999; background-color:#ccc; opacity:0.55; filter:alpha(opacity=55);position:fixed;display:none;"></div>
<div id="loading" class="loading hide"></div>
<div id="showinfor" class="header showMsg  hide" style="position:fixed">
	<div class="showinfor_handle"><span style="float: left;margin-left:5px;color:#f1f1f1;">系统提示</span><img src="${base}/res/images/div_close.jpg" width="15" height="15" onclick="hideInfoMsg()" style="float:right;margin: 5px;cursor: pointer;"></div>
	<div id="msbcont" >		
	</div>
</div>
 <div class="header">
        <a href="index.html" class="logo"></a><span style="height:35px;line-height:35px;color:white;font-size:20px;font-weight:bold">${parentEntMember.entTrueName!''}智能酒店管理系统</span>

        <div class="buttons">
            <div class="popup" id="subNavControll">
                <div class="label"><span class="icos-list"></span></div>
            </div>
            <div class="dropdown">
                <div class="label"><span class="icos-user2"></span></div>
                <div class="body" style="width: 160px;">
                    <div class="itemLink">
                        <a href="javascript:showLoading();location.href='index.html';"><span class="icon-cog icon-white"></span> 设置</a>
                    </div>            
                    <div class="itemLink">
                        <a href="${base}/exit.html"><span class="icon-off icon-white"></span>退出</a>
                    </div>                                        
                </div>                
            </div>            
            
            <div class="popup">
                <div class="label"><span class="icos-cog"></span></div>
                <div class="body">
                    <div class="arrow"></div>
                    <div class="row-fluid">
                        <div class="row-form">
                            <div class="span12">
                                <span class="top">模板:</span>
                                <div class="themes">
                                    <a href="#" data-theme="" class="tip" title="Default"><img src="${base}/res/images/themes/default.jpg"/></a>                                    
                                    <a href="#" data-theme="ssDaB" class="tip" title="DaB"><img src="${base}/res/images/themes/dab.jpg"/></a>
                                    <a href="#" data-theme="ssTq" class="tip" title="Tq"><img src="${base}/res/images/themes/tq.jpg"/></a>
                                    <a href="#" data-theme="ssGy" class="tip" title="Gy"><img src="${base}/res/images/themes/gy.jpg"/></a>
                                    <!--<a href="#" data-theme="ssLight" class="tip" title="Light"><img src="${base}/res/images/themes/light.jpg"/></a>-->
                                    <a href="#" data-theme="ssDark" class="tip" title="Dark"><img src="${base}/res/images/themes/dark.jpg"/></a>
                                    <a href="#" data-theme="ssGreen" class="tip" title="Green"><img src="${base}/res/images/themes/green.jpg"/></a>
                                    <a href="#" data-theme="ssRed" class="tip" title="Red"><img src="${base}/res/images/themes/red.jpg"/></a>
                                </div>
                            </div>
                        </div>
                        <div class="row-form">
                            <div class="span12">
                                <span class="top">背景:</span>
                                <div class="backgrounds">
                                    <a href="#" data-background="bg_default" class="bg_default"></a>
                                    <a href="#" data-background="bg_mgrid" class="bg_mgrid"></a>
                                    <a href="#" data-background="bg_crosshatch" class="bg_crosshatch"></a>
                                    <a href="#" data-background="bg_hatch" class="bg_hatch"></a>                                    
                                    <a href="#" data-background="bg_light_gray" class="bg_light_gray"></a>
                                    <a href="#" data-background="bg_dark_gray" class="bg_dark_gray"></a>
                                    <a href="#" data-background="bg_texture" class="bg_texture"></a>
                                    <a href="#" data-background="bg_light_orange" class="bg_light_orange"></a>
                                    <a href="#" data-background="bg_yellow_hatch" class="bg_yellow_hatch"></a>                        
                                    <a href="#" data-background="bg_green_hatch" class="bg_green_hatch"></a>                        
                                </div>
                            </div>          
                        </div>
                        <div class="row-form">
                            <div class="span12">
                                <span class="top">导航栏:</span>
                                <input type="radio" name="navigation" id="fixedNav"/> 显示
                                <input type="radio" name="navigation" id="collapsedNav"/> 可折叠
                                <input type="radio" name="navigation" id="hiddenNav"/> 隐藏
                            </div>                                
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>    
</#macro>