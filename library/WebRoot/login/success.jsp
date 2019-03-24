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
    
    <title>My JSP 'success.jsp' starting page</title>
    
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
    <a href="login/addbooks.jsp" target="frame">添加书籍</a>
    <a href="${pageContext.request.contextPath }/select_books.action" target="frame">删除书籍</a>
    <a href="${pageContext.request.contextPath }/select_books.action" target="frame">修改书籍</a>
    <a href="${pageContext.request.contextPath }/select_books.action" target="frame">查询书籍</a><br/>
    <iframe name="frame" style="height:100%;width:50%">
    	<s:fielderror>
    		<s:param>error1</s:param>
    	</s:fielderror>
    </iframe>
  </body>
</html>
