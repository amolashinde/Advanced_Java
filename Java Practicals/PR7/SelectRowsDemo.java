import java.sql.*;
class SelectRowsDemo
{
	public static void main(String args[]) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection
		("jdbc:mysql://localhost:3306/student","root","root");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from stud_info");
		System.out.println("\nRollNo\tName\tMarks");
		System.out.println("----------------------");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
		}
		con.close();
	}
}
