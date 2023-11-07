package bean;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/hi2")
// 주소 지정하는 표시

public class Hi2 extends HttpServlet {
// 서블릿이 언제 만들어지고 언제 사라지는지 까지를 생명주기라 함

	public void init(ServletConfig config) throws ServletException {
		System.out.println("서블릿이 탄생함");
		String tel = config.getInitParameter("tel");
		String email = config.getInitParameter("email");
		System.out.println("관리자 전화번호인 " + tel + "로 문자보냄");
		System.out.println("관리자 이메일인 " + email + "로 메일보냄");
	}

	public void destroy() {
		System.out.println("서블릿 생명을 다함");
		// 코드가 바뀌거나 서버가 닫히면 destroy() method가 실행됨
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet() method가 자동 호출됨");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost() method가 자동 호출됨");
	}

}
