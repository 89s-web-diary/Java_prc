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
		$('#b4').click(function() {
			let tVal = $('#test').val()
			$.ajax({
				url : "test.jsp",
				data : { // ajax를 이용해 jsp에 데이터를 전달하는 방법
					test : tVal
				},
				success : function(a) {
					$('#d1').html(a)
				}
			})
		}) //b4
		$('#b1').click(function() {
			let mVal = $('#money').val()
			let cVal = $('#choice').val()
			$.ajax({
				url : "money.jsp",
				data : {
					money : mVal,
					choice : cVal
				},
				success : function(a) {
					$('#d1').html('결제금액은 ' + a + '원')
				}
			})
		}) //b1

		$('#b3').click(function() {
			let telVal = $('#tel').val()
			$.ajax({
				url : "phone.jsp",
				data : {
					tel : telVal
				},
				success : function(a) {
					$('#d1').html("<input id='idn'> <button id='b5'>인증 요청하기</button>")
					$('#d2').html(a)
					res = a.trim()
				}
			})
		}) //b3 인증번호 받기
		$('#b2').click(function() {
			$.ajax({
				url : "idCheck.jsp",
				data : {
					id : $('#id').val()
				},
				success : function(x) {
					alert(x)
				},
				error : function(e) {
					
				}
			})
			
		})
	})
</script>
</head>
<body bgcolor="pink">
	<h3>비동기통신으로 서버와 통신하기</h3>
	ajax테스트 :
	<input type="text" id='test'>
	<button id='b4'>ajax테스트(test.jsp)</button>
	<br>
	<!-- test에 입력한 id값을 서버에서 받아..id님 환영합니다.!!이라고
	div에 넣어보세요. test.jsp -->
	결제금액 :
	<input type="text" id="money">
	<br> 1)계좌이체, 2)신용카드, 3)휴대폰결제
	<br> 결제수단 :
	<input type="text" id="choice">
	<button style="color: blue; background: green;" id='b1'>결제하기</button>
	<hr color="red">
	회원가입할 id입력 :
	<input type="text" id="id">
	<button style="color: blue; background: yellow;" id='b2'>회원가입시
		id중복 체크</button>
	<hr color="red">
	인증받을 전화번호 입력 :
	<input type="text" id="tel">
	<button style="color: blue; background: fuchsia;" id='b3'>인증번호
		받기</button>
	<hr color="green">
	<div style="background: yellow" id="d1"></div>
	<div style="background: yellow" id="d2"></div>
</body>
</html>