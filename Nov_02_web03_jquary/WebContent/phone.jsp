<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String tel = request.getParameter("tel");
	String pre = tel.substring(0, 3);
	String res = "";
	switch (pre) {
	case "010":
		res = "11";
		break;
	case "011":
		res = "22";
		break;
	case "012":
		res = "33";
		break;
	default:
		res = "44";
	}
	Random r = new Random();
	String no = "";
	for (int i = 0; i < 4; i++) {
		int no_r = r.nextInt(10);
		no = no + no_r;
	}
	res = res + no;
	if(tel.length()<10 || tel.length()>11){
		res = "올바른 번호를 입력해주세요";
	}
%>
<%=res%>
