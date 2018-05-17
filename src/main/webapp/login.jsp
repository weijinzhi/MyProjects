<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<title>后台登陆</title>
<link href="static/login/css/style.css" rel="stylesheet" type="text/css"
	media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="后台登录" />

</head>
<body>

<script type="text/javascript">
function printOut() {
	//获取radio的值  
	var list = document.getElementsByName("choose");
	for (i = 0; i < list.length; i++) {
		if (list[i].checked == true) {
			//如果选择教师登录  
			if (list[i].value == "0") {
				document.form.action = "<%=basePath%>teacher/login";
				document.form.submit();
				break;
			}
			//如果选择学生邮箱  
			if (list[i].value == "1") {
				document.form.action = "<%=basePath%>student/login";
				document.form.submit();
				break;
			}
		}

	}
}
</script>

	<div class="login-form">
		<div class="top-login">
			<span><img src="static/login/images/group.png" alt="" /></span>
		</div>

		<h1>登录</h1>

		<div id="type" class="login-top">
			<form name="form" method="post">
				<div class="wrapper">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 教师 <input
						value="0" type="radio" id="teacher" name="choose"> 学生 <input
						value="1" type="radio" id="student" name="choose" checked>
				</div>

				<input type="hidden" name="backToUrl" value="" />
				<c:if test="${!empty message}">
					<p style="color: red">${message}</p>
				</c:if>

				<div class="login-ic">
					<i></i> <input type="text" id="studentId" name="studentId"
						value="用户" onFocus="this.value = '';"
						onBlur="if (this.value == '') {this.value = '用户';}" />
					<div class="clear"></div>
				</div>

				<div class="login-ic">
					<i></i> <input type="text" id="teacherId" name="teacherId"
						value="用户" onFocus="this.value = '';"
						onBlur="if (this.value == '') {this.value = '用户';}" />
					<div class="clear"></div>
				</div>

				<div class="login-ic">
					<i class="icon"></i> <input id="password" type="password"
						name="password" value="password" onFocus="this.value = '';"
						onBlur="if (this.value == '') {this.value = 'password';}" />
					<div class="clear"></div>
				</div>

				<div class="log-bwn">
					<input onclick=javascript:printOut(); type="submit" value="登录">
				</div>
			</form>
		</div>
	</div>
	<script src='static/login/js/jquery.js'></script>
	<script src="static/login/js/index.js"></script>

	<script type="text/javascript">
	$("#teacherId").parent().hide(); // 先隐藏第二组文本框
		
	$(":radio").click(function() {

	    var num = $(this).val();  // 当前按钮的value值对应需要显示文本框的位置

	    if(num == "0"){
	    	$("#teacherId").parent().show();
	    	$("#studentId").parent().hide();
	    }

	    if(num == "1"){
	    	$("#studentId").parent().show();
	    	$("#teacherId").parent().hide();
	    }

	});
	</script>
</body>
</html>