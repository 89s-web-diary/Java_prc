<%@page import="com.multi.mvc04.MovieDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	MovieDTO bag = (MovieDTO) request.getAttribute("bag");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
*{
	align-content: center;
	align-items: center;
	text-align: center;
}
</style>
</head>
<body>

	<h2><%=bag.getTitle() %> 상영 정보</h2>
	<table border="1" style="text-align: center" align="center">
		<tr>
			<td rowspan=4 width="200"><img width="370" height="550" src="resources/img/<%=bag.getImg()%>"></td>
			<td width="200"><%=bag.getTitle() %></td>
		</tr>
		<tr>
			<td>평점 : <%=bag.getRate() %></td>
		</tr>
		<tr>
			<td>개봉일<br><%=bag.getDate() %></td>
		</tr>
	</table>
	<a href="list"><button style="background: lightblue">목록 돌아가기</button></a>
	<a href="index.jsp"><button style="background: lime">첫화면으로 가기</button></a>

</body>
</html>