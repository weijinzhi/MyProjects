<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查看系統消息推送</title>

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
<!--  
	<!-- Modal -->
	<div class="modal fade" id="lookoverMessagesModal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">消息查看</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal">
						<input name="id" type="hidden" value="${Mes.id}">
						<div class="form-group">
							<label class="col-sm-2 control-label">message_title</label>
							<div class="col-sm-10">
								<p class="form-control-static">${Mes.messTitle}</p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">content</label>
							<div class="col-sm-10">
								<p class="form-control-static">${Mes.messContent}</p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">creat_time</label>
							<div class="col-sm-10">
								<p class="form-control-static">
									<fmt:formatDate value="${Mes.createTime}" pattern="yyyy-MM-dd" />
								</p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">teacherName</label>
							<div class="col-sm-10">
								<p class="form-control-static">${Mes.teacher.teacherName}</p>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
-->
				</div>
			</div>
		</div>
	</div>
	<!-- 搭建显示页面 -->
	<div class="container">
		<!-- 标题行 -->
		<div class="row">
			<div class="col-md-12">
				<h1>消息推送通知</h1>
			</div>
		</div>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover">
					<tr>
						<th>#</th>
						<th>message_title</th>
						<th>content</th>
						<th>creat_time</th>
						<th>teacherName</th>
						
					</tr>
					<c:forEach items="${pageInfo.list}" var="Mes">
						<tr>
							<th>${Mes.id}</th>
							<th>${Mes.messTitle}</th>
							<th>${Mes.messContent}</th>
							<th><fmt:formatDate value="${Mes.createTime}"
									pattern="yyyy-MM-dd" /></th>
							<th>${Mes.teacher.teacherName}</th>
						</tr>
					</c:forEach>

				</table>
			</div>
		</div>
		<!-- 显示分页信息 -->
		<div class="row">
			<!-- 分页文字信息 -->
			<div class="col-md-6">当前${pageInfo.pageNum
				}页面,总${pageInfo.pages }页，总${pageInfo.total }条记录</div>
			<!-- 分页条信息 -->
			<div class="col-md-6">
				<nav aria-label="Page navigation">
				<ul class="pagination">
					<li><a href="${APP_PATH }/course_stu?pn=1">首页</a></li>
					<c:if test="${pageInfo.hasPreviousPage }">
						<li><a
							href="${APP_PATH }/course_stu?pn=${pageInfo.pageNum-1}"
							aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
						</a></li>
					</c:if>


					<c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">

						<c:if test="${page_Num == pageInfo.pageNum }">
							<li class="active"><a href="#">${page_Num }</a></li>
						</c:if>
						<c:if test="${page_Num != pageInfo.pageNum }">
							<li><a href="${APP_PATH }/course_stu?pn=${page_Num }">${page_Num
									}</a></li>
						</c:if>

					</c:forEach>
					<c:if test="${pageInfo.hasNextPage }">
						<li><a
							href="${APP_PATH }/course_stu?pn=${pageInfo.pageNum+1}"
							aria-label="Next"> <span aria-hidden="true">&raquo;</span>
						</a></li>
					</c:if>
					<li><a href="${APP_PATH }/course_stu?pn=${pageInfo.pages}">尾页</a></li>
				</ul>
				</nav>
			</div>
		</div>
	</div>
</body>

<script type="text/javascript">

	$(document).on("click", "#LookOver_Mes_modal_btn", function() {
		//1.将模态框中的信息更新，交给服务器
		//2.发送ajax请求保存更新学生信息
		//弹出模态框
		$("#lookoverMessagesModal").modal({
			backdrop : "static"
		});
	});

	
</script>
</html>