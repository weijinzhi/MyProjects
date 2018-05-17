<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<%
	pageContext.setAttribute("PATH", request.getContextPath());
%>
<script type="text/javascript"
	src="${PATH }/static/js/jquery-1.12.3.min.js"></script>
<link href="${PATH }/bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="${PATH }/static/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="modal fade" id="teacherUpdateModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">教师个人信息修改</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal">
						<div class="form-group">
							<label for="teacherId_update_input" class="col-sm-2 control-label">教师编号</label>
							<div class="col-sm-10">
								<p class="form-control-static" id="teacherId_update_static"></p>
								<span class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label for="teacherName_update_input" class="col-sm-2 control-label">教师姓名</label>
							<div class="col-sm-10">
								<p class="form-control-static" id="teacherName_update_static"></p>
								<span class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label for="password_update_input" class="col-sm-2 control-label">密码</label>
							<div class="col-sm-10">
								<input type="password" name="password" class="form-control"
									id="password_update_input">
								<span class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label for="phone_update_input" class="col-sm-2 control-label">联系方式</label>
							<div class="col-sm-10">
								<input type="text" name="phone" class="form-control"
									id="phone_update_input">
								<span class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label for="sex_update_input" class="col-sm-2 control-label">性别</label>
							<div class="col-sm-10">
								 <p class="form-control-static" id="sex_update_input"></p>
							</div>
						</div>
						<div class="form-group">
							<label for="academy_update_input" class="col-sm-2 control-label">学院</label>
							<div class="col-sm-4">
								<p class="form-control-static" id="academy_update_static"></p>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="teacher_update_btn">更新</button>
				</div>
			</div>
		</div>
	</div>
	


<button id="update_teacher_information" class="btn btn-default">修改个人信息</button>
<br><br>

<script type="text/javascript">
function getTeacher(id) {
	$.ajax({
		url : "${PATH}/teacher/information",
		type : "GET",
		data : "id=" + id,
		success : function(result) {
			var teacherData = result.extend.teacher;
			$("#teacherId_update_static").text(teacherData.teacherId);
			$("#teacherName_update_static").text(
					teacherData.teacherName);
			$("#sex_update_input").text(teacherData.sex);
			$("#academy_update_static").text(teacherData.academy);
			$("#password_update_input").val(teacherData.password);
			$("#phone_update_input").val(teacherData.phone);
		}
	});
}

$("#update_teacher_information").click(function() {
	getTeacher(1);

	$("#teacherUpdateModal").modal({
		backdrop : "static"
	});

});
//========================================更新教师信息======================================
$("#teacher_update_btn").click(function() {
	$.ajax({
		url : "${PATH}/teacher/teacherupdate/1",
		data : $("#teacherUpdateModal form").serialize(),
		type : "PUT",
		success : function(result) {
			alert(result.msg);
			$("#teacherUpdateModal").modal("hide");
		}
	});
});
</script>

</body>
</html>