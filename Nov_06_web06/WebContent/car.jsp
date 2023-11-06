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
		$.ajax({
			url : "data/car.json",
			success : function(json) {
				// console.log(json)
				//for(let i = 0; i < json.length; i++){
				// console.log(json[i].email)
				$(json).each(function(i, one){	// ajax 식 for each 사용법
				// $(여러개 들어있는 변수 or 배열).each(function(인덱스, 하나씩)))
					//console.log(one.email)
					idVal = one.id
					emailVal = one.email
					carVal = one.car
					console.log(idVal + " " + emailVal + " " + carVal)
					$.ajax({
						url : "db_create.jsp",
						data : {
							id : one.id,
							email : one.email,
							car : one.car
						},
						success : function(x) {
							console.log(x.length)
							if(x.trim() == '1'){
								console.log('db저장 성공')
							}else{
								console.log('db저장 실패')
							}
						} // success
					}) // $.ajax(db)
				})	// $(json).each
			}	// success
		})	// $.ajax
	}) // #b1
	
	
	$('#b2').click(function() {
			$('#d1').empty()
			$.ajax({
				url : "data/car.xml",
				success : function(xml) {
					let list = $(xml).find('record')
					for (let i = 0; i < list.length; i++) {
						id = $(list[i]).find('id').text()
						email = $(list[i]).find('email').text()
						car = $(list[i]).find('car').text()
						$('#d1').append(id + " " + email + " " + car + "<br>")
					} // for
				} // success
			}) // ajax
		}) // b2

	}) //$(function)
</script>
</head>
<body>

	<button id="b1">car.josn읽고 DB전송</button>
	<button id="b2">car.xml읽어와서 추출하기</button>
	<div id="d1"></div>
</body>
</html>