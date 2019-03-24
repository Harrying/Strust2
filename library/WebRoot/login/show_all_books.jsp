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
    
    <title>My JSP 'show_all_books.jsp' starting page</title>
    
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
  <s:debug></s:debug>
    <table border="1">
    	<tr>
    		<td colspan="5">
    			<form action="${pageContext.request.contextPath }/selectbook.action" method="post">
    				bookName:<input type="text" name="bookName"/><input type="submit" value="select"/>
    				<s:fielderror>
    					<s:param>selectError</s:param>
    				</s:fielderror>
    			</form>
    		</td>
    		<td><a href="login/addbooks.jsp">添加</a></td>
    	</tr>
    	<tr>
    		<!-- <th>是否为偶数</th> -->
    		<th>书名</th>
    		<th>作者</th>
    		<th>出版社</th>
    		<th>书价</th>
    		<th colspan="2">操作</th>
    	</tr>
    	<s:iterator var="b" value="list" status="l">
    			<s:if test='#l.odd == true'>
    		<tr style="background:red">
    			<%-- <td><s:property value="#l.odd"/></td> --%>
    			<td><s:property value="bookName"/></td>
    			<td><s:property value="bookAuthor"/></td>
    			<td><s:property value="bookPublish"/></td>
    			<td><s:property value="bookPrice"/></td>
    			<td><a href="${ pageContext.request.contextPath }/update_select_book.action?bookName=${bookName}">修改</a></td>
    			<td><a href="${ pageContext.request.contextPath }/delete_book.action?bookName=${bookName}">删除</a></td>
    			
    			<s:fielderror>
    				<s:param>deleteError</s:param>
    				<s:param>deleteSuccess</s:param>
    			</s:fielderror>
    		</tr>
    		</s:if>
    		<s:else>
    			<tr style="background:blue">
    			<%-- <td><s:property value="#l.odd"/></td> --%>
    			<td><s:property value="bookName"/></td>
    			<td><s:property value="bookAuthor"/></td>
    			<td><s:property value="bookPublish"/></td>
    			<td><s:property value="bookPrice"/></td>
    			<td><a href="${ pageContext.request.contextPath }/update_select_book.action?bookName=${bookName}">修改</a></td>
    			<td><a href="${ pageContext.request.contextPath }/delete_book.action?bookName=${bookName}">删除</a></td>
    			
    			<s:fielderror>
    				<s:param>deleteError</s:param>
    				<s:param>deleteSuccess</s:param>
    			</s:fielderror>
    		</tr>
    		</s:else>
    	</s:iterator>
    </table>
  </body>
</html>
