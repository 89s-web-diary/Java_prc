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
		$.ajax({
			url : "ok.jsp",
			success : function(a) {
				$('#d1').html(a)
			}
		})
		$.ajax({
			url : "weather.jsp",
			success : function(a) {
				$('#d2').html(a)
			}
		})
		$.ajax({
			url : "tour.jsp",
			success : function(a) {
				$('#d3').html(a)
			}
		})
	})
</script>
</head>
<body>
<div id="d1" style="background: yellow"></div>
<div id="d2" style="background: lime"></div>
<div id="d3" style="background: magenta"></div>
</body>
</html>