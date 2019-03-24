<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
欢迎${sessionScope.user.usertype}${user.username}
<a href="back/bookAdd.jsp" target="bottom">添加图书信息</a>
<div>
<iframe name="bottom" width="600" height="400">

</iframe>
</div>
</body>
</html>