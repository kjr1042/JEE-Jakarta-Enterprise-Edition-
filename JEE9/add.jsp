<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp</title>
</head>
<body>

<%!
int a =100;
int b=200;

int add()
{
	return a+b;
}
%>


<%
out.print(add());
%>
</body>
</html>