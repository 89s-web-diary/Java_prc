<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	// db에 저장된 id와 pw를 임의로 설정
	String id2 = "apple";
	String pw2 = "1234";
	// 로그인 성공한 경우 id를 세션으로 설정
	// id가 세션으로 설정되어있으면 로그인 성공이라고 판단
	if (id.equals(id2) && pw.equals(pw2)) {
		session.setAttribute("id", id2);
		out.print("로그인 성공<br>");
		out.print("<script>alert('로그인성공')</script>");
	}else{
		out.print("<a href =네이버로그인.jsp>로그인이 필요합니다</a><br>");
		session.setAttribute("id", null);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="news.jsp">뉴스로 링크</a>
	<a href="mail.jsp">메일로 링크</a>
	<a href="shopping.jsp">쇼핑으로 링크</a>
</body>
</html>