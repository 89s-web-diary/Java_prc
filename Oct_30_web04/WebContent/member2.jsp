<%@page import="javafx.scene.control.Alert"%>
<%@page import="bin.MemberDAO"%>
<%@page import="bin.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:useBean id="bag" class="bin.MemberDTO"></jsp:useBean>
<!-- MemberDTO bag = new MemberDTO(); -->
<jsp:setProperty property="*" name="bag" />
<!-- 아래 8줄 -->
<%
	MemberDAO dao = new MemberDAO();
	int result = dao.insert(bag);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/project2.css">
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
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
			<%
				if (result == 1) {
			%>
			<h3>회원가입에 성공</h3>
			<a href="member.jsp">돌아가기</a>
			<%
				} else {
			%>
			<h3>회원가입 실패</h3>
			<%
				}
			%>
		</div>
	</div>
</body>
</html>