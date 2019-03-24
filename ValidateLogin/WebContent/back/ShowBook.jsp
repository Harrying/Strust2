<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="java.util.*,com.opensymphony.xwork2.util.*,nuc.sw.service.*,nuc.sw.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%ValueStack vs=(ValueStack)request.getAttribute("struts.valueStack");
  BookService bs=(BookService)vs.findValue("bookService");
  List<Book> books=bs.getBookList();
  Iterator<Book> iter=books.iterator();  
%>
<table>
<caption>全部图书信息</caption>
<tr>
<td>书名</td><td>作者</td><td>定价</td>
</tr>
<%while(iter.hasNext()){
	Book book=iter.next();
	//pageContext.setAttribute("book",iter.next());%>
<tr>
<td><%=book.getBookName() %></td>
<td><%=book.getBookAuthor() %></td>
<td><%=book.getBookPrice() %></td>
</tr><%}%>
</table>

</body>
</html>