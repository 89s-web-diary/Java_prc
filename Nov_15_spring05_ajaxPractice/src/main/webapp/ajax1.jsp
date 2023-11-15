<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
<script type="text/javascript">

// jquery는 버튼하나 당 함수 하나, 요청 하나 당 함수 하나
// 특정한 이벤트가 발생하기를 기다렸다가 이벤트가 발생하면
// 자동으로 함수를 실행시켜주는 방식의 함수를 사용함. >>>> 콜백함수
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "test",
				success : function(x) {
					$('#d1').html(x)
					
				}
			})
		})
		
		$('#b2').click(function name() {
			$.ajax({
				url : "test2",
				success : function(x) {
					$('#d1').html(x)
				}
			})
		})
	})
	
</script>
</head>
<body>

	<button id="b1">테스트</button><br>
	<button id="b2">테스트2</button>
	<hr color="red">
	<div id = "d1"></div>
</body>
</html>