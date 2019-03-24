<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
 <form action="Cal" method="post">
        
运算数：<input type="text"name="num1" value="${sessionScope.num1 }"><br>
运算符：
<input type="radio" name="op" value="+" ${sessionScope.op == "+"?"checked":""} >+
<input type="radio" name="op" value="-" ${sessionScope.op == "-"?"checked":""} >-
<input type="radio" name="op" value="*" ${sessionScope.op == "*"?"checked":""} >*
<input type="radio" name="op" value="/" ${sessionScope.op == "/"?"checked":""} >/<br>
运算数：<input type="text" name="num2" value="${sessionScope.num2 }"><br>
<input type="submit" name="submit" value="提交"><br>
结果：<input type="text" name="result" value="${sessionScope.result }">
</form>

</body>
</html>