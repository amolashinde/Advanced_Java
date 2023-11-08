package authentication;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String u = request.getParameter("uname");
		String p = request.getParameter("pwd");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration?characterEncoding=utf8","root","system");
			Statement st = con.createStatement();
			String sql = "insert into reg values('"+u+"','"+p+"')";
			st.executeUpdate(sql);
			out.print("Registered Successfully!");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
