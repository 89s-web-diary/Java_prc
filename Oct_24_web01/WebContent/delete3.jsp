<%@page import="bean.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	ProductDAO dao = new ProductDAO();
	
	int res = dao.delete(id);
	String ans = "";
	if (res == 1)
		ans = "삭제가 완료되었습니다";
	else
		ans = "등록된 상품이 없습니다";
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
</style>
</head>
<body bgcolor="violet">

	<h2><%=ans%></h2>
	<a href="index.html">
		<button style="background: lightblue">첫페이지로</button>
	</a>
	<a href="product.html">
		<button style="background: lightblue">상품정보 페이지로</button>
	</a>

</body>
</html>