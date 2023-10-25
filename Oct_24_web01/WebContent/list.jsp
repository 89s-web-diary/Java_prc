<%@page import="java.util.ArrayList"%>
<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	ArrayList<MemberVO> list = new ArrayList<>();
	MemberDAO dao = new MemberDAO();
	list = dao.list();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	text-align: center;
}

.top {
	/* 클래스 중 left에 해당하는 것만 style 지정 */
	background: yellow;
	font-size: 20px;
	width: 200px;
}

.data {
	background: white;
	font-size: 15px;
}
</style>
</head>
<body bgcolor="lime">

	<h2>전체 회원정보 페이지</h2>
	<hr>
	<a href="index.html">
		<button style="background: pink; color: red">첫페이지로</button>
	</a>
	<a href="member.html">
		<button style="background: pink; color: red">회원정보 페이지로</button>
	</a>
	<table border="1" align="center">
		<tr>
			<td class="top">아이디</td>
			<td class="top">패스워드</td>
			<td class="top">이름</td>
			<td class="top">전화번호</td>
		</tr>
		<%
			for (MemberVO bag : list) {
		%>
		<tr>
			<td class="data"><%=bag.getId()%></td>
			<td class="data"><%=bag.getPw()%></td>
			<td class="data"><%=bag.getName()%></td>
			<td class="data"><%=bag.getTel()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>