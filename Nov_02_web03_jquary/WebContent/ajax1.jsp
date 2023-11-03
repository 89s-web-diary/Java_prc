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
			url : "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2Fcategory%2Fsports%2F%3FoutputType%3Dxml&api_key=mnucj1tyqlesi2wxeuf994owltygmf1pyeclyc1m",
			success : function(x) {
				// console.log(x)	// 브라우저의 콘솔에 출력 / alert에서 나오지 않던것들이 자세하게 나옴
				// console.log(list[0].title)	// .만 찍으면 가져오고 싶은것들 쉽게 가져오기 가능
				let list = x.items		// [{title:...,  content:..., },{},{},{},,,]
				for(let i=0; i<list.length;i++){
					aTag = "<a href="+ list[i].link+">" + list[i].title+"</a>"
					$('#d1').append(aTag + "<br>" + list[i].content)
				}
			},
			error : function(e) {
				alert('에러')
			}
			
		})
	})
</script>
</head>
<body>
<div id="d1"></div>
</body>
</html>