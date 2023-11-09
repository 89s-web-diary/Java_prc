<%@page import="com.multi.mvc01.BbsDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	BbsDTO bag = (BbsDTO)request.getAttribute("bag");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

게시판 id <%=bag.getId() %><br>
게시판 title <%=bag.getTitle() %><br>
게시판 content <%=bag.getContent() %><br>
게시판 writer <%=bag.getWriter() %><br>

</body>
</html>