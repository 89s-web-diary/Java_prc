<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
<script type="text/javascript">

	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "json.jsp",
				dataType : "json",			// dataType을 정해주지 않으면 json이 아닌 String으로 인식
				success : function(x) {		// 지정X >>> json방식으로 데이터 꺼내오기 안됨
					$('#d1').html(x.id)
				}
			})
		})
		$('#b2').click(function() {
			$.ajax({
				url : "json2.jsp",
				dataType : "json",
				success : function(x) {
					$('#d1').html(x[0].tel)
				}
			})
		})
	
	})
	
</script>
</head>
<body>

	<button id="b1">JSON으로 받아오기</button>
	<button id="b2">JSON으로 받아오기2</button>
	<hr color="red">
	<div id = "d1"></div>
</body>
</html>