<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/"
			+ application.getContextPath() + "/";
%>

<base href="<%=path%> " />
<!-- 将页面所有的资源位置转换为从根目录开始查找 -->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>学生管理平台</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
	 
	 <script type="text/javascript" src="js/jquery-1.10.1.js" ></script>
	 <script type="text/javascript" src="s/bootstrap.min.js" ></script>
	 <link rel="stylesheet" type="text/css" href="css/my.css"/>
	<script type="text/javascript" src="js/datepicker/lang/zh-cn.js"></script>
	<script type="text/javascript" src="js/datepicker/WdatePicker.js"></script>
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
			
			
			<!--
            	作者：984801940@qq.com
            	时间：2017-07-22
            	描述：最上面的 部分
            -->
			<div class="top">
				12346
			</div>
			
			
			<div class="nav row">
				123
				<div class="col-md-1">
					123
				</div>
				<div class="col-md-1">
					123
				</div>
				123
				<div class="col-md-1">
					123
				</div>
				<div class="col-md-1">
					123
				</div>
				<div class="col-md-1">
					123
				</div>
				<div class="col-md-1">
					123
				</div>
				<div class="col-md-1">
					123
				</div>
				<div class="col-md-1">
					123
				</div>
				<div class="col-md-1">
					123
				</div>
				<div class="col-md-1">
					123
				</div>
				<div class="col-md-1">
					123
				</div>
				<div class="col-md-1">
					123
				</div>
				<div class="col-md-1">
					123
				</div>
				
				
			</div>
			
		
			
			
			<div class="main row">
				<div class="mod col-md-12">
					<div class="col-md-6">
					登陆
					</div>
					<div class="col-md-6 textright">
					回到完整页面
					</div>
				</div>
				<div class="row">
					
			
					<div class="col-md-6" style="border-right:1px solid #111">
											
						<div class="main-left-1 ">
							<div >
								  &nbsp;
							</div> 
							<div class="divmargin-top divmargin-left">
								姓
							</div>
							<div class="divmargin-top divmargin-left divmargin-bottom">
							<input type="text" id="surname"/>
							</div>					
							
							
							<div class="divmargin-top divmargin-left">
								名字
							</div>
							<div class="divmargin-top divmargin-left divmargin-bottom">
							<input type="text" id="name"/>
							</div>								
							
													
						
							<div class="divmargin-top divmargin-left">
								英文名字
							</div>
							<div class="divmargin-top divmargin-left divmargin-bottom">
							<input type="text" id="ename"/>
							</div>	
							
							<div class="divmargin-top divmargin-left">
								电子邮件
							</div>
							<div class="divmargin-top divmargin-left divmargin-bottom">
								<input type="text" id="userEmail" onchange="selectEmail()"/>							
							</div>
							
							<div class="divmargin-top divmargin-left">
								密码
							</div>	
							<div class="divmargin-top divmargin-left divmargin-bottom">
								<input type="password" id="userPassword"/>							
							</div>
							
							<div class="divmargin-top divmargin-left">
								学科
							</div>
							<div class="divmargin-top divmargin-left divmargin-bottom">
								<select name="cars2" id="userSubject">
								<option value="volvo" selected="selected">请选择</option>
								<option value="saab">Saab</option>
								<option value="fiat" >Fiat</option>
								<option value="audi">Audi</option>
								</select>
							</div>
						
							
							<div class="divmargin-top divmargin-left ">
								学院
							</div>
							<div class="divmargin-top divmargin-left divmargin-bottom">
								<select name="cars2" id="userAcademy">
								<option value="volvo">请选择</option>
								<option value="saab">Saab</option>
								<option value="fiat" selected="selected">Fiat</option>
								<option value="audi">Audi</option>
								</select>
							</div>
																																	
							<div class="divmargin-top divmargin-left ">
								<input type="button" value="保存" id="ok"/>
							</div>							
						</div>
										
					</div>
					
					<div class="col-md-6" style="border:0px solid #000">
            

						<div class="main-left-1">
							<div >
								  &nbsp;
							</div> 
							<div class="divmargin-top divmargin-left">
								生日
							</div>
							<div class="divmargin-top divmargin-left divmargin-bottom">
							<input id="birthday" name="user" readonly="true" 
           					onfocus="WdatePicker({'skin':'whyGreen','dateFmt':'yyyy-MM-dd'});" />
							</div>	
						
       					
	       					<div class="divmargin-top divmargin-left">
								<input name="sex" type="radio" value="man"  /><label for="man">男</label>
								<input name="sex" type="radio" value="woman" /><label for="woman">女</label>
							</div>       		
						 
						
					
						</div>	
					</div>
					
				</div>
				
				<div class="mod col-md-12">
					22222222
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


