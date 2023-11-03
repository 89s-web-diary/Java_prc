<%@page import="bin.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="bin.ProductDTO"></jsp:useBean>
<jsp:setProperty property="*" name="bag" />
<%
	ArrayList<ProductDTO> list = null;
	String s = "";
	if (bag.getId() != null) {
		if (session.getAttribute("basket") == null) {
			list = new ArrayList<>();
		} else {
			list = (ArrayList<ProductDTO>) session.getAttribute("basket");
		}
		list.add(bag);
		session.setAttribute("basket", list);
	} else {
		if (session.getAttribute("basket") == null) {

		} else {
			list = (ArrayList<ProductDTO>) session.getAttribute("basket");
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/project.css" rel="stylesheet">
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
			<% if (session.getAttribute("id") != null) { %>
			<%=session.getAttribute("id")%>님 환영합니다 <a href="logout.jsp"><button
					class="btn btn-outline-danger">로그아웃</button></a>
			<%}else{ %>
			<font color="black">비회원 장바구니</font>
			<a href="login.jsp"><button class="btn btn-success">로그인하기</button></a><br>
			<% } if (session.getAttribute("basket") != null) { %>
			<table class="table table-hover">
				<thead>
					<tr class="table table-info">
						<td width="150px">상품ID</td>
						<td width="150px">상품명</td>
						<td width="150px">가격</td>
						<td width="150px">주문하기</td>
					</tr>
				</thead>
				<tbody>
					<%	for (ProductDTO bag2 : list) { %>
					<tr>
						<td><%=bag2.getId()%></td>
						<td><%=bag2.getTitle()%></td>
						<td><%=bag2.getPrice()%>원</td>
						<td><button class="btn btn-warning">주문하기</button></td>
					</tr>
					<% } %>
					<tr>
						<td colspan="4">장바구니 개수 : <%=list.size()%>개 
						<button class="btn btn-danger">일괄주문하기</button>
						</td>
					</tr>
				</tbody>
			</table>
			<% }else { %>
			<font>장바구니가 비었습니다</font>
			<a href="product.jsp"><button class="btn btn-info">쇼핑하러가기</button></a>
			<% } %>			
		</div>
	</div>
</body>
</html>