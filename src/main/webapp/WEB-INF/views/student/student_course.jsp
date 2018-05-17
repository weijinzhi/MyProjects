<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>实验课程安排表</title>

<!-- 引入jQuery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.12.3.min.js"></script>

<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<link href="${APP_PATH }/static/css/base.css" rel="stylesheet" />
<script type="text/javascript" src="${APP_PATH }/static/js/layer.js"></script>
<script type="text/javascript"
	src="${APP_PATH }/static/js/bootstrap-treeview.js"></script>
<script type="text/javascript"
	src="${APP_PATH }/static/js/shiro.demo.js"></script>

<!-- 引入各种CSS样式表 -->
<link rel="stylesheet" href="${APP_PATH }/static/css/bootstrap.css">
<link rel="stylesheet" href="${APP_PATH }/static/css/font-awesome.css">
<link rel="stylesheet" href="${APP_PATH }/static/css/index.css">
<link rel="stylesheet" href="${APP_PATH }/static/css/font-change.css">

<script type="text/javascript"
	src="${APP_PATH }/static/js/user.login.js"></script>

</head>
<body>
	<!-- 搭建显示页面 -->
	<div class="container">
		<!-- 标题行 -->
		<div class="row">
			<div class="col-md-12">
			<h1>实验课程信息</h1>
			</div>
		</div>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover">
					<tr>
						<th>#</th>
						<th>courseName</th>
						<th>start_time</th>
						<th>end_time</th>
						<th>locate</th>
						<th>teacherName</th>
					</tr>
					<c:forEach items="${pageInfo.list}" var="courseStu"><tr>
						<th>${courseStu.id}</th>
						<th>${courseStu.courses.courseName }</th>
						<th><fmt:formatDate value="${courseStu.courses.startTime}" pattern="yyyy-MM-dd"/></th>
						<th><fmt:formatDate value="${courseStu.courses.endTime}" pattern="yyyy-MM-dd"/></th>
						<th>${courseStu.courses.lab.locate}</th>
						<th>${courseStu.courses.teacher.teacherName}</th>
					</tr></c:forEach>
					
				</table>
			</div>
		</div>
		<!-- 显示分页信息 -->
		<div class="row">
			<!-- 分页文字信息 -->
			<div class="col-md-6">
			当前${pageInfo.pageNum }页面,总${pageInfo.pages }页，总${pageInfo.total }条记录
			</div>
			<!-- 分页条信息 -->
			<div class="col-md-6">
				<nav aria-label="Page navigation">
				<ul class="pagination">
				<li><a href="${APP_PATH }/course_stu?pn=1">首页</a></li>
				<c:if test="${pageInfo.hasPreviousPage }">
				<li><a href="${APP_PATH }/course_stu?pn=${pageInfo.pageNum-1}" aria-label="Previous"> <span
							aria-hidden="true">&laquo;</span>
					</a></li>
				</c:if>
				
					
					<c:forEach items = "${pageInfo.navigatepageNums }" var="page_Num">
					
					<c:if test="${page_Num == pageInfo.pageNum }">
					<li class="active"><a href="#">${page_Num }</a></li>
					</c:if>
					<c:if test="${page_Num != pageInfo.pageNum }">
					<li><a href="${APP_PATH }/course_stu?pn=${page_Num }">${page_Num }</a></li></c:if>
					
					</c:forEach>
					<c:if test="${pageInfo.hasNextPage }">
					<li><a href="${APP_PATH }/course_stu?pn=${pageInfo.pageNum+1}" aria-label="Next"> <span
							aria-hidden="true">&raquo;</span>
					</a></li>
					</c:if>
					<li><a href="${APP_PATH }/course_stu?pn=${pageInfo.pages}">尾页</a></li>
				</ul>
				</nav>
			</div>
		</div>
	</div>
</body>
</html>