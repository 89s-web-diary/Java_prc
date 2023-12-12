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
					key : "75a444600b6ca242c962c6619219f5a8",
					targetDt : "20231209"
				},
				dataType : "json",
				success : function(x) {
					list = x.boxOfficeResult.dailyBoxOfficeList;
					for (let i = 0; i < list.length; i++) {
						let rank = list[i].rank
						let movieCd = list[i].movieCd
						let movieNm = list[i].movieNm
						let scrnCnt = list[i].scrnCnt
						let openDt = list[i].openDt
						// ajax로 넘겨도 되고, location.href로 넘겨도 됨
						/* location.href = "movie?rank=" + rank +
										"&movieCd=" + movieCd +
										"&movieNm=" + movieNm +
										"&scrnCnt=" + scrnCnt +
										"&openDt=" + openDt */
						$.ajax({
							url : "movie",
							data : {
								rank : rank,
								movieCd : movieCd,
								movieNm : movieNm,
								scrnCnt : scrnCnt,
								openDt : openDt
							},
							success : function(x) {
								alert(x)
							}
						})
					}
				}
			})
		})
	})
</script>
</head>
<body>
<button id="b1">박스오피스 가지고오기(영화진흥위원회)</button>
<hr color = "red">
<div id="d1" style="background: pink; width:600px; height:500px;"></div>
</body>
</html>