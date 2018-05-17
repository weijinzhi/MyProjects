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

<div class="modal fade" id="labAddModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">实验室信息录入</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal">
						<div class="form-group">
							<label for="labnum_add_input" class="col-sm-2 control-label">教室名</label>
							<div class="col-sm-10">
								<input type="text" name="labNum" class="form-control"
									id="labNum_add_input" />
								<span class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label for="labType_add_input" class="col-sm-2 control-label">教室类型</label>
							<div class="col-sm-10">
								<input type="text" name="labType" class="form-control"
									id="labType_add_input" />
								<span class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label for="labCap_add_input" class="col-sm-2 control-label">容量</label>
							<div class="col-sm-10">
								<input type="text" name="labCap" class="form-control"
									id="labCap_add_input" />
								<span class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label for="locate_add_input" class="col-sm-2 control-label">教室地点</label>
							<div class="col-sm-10">
								<input type="text" name="locate" class="form-control"
									id="locate_add_input" />
								<span class="help-block"></span>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="lab_add_btn">更新</button>
				</div>
			</div>
		</div>
	</div>


<button id="add_lab_information" class="btn btn-default">添加实验室信息</button>
	<br><br>

<script type="text/javascript">
$("#add_lab_information").click(function() {

	$("#labAddModal").modal({
		backdrop : "static"
	});

});
$("#lab_add_btn").click(function() {
	$.ajax({
		url : "${PATH}/savelab",
		type : "POST",
		data : $("#labAddModal form").serialize(),
		success : function(success) {
			$("#labAddModal").modal('hide');
		}
	});
});
</script>

</body>
</html>