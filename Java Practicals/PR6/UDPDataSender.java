	import java.net.*;
	class UDPDataSender
	{
	  public static void main(String args[])throws Exception
	  {
		DatagramSocket ds=new DatagramSocket();
		String str="Welcome To The World Of Networking Advance Java!!";
		byte data[]=str.getBytes();
		int len=str.length();
		InetAddress addr=InetAddress.getByName("127.0.0.1");
		DatagramPacket dp=new DatagramPacket(data,len,addr,5555);
		ds.send(dp);
		ds.close();
	  }
	}
	
	
	
	
	
	