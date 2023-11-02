<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String won = request.getParameter("won");
	float won2 = Float.parseFloat(won);
	won2 = won2*3/4000;
%>
<%=won2%>