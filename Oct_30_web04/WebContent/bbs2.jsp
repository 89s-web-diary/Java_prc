<%@page import="bin.BbsDTO"%>
<%@page import="bin.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:useBean id="bag" class="bin.BbsDTO"></jsp:useBean>
<jsp:setProperty property="id" name="bag" />
<%
	BbsDAO dao = new BbsDAO();
	BbsDTO bag2 = dao.one(bag);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/project.css" rel="stylesheet">
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
			<!-- 액션태그 -->
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
			<% if (session.getAttribute("id") != null) { %>
			<%=session.getAttribute("id")%>님 환영합니다.
			<% } %>
			<br>
			<table border=1 class = "table table-hover">
			<thead>
				<tr class = "table table-success">
					<td colspan="2"><%=bag2.getWriter()%>님이 작성함
				</tr>
			</thead>
				<tr>
					<td>제목</td>
					<td><%=bag2.getTitle()%>
				</tr>
				<tr>
					<td>내용</td>
					<td><textarea rows="4" cols="25"><%=bag2.getContent()%></textarea> </td>
				</tr>
				<tr>
					<td>작성자</td>
					<td><%=bag2.getWriter()%></td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>