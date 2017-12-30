<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/"
			+ application.getContextPath() + "/";
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN"
"http://www.w3.org/TR/html4/strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" lang="en">

	<head>
	<!-- 将页面所有的资源位置转换为从根目录开始查找 -->
	<base href="<%=path%>" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

		<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />

		<script type="text/javascript" src="js/jquery-1.10.1.js"></script>
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
		<link rel="stylesheet" type="text/css" href="css/my.css" />

		<title>注册</title>
	</head>

	<body>

	<div class="row">
		
		<!--
        	作者：984801940@qq.com
        	时间：2017-03-06
        	描述：最左边
        -->
		<div class="col-md-3">
			
		</div>
		
		<div class="col-md-6">
			
			<div class="top">
				123
			</div>
			<div class="nav">
				123
			</div>
			
			
			<div class="main">
				<form id="form" name="form" action="${basePath }gl/user_add.action" method="post" enctype="multipart/form-data">

			<div class="row">
				<div class="col-md-6 text-left">
					
					<strong>
						登录
					</strong>
				
				</div>
				<div class="col-md-6 text-right">
					
					<strong>
						返回主页
					</strong>
					
				</div>
			</div>
			
					<div class="col-md-6" style="border-right:1px solid #111">
											
						<div class="main-left-1 ">
							<div >
								  &nbsp;
							</div> 
															
							<div class="divmargin-top divmargin-left">
								电子邮件
							</div>
							<div class="divmargin-top divmargin-left divmargin-bottom">
								<input type="text" id="userEmail"/>							
							</div>
							
							<div class="divmargin-top divmargin-left">
								密码
							</div>	
							<div class="divmargin-top divmargin-left divmargin-bottom">
								<input type="password" id="userPassword"/>							
							</div>
																																											
							<div class="divmargin-top divmargin-left divmargin-bottom">
								<input type="button" value="保存" id="ok"/>
							</div>	
							<div class="divmargin-top divmargin-left divmargin-bottom">
								<input type="button" value="注册" id="register" onclick="doRegister()"/>
							</div>	
							<div class="divmargin-top divmargin-left divmargin-bottom">
								<input type="button" value="返回" id="goback" onclick="javascript:history.go(-1)"/>
							</div>							
						</div>
										
					</div>
			
					
			</div>
			
			
			<div class="foot">
				12367
			</div>
			
			
						
			
		</div>
		
		
		
		
		
		<!--
        	作者：984801940@qq.com
        	时间：2017-03-06
        	描述：最右边
        -->
		<div class="col-md-3">
			
		</div>
		
		
	</div>	
	

		

	</body>
<script type="text/javascript" >


	
	function doRegister(){
		
		window.location.href = "register_login/register_UI.action";
		
	}

	
	$("#ok").click(function(){
		
		
		//e-mail
		var userEmail = $("#userEmail").val();
		//密码
		var userPassword = $("#userPassword").val();
			
		 $.ajax({
	          type:"get",
	        
	          url:"register_login/login.action",
	          async:true,
	          data:{
	        	  userPassword:userPassword,
	              userEmail:userEmail       
	          },
	          success : function(data){
	        	  var msg = data.key;
	        	  //判断是否插入成功
	        	  if(msg=="yes")
	        	  {
	        		  alert("登录");
	        		  window.location.href=data.url;
	        		  
	        	  }else if(msg =="no")
	        	  {
	        		  alert("登陆失败，请查看信息");
	        		 
	        	  }
	     
	              console.log(data.key);
	          }
	          
	      });
	});

</script>
</html>


