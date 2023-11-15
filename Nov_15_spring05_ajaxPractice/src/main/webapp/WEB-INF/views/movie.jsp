<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
td {
	width: 200px;
	height: 30px;
	font-size: 20px;
	text-align: center;
}

</style>
<table border="1">
	<tr style="background: yellow">
		<td>영화제목</td>
		<td>영화가격</td>
	</tr>
	<tr style="background: pink">
		<td>${bag.title}</td>
		<td>${bag.price}원</td>
	</tr>
	<tr>
		<td colspan="2"><a href="text.jsp">문자인증받기</a></td>
	</tr>
</table>