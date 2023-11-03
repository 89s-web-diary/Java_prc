<%@page import="bin.MemberDAO"%>
<%@page import="bin.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	session.setAttribute("id", null);
	session.setAttribute("basket", null);
	response.sendRedirect("member.jsp");
	// 서버가 클라이언트(브라우저)에게 member.jsp를 요청하라고 명령
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