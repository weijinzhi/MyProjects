<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	pageContext.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>个人资料</title>
<link href="${path }/static/css/base.css" rel="stylesheet" />
<script type="text/javascript" src="${path }/static/js/layer.js"></script>
<script type="text/javascript"
	src="${path }/static/js/bootstrap-treeview.js"></script>
<script type="text/javascript" src="${path }/static/js/shiro.demo.js"></script>

<!-- 引入各种CSS样式表 -->
<link rel="stylesheet" href="${path }/static/css/bootstrap.css">
<link rel="stylesheet" href="${path }/static/css/font-awesome.css">
<link rel="stylesheet" href="${path }/static/css/index.css">
<link rel="stylesheet" href="${path }/static/css/font-change.css">

<script type="text/javascript"
	src="${path }/static/js/jquery-1.12.3.min.js"></script>
<script type="text/javascript" src="${path }/static/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${path }/static/js/user.login.js"></script>
</head>
<body data-target="#one" data-spy="scroll">
	<div class="container"
		style="padding-bottom: 15px; min-height: 300px; margin-top: 40px;">
		<div class="row">
			<div class="col-md-10">
				<h2>个人资料</h2>
				<hr>
				<table class="table table-bordered">
					<tr>
						<th>昵称</th>
						<td>管理员</td>
					</tr>
					<tr>
						<th>帐号</th>
						<td>${ teacher.teacherId}</td>
					</tr>
					<tr>
						<th>姓名</th>
						<td>${ teacher.teacherName}</td>
					</tr>
					<tr>
						<th>密码</th>
						<td>${ teacher.password}</td>
					</tr>
					<tr>
						<th>电话</th>
						<td>${ teacher.phone}</td>
					</tr>
					<tr>
						<th>性别</th>
						<td>${ teacher.sex}</td>
					</tr>
					<tr>
						<th>学院</th>
						<td>${ teacher.academy}</td>
					</tr>
				</table>
			</div>
		</div>
	</div>

</body>
</html>