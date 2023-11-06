<%@page import="bean.CarDAO"%><%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// 1. 브라우저로부터 넘어온 데이터를 받아 DTO를 만들어서 넣어준다  ==> 액션태그 이용
// 2. DAO 객체 생성해서 DTO를 주면서 insert(DTO)요청
%>
<jsp:useBean id="bag" class="bean.CarDTO"></jsp:useBean>
<jsp:setProperty property="*" name="bag" />
<%
	CarDAO dao = new CarDAO();
	int res = dao.insert(bag);
%>
<%=res%>