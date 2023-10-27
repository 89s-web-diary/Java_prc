<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>로그인 화면입니다</h3>
	<form action="로그인세션설정.jsp" method="post">		<!-- method = "post" 주소창에 정보 안남음 -->
		아이디 : <input name="id" value="apple"><br>
		패스워드 : <input name="pw" value="1234"><br>
		<button type="submit">로그인 요청</button>
	</form>

</body>
</html>