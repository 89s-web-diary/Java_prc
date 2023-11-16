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

		$('#b3').click(function() {
			$.ajax({
				url : "jsonmember",
				success : function(json) {
					console.log(json)
					header = "<table border='1'><tr><td>ID</td><td>PW</td><td>이름</td><td>TEL</td></tr>"
					$('#d1').append(header)
					console.log(header)
					// $(json).each(function(index, 변수명) {})		>>> jquery에서 쓰는 foreach
					for(let i=0;i<json.length;i++){
						id = json[i].id
						pw = json[i].pw
						name = json[i].name
						tel = json[i].tel
						ff = id + " " + pw + " " + name + " " + tel + "<br><hr>"
						mid = "<tr><td>"+id+"</td><td>"+pw+"</td><td>"+name+"</td><td>"+tel+"</td></tr>"
						$('#d1').append(mid)
						console.log(mid)
					}
					under = "</table>"
					$('#d1').append(under)
					console.log(under)
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