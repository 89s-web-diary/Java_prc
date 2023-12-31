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
			<br>
			<table border=1 class = "table table-hover">
			<thead>
				<tr class = "table table-success">
					<td colspan="2"><%=bag2.getWriter()%>님이 작성함
				</tr>
			</thead>
				<tr>
					<td width="200">제목</td>
					<td width="300"><%=bag2.getTitle()%>
				</tr>
				<tr>
					<td width="200">내용</td>
					<td width="300"><%=bag2.getContent()%></td>
				</tr>
				<tr>
					<td width="200">작성자</td>
					<td width="300"><%=bag2.getWriter()%></td>
				</tr>
			</table>
			<a href="bbs.jsp"><button class="btn btn-info">리스트로</button></a>
			<% if(session.getAttribute("id")!=null) {
				if(session.getAttribute("id").equals(bag2.getWriter())) { %>
			<a href="update.jsp?id=<%=bag2.getId()%>"><button class="btn btn-warning">수정하기</button></a>
			<a href="delete.jsp?id=<%=bag2.getId()%>"><button class="btn btn-danger">삭제하기</button></a>
			<% }} %>
		</div>
	</div>
</body>
</html>