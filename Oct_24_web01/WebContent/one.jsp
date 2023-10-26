<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	MemberDAO dao = new MemberDAO(); // 객체생성 시 자동완성기능 이용
	MemberVO bag = dao.one(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	text-align: center
}

table {
	text-align: center;
	font-size: 20px;
}

.right {
	width: 200px;
	background: white;
}
.left {
	width: 200px;
	background: white;
}
</style>
</head>
<body bgcolor="red">

	<h2>검색 결과</h2>
	<hr color="black" size="10">
	<a href="index.html">
		<button style="background: pink; color: red">첫페이지로</button>
	</a>
	<a href="member.html">
		<button style="background: pink; color: red">회원정보 페이지로</button>
	</a><br>
	<table border="1" align=center>
		<tr>
			<td class="left">아이디</td>
			<td class="right"><%=bag.getId()%></td>
		</tr>
		<tr>
			<td class="left">비밀번호</td>
			<td class="right"><%=bag.getPw()%></td>
		</tr>
		<tr>
			<td class="left">이름</td>
			<td class="right"><%=bag.getName()%></td>
		</tr>
		<tr>
			<td class="left">전화번호</td>
			<td class="right"><%=bag.getTel()%></td>
		</tr>
	</table>

</body>
</html>