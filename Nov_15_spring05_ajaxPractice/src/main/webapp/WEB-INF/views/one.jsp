<%@page import="com.multi.mvc05.BbsDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	BbsDTO bag = (BbsDTO) request.getAttribute("bag");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	text-align: center;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
</head>
<body>
	<table align=center class="table table-info" style="width: 350px">
		<tr style="background: lightgray">
			<td width="100px">번호</td>
			<td width="400px">제목</td>
			<td width="100px">작성자</td>
		</tr>
		<tr>
			<td><%=bag.getId()%></td>
			<td><%=bag.getTitle()%></td>
			<td><%=bag.getWriter()%></td>
		</tr>
		<tr height="500px">	
			<td>내용</td>
			<td colspan="2"><%=bag.getContent()%></td>
		</tr>
	</table>
</body>
</html>