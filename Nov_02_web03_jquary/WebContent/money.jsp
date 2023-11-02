<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String money = request.getParameter("money");
	String choice = request.getParameter("choice");
	int m2 = Integer.parseInt(money);
	if(choice.equals("1")){
		m2 = m2 - 1000;
	}else if(choice.equals("2")){
		m2 = m2 + 1000;
	}
%>
<%=m2%>