<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生个人信息</title>

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
<body data-target="#one" data-spy="scroll">

	<!-- 学生信息修改 -->
	<!-- Modal -->
	<div class="modal fade" id="stuUpdateModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">学生个人信息修改</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal">
						<input name="id" type="hidden" value="${stu.id}">
						<div class="form-group">
							<label class="col-sm-2 control-label">学号</label>
							<div class="col-sm-10">
								<p class="form-control-static">${stu.studentId}</p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">姓名</label>
							<div class="col-sm-10">
								<p class="form-control-static">${stu.studentName}</p>
							</div>
						</div>
						<div class="form-group">
							<label for="focus" class="col-sm-2 control-label">密码</label>
							<div class="col-sm-10">
								<input type="text" name="password" class="form-control"
									id="password_update_input" placeholder="password">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">性别</label>
							<div class="col-sm-10">
								<p class="form-control-static">${stu.sex}</p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">班级</label>
							<div class="col-sm-10">
								<p class="form-control-static">${stu.classnum}</p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">学院</label>
							<div class="col-sm-10">
								<p class="form-control-static">${stu.academy}</p>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="stu_update_btn">更新</button>
				</div>
			</div>
		</div>
	</div>

	<!-- 显示页面 -->
	<div class="container">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h1>学生个人信息</h1>
			</div>
		</div>
		<!-- 按钮 -->
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<button class="btn btn-primary" id="stu_update_modal_btn">修改</button>
				<button class="btn btn-success">保存</button>
			</div>

		</div>
	</div>
	<!-- 显示学生个人信息的表格 -->
	<div class="container"
		style="padding-bottom: 15px; min-height: 300px; margin-top: 40px;">
		<div class="row">
			<div class="col-md-10">
				<hr>
				<table class="table table-bordered">
					<tr>
						<th>学号</th>
						<td>${stu.studentId}</td>
					</tr>
					<tr>
						<th>姓名</th>
						<td>${stu.studentName}</td>
					</tr>
					<tr>
						<th>密码</th>
						<td>${stu.password}</td>
					</tr>
					<tr>
						<th>性别</th>
						<td>${stu.sex}</td>
					</tr>
					<tr>
						<th>班级</th>
						<td>${stu.classnum}</td>
					</tr>
					<tr>
						<th>学院</th>
						<td>${stu.academy}</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		//点击修改按钮弹出模态框
		$("#stu_update_modal_btn").click(function() {
			//发送ajax请求，查出个人信息

			//弹出模态框
			$("#stuUpdateModal").modal({
				backdrop : "static"
			});
		});
		
		$(document).on("click","#stu_update_btn",function(){
			//1.将模态框中的信息更新，交给服务器
			//2.发送ajax请求保存更新学生信息
			$.ajax({
				url:"${APP_PATH}/student/update",
				type:"POST",
				data:$("#stuUpdateModal form").serialize()+"&_method=PUT",
				success:function(result){
					alert(result.msg);
				}
				
			});
		});
	</script>

</body>
</html>