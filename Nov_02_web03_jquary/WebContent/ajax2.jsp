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
				url : "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2Fcategory%2Fentertainments%2F%3FoutputType%3Dxml&api_key=mnucj1tyqlesi2wxeuf994owltygmf1pyeclyc1m",
				success : function(x) {
					let list = x.items
					console.log(x)
					$('#d1').empty()
					for(let i=0;i<list.length;i++){
						aTag = "<a href=" + list[i].link+">"+list[i].title+"</a>"
						$('#d1').append(aTag + "<br>" + list[i].content)
					} // for
				} // success
			}) // ajax
		}) // b1
		$('#b2').click(function() {
			$.ajax({
				url : "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2F%3FoutputType%3Dxml&api_key=mnucj1tyqlesi2wxeuf994owltygmf1pyeclyc1m",
				success : function(x) {
					let list = x.items
					console.log(x)
					$('#d1').empty()
					for(let i=0;i<list.length;i++){
						aTag = "<a href=" + list[i].link+">"+list[i].title+"</a>"
						$('#d1').append(aTag + "<br>" + list[i].content)
					} // for
				} // success
			}) // ajax
		}) // b2
		$('#b3').click(function() {
			$.ajax({
				url : "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2Fcategory%2Fsports%2F%3FoutputType%3Dxml&api_key=mnucj1tyqlesi2wxeuf994owltygmf1pyeclyc1m",
				success : function(x) {
					let list = x.items
					console.log(x)
					$('#d1').empty()
					for(let i=0;i<list.length;i++){
						aTag = "<a href=" + list[i].link+">"+list[i].title+"</a>"
						$('#d1').append(aTag + "<br>" + list[i].content+"<br>")
					} // for
				} // success
			}) // ajax
		}) // b3
		
	})
</script>
<style>
button {
	font-size: 15px
}
img{
	width: 300px;
	height: 300px;
}
</style>
</head>
<body bgcolor="lime">
	<h2>신문뉴스 데이터 받아오기(ajax로)</h2>
	<button id="b1" style="background: pink">연예인 기사(조선)</button>
	<button id="b2" style="background: yellow">최신 기사(조선)</button>
	<button id="b3" style="background: skyblue">스포츠 기사(조선)</button>
	<hr>
	<div id="d1"></div>
</body>
</html>