$(document).ready(function(){
	//点击提交按钮
	$(".btn_zhuce").click(function(){
		
		//获取员工工号
		var gong_id = $("#EMPLOYEE_ID").val();
		// alert("adsfasd"+gong_id.length);
		//获取姓名
		var name = $("#EMPLOYEE_NAME").val();
		// alert("adsfasd"+name);
		// 获取密码
		var psw = $(".password").val();
		//判断工号和密码是否为空
		var re = /^[0-9]+.?[0-9]*$/;   //判断字符串是否为数字
		// 
		if(gong_id==null || ""==gong_id){
			// 工号为数字且 6~10位
			alert("工号不能为空！！！");
		}
		//if(re.test(gong_id)){
		//	alert("工号格式不正确！！");
		//}
		if(gong_id.length<6 || gong_id.length>10){
			alert("工号必须为6~10位！！！");
		}
		if(name == null || name==""){
			alert("姓名不能为空！！！！");
		}
		if(psw==null || ""==psw || psw.length<8 || psw.length>15){
			alert("密码不能为空且密码必须为8~15位！！！");
		}
		//else if(psw.length<8 || psw.length>15){
		//	alert("");
		//}
	});
})