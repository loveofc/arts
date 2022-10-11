package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet SecondServlet");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>hi FirstServelt</h1>");
	}

	@Override
	public void destroy() {
		System.out.println("destroy SecondServlet");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init SecondServlet");
	}
	
}
