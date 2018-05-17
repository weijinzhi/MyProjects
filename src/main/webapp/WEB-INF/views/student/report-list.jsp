<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>实验报告</title>

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

	<!-- Modal -->
	<div class="modal fade" id="file" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">上传实验报告</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal">
						<div class="form-group">
							<label class="col-sm-2 control-label">上传文件名称</label>
							<div class="col-sm-10">
								<input type="report" class="form-control" name="loadFileName"
									id="exampleInputReport" placeholder="report">
							</div>
						</div>
			
				<div class="form-group">
					<label class="col-sm-2 control-label">路径</label>
					<div class="col-sm-10">
						<input type="file" 
									id="exampleInputReportLoad" >
					</div>
				</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary" id="report_load_btn">上传</button>
			</div>
		</div>
	</div>
	</div>

	<!-- 搭建显示页面 -->
	<div class="container">
		<!-- 标题行 -->
		<div class="row">
			<div class="col-md-12">
				<h1>报告任务</h1>
			</div>
		</div>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="reps_table">
					<thead>
						<tr>
							<th>#</th>
							<th>report_litle</th>
							<th>reprot_file_name</th>
							<th>stop_time</th>
							<th>courseName</th>
							<th>teacherName</th>
							<th>操作</th>
						</tr>

					</thead>
					<tbody>

					</tbody>

				</table>
			</div>
		</div>
		<!-- 显示分页信息 -->
		<div class="row">
			<!-- 分页文字信息 -->
			<div class="col-md-6" id="page_info_area"></div>
			<!-- 分页条信息 -->
			<div class="col-md-6" id="page_nav_area"></div>
		</div>
	</div>
	<script type="text/javascript">
		$(function() {
			//去第一页
			to_page(1);

		});
		function to_page(pn) {
			$.ajax({
				url : "${APP_PATH}/reportload",
				data : "pn=" + pn,
				type : "GET",
				success : function(result) {
					//console.log(result);
					//显示报告信息
					build_reports_table(result);
					//解析并显示分页信息
					build_page_info(result);
					//解析并显示分页条数据
					build_page_nav(result);

				}
			});

		}

		function build_reports_table(result) {

			//清空table表格
			$("#reps_table tbody").empty();
			var reps = result.extend.pageInfo.list;
			$.each(reps, function(index, item) {
				var repIdTd = $("<td></td>").append(item.id);
				var repTitleTd = $("<td></td>").append(item.reportTitle);
				var repFileNameTd = $("<td></td>").append(item.reportFileName);
				var repStopTimeTd = $("<td></td>").append(item.stopTime);
				var repCourseNameTd = $("<td></td>").append(
						item.courses.courseName);
				var repTeacherNameTd = $("<td></td>").append(
						item.teacher.teacherName);
				//按钮
				var editBtn = $("<button></button>").addClass(
						"btn btn-primary btn-sm edit_btn").append(
						$("<span></span>").addClass(
								"plyphicon glyphicon-pencil")).append("上传报告");

				$("<tr></tr>").append(repIdTd).append(repTitleTd).append(
						repFileNameTd).append(repStopTimeTd).append(
						repCourseNameTd).append(repTeacherNameTd).append(
						editBtn).appendTo("#reps_table tbody");
				edit_Btn.attr("reportId", item.id);
			});

		}

		function build_page_info(result) {
			$("#page_info_area").empty();
			$("#page_info_area").append(
					"当前" + result.extend.pageInfo.pageNum + "页面,总"
							+ result.extend.pageInfo.pages + "页，总 "
							+ result.extend.pageInfo.total + "条记录");

		}
		//显示分页条
		function build_page_nav(result) {
			//$("#page_nav_area").
			$("#page_nav_area").empty();
			var ul = $("<ul></ul>").addClass("pagination");

			var firstPageLi = $("<li></li>").append(
					$("<a></a>").append("首页").attr("href", "#"));
			var prePageLi = $("<li></li>").append(
					$("<a></a>").append("&laquo;"));
			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			}

			firstPageLi.click(function() {
				to_page(1);
			});
			prePageLi.click(function() {
				to_page(result.extend.pageInfo.pageNum - 1);
			});
			var nextPageLi = $("<li></li>").append(
					$("<a></a>").append("&raquo;"));
			var lastPageLi = $("<li></li>").append(
					$("<a></a>").append("尾页").attr("href", "#"));
			if (result.extend.pageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			}
			lastPageLi.click(function() {
				to_page(result.extend.pageInfo.pages);
			});
			nextPageLi.click(function() {
				to_page(result.extend.pageInfo.pageNum + 1);
			});

			ul.append(firstPageLi).append(prePageLi);

			$.each(result.extend.pageInfo.navigatepageNums, function(index,
					item) {
				var numLi = $("<li></li>").append($("<a></a>").append(item));
				if (result.extend.pageInfo.pageNum == item) {
					numLi.addClass("active");
				}
				numLi.click(function() {
					to_page(item);
				});
				ul.append(numLi);
			});

			ul.append(nextPageLi).append(lastPageLi);

			var navEle = $("<nav></nav>").append(ul);
			navEle.appendTo("#page_nav_area");

		}

		$(document).on("click", ".edit_btn", function() {
			$("#file").modal({
				backdrop : "static"
			});
		});
		
		$(document).on("click",".report_load_btn",function(){
			//1.将模态框中的信息更新，交给服务器
			//2.发送ajax请求保存更新学生信息
			alert(11111);
			$.ajax({
				url:"${APP_PATH}/report/load",
				type:"POST",
				data:$("#file form").serialize()+"&_method=PUT",
				success:function(result){
					alert(result.msg);
				}
				
			});
		});
	</script>

</body>
</html>