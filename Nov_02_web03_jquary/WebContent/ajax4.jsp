<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			let wonVal = $('#won').val()
			$.ajax({
				url : "won.jsp",
				data : {
					won : wonVal
				},
				success : function(a) {
					$('div').html(wonVal + "원은 " + a + "달러입니다")
				}
			})
		})
		$('#b2').click(function() {
			let dolVal = $('#dollar').val()
			$.ajax({
				url : "dollar.jsp",
				data : {
					dollar : dolVal
				},
				success : function(a) {
					$('div').html(dolVal + "달러는 " + a + "원입니다")
				}
			})
		})
	})
</script>
</head>
<body bgcolor="lime">
	<h3>비동기통신으로 서버와 통신하기</h3>
	원화를 달러로 :
	<input id='won'>
	<button style="background: green; color: blue" id="b1">원화를 달러로</button>
	<hr color='red'>
	달러를 원화로 :
	<input id='dollar'>
	<button style="background: yellow; color: blue" id="b2">달러를
		원화로</button>
	<hr color='blue'>
	<div></div>

</body>
</html>