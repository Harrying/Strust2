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
    
    <title>My JSP 'addBookText.jsp' starting page</title>
    
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
  <s:fielderror></s:fielderror>
  <form action="${pageContext.request.contextPath }/addBookText.action" method="post" enctype="multipart/form-data">
	   	<table>
	   	<tr>
		   	<td>
		   		<label>文件名称</label>
		   	</td>
		   	<td>
		   		<input type="text" name="title"/>
		   	</td>
		</tr>
		<tr>
			<td>
		   		<label>文本1添加</label>
		   	</td>
		   	<td>
		   		<input type="file" name="upload"/>
		   	</td>
		 </tr> 
		 <tr>
		   	<td>
		   		<label>文本2添加</label>
		   	</td>
		   	<td>	
		   		<input type="file" name="upload"/>
		   	</td>
		 </tr>
		 <tr>
			 <td>
			   	<label>文本3添加</label>
			 </td>
			 <td>
			 	<input type="file" name="upload"/>
			 </td>
		 </tr>
		 <tr>
		 	<td colspan="2">
		   		<input type="submit" value="确认上传"/>
		   	</td>
		 </tr>
	   	</table>
   	</form>
  </body>
</html>
