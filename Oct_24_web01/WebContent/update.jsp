<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

	String id = request.getParameter("id");
	String index = request.getParameter("index");
	String cont = request.getParameter("cont");
	
	MemberDAO dao = new MemberDAO();	// 객체생성 시 자동완성기능 이용
	int res = dao.update(id, index, cont);
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
<body bgcolor="red">

	<h4><%=result%></h4>
	<hr color="lime">
	<a href="index.html">
		<button style="background: pink; color: red">첫페이지로</button>
	</a>
	<a href="member.html">
		<button style="background: pink; color: red">회원정보 페이지로</button>
	</a><br>
	수정 요청한 아이디는  <%=id%><br>
	수정 요청한 항목은 <%=index%><br>
	수정 요청한 내용은 <%=cont %>

</body>
</html>