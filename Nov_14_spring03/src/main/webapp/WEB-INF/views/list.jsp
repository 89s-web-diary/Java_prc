<%@page import="com.multi.mvc03.BookDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	List<BookDTO> list = (List<BookDTO>) request.getAttribute("list");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lime">

	<h2>결과 페이지입니다</h2>
	<table border="1" style="text-align: center">
		<tr>
			<td width="200">ID</td>
			<td width="200">NAME</td>
			<td width="200">URL</td>
			<td width="200">IMG</td>
		</tr>
		<% for (BookDTO bag : list) { %>
		<tr>
			<td><%=bag.getId() %></td>
			<td><%=bag.getName() %></td>
			<td><%=bag.getUrl() %></td>
			<td><%=bag.getImg() %></td>
		</tr>
		<% } %>
	</table>

</body>
</html>