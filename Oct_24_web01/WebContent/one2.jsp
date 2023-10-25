<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String no = request.getParameter("no");

	BbsDAO dao = new BbsDAO();
	BbsVO bag = new BbsVO();

	bag = dao.one(Integer.parseInt(no));
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
	background: cyan;
}

.left {
	width: 200px;
	background: violet;
}
</style>
</head>
<body bgcolor="orange">

	<h2>검색 결과</h2>
	<hr color="purple" size="10">
	<table border="1" align=center>
		<tr>
			<td class="left">글 번호</td>
			<td class="right"><%=bag.getNo()%></td>
		</tr>
		<tr>
			<td class="left">제목</td>
			<td class="right"><%=bag.getTitle()%></td>
		</tr>
		<tr>
			<td class="left">내용</td>
			<td class="right"><textarea rows="4" cols="22"
					style="background: cyan; font-size: 20px"><%=bag.getContent()%></textarea></td>
		</tr>
		<tr>
			<td class="left">작성자</td>
			<td class="right"><%=bag.getWriter()%></td>
		</tr>
	</table>
</body>
</html>