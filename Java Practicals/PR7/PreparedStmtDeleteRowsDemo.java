import java.sql.*;
import java.util.*;
class PreparedStmtDeleteRowsDemo
{
	public static void main(String args[])
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection
		("jdbc:mysql://localhost:3306/student","root","root");
		PreparedStatement pstmt=con.prepareStatement("delete from stud_info where rollno=?");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll No for deletion:");
		int rn=sc.nextInt();
		pstmt.setInt(1,rn);				
		int x=pstmt.executeUpdate();								
		System.out.println("No of Rows deleted from table:"+x);
	}
}