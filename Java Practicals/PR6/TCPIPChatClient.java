import java.net.*;
import java.io.*;
import java.util.*;
class TCPIPChatClient 
{
   public static void main(String args[])throws Exception
   {
       Socket s1=new Socket("localhost",9090);
       Scanner sc=new Scanner(System.in);
       DataInputStream din=new DataInputStream(s1.getInputStream());
       DataOutputStream dout=new DataOutputStream(s1.getOutputStream());
       String msg="";
       System.out.println("Client is Running...Type 'STOP' to Quit");
       while(!msg.equals("STOP"))
       {
          msg=sc.nextLine();
          dout.writeUTF(msg);
          msg=din.readUTF();
          System.out.println("Server: "+msg);
       }
       s1.close();
   }
}





