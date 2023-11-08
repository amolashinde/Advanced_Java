import java.io.*;  
import java.net.*;  
public class TCPServer 
{  
   public static void main(String[] args) throws Exception
   {   
		ServerSocket ss=new ServerSocket(6666);  
		Socket s=ss.accept();//establishes connection   
		DataInputStream dis=new DataInputStream(s.getInputStream());  
		String  str=(String)dis.readUTF();  
		System.out.println("message= "+str);  
		ss.close();   
	}  
} 