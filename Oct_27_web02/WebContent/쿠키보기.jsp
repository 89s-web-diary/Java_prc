<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	// 브라우저에 심어놓은 쿠키들을 한꺼번에 다 가져온다
	Cookie[] cookies = request.getCookies();
	// {cookie, cookie2, cookie3} + length(3), cookie = name + value
	String name = "";
	String value = "";
	for (Cookie c : cookies) {
		name = name + " " + c.getName();
		value = value + " " + c.getValue();
		out.print(c.getName() + " " + c.getValue() + "<br>");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	쿠키의 갯수는
	<%=cookies.length%> 개
	<br>쿠키의 이름 <%=name%><br>
	쿠키의 값은 	<%=value%><br>
	<a href="특정한쿠키지우기.jsp">특정한쿠키지우기</a>
</body>
</html>