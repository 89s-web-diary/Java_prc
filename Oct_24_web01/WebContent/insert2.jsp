<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String writer = request.getParameter("writer");

	BbsDAO dao = new BbsDAO();
	BbsVO bag = new BbsVO();
	bag.setTitle(title);
	bag.setWriter(writer);
	bag.setContent(content);
	dao.insert(bag);
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
</style>
</head>
<body bgcolor="orange">

	<h5>게시물이 등록되었습니다.</h5>
	<a href="insert2.html">
		<button>글쓰기 페이지로 돌아가기</button>
	</a>
	<br>
	<a href="bbs.html">
		<button>게시판 페이저로 돌아가기</button>
	</a>
	<br>
	<a href="index.html">
		<button>첫 페이지로 돌아가기</button>
	</a>

</body>
</html>