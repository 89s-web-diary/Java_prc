<%@page import="com.multi.mvc01.BbsDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	ArrayList<BbsDTO> list = (ArrayList<BbsDTO>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<thead>
			<tr>
				<td width="200">ID</td>
				<td width="200">제목</td>
				<td width="200">작성자</td>
			</tr>
		</thead>
		<tbody>
			<% for (BbsDTO bag : list) { %>
			<tr>
				<td><%=bag.getId()%></td>
				<td><a href="one?id=<%=bag.getId() %>"><%=bag.getTitle()%></a></td>
				<td><%=bag.getWriter()%></td>
			</tr>
			<% } %>
		</tbody>
	</table>

</body>
</html>