<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");

	String[] list = { "root", "hong", "kang" };

	String result = "사용 가능한 id 입니다";

	for (String s : list) {
		if (s.equals(id)) {
			result = "사용할 수 없는 id입니다";
			break;
		}
	}
%><%=result%>