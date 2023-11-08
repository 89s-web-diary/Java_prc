package com.multi.mvc01;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 싱글톤 객체 생성 + 컨트롤러로 역할
public class MemberController {

	// 버튼을 눌러서 요청 --> 함수 사용
	// 버튼 하나 >>> 함수 하나

	@RequestMapping("insert")
	public void insert(MemberDTO bag) {
		// 함수(bag) >> 요청할 때 만듦(프로토타입)
		// 함수(bag) >> 클라이언트로부터 전달된 값을 MemberDTO type으로 전달
		MemberDAO dao = new MemberDAO();
		int result = dao.insert(bag);
		String resT = "";
		if(result == 1) resT = "회원가입 성공";
		else resT = "회원가입 실패";
		System.out.println(resT);
	}
	
	@RequestMapping("login")
	public void login(MemberDTO bag, HttpSession session) throws Exception {
		MemberDAO dao = new MemberDAO();
		boolean result = dao.login(bag);
		if (result){
			session.setAttribute("id", bag.getId());
		}
	}

}
