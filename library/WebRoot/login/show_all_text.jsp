<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show_all_text.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  		1.普通下载
    	<s:iterator value="fileItems" var="filePath">
    		<a href="<s:property value="#filePath"/>"><s:property value="#filePath"/></a><br>
    	</s:iterator>
    	Struts2下载：
	<br>
	<s:iterator value="fileItems" var="fItems">
		<a href="download?inputPath=${fItems.filePath}&contentType=${fItems.contentType}&downFileName=${fItems.fileName}">${fItems.fileName}</a><br> 
	</s:iterator>

  
 </body>
</html>
