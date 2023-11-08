<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/project.css">
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
			<h3>회원화면</h3>
			<!-- 로그인 구현 -->
			<% if (session.getAttribute("id") == null) { %>
			<form action="login">
				<table border="1" bordercolor='red' class="table table-striped">
					<tr>
						<td>아이디</td>
						<td><input type="text" name="id" class="form-control"></td>
					</tr>
					<tr>
						<td>패스워드</td>
						<td><input type="text" name="pw" class="form-control"></td>
					</tr>
					<tr>
						<td colspan="2">
							<button type="submit" class="btn btn-warning"
								style="width: 250px;">로그인처리</button>
						</td>
					</tr>
				</table>
 			</form>
 			<form action="insert">
				<table border="1" bordercolor='red' class="table table-dark">
					<tr>
						<td>아이디</td>
						<td><input type="text" name="id" class="form-control"></td>
					</tr>
					<tr>
						<td>패스워드</td>
						<td><input type="text" name="pw" class="form-control"></td>
					</tr>
					<tr>
						<td>이름</td>
						<td><input type="text" name="name" class="form-control"></td>
					</tr>
					<tr>
						<td>전화번호</td>
						<td><input type="text" name="tel" class="form-control"></td>
					</tr>
					<tr>
						<td colspan="2">
							<button type="submit" style="width: 250px;"
								class="btn btn-warning">회원가입처리</button>
						</td>
					</tr>
				</table>
			</form>
			<% } else { %>
			<!-- 로그인이 되었을 때 코드 -->
			<br>
			<span class="alert alert-success"><%=session.getAttribute("id")%>님 환영합니다.</span>
			<a href="logout.jsp"><button class="btn btn-danger">로그아웃</button></a>
			<% } %>
			
			<!-- 회원가입 구현 -->
		</div>
	</div>
</body>
</html>