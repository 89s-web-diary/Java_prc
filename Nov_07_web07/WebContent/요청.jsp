<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="hi?q=car">Get요청</a><br>
	<!-- a태그는 무조건 get요청, 단순한 요청 -->
	<form action="hi" method="post">
		<!-- Form태그는 Get/Post 선택 가능 -->
		<!-- 기본값은 get -->
		id : <input name="id" value="apple"><br>
		pw : <input name="pw" value="1234"><br>
		<button>서버로 제출</button>
	</form>
</body>
</html>