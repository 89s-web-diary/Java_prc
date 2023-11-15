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
				url : "computer",
				data : {
					com : $('#com').val(),
					price : $('#price').val(),
					mouse : $('#mouse').val(),
					price2 : $('#price2').val()
				}, 
				success : function(x) {
					$('#d1').html(x)
					
				}
			})
		})
		
	})
	
</script>
</head>
<body>

	컴퓨터종류 : <input id="com" value = "LG그램"><br>
	컴퓨터가격 : <input id="price" value = "2000"><br>
	마우스종류 : <input id="mouse" value = "로지텍"><br>
	마우스가격 : <input id="price2" value = "1000"><br>
	<button id="b1">컴퓨터 구매 항목 확인</button><br>
	<hr color="red">
	<div id = "d1"></div>
</body>
</html>