package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class Hi extends HttpServlet {
	// HttpServlet에 있는 service()
	// 모든 요청은 service()가 받아서 get/post인지 구분
	// get요청이 들어오면 doGet() / post요청이 들어오면 doPost()

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("get요청이 들어왔음");
		String q = request.getParameter("q");
		// PrintWriter 부품을 이용해서 브라우저에 문자들(코드)를 보낼 수 있음.
		PrintWriter out = response.getWriter();
		out.println("<h1>your data : " + q + "</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("post요청이 들어왔음");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		PrintWriter out = response.getWriter();
		out.println("<h1>your id : " + id + ", your pw : " + pw + "</h1>");
	}

}
