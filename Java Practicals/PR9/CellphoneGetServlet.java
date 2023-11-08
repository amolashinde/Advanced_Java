package examples;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CellphoneGetServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String cphone = request.getParameter("cellphone");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("The selected cellphone is: " + cphone);
		out.close();
	}
}
