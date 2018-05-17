<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生列表</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<script type="text/javascript"
	src="${APP_PATH }/bootstrap/js/jquery-1.12.3.min.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH }/bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH }/bootstrap/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body>
	<div class="container">
		<!-- 数据 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="emps_tables">
					<thead>
						<tr>
							<th>
								<input type="checkbox" id="check_all">
							</th>
							<th>ID</th>
							<th>学生姓名</th>
							<th>性别</th>
							<th>班级</th>
							<th>学院</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>

					</tbody>
				</table>
			</div>
		</div>
		<!-- 分页信息 -->
		<div class="row">
			<div class="col-md-6" id="page_info_area"></div>
			<div class="col-md-6" id="page_nav_area"></div>
		</div>
	</div>
	
	<script type="text/javascript">
	$(function() {
		to_page(1);
	});

	function to_page(pn) {
		$.ajax({
			url : "${APP_PATH}/studentAll",
			data : "pn=" + pn,
			type : "GET",
			success : function(result) {
				//console.log(result);
				//1.解析并显示员工信息
				build_emps_table(result);
				//2.解析并显示分页信息
				build_page_info(result);
				//3.解析显示分页条信息
				build_page_nav(result);
			}
		});
	}

	function build_emps_table(result) {
		$("#emps_tables tbody").empty();
		var emps = result.extend.pageInfo.list;
		$.each(emps, function(index, item) {
			var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
			var studentIdTd = $("<td></td>").append(item.studentId);
			var studentNameTd = $("<td></td>").append(item.studentName);
			var sexTd = $("<td></td>").append(
					item.sex == "M" ? "男" : "女");
			var classnumTd = $("<td></td>").append(item.classnum);
			var academyTd = $("<td></td>").append(item.academy);
			
			var editBtn = $("<button></button>").addClass(
					"btn btn-primary btn-sm edit_btn").append(
					$("<span></span>").addClass(
							"glyphicon glyphicon-pencil")).append("编辑");
			//为编辑按钮添加自定义属性好，便是当前员工的Id
			editBtn.attr("edit-id",item.studentId);
			var delBtn = $("<button></button>").addClass(
					"btn btn-danger btn-sm delete_btn").append(
					$("<span></span>")
							.addClass("glyphicon glyphicon-trash")).append(
					"删除");
			delBtn.attr("del-id",item.studentId);
			var btnTd = $("<td></td>").append(editBtn).append(" ").append(
					delBtn);
			
			$("<tr></tr>").append(checkBoxTd).append(studentIdTd).append(studentNameTd).append(
					sexTd).append(classnumTd).append(academyTd).append(
					btnTd).appendTo("#emps_tables tbody");
		});
	}
	//分页信息
	function build_page_info(result) {
		$("#page_info_area").empty();
		$("#page_info_area").append(
				"当前第" + result.extend.pageInfo.pageNum + "页，总"
						+ result.extend.pageInfo.pages + "页，总"
						+ result.extend.pageInfo.total + "条记录.");
		totalRecord = result.extend.pageInfo.total;
		currentNum = result.extend.pageInfo.pageNum;
	}
	//分页条
	function build_page_nav(result) {
		$("#page_nav_area").empty();
		var ul = $("<ul></ul>").addClass("pagination");

		var firstPageLi = $("<li></li>").append(
				$("<a></a>").append("首页").attr("href", "#"));
		var prePageLi = $("<li></li>").append(
				$("<a></a>").append("&laquo;").addClass(
						"aria-label Previous"));
		if (result.extend.pageInfo.hasPreviousPage == false) {
			firstPageLi.addClass("disabled");
			prePageLi.addClass("disabled");
		} else {
			firstPageLi.click(function() {
				to_page(1);
			});
			prePageLi.click(function() {
				to_page(result.extend.pageInfo.pageNum - 1);
			});
		}

		var nextPageLi = $("<li></li>").append(
				$("<a></a>").append("&raquo;").addClass("aria-label Next"));
		var lastPageLi = $("<li></li>").append(
				$("<a></a>").append("尾页").attr("href", "#"));

		if (result.extend.pageInfo.hasNextPage == false) {
			nextPageLi.addClass("disabled");
			lastPageLi.addClass("disabled");
		} else {
			nextPageLi.click(function() {
				to_page(result.extend.pageInfo.pageNum + 1);
			});
			lastPageLi.click(function() {
				to_page(result.extend.pageInfo.pages);
			});
		}
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
	</script>

</body>
</html>