<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"
	integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4="
	crossorigin="anonymous"></script>

<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "list1",
				data : {
					start : 10,
					end : 15
				},
				success : function(res) {
					$('#d1').html(res)
				}
			})
		})
		$('#b2').click(function() {
			$.ajax({
				url : "list1",
				data : {
					page : 1
				},
				success : function(res) {
					$('#d1').html(res)
				}
			})
		})
		$('#b3').click(function() {
			$.ajax({
				url : "list1",
				data : {
					page : 2
				},
				success : function(res) {
					$('#d1').html(res)
				}
			})
		})
	})
</script>
</head>
<body>

	<button id="b1">게시물 목록(bbsno: 10-15)</button>
	<br>
	<button id="b2">게시물 목록(page1 >> bbsno 1-10)</button>
	<br>
	<button id="b3">게시물 목록(page2 >> bbsno 11-20)</button>
	<hr color="red">
	<div id="d1"></div>
</body>
</html>