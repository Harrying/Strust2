<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form  action="bookAddAction" method="post">
    书名:  <input name="book.bookName" type="text"><br>
    作者:<input name="book.bookAuthor" type="text"><br>
     单价：<input name="book.bookPrice" type="text"><br>
     <input  type="submit"  value="添加">
     </form>
</body>
</html>