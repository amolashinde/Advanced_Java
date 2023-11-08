import java.sql.*;
import java.util.*;
class PreparedStatementInsertRowsDemo
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection
		("jdbc:mysql://localhost:3306/student","root","root");
		PreparedStatement pstmt=con.prepareStatement
		("insert into stud_info values(?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Roll No:");
		int rn=sc.nextInt();
		System.out.println("Enter Student Name:");
		String nm=sc.next();
		System.out.println("Enter Student Marks:");
		float mrks=sc.nextFloat();	
		pstmt.setInt(1,rn);
		pstmt.setString(2,nm);
		pstmt.setFloat(3,mrks);
		int x=pstmt.executeUpdate();
		System.out.println("No of Rows Inserted into table:"+x);
	}
}