<script type="text/javascript">

	//判断邮箱有无注册
	function selectEmail()
	{	
		var userEmail = $("#userEmail").val();
	
		$.ajax({
	          type:"get",
	        
	          url:"register_login/selectEmail.action",
	          async:false,
	          data:{	        	 
	              userEmail:userEmail	                       
	          },
	          success : function(data){
	        	  var msg = data.key;
	        	  //判断是否插入成功
	        	  if(msg=="yes")
	        	  {
	        		  alert("邮箱已被注册");
	        		  $("#userEmail").val("");
	        		  
	        	  }else if(msg =="no")
	        	  {
	        		  alert("邮箱未被注册,可以操作");
	        		 
	        	  }
	     
	              console.log(data.key);
	          }
	          
	      });
	}
	
	
	//注册
	$("#ok").click(function(){
		//获取姓
		var surname = $("#surname").val();
		//获取名字
		var name = $("#name").val();
		//英文名字
		var ename = $("#ename").val();
		//e-mail
		var userEmail = $("#userEmail").val();
		//密码
		var userPassword = $("#userPassword").val();
		//学科
		var userSubject = $("#userSubject option:selected").val();
		//学院
		var userAcademy = $("#userAcademy option:selected").val();	
		
		 $.ajax({
	          type:"get",
	        
	          url:"register_login/register.action",
	          async:true,
	          data:{
	        	  userName:surname+name,
	        	  userEname:ename,
	        	  userPassword:userPassword,
	              userEmail:userEmail,
	              userSubject:userSubject,
	              userAcademy:userAcademy            
	          },
	          success : function(data){
	        	  var msg = data.key;
	        	  //判断是否插入成功
	        	  if(msg=="yes")
	        	  {
	        		  alert("注册成功，请登录");
	        		  window.location.href="register_login/login_UI.action";
	        		  
	        	  }else if(msg =="no")
	        	  {
	        		  alert("注册失败，请查看信息");
	        		 
	        	  }
	     
	              console.log(data.key);
	          }
	          
	      });
		
	/*	
	  var booluser =  name.length >= 2;
	  var boolpwd = password.length >= 6  ;
	  var boolpwd1 = password == qupassword ;
	  var retel =/^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/g; 
	  var booltel = retel.test(phoneNumber);
	  var reemail = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/g ;
	  var boolemail = reemail.test(email);
	 
		  //这里应该嵌套使if的,但是不是实际开发,这么写便于代码观看
		  if(!booluser){
		      console.log('user:不能少于2位');
		  }
		  if(!boolpwd){
		      console.log('pwd:不能少于6位');
		  }
		  if(!boolpwd1){
		      console.log('pwd1:两次输入密码不一致');
		  }
		  if(!booltel){
		      console.log('tel:请输入正确的电话号');
		  }
		  if(!boolemail){
		      console.log('email:请输入正确的邮箱格式');
		  }
		  if(booluser && boolpwd && boolpwd1 && booltel && boolemail){                
		      $.ajax({
		          type:"get",
		        
		          url:"login_register/register.action",
		          async:true,
		          data:{
		              name:name,
		              password:password,
		              email:email,
		              mobilephone:phoneNumber,
		              way:way             
		          },
		          success : function(data){
		        	  var msg = data.key;
		        	  //判断是否插入成功
		        	  if(msg=="yes")
		        	  {
		        		  alert("注册成功，请登录");
		        		  window.location.href="base/goURL/login.action";
		        		  
		        	  }else if(msg =="no")
		        	  {
		        		  alert("注册失败，请查看信息");
		        		 
		        	  }
		     
		              console.log(data.key);
		          }
		          
		      });
		  }
		*/  
		  }
		  )
	
	
</script>











</html>