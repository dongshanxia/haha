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
	
	
	window.location.href = "${proPath}/app/teac_home.action";
	 
	 
	</script>
  </head>
  
  <body>
   <a href="${proPath}/app/teac_home.action">前台</a>
   <a href="${proPath}/sys/teac_home.action">后台</a>
   
   <!-- <jsp : forward page = "${proPath}/Myjsp.jsp" />   -->  
  </body>
</html>
