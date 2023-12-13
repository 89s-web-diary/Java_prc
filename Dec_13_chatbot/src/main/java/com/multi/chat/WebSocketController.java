package com.multi.chat;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {
	
	@MessageMapping("/chat")
	@SendTo("/topic/messages")		// 채팅방 이름 = messages
	public Message send(Message message) {
		// from, text만 messages채팅방에 가입한 브라우저로 그대로 전송
		// Date date = new // Date();
		String date = new SimpleDateFormat("HH:mm").format(new Date());
		message.setDate(date);
		return message;
	}
	
	@MessageMapping("/chat2")
	@SendTo("/topic/messages2")		// 채팅방 이름 = messages
	public Message2 send2(Message2 message) {
		// from, text만 messages채팅방에 가입한 브라우저로 그대로 전송
		String menu = "";
		switch (message.getText()) {
		case "1":
			menu = "챗 봇>>  10) 운동화		11) 모자			12) 가방";
			break;
		case "2":
			menu = "챗 봇>>  20) 배송조회	21) 주문완료상품조회";
			break;
		case "20":
			menu = "챗 봇>> DB에서 가지고 온 배송 상황 목록 \n" +
						"상품명: 르꼬뿌		배송상황: 물건 준비중";
			break;
		case "10":
			menu = "챗 봇>>  100) 나이커	    200) 르꼬뿌			300) 라코스또";
			break;
		case "100":
			menu = "챗 봇>>  1000) 나이커 운동화 세부 메뉴	1) 다시 처음 메뉴";
			break;
		case "1000":
			menu = "챗 봇>>  1001)나이커빨강(1만원)	1002)나이커파랑(2만원)	1003)나이커보라(3만원)	100)이전 메뉴로";
			break;
		default:
			menu = "챗 봇>>선택한 번호는 없는 메뉴입니다. 다시 입력해주세요.";
			break;
		}
		message.setMenu(menu);
		return message;
	}
	
	@MessageMapping("/chat3")
	@SendTo("/topic/messages3")		// 채팅방 이름 = messages
	public Message3 send2(Message3 message) {
		// from, text만 messages채팅방에 가입한 브라우저로 그대로 전송
		String menu = "";
		switch (message.getText()) {
		case "1":
			menu = "챗 봇>>자주묻는질문 게시판으로 가보시겠어요?<br><a href=질문.jsp>자주묻는질문 게시판</a>";
			break;
		case "2":
			menu = "챗 봇>>문의하기 게시판으로 가보시겠어요?<br><a href=문의.jsp>문의하기 게시판</a>";
			break;
		case "3":
			menu = "챗 봇>>건의하기 게시판으로 가보시겠어요?<br><a href=건의.jsp>건의하기 게시판</a>";
			break;
		default:
			menu = "챗 봇>>선택한 번호는 없는 메뉴입니다. 다시 입력해주세요. 입력 1)자주묻는질문 2)문의하기 3)건의하기";
			break;
		}
		message.setMenu(menu);
		return message;
	}
	
}
