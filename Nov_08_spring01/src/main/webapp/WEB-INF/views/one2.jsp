<%@page import="com.multi.mvc01.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	ProductDTO bag = (ProductDTO) request.getAttribute("bag");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
img {
	width: 300px;
	height: 300px;
}
</style>
</head>
<body>
	<table border="1" , style="text-align: center">
		<tr>
			<td rowspan="5"><img src="resources/img/<%=bag.getImg()%>"></td>
			<td>상품ID : <%=bag.getId()%>
			</td>
		</tr>
		<tr>
			<td>상품명 : <%=bag.getTitle()%></td>
		</tr>
		<tr>
			<td>상품정보 : <%=bag.getContent()%></td>
		</tr>
		<tr>
			<td>상품가격 : <%=bag.getPrice()%></td>
		</tr>
		<tr>
			<td>제조회사 : <%=bag.getCompany()%></td>
		</tr>
		<tr>
			<td colspan="2"><a href="list2"><button style="background: lime">돌아가기</button></a></td>
		</tr>
	</table>
</body>
</html>