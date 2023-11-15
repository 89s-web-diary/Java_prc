<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "login",
				data : {
					id : $('#id').val(),
					pw : $('#pw').val()
				},
				success : function(x) {
					$('#d1').html(x)
				}
			})
		})
	})

	$(function() {
		$('#b2').click(function() {
			$.ajax({
				url : "insert",
				data : {
					id : $('#id2').val(),
					pw : $('#pw2').val(),
					name : $('#name').val(),
					tel : $('#tel').val()
				},
				success : function(x) {
					alert(x)
				}
			})
		})
	})
</script>
<style type="text/css">
* {
	text-align: center;
}
</style>
</head>
<body>
	<%
		if (session.getAttribute("id") == null) {
	%>
	<h2>로그인하기</h2>
	<table align=center class="table table-success" style="width: 500px">
		<tr>
			<td width="200px">아이디</td>
			<td><input id="id"></td>
		</tr>
		<tr>
			<td width="200px">비밀번호</td>
			<td><input id="pw"></td>
		</tr>
		<tr>
			<td colspan=2>
				<button class="btn btn-success" id="b1">로그인</button>
			</td>
		</tr>
	</table>
	<div id="d1"></div>

	<h2>회원가입하기</h2>
	<table align=center class="table table-striped" style="width: 500px">
		<tr>
			<td width="200px">아이디</td>
			<td><input id="id2"></td>
		</tr>
		<tr>
			<td width="200px">비밀번호</td>
			<td><input id="pw2"></td>
		</tr>
		<tr>
			<td width="200px">이름</td>
			<td><input id="name"></td>
		</tr>
		<tr>
			<td width="200px">전화번호</td>
			<td><input id="tel"></td>
		</tr>
		<tr>
			<td colspan=2><button class="btn btn-info" id="b2">회원가입</button></td>
		</tr>
	</table>
	<div id="d2"></div>
	<%
		} else {
	response.sendRedirect("bbs.jsp");
	%>
	<%-- <span class="alert alert-success"><%=session.getAttribute("id")%>님
		환영합니다.</span>
	<a href="logout.jsp"><button class="btn btn-danger">로그아웃</button></a> --%>
	<%
		}
	%>
</body>
</html>