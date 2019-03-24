<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
欢迎${sessionScope.user.usertype}${sessionScope.user.username}
<a href="back/AddBook.jsp"  target="tails">添加图书信息</a>
<a href="bookAction!updateBook">修改图书信息</a>
<a href="bookAction!queryBook">查询图书信息</a>
<a href="bookAction!deleteBook">删除图书信息</a>
<div>
<iframe name="tails" width="600" height="400"></iframe>
</div>
</body>
</html>