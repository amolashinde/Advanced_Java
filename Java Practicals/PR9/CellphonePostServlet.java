package examples;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CellphonePostServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String cname = request.getParameter("cellphone");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Selected cellphone is: " + cname);
		out.close();
	}
}
