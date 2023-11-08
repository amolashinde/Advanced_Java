package examples;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class HttpSessionExample extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession s = request.getSession(true);
		Date d = (Date) s.getAttribute("Date");
		if(d!=null) {
			out.println("<br> Last Date: " + d);
		}
		d = new Date();
		s.setAttribute("Date", d);
		out.println("Current date: " + d);
		out.close();
	}		
}
