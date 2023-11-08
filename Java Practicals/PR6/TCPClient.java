import java.io.*;  
import java.net.*;  
public class TCPClient
{  
  public static void main(String[] args) throws Exception
  {  
	Socket s=new Socket("localhost",6666);  
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
	dout.writeUTF("Hello Server");  
	dout.close();  
	s.close();   
  }  
}