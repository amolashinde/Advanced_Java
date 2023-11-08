package authentication;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String u = request.getParameter("uname");
		String p = request.getParameter("pwd");
		
		if(Connect.register(u, p)){
			if(Connect.validate(u, p)) {
				RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
				rd.forward(request, response);
			}
			else {
				out.print("Incorrect password or username");
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
		}	
		else {
			out.print("Your account does not exist, try registering first.");
			RequestDispatcher rd = request.getRequestDispatcher("register.html");
			rd.include(request, response);
		}
	}
}
