<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

	String no = request.getParameter("no");
	BbsDAO dao = new BbsDAO();
	int res = dao.delete(Integer.parseInt(no));
	String ans = "";
	if(res == 1) ans = "삭제가 완료되었습니다";
	else ans = "등록된 게시글이 없습니다";
	// 3. 결과를 html로 만들어서 클라이언트에 전송
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="orange">

	<h4><%=ans%></h4>
	
</body>
</html>