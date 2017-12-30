<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@include file="/common/common.jspf"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	
	
	<script language="JavaScript">
	
	//
	
	//$(document).ready(function(){
	//	$("div").html("<b>我是重新设置后的内容</b>"); 
	//})
	window.onload = function(){		
	　　$("div").html("<b>我是重新设置后的内容</b>"); 
	}
	 
	 
	</script>
	
	<style type="text/css">
	
	
	#red2 {
	 	width:100%;
	 	height:100%;  	  
		 background-color: gray;
		 
		  background-image:url(${basePath}img/top.png);
		 /*
		  background-repeat:no-repeat;
		  background-attachment:fixed;
		 */
  } 
	}
	</style>
	
	
  </head>
  
  <body>
   <div id="red2"></div>
  <!--  <img alt="" src="${basePath}img/top.png"> --> 
   <!-- <jsp : forward page = "${proPath}/Myjsp.jsp" />   -->  
  </body>
</html>
