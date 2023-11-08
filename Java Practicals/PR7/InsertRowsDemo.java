import java.sql.*;
class InsertRowsDemo
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully!!!");
		Connection con=DriverManager.getConnection
		("jdbc:mysql://localhost:3306/student","root","root");
		System.out.println("Connection established successfully!!!");
		Statement stmt=con.createStatement();
		int x=stmt.executeUpdate
		("insert into stud_info values(3030,'Bjarne',1)");
		System.out.println("No of Rows Inserted into table:"+x);
	}
}







