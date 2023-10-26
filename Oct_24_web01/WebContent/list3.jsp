<%@page import="bean.ProductVO"%>
<%@page import="bean.ProductDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	ArrayList<ProductVO> list = new ArrayList<ProductVO>();
	ProductDAO dao = new ProductDAO();
	list = dao.list();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	text-align: center;
}

.top {
	/* 클래스 중 left에 해당하는 것만 style 지정 */
	background: yellow;
	font-size: 20px;
	width: 150px;
}
#contt{
	width: 200px;
}
.data {
	background: white;
	font-size: 15px;
}
img {
	width: 100px;
	height: 100px;
}
</style>
</head>
<body bgcolor="violet">

	<h2>전체 상품정보 페이지</h2>
	<hr>
	<a href="index.html">
		<button style="background: lightblue">첫페이지로</button>
	</a>
	<a href="product.html">
		<button style="background: lightblue">상품정보 페이지로</button>
	</a>
	<table border="1" align="center">
		<tr>
			<td class="top">상품번호</td>
			<td class="top">이름</td>
			<td class="top">가격</td>
			<td class="top">이미지</td>
		</tr>
		<%
			for(ProductVO bag : list) {
		%>
		<tr>
			<td class="data"><%=bag.getId()%></td>
			<td class="data"><a href="one3.jsp?id=<%=bag.getId()%>"><%=bag.getName()%></a></td>
			<td class="data"><%=bag.getPrice()%></td>
			<td class="data"><img src="img/<%=bag.getImg()%>"></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>