import java.sql.*;
class UpdateRowsDemo
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
		("update stud_info set marks=90 where rollno=3030");
		System.out.println("No of Rows updated into table:"+x);
	}
}



