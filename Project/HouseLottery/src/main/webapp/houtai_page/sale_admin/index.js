$(document).ready(function(){
	// 点击确定按钮，保存摇号时间到数据库中
	$(".yaohao_btn_ok").click(function(){
		// 获取摇号时间
		var yaohao_time = $(".input_yaohao_time").val();
		alert("摇号时间:"+yaohao_time);
		
	});
	// 点击确定按钮，保存发布选房时间到数据库中
	$(".xuan_btn_ok").click(function(){
		
		// 获取摇号时间
		var xuanfang_time = $(".xuan_house_time").val();
		// var xuanfang_time = document.getElementsByClassName("xuan_house_time").value;
		alert("选房时间:"+xuanfang_time);
		
	});
})