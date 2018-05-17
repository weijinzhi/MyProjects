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
	
	<h3>文件上传:</h1>
	<br>
	<form id="uploadForm" action="" method="post" enctype="multipart/form-data">
	 	<p>File:
	 		<input type="file" name="file"/>
	 	</p> 
		<br>
		<!-- 
		<select class="form-control" name="courseId" id="course_add_select"></select>
		 -->
	 	<button type="button" class="btn btn-primary" id="upload_material">上传</button>
	</form>	 
	<script type="text/javascript">
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
		    	alert("成功");
		    	alert(result.msg);
		    }
		});
		
	});
	</script>
</body>
</html>