<%@page import="java.util.ArrayList"%>
<%@page import="bean.BbsDAO"%>
<%@page import="bean.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	BbsDAO dao = new BbsDAO();
	ArrayList<BbsVO> list = dao.list();
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
	width: 150px;
}
#contt{
	width: 200px;
}
.data {
	background: white;
	font-size: 15px;
}
</style>
</head>
<body bgcolor="skyblue">

	<h2>전체 게시판 페이지</h2>
	<hr>
	<a href="index.html">
		<button style="background: lime">첫페이지로</button>
	</a>
	<a href="bbs.html">
		<button style="background: lime">게시판정보 페이지로</button>
	</a>
	<table border="1" align="center">
		<tr>
			<td class="top">게시글번호</td>
			<td class="top">제목</td>
			<td class="top" id="contt">내용</td>
			<td class="top">작성자</td>
		</tr>
		<%
			for(BbsVO bag : list) {
		%>
		<tr>
			<td class="data"><%=bag.getNo()%></td>
			<td class="data"><a href="one2.jsp?no=<%=bag.getNo()%>"><%=bag.getTitle()%></a></td>
			<td class="data"><%=bag.getContent()%></td>
			<td class="data"><%=bag.getWriter()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>