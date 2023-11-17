<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>마커 생성하기</title>
<script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=키키오api"></script>
<script>
	$(function() {
		// 1. jsp가 시작하자마자 ajax를 실행해서 json을 받아와서 map 찍기
		// 2. 버튼을 클릭했을 때 ajax를 실행해서 json을 받아와서 map 찍기
		$('#b1').click(function() {
			$.ajax({
				url : "map3",
				success : function(array) {
					console.log(array)
					alert(array.length)
					
					var positions = [];
					var latSum = 0, lonSum = 0;
					$(array).each(function(i, json) {
						positions.push({
							title: json.location,
							latlng: new kakao.maps.LatLng(json.lat, json.lon)
						})
						latSum += json.lat
						lonSum += json.lon
					})
					var latCen = latSum / array.length
					var lonCen = lonSum / array.length
					var mapContainer = document.getElementById('map'), // 지도를 표시할 div  
    				mapOption = { 
        			center: new kakao.maps.LatLng(latCen, lonCen), // 지도의 중심좌표
       				 level: 3 // 지도의 확대 레벨
   					 };
					var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다
					
        			// 마커 이미지의 이미지 주소입니다
           			var imageSrc = "https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png"; 
    
             		for (var i = 0; i < positions.length; i ++) {
                    	// 마커 이미지의 이미지 크기 입니다
                 		var imageSize = new kakao.maps.Size(24, 35); 
    
                 		// 마커 이미지를 생성합니다    
                 		var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize); 
    
                 		// 마커를 생성합니다
                 		var marker = new kakao.maps.Marker({
                     		map: map, // 마커를 표시할 지도
                      		position: positions[i].latlng, // 마커를 표시할 위치
                      		title : positions[i].title, // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다
                     		image : markerImage // 마커 이미지 
                     	});
                 	}
				}
			})
		})
		
	})
</script>

</head>
<body>

	<button id="b1">데이터 검색</button>
	<br>
	<div id="map" style="width: 70%; height: 350px;"></div>

</body>
</html>