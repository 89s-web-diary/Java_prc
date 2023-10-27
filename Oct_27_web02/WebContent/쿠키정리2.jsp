<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Cookie[] cookies = request.getCookies();
	int sum=0;
	for(Cookie c : cookies){
		if(c.getName().equals("apple")||c.getName().equals("ice")){
			sum = sum+ Integer.parseInt(c.getValue());
		}
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
사과와 아이스크림의 가격은 <%=sum %>원
</body>
</html>