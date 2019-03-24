<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<s:fielderror escape="false"></s:fielderror>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function login(){
	targetForm=document.forms[0];
	targetForm.action="loginAction!LoginMethod";
	targetForm.submit();
}
function regist(){
	targetForm=document.forms[0];
	targetForm.action="registAction!RegistMethod";
	targetForm.submit();
	
}
</script>
</head>
<body>
<form action="LoginAction" method="post">
用户名：<input type="text" name="username"><br>
密码：<input type="text" name="password"><br>
用户类型：<select name="usertype">
         <option>管理员</option>
         <option>普通用户</option>
         </select><br>
<input type="button" value="登录" onclick="login()">
<input type="button" value="注册" onclick="regist()">
</form>
</body>
</html>