<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>

<!--可无视-->
<link rel="stylesheet" type="text/css" href="images/main.css" />

<!--主要样式-->
<link rel="stylesheet" type="text/css" href="images/jqtransform.css" />

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.jqtransform.js"></script>
<script language="javascript">
	$(function() {
		$('.jqtransform').jqTransform();
	});
</script>

<style type="text/css">
.demo {
	width: 680px;
	margin: 10px auto;
	color: #333;
	background: #fff
}

.page_title {
	width: 680px;
	height: 30px;
	margin: 10px auto 0 auto;
	text-align: center;
	font-weight: bold;
}

form p {
	padding: 4px;
	line-height: 20px;
	clear: both
}

form p label {
	display: block;
	float: left;
	width: 100px;
	padding-top: 2px
}
</style>
</head>
<body>
	<div id="main">
		<div class="demo">
			<form class="jqtransform" action="${path }/message/add?teacherId=${teacherId}" method="post">
				<p>
					<label>标题：</label><input name="messTitle" type="text" />
				</p>
				<p>
					<label>内容：</label>
					<textarea name="messContent" rows="6" cols="40"></textarea>
				</p>
				<p>
					<label>&nbsp;</label><input type="submit" value="提交" /> <input
						type="reset" value="重置" />
				</p>
			</form>
		</div>

	</div>


</body>
</html>
