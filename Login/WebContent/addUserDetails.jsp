<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="userDetailsAction" method="post">
<s:textfield label="用户名" name="username" value="%{#session.user.username}"></s:textfield><br>
<s:textfield label="年龄" name="age"></s:textfield><br>
<s:textfield label="移动电话" name="phone"></s:textfield><br>
<s:textfield label="邮箱" name="email"></s:textfield><br>
<s:submit value="提交"></s:submit>
</form>

</body>
</html>