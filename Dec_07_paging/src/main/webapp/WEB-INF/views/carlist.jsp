<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table border="1" style="text-align: center">
	<tr bgcolor="lime">
		<td width="80px">행번호</td>
		<td width="80px">id</td>
		<td width="300px">email</td>
		<td width="180px">car</td>
	</tr>
	<c:forEach items="${list}" var="vo">
		<tr>
			<td>${vo.car_no}</td>
			<td>${vo.id}</td>
			<td>${vo.email}</td>
			<td>${vo.car}</td>
		</tr>
	</c:forEach>
</table>