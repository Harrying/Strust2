<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function login(){
	targetForm=document.forms[0];
	targetForm.action="loginAction";
	targetForm.submit();
}
function regist(){
	targetForm=document.forms[0];
	targetForm.action="registAction";
	targetForm.submit();
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:fielderror escape="false"></s:fielderror>
<form action="action!methodName" method="post">
用户名<input type="text" name="username"><br>
密码<input type="password" name="password"><br>
用户类型<select name="usertype">
<option>管理员</option>
<option>普通用户</option>
</select>
<input type="button" value="登录" onclick="login();" >
<input type="button" value="注册" onclick="regist();" >
</form>
</body>
</html>