<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function age(){
	alert('나이계산 진행할 예정')
	let yearTag = document.getElementById('year')	// id가 year인 input태그를 인식
	let yearValue = yearTag.value
	let age = 2023 - yearValue + 1
	alert('당신의 나이는 ' + age)
}
function rec() {
	alert('면적계산 진행할 예정')
	let width = parseFloat(document.getElementById('w').value)	// value값 가져오기를 한번에 진행시켜도 된다
	let height = parseFloat(document.getElementById('h').value)
	let area = width * height
	alert('사각형의 넓이는 ' + area)
	
}
</script>
</head>
<body>
	태어난 해 입력 <input name="year" id="year"> <button onclick="age()">나이계산</button><br>
	사각형의 면적 가로 : <input name="w" id='w'> 세로 : <input name ="h" id='h'>
				  <button onclick="rec()">사각형의 면적 계산</button>
</body>
</html>