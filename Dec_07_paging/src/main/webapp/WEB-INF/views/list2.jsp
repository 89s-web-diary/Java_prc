<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	int pages = (int)request.getAttribute("pages");
%>
<html>
<head></head>
<body>
	<hr color="red">
	전체 게시물 수 : ${count}개 <br>
	전체 페이지 수 : ${pages}개 <br>
	<%for(int i = 1;i<=pages;i++) {%>
	<a href="list2?page=<%=i%>"><button style="background: yellow; width: 50px;"><%=i%></button></a>&nbsp;
	<%} %>
	<hr color="red">
	<table border="1" style="text-align: center">
		<tr bgcolor="lime">
			<td width="80px">행번호</td>
			<td width="100px">id</td>
			<td width="150px">제목</td>
			<td width="200px">내용</td>
			<td width="150px">작성자</td>
		</tr>
		<c:forEach items="${list}" var="vo">
			<tr>
				<td>${vo.bbs_no}</td>
				<td>${vo.id}</td>
				<td>${vo.title}</td>
				<td>${vo.content}</td>
				<td>${vo.writer}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
