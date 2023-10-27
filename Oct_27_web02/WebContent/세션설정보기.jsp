<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int view = (int)session.getAttribute("view");
	// 들어갈 때 value가 object타입으로 들어갔음 ==> 꺼낼때 object로 꺼내짐
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
저장된 세션값은 <%=view%>
</body>
</html>