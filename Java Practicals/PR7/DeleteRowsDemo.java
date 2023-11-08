import java.sql.*;
class DeleteRowsDemo
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully!!!");
		Connection con=DriverManager.getConnection
		("jdbc:mysql://localhost:3306/student","root","root");
		System.out.println("Connection established successfully!!!");
		Statement stmt=con.createStatement();
		int x=stmt.executeUpdate("delete from stud_info where rollno=3030");
		System.out.println("No of Rows deleted into table:"+x);
	}
}



