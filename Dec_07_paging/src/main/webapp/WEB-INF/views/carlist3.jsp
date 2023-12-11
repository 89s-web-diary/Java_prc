<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	int pages = (int)request.getAttribute("pages");
%>
<html>
<head>
</head>
<body>
	<hr color="red">
	전체 게시물 수 : ${count}개 <br>
	전체 페이지 수 : ${pages}개 <br>
	<%for(int i = 1;i<=pages;i++) {%>
	<a href="carlist3?page=<%=i%>"><button class="pages" style="background: yellow; width: 50px;"><%=i%></button></a>&nbsp;
	<%} %>
	<hr color="red">
	<div id="d1">
		<table border="1" style="text-align: center">
			<tr bgcolor="lime">
				<td width="80px">행번호</td>
				<td width="80px">id</td>
				<td width="300px">email</td>
				<td width="180px">car</td>
			</tr>
			<c:forEach items="${list}" var="vo">
				<tr>
					<td>${vo.car_no}</td>
					<td>${vo.id}</td>
					<td>${vo.email}</td>
					<td>${vo.car}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
