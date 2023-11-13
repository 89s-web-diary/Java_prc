<%@page import="com.multi.mvc02.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	BookDTO bag = (BookDTO) request.getAttribute("bag");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>북마크 검색 결과</h2>
	ID : <%=bag.getId() %><br>
	NAME : <%=bag.getName() %><br>
	URL : <%=bag.getUrl() %><br>
	IMG : <%=bag.getImg() %><br>
	<a href="index.jsp"><button>첫 페이지로</button></a>
</body>
</html>