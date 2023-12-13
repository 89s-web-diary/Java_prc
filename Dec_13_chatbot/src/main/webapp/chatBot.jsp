<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="resources/js/sockjs-0.3.4.js"></script>
<script type="text/javascript" src="resources/js/stomp.js"></script>
<script type="text/javascript"
	src="resources/js/webSocketSendToUserApp.js"></script>

<script type="text/javascript">
	var stompClient = null;

	function connect() {
		// 1. 소켓객체 생성
		// 전화기 역할을 하는 web Socket객체 생성
		// pageContext객체가 프로젝트의 주소를 알아서 가져와줌
		var socket = new SockJS("${pageContext.request.contextPath}/chat3");

		// 2. 데이터를 전송하고, 받을 수 있는 stompClient객체 생성
		stompClient = Stomp.over(socket)

		// 3. 연결 + 데이터가 도착했을 때 자동으로 호출되는 함수를 하나 정의
		stompClient.connect({}, function(frame) {
			console.log("연결됨 >> " + frame)
			// stompClient.subscribe를 이용해서 특정한 채팅방에 가입
			stompClient.subscribe("/topic/messages3", function(messageOutput) {
				console.log(JSON.parse(messageOutput.body))
				json = JSON.parse(messageOutput.body)
				$('#response').append(json.menu + "<br>")
			})
		})
		// 왼쪽 {}은 연결될때 보내는 데이터, 오른쪽은 데이터를 받고나서 자동으로 해주는 행동
	}

	function disconnect() {
		if (stompClient != null) {
			stompClient.disconnect()
			console.log("연결끊어짐")
		}
	}

	function sendMessage() {
		// 누가 입력?
		var from = document.getElementById("from").value
		// 입력한 내용?
		var text = document.getElementById("text").value
		// stompClient.send()함수로 메세지 전송
		stompClient.send("/app/chat3", {}, JSON.stringify({
			"from" : from,
			"text" : text
		}))
		$('#text').val("")

	}
</script>
</head>
<body onload="disconnect()">
	<br>
	<br>
	<div>
		<h3>Festival Manager입니다</h3>
		<hr color="red">
		<img src="resources/img/festival.png" width="500" height="200">
		<div class="input-group mb-3 input-group-lg">
			<span class="input-group-text">닉네임 입력:</span> <input type="text"
				class="form-control" id="from" value="guest">
		</div>
		<br />
		<div>
			<button id="connect" onclick="connect();" class="btn btn-danger"
				style="width: 200px">Connect</button>
			<button id="disconnect" disabled="disabled" onclick="disconnect();"
				style="width: 200px" class="btn btn-danger">Disconnect</button>
		</div>
		<br />
		<div id="conversationDiv">
			<input type="text" id="text" placeholder="1)자주묻는질문 2)문의하기 3)건의하기" class="form-control" />
			<button id="sendMessage" onclick="sendMessage();"
				class="btn btn-primary">Send</button>

			<p id="response" class="alert alert-success"></p>
		</div>
	</div>

</body>
</html>