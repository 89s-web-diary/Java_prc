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
			url : "data/company_mock.json",
			success : function(json) {
				for(let i = 0; i < json.length; i++){
					console.log(json[i])		
				}	// for
			}	// success
		})	// $.ajax
	}) // #b1
	
	$('#b2').click(function() {
		$('#d1').empty()
		$.ajax({
			url : "data/company_mock.xml",
			success : function(xml) {
				list = $(xml).find('record')
				for(let i = 0; i<list.length; i++){
					let id = $(list[i]).find('id').text()
					let name = $(list[i]).find('name').text()
					let addr = $(list[i]).find('addr').text()
					let tel = $(list[i]).find('tel').text()
					let domain = $(list[i]).find('domain').text()
					$('#d1').append(id + " " + name + " "+ addr + " " + tel + " " + domain + "<br>")
				} // for문
			} // success
		}) // ajax
	}) // #b2
	
	$('#b3').click(function() {
		$.ajax({
			url : "data/company_mock.json",
			success : function(json) {
				console.log(json)
				for(let i = 0; i < json.length; i++){
					$.ajax({
						url : "db_com_create.jsp",
						data : {
							id : json[i].id,
							name : json[i].name,
							addr : json[i].addr,
							tel : json[i].tel,
							domain : json[i].domain
						},
						success : function(x) {
							let cnt = 0
							console.log(x.length)
							if(x.trim() == '1'){
								cnt++
							} //if
							if(cnt==1000){
								console.log('success')
							}
						} // success
					}) // $.ajax
				} // for문 
			} // success
		}) // $.ajax
	}) // #b3
	
	$('#b4').click(function() {
		$.ajax({
			url : "https://api.openweathermap.org/data/2.5/weather?lat=35.1362607&lon=129.1027527&appid=f2917473db1db55dee1aeaad9419a1bb", 
			dataType : 'json',
			success : function(x) {
				$('#d1').html("위치 : "+x.name+"<br>"+
				"날씨 : "+x.weather[0].description+"<br>"+
				"풍속 : "+x.wind.speed+"<br>"+
				"최고기온 : "+x.main.temp_max+"<br>"+
				"최저기온 : "+x.main.temp_min+"<br>"+
				"체감온도 : "+x.main.feels_like+"<br>" +
				"구름 : "+x.clouds.all+"<br>")
			}
		})
	})
	
	$('#b5').click(function() {
		$.ajax({
			url : "https://api.openweathermap.org/data/2.5/weather?q=pusan&appid=0b3b55e8f262238476508706d818c2d3", 
			dataType : 'json',
			success : function(x) {
				$('#d1').html("위치 : "+x.name+"<br>"+
				"날씨 : "+x.weather[0].description+"<br>"+
				"풍속 : "+x.wind.speed+"<br>"+
				"최고기온 : "+x.main.temp_max+"<br>"+
				"최저기온 : "+x.main.temp_min+"<br>"+
				"체감온도 : "+x.main.feels_like+"<br>" +
				"구름 : "+x.clouds.all+"<br>")
			}
		})
	})
	
})
</script>
</head>
<body>

	<button id="b1">company_mock.json읽어와서 추출하기</button>
	<button id="b2">company_mock.xml읽어와서 추출하기</button>
	<button id="b3">company_mock.json DB에 저장하기</button>
	<button id="b4">위치로 날씨알아오기</button>
	<button id="b5">지역으로 날씨알아오기</button>
	<div id="d1"></div>

</body>
</html>