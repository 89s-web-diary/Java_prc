<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

	String id = request.getParameter("id");

	MemberDAO dao = new MemberDAO();	// 객체생성 시 자동완성기능 이용
	int res = dao.delete(id);
	String ans = "";
	if(res == 1) ans = "탈퇴처리가 완료되었습니다";
	else ans = "등록된 아이디가 없습니다";
	// 3. 결과를 html로 만들어서 클라이언트에 전송
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="red">

	<h4><%=ans%></h4>
	
</body>
</html>