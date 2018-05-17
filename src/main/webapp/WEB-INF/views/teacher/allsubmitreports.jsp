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

<button type="button" class="btn btn-primary" id="download_reports">下载</button>
	<br>
	<table class="table table-hover" id="stu_submit_to_teacher_tables">
		<thead>
			<tr>
				<th>学生名</th>
				<th>提交时间</th>
				<th>文件名</th>
				<th>下载报告</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th>Tom</th>
				<th>2016-9-21</th>
				<th>zstu.sql</th>
				<th><a href="download?filename=zstu.sql">下载</a></th>
			</tr>
		</tbody>
	</table>
	<script type="text/javascript">
	function getSubmitReports(){
		$.ajax({
			url:"${PATH}/allsubmitreports",
			type:"GET",
			success:function(result){
				bulid_reports_table(result);
			}
		});
	}
	function bulid_reports_table(result){
		$("#stu_submit_to_teacher_tables tbody").empty();
		var sreports = result.extend.submitreports;
		$.each(sreports,function(index,item){
			//学生名 提交时间 文件名 下载报告
			var stuNameTd = $("<td></td>").append(item.student.studentName);
			var submitTimeTd = $("<td></td>").append(item.submitTime);
			var fileNameTd = $("<td></td>").append(item.submitFileName);
			var downloadHref = $("<a></a>").attr("href","download?filename="+item.submitFileName).append("下载");
			var downloadHrefTd = $("<td></td>").append(downloadHref);
			$("<tr></tr>").append(stuNameTd).append(submitTimeTd).append(fileNameTd)
				.append(downloadHrefTd).appendTo("#stu_submit_to_teacher_tables tbody");
		});
	}
	$("#download_reports").click(function(){
		getSubmitReports();
	});
	/*
	$(document).on("click",".downloadreports",function(){
		var fileName = $(this).attr("fileName");
		var filePath = $(this).attr("filePath");
		$.ajax({
			url:"${PATH}/download",
			type:"GET",
			data:"filename="+fileName+"&filepath="+filePath,
			success:function(result){
				
			}
		});
	});
	*/
	</script>

</body>
</html>