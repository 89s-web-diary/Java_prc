<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<br>
	<br>
	<span class="alert alert-success"><%=session.getAttribute("id")%>님
		환영합니다.</span>
	<a href="logout.jsp"><button class="btn btn-danger">로그아웃</button></a>
	<br>
	<br>
	<a href="list"><button class="btn btn-wanring">게시판 목록 보기</button></a>
	<br>

</body>
</html>