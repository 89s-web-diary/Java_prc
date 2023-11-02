<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String dollar = request.getParameter("dollar");
	double dollar2 = Float.parseFloat(dollar);
	dollar2 = dollar2 * 1340;
%>
<%=dollar2%>