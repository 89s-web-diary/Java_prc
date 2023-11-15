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
		<td>항목명</td>
		<td>가격</td>
	</tr>
	<tr style="background: pink">
		<td>${bag.com}</td>
		<td>${bag.price }원</td>
	</tr>
	<tr style="background: pink">
		<td>${bag.mouse}</td>
		<td>${bag.price2}원</td>
	</tr>
	<tr style="background: lime">
		<td>총계</td>
		<td>${bag.price+bag.price2}원</td>
	</tr>
</table>