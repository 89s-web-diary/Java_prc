<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie c3 = new Cookie("ctg", "운동");
	Cookie c4 = new Cookie("sport", "축구");
	response.addCookie(c3);
	response.addCookie(c4);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>