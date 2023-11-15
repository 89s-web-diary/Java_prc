<%@page import="com.multi.mvc05.BbsDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% List<BbsDTO> list = (List<BbsDTO>)request.getAttribute("list"); %>
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
	<h2>게시판 페이지</h2>
	<br>
	<span class="alert alert-success"><%=session.getAttribute("id")%>님
		환영합니다.</span>
	<a href="logout.jsp"><button class="btn btn-danger">로그아웃</button></a><br><br>
	<table align=center class="table table-info" style="width: 350px">
		<tr style="">
			<td width="50px">번호</td>
			<td width="200px">제목</td>
			<td width="100px">작성자</td>
		</tr>
		<% for(BbsDTO bag : list){ %>
		<tr>
			<td><%=bag.getId() %></td>
			<td><a href="one?title=<%=bag.getTitle()%>"><%=bag.getTitle() %></a></td>
			<td><%=bag.getWriter() %></td>
		</tr>
		<% } %>
	</table>
</body>
</html>