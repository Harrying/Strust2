<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,com.opensymphony.xwork2.util.*,nuc.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
ValueStack vs=(ValueStack)request.getAttribute("struts.valueStack");
BookService bs=(BookService)vs.findValue("bookService");
List<Book> books=bs.getBooklist();
Iterator<Book> iter=books.iterator();
%>
<table border="1">
<caption>图书信息</caption>
<tr>
<td>书名</td> 
<td>作者</td>
<td>价格</td>
</tr>
<%
while(iter.hasNext()){
	Book book=iter.next();
%>
<tr>
<td><%=book.getName()%></td>
<td><%=book.getAuthor()%></td>
<td><%=book.getPrice()%></td>
</tr>
<%}
%>
</table>
</body>
</html>