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
     <link rel="stylesheet" type="text/css" href="css/my.css"/>
     
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" />	
	<link rel="stylesheet" href="lib/jquery-ui.min.css" />
	<link rel="stylesheet" href="css/lobipanel.min.css" />
	
	
	<script type="text/javascript" src="lib/jquery.1.11.min.js"></script>
	<script type="text/javascript" src="lib/jquery-ui.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js" ></script>
	<script type="text/javascript" src="js/lobipanel.min.js"></script>
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
					<div class="panel panel-default lobipanel mypanel" data-sortable="true">
							<div class="panel-heading">
								<div class="panel-title">
									<h4>Panel title</h4>
								</div>
							</div>
							<div class="panel-body">
								<a href="https://www.baidu.com">aaa</a>
							</div>
						</div>
				</div>
					
		</div>
		
		<div class="col-md-6">
			
			<div class="top" id="teac_top">
				
			</div>
			
			
		<div>

		<nav class = "navbar navbar-default" role = "navigation">        
	        <div>  
	            <ul class="nav navbar-nav" id="nav_yemian">  
	               <li ><a href="app/teac_home.action" >个人信息</a></li> 
	               <li ><a href="app/teac_kxyj.action" >科学研究</a></li> 
	               <li ><a href="app/teac_lwzz.action" >论文专著</a></li> 
	               <li ><a href="app/teac_kytd.action" >科研团队</a></li> 
	            </ul>      
	        </div>  
	   </nav>
	   
	</div>		
	  
		
					
				<div class="">

					<div class="row">

						<div class="col-md-4" id="xinxitianjiazuo">
													
						</div>
						<div class="col-md-8" id="xinxitianjiayou">
							
							
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
				<div class="top" >
				
				</div>
				<div>
					<label onclick="ceshi()" id="ceshi">添加页面</label>
				</div>
				<div>
					<input type="text" id="deleteText">请输入要删除的页面的值</input>
				</div>
				<div>
					<label onclick="ye_delete()" id="ye_delete">删除页面</label>
				</div>
			</div>

		</div>

	</body>
	<script>
		
		
		
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
			$('.mypanel').lobiPanel({
				// 配置参数
				//...
				close: { 
					icon: 'glyphicon glyphicon-remove', 
					tooltip: 'Close2' 
				},
				editTitle: { 
					icon: 'glyphicon glyphicon-pencil', 
					icon2: 'glyphicon glyphicon-floppy-disk', 
					tooltip: '编辑标题' 
				},
				minimize: {
					icon: 'glyphicon glyphicon-minus',
					icon2: 'glyphicon glyphicon-plus',
					tooltip: '最大化或最小化'
				},
				unpin:false,
				expand:false,
				changeStyle:false,
				reload:false
			});  
	    };   
		
		
		
		
		
		
		
		
		//需要删除页面的值
		var deleteText=document.getElementById("deleteText");		
		var ye_delete=document.getElementById("ye_delete");		
		ye_delete.onclick=function(){	
			//获取页面的div
			var nav_yemian=document.getElementById("nav_yemian");
			//获取要删除页面的div
			var nav_devObj = nav_yemian.children[deleteText.value-1];	
			nav_yemian.removeChild(nav_devObj);
			
			deleteText.value="";
		}	
		
		
		//给导航栏添加新增输入框
		var ob=document.getElementById("ceshi");		
		var tempnav=1;
		ob.onclick=function(){
			if (tempnav>0) {
				alert("22");
				//防止再次进入
				tempnav=-1;
				//获取页面的div
				var nav_yemian=document.getElementById("nav_yemian");
				//子节点长度	
				var nav_yemianLen = nav_yemian.children.length;
				//获取子节点的最后一个节点
				var nav_lastObj = nav_yemian.children[nav_yemianLen-1];					
				//alert(nav_yemianLen);
				var p = document.createElement("li"); // 创建一个元素节点 
					
				p.innerHTML = "<a> <input id='tempinput'></input> </a>";  
				insertAfter(p,nav_lastObj);
				
			} else{
				alert("请先输入要加入导航头");
				return;
			}
			
			
		};
		
		//输入的页面保存为导航栏
		$("#nav_yemian").on("change","li input",function(e){  
			if (tempnav<0) {
				var tempinput=document.getElementById("tempinput");
				//得到输入的值
				var tempInputValue=tempinput.value;
				
				//删除原节点
				
				$("#tempinput").parent().parent().remove();
				
			   //获取页面的div
				var nav_yemian=document.getElementById("nav_yemian");
				//子节点长度	
				var nav_yemianLen = nav_yemian.children.length;
				//获取子节点的最后一个节点
				var nav_lastObj = nav_yemian.children[nav_yemianLen-1];					
				//alert(nav_yemianLen);
				var p = document.createElement("li"); // 创建一个元素节点 
						
						
				//新插入页面的超链接		
				p.innerHTML = "<a href='app/teac_kytd.action' >"+tempInputValue+"</a>";			
				insertAfter(p,nav_lastObj);
				
				tempnav=1;
			} else{
				alert("请先输入要加入导航头");
				return;
			}
			
		
		});
		
		
		

		
		
		
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