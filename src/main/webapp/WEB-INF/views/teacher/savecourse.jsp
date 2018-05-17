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
<div class="modal fade" id="courseAddModal" 
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">课程信息录入</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal">
						<div class="form-group">
							<label for="coursename_add_input" class="col-sm-2 control-label">课程名</label>
							<div class="col-sm-10">
								<input type="text" name="courseName" class="form-control"
									id="courseName_add_input" />
								<span class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label for="credit_add_input" class="col-sm-2 control-label">课程学分</label>
							<div class="col-sm-10">
								<input type="text" name="credit" class="form-control"
									id="credit_add_input" />
								<span class="help-block"></span>
							</div>
						</div>
						<!-- 
						<div class="form-group">
							<label for="startTime_add" class="col-sm-2 control-label">开始时间</label>
							<div class="col-sm-9 input-group date form_date" data-date="" 
							data-date-format="yyyy-mm-dd" data-link-field="startTime_add" 
							data-link-format="yyyy-mm-dd">
								<input type="text" name="startTime" class="form-control" 
								 id="startTime_add_input" value="" readonly="readonly"/>
								<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
								<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
							</div>
							<input type="hidden" id="startTime_add" value="" /><br/>
						</div>
						<div class="form-group">
							<label for="endTime_add" class="col-sm-2 control-label">结束时间</label>
							<div class="col-sm-9 input-group date form_date" data-date="" 
							data-date-format="yyyy-mm-dd" data-link-field="endTime_add" 
							data-link-format="yyyy-mm-dd">
								<input type="text" name="endTime" class="form-control"
									id="endTime_add_input" value="" readonly="readonly"/>
								<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
								<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
							</div>
							<input type="hidden" id="endTime_add" value="" /><br/>
						</div>
						 -->
						<div class="form-group">
						    <label for="labId_add_input" class="col-sm-2 control-label">实验室</label>
						    <div class="col-sm-4">
						      	<select class="form-control" name="labId" id="lab_add_select"></select>
						    </div>
						  </div>
						  <input type="hidden" name="teacherId" value="1" />
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="course_add_btn">更新</button>
				</div>
			</div>
		</div>
	</div>
<button id="add_course_information" class="btn btn-default">添加课程信息</button>
	<br><br>
	
	<script type="text/javascript">
	function getLabs(ele) {
		$(ele).empty();
		$.ajax({
			url:"${PATH}/labs",
			type:"GET",
			success:function(result){
				$.each(result.extend.labs,function(index,item){
					var optionEle = $("<option></option>").append(item.labNum).attr("value",item.id);
					optionEle.appendTo(ele);
				});
			}
		});
	}
	$("#add_course_information").click(function() {
		getLabs($("#lab_add_select"));
		$("#courseAddModal").modal({
			backdrop : "static"
		});
	});
	$("#course_add_btn").click(function() {
		$.ajax({
			url : "${PATH}/savecourse",
			type : "POST",
			data : $("#courseAddModal form").serialize(),
			success : function(success) {
				$("#courseAddModal").modal('hide');
			}
		});
	});
	//================================文件上传======================================
	function getCourses(ele){
		$(ele).empty();
		$.ajax({
			url:"${PATH}/allcourses",
			type:"GET",
			success:function(result){
				$.each(result.extend.courses,function(index,item){
					var optionEle = $("<option></option>").append(item.courseName).attr("value",item.id);
					optionEle.appendTo(ele);
				});
			}
		});
	}
	$("#upload_material").click(function(){
		var formData = new FormData($("#uploadForm")[0]);
		$.ajax({
			url:"${PATH}/upload",
			type:"POST",
			data:formData,
			async: false, 
		    cache: false, 
		    contentType: false, 
		    processData: false, 
		    success:function(result){
		    	alert(result.msg);
		    }
		});
		
	});
	</script>

</body>
</html>