<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table border="1" style="text-align: center">
	<tr bgcolor="lime">
		<td width="80px">행번호</td>
		<td width="100px">id</td>
		<td width="150px">제목</td>
		<td width="200px">내용</td>
		<td width="150px">작성자</td>
	</tr>
	<c:forEach items="${list}" var="vo">
		<tr>
			<td>${vo.bbs_no}</td>
			<td>${vo.id}</td>
			<td>${vo.title}</td>
			<td>${vo.content}</td>
			<td>${vo.writer}</td>
		</tr>
	</c:forEach>
</table>