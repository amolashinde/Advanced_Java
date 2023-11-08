import java.sql.*;
class CreateTableDemo
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully!!!");
		Connection con=DriverManager.getConnection
		("jdbc:mysql://localhost:3306/student","root","system");
		System.out.println("Connection established successfully!!!");
		Statement stmt=con.createStatement();
		stmt.execute("create table stud_info(rollno integer(5),name varchar(10),marks integer(3))");
		System.out.println("Table created successfully!!!");
	}
}





