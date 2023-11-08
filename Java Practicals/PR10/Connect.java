package authentication;

import java.sql.*;

public class Connect {
	static boolean exists = false;
	static boolean state = false;
	
	public static boolean register(String user, String pass) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/Registration?characterEncoding=utf8","root","system");
			Statement st = con.createStatement();
			String sql1 = "select username from reg where username='"+user+"'";
			ResultSet rs = st.executeQuery(sql1);
			if(!rs.next()) {
				exists=false;
			}
			else {
				exists=true;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return exists;
	}
	
	
	public static boolean validate(String user, String pass) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/Registration?characterEncoding=utf8","root","system");
			Statement st = con.createStatement();
			String sql = "select *from reg"; 
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				if(rs.getString(1).equals(user) && rs.getString(2).equals(pass)) {
					state = true;
				}
				else {
					state = false;
				}
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return state;
	}
}
