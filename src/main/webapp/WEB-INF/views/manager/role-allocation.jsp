<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("GBK");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Bootstrap分页实例</title>
<link href="<%=request.getContextPath()%>/bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="<%=request.getContextPath()%>/bootstrap/js/jquery-2.1.4.min.js"></script>
<script src="<%=request.getContextPath()%>/bootstrap/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/bootstrap/bootstrap-3.3.7-dist/js/bootstrap-paginator.min.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/bootstrap-3.3.7-dist/css/font-awesome.min.css">

<style type="text/css">
#queryDiv {
 margin-right: auto;
 margin-left: auto;
 width:600px;
}
#textInput {
 margin-top: 10px;
}
#tableResult {
 margin-right: auto;
 margin-left: auto;
 width:600px;
}
td {
 width:150px
}
</style>
</head>
<body>
	<div id = "queryDiv">
		<input id = "teacherId" type="text" placeholder="请输入教师编号" >
		<button id = "queryButton" class="btn btn-primary" type="button">查询</button>
	</div>
	<form id="form1">
		<table class="table table-bordered" id = 'tableResult'>
			<caption>查询教师结果</caption>
			<thead>
				<tr>
					<th>序号</th>
					<th>ID</th>
					<th>姓名</th>
					<th>电话</th>
					<th>性别</th>
					<th>学院</th>
					<th>角色</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody id="tableBody">
			</tbody>
		</table>
		<!-- 底部分页按钮 -->
		<div id="bottomTab"></div>
	</form>
	<script type='text/javascript'>    
	    var PAGESIZE = 10;
        var options = {  
            currentPage: 1,  //当前页数
            totalPages: 10,  //总页数，这里只是暂时的，后头会根据查出来的条件进行更改
            size:"normal",  
            alignment:"center",  
            itemTexts: function (type, page, current) {  
                switch (type) {  
                    case "first":  
                        return "第一页";  
                    case "prev":  
                        return "前一页";  
                    case "next":  
                        return "后一页";  
                    case "last":  
                        return "最后页";  
                    case "page":  
                        return  page;  
                }                 
            },  
            onPageClicked: function (e, originalEvent, type, page) {  
            	var teacherId = $("#teacherId").val(); //取内容
            	buildTable(teacherId,page,PAGESIZE);//默认每页最多10条
            }  
        }  

        //获取当前项目的路径
        var urlRootContext = (function () {
            var strPath = window.document.location.pathname;
            var postPath = strPath.substring(0, strPath.substr(1).indexOf('/') + 1);
            return postPath;
        })();
        
       
        //生成表格
        function buildTable(teacherId,pageNumber,pageSize) {
        	var url =  urlRootContext + "/tearole/role"; //请求的网址
             var reqParams = {'teacherId':teacherId, 'pageNumber':pageNumber,'pageSize':pageSize};//请求数据
             $(function () {   
             	  $.ajax({
             	        type:"POST",
             	        url:url,
             	        data:reqParams,
             	        async:false,
             	        dataType:"json",
             	        success: function(data){
             	            if(data.isError == false) {
             	           // options.totalPages = data.pages;
             	        var newoptions = {  
                        currentPage: 1,  //当前页数
                        totalPages: data.pages==0?1:data.pages,  //总页数
                        size:"normal",  
                        alignment:"center",  
                        itemTexts: function (type, page, current) {  
                        switch (type) {  
                            case "first":  
                            return "第一页";  
                            case "prev":  
                            return "前一页";  
                            case "next":  
                            return "后一页";  
                            case "last":  
                            return "最后页";  
                        case "page":  
                        return  page;  
                }                 
            },  
            onPageClicked: function (e, originalEvent, type, page) {  
            	var teacherId = $("#teacherId").val(); //取内容
            	buildTable(teacherId,page,PAGESIZE);//默认每页最多10条
            }  
         }             	           
         $('#bottomTab').bootstrapPaginator("setOptions",newoptions); //重新设置总页面数目
         var dataList = data.dataList;
         $("#tableBody").empty();//清空表格内容
         if (dataList.length > 0 ) {
             $(dataList).each(function(){//重新生成
            	 var button = $("<button></button>").addClass(
					"btn btn-primary btn-sm edit_btn").append(
							$("<span></span>").addClass(
									"glyphicon glyphicon-pencil")).append("修改");
             		button.attr("id",this.id);
             		button.attr("teacherName", this.teacher.teacherName);
             	    $("#tableBody").append('<tr>');
                    $("#tableBody").append('<td>' + this.id + '</td>');
                    $("#tableBody").append('<td>' + this.teacherId + '</td>');
                    $("#tableBody").append('<td>' + this.teacher.teacherName + '</td>');
                    $("#tableBody").append('<td>' + this.teacher.phone + '</td>');
                    $("#tableBody").append('<td>' + this.teacher.sex + '</td>');
                    $("#tableBody").append('<td>' + this.teacher.academy + '</td>');
                    if(this.role.roleName == "teacher"){
                    	$("#tableBody").append('<td>' + "<select name='select' id='select'> <option value='manager'" + 
                        		">manager</option> <option value='teacher' selected>teacher</option>" + '</td>');
                    }
                    if(this.role.roleName == "manager"){
                    	$("#tableBody").append('<td>' + "<select name='select' id='select'> <option value='manager'" + 
                        		" selected>manager</option> <option value='teacher'>teacher</option>" + '</td>');
                    }
                    $("#tableBody").append(button);
                    $("#tableBody").append('</tr>');
             	    });
             	    } else {             	            	
             	          $("#tableBody").append('<tr><th colspan ="4"><center>查询无数据</center></th></tr>');
             	    }
             	    }else{
             	          alert(data.errorMsg);
             	            }
             	      },
             	        error: function(e){
             	           alert("查询失败:" + e);
             	        }
             	    });
               });
        }
        
        //渲染完就执行
        $(function() {
        	
        	//生成底部分页栏
            $('#bottomTab').bootstrapPaginator(options);     
        	
        	buildTable("",1,10);//默认空白查全部
        	
            //创建结算规则
            $("#queryButton").bind("click",function(){
            	var teacherName = $("#teacherName").val();	
            	buildTable(teacherName,1,PAGESIZE);
            });
        });
        $(document).on("click","button",function(){
        	
        	var roleName = $("#select").val();
        		//$(this).parent().find("td:eq(6)").child().val();
			var id = $(this).attr("id");
			var url =  urlRootContext + "/tearole/modify?id=" + id + "&roleName=" + roleName; //请求的网址
			var teacherName = $(this).attr("teacherName");
			if(confirm("确认修改"+teacherName + "的权限?")){
				$.ajax({
					url:url,
					type:"POST",
					success:function(result){
						alert(result.msg);
						//回到本页
						to_page(currentNum);
					}
				});
			}

        });
    </script>
</body>
</html>