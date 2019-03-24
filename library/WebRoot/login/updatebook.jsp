<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'selectbooks.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  		<s:fielderror>
  			<s:param>updateError</s:param>
  		</s:fielderror>
  		<form action="${ pageContext.request.contextPath }/update_book.action" method="post">
  			书名：<input type="text" name="bookName" value="<s:property value='updatelist[0].bookName'/>"/><br>
  			作者：<input type="text" name="bookAuthor" value="<s:property value='updatelist[0].bookAuthor'/>"/><br>
  			出版社：<input type="text" name="bookPublish" value="<s:property value='updatelist[0].bookPublish'/>"/><br>
  			书价:<input type="text" name="bookPrice" value="<s:property value='updatelist[0].bookPrice'/>"/><br>
  			<input type="submit" value="update"/>
  		</form>
  <body>
    	
  </body>
</html>
