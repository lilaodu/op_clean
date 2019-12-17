/**
 * @license Copyright (c) 2003-2017, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see LICENSE.md or http://ckeditor.com/license
 */

CKEDITOR.editorConfig = function( config ) {
	// Define changes to default configuration here. For example:
	// config.language = 'fr';
	// config.uiColor = '#AADC6E';
	config.image_previewText=' '; //预览区域显示内容
	
	config.filebrowserImageUploadUrl= "imageUpload.html"; //待会要上传的action或servlet
	
	config.removeDialogTabs ="image:advanced;link:advanced";
	// 界面语言，中文:'zh-cn'  英文：'en'
    config.language = 'zh-cn';
	
	// 去除ckeditor状态栏
	config.removePlugins = 'elementspath';	
	config.resize_enabled = false;
	
	config.toolbar = 'Full';
	
	config.toolbar_Full = [
		 ['','-','Save','NewPage','Preview','-','Templates'],
		 ['Cut','Copy','Paste','PasteText','PasteFromWord','-','Print', 'SpellChecker', 'Scayt'],
		 ['Undo','Redo','-','Find','Replace','-','SelectAll','RemoveFormat'],
		 ['Form', 'Checkbox', 'Radio', 'TextField', 'Textarea', 'Select', 'Button', 'ImageButton', 'HiddenField'],	
		 ['Bold','Italic','Underline','Strike','-','Subscript','Superscript'],
		 ['NumberedList','BulletedList','-'],
		 '/',	 
		 ['Outdent','Indent','Blockquote','JustifyLeft','JustifyCenter','JustifyRight','JustifyBlock'],
		 ['Link','Unlink','Anchor'],
		 ['Image','Table','HorizontalRule','Smiley','SpecialChar','PageBreak'],
		 ['Styles','Format','Font','FontSize'],['TextColor','BGColor']
		 ];
	//config.baseUrl = "http://localhost:8080/upload/"
};
