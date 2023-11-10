<%@page import="com.multi.mvc01.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	ArrayList<ProductDTO> list = (ArrayList<ProductDTO>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	img{
		width: 100px;
		height: 80px;
	}
</style>
</head>
<body>
	<h2>상품 전체 정보 페이지입니다</h2>
	<table style="text-align: center" border="1">
		<thead>
			<tr>
				<td width="200">상품ID</td>
				<td width="200">상품명</td>
				<td width="200">상품가격</td>
				<td width="200">상품이미지</td>
			</tr>
		</thead>
		<tbody>
			<%	for (ProductDTO bag : list) {	%>
			<tr>
				<td><%=bag.getId()%></td>
				<td><a href="one2?id=<%=bag.getId()%>"><%=bag.getTitle()%></a></td>
				<td><%=bag.getPrice()%>원</td>
				<td><img src="resources/img/<%=bag.getImg()%>"></td>
			</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>