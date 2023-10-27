<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	// 쿠키를 만들자
    	Cookie c1 = new Cookie("name", "hong");	// Cookie(이름+값)
    	Cookie c2 = new Cookie("age", "100");	// Cookie(이름+값)
    	// 브라우저에 심자
    	// HttpServletResponse response = new HttpServletResponse(); <= 이미 생성되어있음
    	response.addCookie(c1);
    	response.addCookie(c2);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>브라우저에 쿠키 심기 완료</h3>
	<a href="쿠키보기.jsp">쿠키보기</a>
</body>
</html>