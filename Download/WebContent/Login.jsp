<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="loginAction" method="post">
<s:fielderror escape="false"></s:fielderror>
<s:actionerror/>
用户名<input type="text" name="username"><br>
密码<input type="password" name="password"><br>
用户类型<select name="usertype">
<option>管理员</option>
<option>普通用户</option>
</select><br>
<input type="submit" value="提交">
</form>
</body>
</html>