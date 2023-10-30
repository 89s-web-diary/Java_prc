<%@page import="bin.ProductDTO"%>
<%@page import="bin.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="bin.ProductDTO"></jsp:useBean>
<jsp:setProperty property="id" name="bag" />
<%
	ProductDAO dao = new ProductDAO();
	ProductDTO bag2 = dao.one(bag);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/project.css" rel="stylesheet">
<style>
span{
	font-size: 18px;
}
</style>
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
			<!-- 액션태그 -->
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
			<button class="btn btn-success">상품상세정보</button>
			<br>
			<table border=1 class = "table table-bordered">
				<tr>
					<td rowspan="5"><img alt="none" src="img/<%=bag2.getImg()%>"></td>
					<td><span class="alert alert-danger">상품아이디 : <%=bag2.getId()%></span>
				</tr>
				<tr>
					<td><span class="alert alert-danger">상품명 : <%=bag2.getTitle()%></span>
				</tr>
				<tr>
					<td><span class="alert alert-success">상품설명 : <%=bag2.getContent()%></span>
				</tr>
				<tr>
					<td><span class="alert alert-success">상품가격 : <%=bag2.getPrice()%></span>
				</tr>
				<tr>
					<td><span class="alert alert-success">상품회사 : <%=bag2.getCompany()%></span>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>