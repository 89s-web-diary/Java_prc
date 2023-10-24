<%@page import="bean.ProductVO"%>
<%@page import="bean.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String cont = request.getParameter("cont");
	String prc = request.getParameter("price");
	int price = Integer.parseInt(prc);
	String comp = request.getParameter("comp");
	String img = request.getParameter("img");
	
	ProductDAO dao = new ProductDAO();
	ProductVO bag = new ProductVO();
	bag.setId(id);
	bag.setName(name);
	bag.setCont(cont);
	bag.setPrice(price);
	bag.setComp(comp);
	bag.setImg(img);
	dao.insert(bag);
	
	// 3. 결과를 html로 만들어서 클라이언트에 전송
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

	<h5>당신이 입력한 회원정보를 확인해주세요</h5>
	<hr color="lime">
	등록한 상품ID는  <%=id%><br>
	등록한 상품명은  <%=name%><br>
	등록한 상품설명은  <%=cont%><br>
	등록한 상품가격은 <%=price%><br>
	등록한 제조회사는 <%=comp%><br>
	등록한 상품이미지는 <%=img%><br>
	
	
</body>
</html>