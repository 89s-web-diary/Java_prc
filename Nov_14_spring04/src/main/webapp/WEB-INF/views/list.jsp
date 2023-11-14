<%@page import="com.multi.mvc04.MovieDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	List<MovieDTO> list = (List<MovieDTO>) request.getAttribute("list");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	text-align: center;
}
</style>
</head>
<body>

	<h2>현재 상영작</h2>
	<table border="1" style="text-align: center" align="center">
		<tr>
			<td width="200">포스터</td>
			<td width="200">제목</td>
			<td width="200">평점</td>
			<td width="200">개봉일</td>
		</tr>
		<%
			for (MovieDTO bag : list) {
		%>
		<tr>
			<td><img src="resources/img/<%=bag.getImg()%>"></td>
			<td><a href="one?title=<%=bag.getTitle()%>"><%=bag.getTitle()%></a></td>
			<td><%=bag.getRate()%></td>
			<td><%=bag.getDate()%></td>
		</tr>
		<%
			}
		%>
	</table>
	<a href="index.jsp"><button>돌아가기</button></a>
</body>
</html>