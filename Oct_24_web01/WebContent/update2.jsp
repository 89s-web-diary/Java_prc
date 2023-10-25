<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

	String no = request.getParameter("no");
	String index = request.getParameter("index");
	String cont = request.getParameter("cont");
	Integer.parseInt(no);
	BbsDAO dao = new BbsDAO();
	int res = dao.update(Integer.parseInt(no), index, cont);
	String result = "";
	if(res==1) result = "수정이 완료되었습니다.";
	else result = "수정에 실패하였습니다.";
	// 3. 결과를 html로 만들어서 클라이언트에 전송
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="orange">

	<h4><%=result%></h4>
	<hr color="lime">
	수정 요청한 게시글 번호는  <%=no%><br>
	수정 요청한 항목은 <%=index%><br>
	수정 요청한 내용은 <%=cont %>

</body>
</html>