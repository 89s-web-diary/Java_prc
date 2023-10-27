<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = (String)session.getAttribute("name");
	int age = (int)session.getAttribute("age");
%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=name%> / ${name}<br>
<%=age%> / ${age}<br>
내년나이는 <%=age+1%>입니다
<!-- 속성값만 꺼내 쓸 때는 ${지정한 이름} 을 이용하면 편하게 꺼내서 쓸 수 있다. -->
 
</body>
</html>