package examples;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddCookieServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String s = request.getParameter("c");
		Cookie c1 = new Cookie("Java",s);
		response.addCookie(c1);
		out.println("The cookie is set to: " + s);
		out.close();
	}
}
