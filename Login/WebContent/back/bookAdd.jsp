<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="bookAction" method="post">
书名：<input type="text" name="book.name"><br>
作者：<input type="text" name="book.author"><br>
定价：<input type="text" name="book.price"><br>
<input type="submit" value="添加">
</form>
</body>
</html>