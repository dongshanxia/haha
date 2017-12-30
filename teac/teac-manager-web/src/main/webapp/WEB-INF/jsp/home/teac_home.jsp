<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/"
			+ application.getContextPath() + "/";
%>
<!-- 将页面所有的资源位置转换为从根目录开始查找 -->
<base href="<%=path%>" />



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>学生管理平台</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/jquery-ui.css" />
	<link rel="stylesheet" type="text/css" href="css/my.css"/>
	
	<link rel="stylesheet" href="css/bootstrap.min.css" />	
	<script type="text/javascript" src="js/jquery-1.12.js"></script>
	<script type="text/javascript" src="js/jquery-ui-1.12.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js" ></script>

	<script type="text/javascript" src="js/datepicker/lang/zh-cn.js"></script>
	

</head>

<script type="text/javascript">
	
	
    </script>


<body>

	<div class="row">
		
		<!--
        	作者：984801940@qq.com
        	时间：2017-03-06
        	描述：最左边
        -->
		<div class="col-md-3">
				<div class="top" >
				
				</div>
				<div>
					<label onclick="zuoceshi()" id="zuoceshi">左边添加</label>
				</div>
				<div>
					<label onclick="youceshi()" id="youceshi">右边添加</label>
				</div>
				
				
				<div id="myhiddenone" class="hidden">
					  <div class="portlet">
							    <div class="portlet-header">订阅222</div>
							    <div class="portlet-content">22Lorem ipsum dolor sit amet, consectetuer adipiscing elit</div>
						</div>
				</div>
				<div id="notmyhiddenone" class="hidden">
					 <div id="dialog-confirm" title="清空回收站吗？">
  							<p><span class="ui-icon ui-icon-alert" style="float:left; margin:0 7px 20px 0;">  								
  							</span>这些项目将被永久删除，并且无法恢复。您确定吗？</p>
					</div>
				</div>
					
		</div>
		
		<div class="col-md-6">
			
			<div class="top" id="teac_top">
				
			</div>
			
			
	

		    <div>   
		        <div class="myfont20" id="nav_yemian">  	            	            
		  		                     	               
		        </div>  
	  		</div>
		
	  
		
					
				

			<div class="row mymain">

				<div class="col-md-4 column " id="xinxitianjiazuo">
											
				</div>
				<div class="col-md-8 column" id="xinxitianjiayou">
					
					
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
				<div class="top" >
				
				</div>
				<div>
					<label onclick="ceshi()" id="ceshi">添加页面</label>
				</div>
				
				<div>
					<label onclick="ye_delete()" id="ye_delete">删除选中页面</label>
				</div>
			</div>

		</div>

	</body>
	<script>
		//初始化化数据
		$(function()
		{
			
			
			
			//面板的初始化
			$( ".column" ).sortable({
			      connectWith: ".column",
			      handle: ".portlet-header",
			      cancel: ".portlet-toggle",
			      placeholder: "portlet-placeholder ui-corner-all"
			    });
			 
			    $( ".portlet" )
			      .addClass( "ui-widget ui-widget-content ui-helper-clearfix ui-corner-all" )
			      .find( ".portlet-header" )
			        .addClass( "ui-widget-header ui-corner-all" )
			        .prepend( "<span class='ui-icon ui-icon-minusthick portlet-toggle'></span><span class='ui-icon ui-icon-circle-close portlet-close'></span>");
			     ;
			 
			    $( ".portlet-toggle" ).click(function() {
			      var icon = $( this );
			      icon.toggleClass( "ui-icon-minusthick ui-icon-plusthick" );
			      icon.closest( ".portlet" ).find( ".portlet-content" ).toggle();
			    });
			    
			    $( ".portlet-close" ).click(function() {
			      $( "#dialog-confirm" ).dialog({
			      resizable: false,
			      height:140,
			      modal: true,
			      buttons: {
			        "Delete all items": function() {
			          $( this ).dialog( "close" );
			        },
			        Cancel: function() {
			          $( this ).dialog( "close" );
			        }
			      }
	   			 });
			    });
			    
			    alert("A");
			    $.ajax({
			          type:"post",			        
			          url:"sys/TeacherNavbar/select.action",
			          async:false,
			          success : function(data){
			        	  var msg = data.key;
			        	  //判断是否插入成功
			        	  if(msg=="yes")
			        	  {
			        		 /*获取要加入导航栏地方
			        		 <label class="radio-inline">
						        <input type="radio" value="option2" name="navbar">女性
						      </label>
			        		 */
			        		var nav_yemian = document.getElementById("nav_yemian");
			        		
			        		var myset = data.TeacherNavbarList;
			        		
			        		myset.forEach(function (element, sameElement, List) {
				        		var nav_yemianLen = nav_yemian.children.length;
				        		 // 创建一个元素节点    		
				        		var p = document.createElement("label"); 
							    p.setAttribute("class","radio-inline"); 		
								//新插入导航栏
								var temp = element.teacNavUrl;
								p.innerHTML = "<input type='radio' value='"+temp+"' name='navbar' msgName='"+element.teacNavName+"' msgId='"+element.teacNavId+"'>"+element.teacNavName;				
				        		
								
								//判断是否已经存在导航条
								if (nav_yemianLen>0) {
									var nav_lastObj = nav_yemian.children[nav_yemianLen-1];		
									insertAfter(p,nav_lastObj);
								} else {
								
									nav_yemian.append(p);
								}
			        		});
			        		
			        	
			        		  
			        	  }else if(msg =="no")
			        	  {
			        		  alert("服务器正忙");			        		 
			        	  }	     
			              console.log(data.key);
			          }
			          
			      }); 
			    
			  //导航的按钮
				$( "#nav_yemian" ).buttonset();
		});
		
		
		//左侧添加
		var youceshi = document.getElementById("youceshi");
		//右侧添加
		var zuoceshi = document.getElementById("zuoceshi");
		
	
		var a = $("#myhiddenone").html();

		
		zuoceshi.onclick=function(){
			var xinxitianjiazuo = document.getElementById("xinxitianjiazuo");
			zengjia(xinxitianjiazuo);
		}
		youceshi.onclick=function(){
			var xinxitianjiayou = document.getElementById("xinxitianjiayou");
			zengjia(xinxitianjiayou);
		}
		
		
		
		
		
		function zengjia(jiedian){ // 
	   		alert("22");					
			//子节点长度	
			var nav_yemianLen = jiedian.children.length;
			//获取子节点的最后一个节点
			var nav_lastObj = jiedian.children[nav_yemianLen - 1];
			//alert(nav_yemianLen);
			var p = document.createElement("div"); // 创建一个元素节点 

			p.innerHTML = a;
			if(nav_lastObj == null) {
				jiedian.appendChild(p);
			} else {
				insertAfter(p, nav_lastObj);
			}

			$( ".portlet" )
		      .addClass( "ui-widget ui-widget-content ui-helper-clearfix ui-corner-all" )
		      .find( ".portlet-header" )
		        .addClass( "ui-widget-header ui-corner-all" )
		        .prepend( "<span class='ui-icon ui-icon-minusthick portlet-toggle'></span><span class='ui-icon ui-icon-circle-close portlet-close'></span>");
		     ;
		 
		    $( ".portlet-toggle" ).click(function() {
		      var icon = $( this );
		      icon.toggleClass( "ui-icon-minusthick ui-icon-plusthick" );
		      icon.closest( ".portlet" ).find( ".portlet-content" ).toggle();
		    });
		   
		    $( ".portlet-close" ).click(function() {
		      window.console.log("ww");
		      $( "#dialog-confirm" ).dialog({
		      resizable: false,
		      height:140,
		      modal: true,
		      buttons: {
		        "Delete all items": function() {
		          $( this ).dialog( "close" );
		        },
		        Cancel: function() {
		          $( this ).dialog( "close" );
		        }
		      }
   			 });
		    });
	    };   
		
		
		
		
		
		
		
	    var tempadd=1;
	    var tempadd_action=0;
	    var tempupdate=1;
	    var tempupdate_action=0; 
	    var tempdelete=1; 
		//需要删除页面的值
		var ye_delete=document.getElementById("ye_delete");
		
		
		ye_delete.onclick=function(){
			//radio标签
			if (tempdelete==1) {
				var tempadd=0;
			    var tempupdate=0; 
				$v = $("input[name='navbar']:checked");
				var msgId = $v.attr("msgId");
				$.ajax({
			          type:"post",			        
			          url:"sys/TeacherNavbar/delete.action",
			          async:false,
			          data:{
			        	  id:msgId	        	        
			          },
			          success : function(data){
			        	  var msg = data.key;
			        	  //判断是否插入成功
			        	  if(msg=="yes"){		        	
			  				//label 标签
							$v.parent().remove();
							tempdelete=1;
							tempadd=1;
						    tempupdate=1; 
			        		//nav_yemian.removeChild(nav_devObj);
			        	  }else if(msg =="no")
			        	  {
			        		  alert("服务器正忙");			        		 
			        	  }	     
			              console.log(data.key);
			          }			          
			      });								
				deleteText.value="";
			}else if(tempdelete==0){
				 alert("其他操作没完成");
				 return;
			}
		}	
		
		
		//给导航栏添加新增输入框
		var ob=document.getElementById("ceshi");		
		
		ob.onclick=function(){
			if (tempadd==1) {
				tempupdate=0; 
				tempdelete=0;
				tempadd=0;
				alert("22");
		
				//获取页面的div
				var nav_yemian=document.getElementById("nav_yemian");
				//子节点长度	
				var nav_yemianLen = nav_yemian.children.length;
				//获取子节点的最后一个节点
				var nav_lastObj = nav_yemian.children[nav_yemianLen-1];					
				//alert(nav_yemianLen);
				var p = document.createElement("label"); // 创建一个元素节点 
					
				p.innerHTML = "<a> <input id='tempinput'></input> </a>"; 
				if (nav_yemianLen>0) {
					insertAfter(p,nav_lastObj);
					tempadd_action=1;
				}else
				{
					nav_yemian.appendchild(p);
				}								
			} else{
				alert("其他操作没完成");
				return;
			}
			
			
		};
	
		var $d;
		var msgId;
		var tempoption;
		var temp_op;
		$("#nav_yemian").on("dblclick","label",function(e){  	
			if (tempupdate==1) {
				tempadd=0; 
				tempdelete=0;	
				tempupdate=0;
				alert("222222");			
				$v = $("input[name='navbar']:checked");
				$d = $("input[name='navbar']:checked").parent();
				msgId = $v.attr("msgId");
				tempoption=$v.val();
				//jq传js
				var $p = $v.parent();
				$p.empty();
				
				var $aa = $("<a></a>");
				//创建a 和input节点
				var $input = $("<input id='tempinput'></input>");
				//p.innerHTML = "<a> <input id='tempinput'>"+$v.attr("msg")+"</input> </a>"; 
				//$p.append("<a> <input id='tempinput'>"+$v.attr("msg")+"</input> </a>")
				$input.val($v.attr("msgName"));
				$aa.append($input);
				$p.append($aa);
				//节点添加上去
				tempupdate_action=1;
			}
		});
		
		//输入的页面保存为导航栏
		$("#nav_yemian").on("change","a",function(e){  
			var tempinput=document.getElementById("tempinput");
			//得到输入的值
			var tempInputValue=tempinput.value;
			if(tempadd_action==1)
			{				
				//删除原节点
				$("#tempinput").parent().parent().remove();			
			   //获取页面的div
				var nav_yemian=document.getElementById("nav_yemian");
				//子节点长度	
				var nav_yemianLen = nav_yemian.children.length;
				//获取子节点的最后一个节点
				var nav_lastObj = nav_yemian.children[nav_yemianLen-1];					
				//alert(nav_yemianLen);
				var p = document.createElement("label"); // 创建一个元素节点 
			    p.setAttribute("class","radio-inline"); 		
				//<input type="radio" value="option2" name="navbar">女性
				//新插入页面的超链接
				var temp = nav_yemianLen+1
				var option7= "option"+temp;
					
				 $.ajax({
			          type:"post",			        
			          url:"sys/TeacherNavbar/insert.action",
			          async:false,
			          data:{
			        	  teacNavUrl:option7,
			        	  teacNavName:tempInputValue           
			          },
			          success : function(data){
			        	  var msg = data.key;
			        	  //判断是否插入成功
			        	  if(msg=="yes")
			        	  {
			        		p.innerHTML = "<input type='radio' value='"+option7+"' name='navbar' msgName='"+tempInputValue+"' msgId='"+data.teacNavId+"'>"+tempInputValue;	  
			        		insertAfter(p,nav_lastObj);
			        		
			        		tempadd_action=0;
			        		tempdelete=1;
							tempadd=1;
						    tempupdate=1; 
			        		  
			        	  }else if(msg =="no")
			        	  {
			        		  alert("insert服务器正忙");			        		 
			        	  }	     
			              console.log(data.key);
			          }
			          
			      }); 			
			}
			if(tempupdate_action==1)
			{
				$.ajax({
			          type:"post",			        
			          url:"sys/TeacherNavbar/update.action",
			          async:false,
			          data:{
			        	  teacNavId:msgId,
			        	  teacNavName:tempInputValue           
			          },
			          success : function(data){
			        	  var msg = data.key;
			        	  //判断是否插入成功
			        	  if(msg=="yes")
			        	  {
			        		$d.empty();
			  				var $input = $("<input type='radio' value='"+tempoption+
			  						"' name='navbar' msgName='"+tempInputValue+
			  						"'msgId='"+msgId+"' >");
			        		$d.append($input);
			  				$d.append(tempInputValue);
			  				tempupdate_action=0;
			  				tempdelete=1;
							tempadd=1;
						    tempupdate=1; 
			        		  
			        	  }else if(msg =="no")
			        	  {
			        		  alert("服务器正忙");			        		 
			        	  }	     
			              console.log(data.key);
			          }
			          
			      });
			}

				
			
			
		});
		
		
		

		
		
		//插入父元素的某一子元素的后面
		function insertAfter(newElement, targetElement ){ // newElement是要追加的元素 targetElement 是指定元素的位置   
		    var parent = targetElement.parentNode; // 找到指定元素的父节点   
		    if( parent.lastChild == targetElement ){ // 判断指定元素的是否是节点中的最后一个位置 如果是的话就直接使用appendChild方法   
		        parent.appendChild( newElement, targetElement );   
		    }else{   
		        parent.insertBefore( newElement, targetElement.nextSibling );   
	    };   
};  
		
	</script>
</html>

<!-- -
				 $.ajax({
			          type:"get",			        
			          url:"register_login/register.action",
			          async:false,
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
			          
			      }); -->