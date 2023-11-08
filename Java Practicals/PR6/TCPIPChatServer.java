import java.net.*;
import java.io.*;
import java.util.*;
class TCPIPChatServer 
{
   public static void main(String args[])throws Exception
   {
     ServerSocket ss=new ServerSocket(9090);
     Socket s2=ss.accept();
       Scanner sc=new Scanner(System.in);
       DataInputStream din=new DataInputStream(s2.getInputStream());
       DataOutputStream dout=new DataOutputStream(s2.getOutputStream());
       String msg=" ";
       System.out.println("Server is Running...Type 'STOP' to Quit");
       while(!msg.equals("STOP"))
       {
          msg=din.readUTF();
          System.out.println("Client: "+msg);
          msg=sc.nextLine();
          dout.writeUTF(msg);

       }
       s2.close();
   }
}




