<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
/* session.setAttribute("view", (int)session.getAttribute("view")+1); */
	int view2 = (int)session.getAttribute("view");
	view2++;
	session.setAttribute("view", view2);
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="세션설정보기.jsp">세션설정보기</a>
</body>
</html>