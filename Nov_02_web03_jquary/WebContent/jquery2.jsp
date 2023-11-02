<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	$(function() {	//$() ==> body부분을 브라우저가 먼저 읽고 오도록 명령!
					//$(function(){처리내용}) ==> body부분을 먼저 읽고 와서
					//입력값으로 지정한 function()부분을 실행
					//b1을 클릭 했을 때 처리 할 내용
		$('#b1').click(function() {
			let yearVal = $('#year').val()
			let age = 2023 - parseInt(yearVal) + 1
			alert('당신의 나이는 ' + age)
		})
					//b2를 클릭 했을 때 처리 할 내용
		$('#b2').click(function() {
			let wVal = $('#w').val()
			let hVal = $('#h').val()
			let area = parseInt(wVal) * parseInt(hVal)
			alert('사각형의 넓이는 ' + area)
		})
	})
</script>
</head>
<body>
	태어난 해 입력 <input name="year" id="year"> <button id="b1">나이계산</button><br>
	사각형의 면적 가로 : <input name="w" id='w'> 세로 : <input name ="h" id='h'>
				  <button id="b2">사각형의 면적 계산</button>
</body>
</html>