<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
* {
	text-align: center;
}
#up{
	margin:0 auto; 
}
#down{
	margin:0 auto; 
}
#d1 {
	float: left;
	width: 400px;
}

#d2 {
	float: left;
	width: 400px;
}

#d3 {
	float: left;
	width: 400px;
}

#d4 {
	float: left;
	width: 400px;
}
</style>

</head>
<body>
	<div>
		<img alt="no" src="resources/img/cgv.png">
	</div>
	<div id="total">
		<div id="up" style="width: 800px">
			<div id="d1">
				<h1>영화 정보 검색</h1>
				<form action="one">
					제목 : <input name="title">
					<button type="submit" class="btn btn-primary">찾아보기</button>
				</form>
			</div>
			<div id="d2">
				<h1>영화 전체 리스트</h1>
				<a href="list"><button class="btn btn-info">전체 리스트 요청</button></a>
			</div>
		</div>
		
		<div id="down" style="width: 800px">
			<div id="d3">
				<h1>상영작 추가</h1>
				<form action="insert">
					제목 : <input type="text" name="title"><br> 평점 : <input
						type="text" name="rate"><br> 개봉일 : <input type="text"
						name="date"><br> 이미지 : <input type="text" name="img"><br>

					<button type="submit" class="btn btn-success">상영작 추가 요청</button>
				</form>
			</div>

			<div id="d4">
				<h1>영화 평점 수정</h1>
				<form action="update">
					제목 : <input name="title"><br> 평점 : <input name="rate"><br>
					<button type="submit" class="btn btn-warning">수정하기</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>