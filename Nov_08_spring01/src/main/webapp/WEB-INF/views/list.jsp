<%@page import="java.util.ArrayList"%>
<%@page import="com.multi.mvc01.BbsDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<%
//컨트롤러에서 모델로 지정한 것 request.getAttribute("모델이름");
	ArrayList<BbsDTO> list = (ArrayList<BbsDTO>)request.getAttribute("list"); 
	//작 = (작)큰;
	for(BbsDTO bag: list){
%>
		게시판 id <%= bag.getId() %> <br>
		<a href="one?id=<%= bag.getId() %>">게시판 title <%= bag.getTitle() %></a>
		<br>
		게시판 writer <%= bag.getWriter() %> <br>
		<hr color="red">
<% } %>
<hr color="blue">
<c:forEach items="${list}" var="bag">
		게시판 id ${bag.id} <br>
		<a href="one?id=${bag.id}">게시판 title ${bag.title}</a>
		<br>
		게시판 writer <c:if test="${bag.writer == 'apple'}">사과</c:if><br>
		<hr color="red">
</c:forEach>
</body>
</html>