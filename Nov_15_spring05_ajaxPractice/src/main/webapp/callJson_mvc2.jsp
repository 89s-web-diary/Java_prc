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
				url : "string",
				success : function(string) {
					alert(string)
					$('#d1').text(string)
					if (string == "winner") {
						let img = "<img src = 'resources/img/1.png'>"
						$('#d1').append(img)
					} else {
						let img = "<img src = 'resources/img/no.png'>"
						$('#d1').append(img)

					}
				}
			})
		})

		$('#b2').click(function() {
			$.ajax({
				url : "json1",
				success : function(json) {
					//json 보려면 console.log 쓰는게 더 편함
					console.log(json)
					console.log(json.pw)
					id = json.id
					pw = json.pw
					name = json.name
					tel = json.tel
					ff = id + " " + pw + " " + name + " " + tel + "<br><hr>"
					$('#d1').append(ff)
				}
			})
		})

		$('#b3').click(function() {
			$.ajax({
				url : "json2",
				success : function(json) {
					console.log(json)
					// $(json).each(function(index, 변수명) {})		>>> jquery에서 쓰는 foreach
					for(let i=0;i<json.length;i++){
						id = json[i].id
						pw = json[i].pw
						name = json[i].name
						tel = json[i].tel
						ff = id + " " + pw + " " + name + " " + tel + "<br><hr>"
						$('#d1').append(ff)
					}
				}
			})
		})

	})
</script>
</head>
<body>

	<button id="b1">JSON으로 받아오기(String)</button>
	<button id="b2">JSON으로 받아오기(json)</button>
	<button id="b3">JSON으로 받아오기(jsonArray)</button>
	<hr color="red">
	<div id="d1"></div>
</body>
</html>