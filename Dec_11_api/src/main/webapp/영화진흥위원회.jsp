<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="header.jsp" %>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({	// var xhr = new XMLHttpRequest(); 랑 같은 코드
				url : "https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json",
				data : {
					key : "키",
					targetDt : "20231209"
				},
				dataType : "json",
				success : function(x) {
					list = x.boxOfficeResult.dailyBoxOfficeList;
					for (let i = 0; i < list.length; i++) {
					console.log(x.boxOfficeResult.dailyBoxOfficeList[i].movieNm)
					}
				}
			})
		})
	})
</script>
</head>
<body>
<button id="b1">박스오피스 가지고오기(영화진흥위원회)</button>
<div id="d1"></div>
</body>
</html>