package com.dos.hzl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/hello", "/hello-world" })
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		out.print("<html><body>");
		out.print("<h2>Welcome to GeeksForGeeks</h2>");
		out.print("</body></html>");
		String name = req.getParameter("userName");
		if (name == null || name.isBlank()) {
			name = "Guest";
		}
		//resp.setContentType("text/html");
		resp.getWriter().append("<h1>Hello, " + name + "!</h1>");

	}

}
