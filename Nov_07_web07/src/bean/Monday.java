package bean;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet("/monday")
public class Monday extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("객체 생성");
		String temp = config.getInitParameter("temp");
		System.out.println("온도는 " + temp);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet() 사용");
	}

}
