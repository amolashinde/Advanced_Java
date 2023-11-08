import java.net.*;
class InetAddressDemo
{
   	public static void main(String args[])throws UnknownHostException
	{
	  //1.getLocalHost()
	  InetAddress addr=InetAddress.getLocalHost();
	  System.out.println("Local Host Name:"+addr);
	  
	  //2.getByName()
	  addr=InetAddress.getByName("www.google.com");
	  System.out.println("Name:"+addr);
	  
	  //3.getAllByName()
	  System.out.println("getAllByName Method Output:");
	  InetAddress a[]=InetAddress.getAllByName("www.google.com");
	  for(int i=0;i<a.length;i++)
	  {
		System.out.println(a[i]);
	  }
    }
 }
 
/*
OUTPUT:
Local Host Name:RK-HP-PAVILION/192.168.108.191
Name:www.google.com/142.250.192.4
getAllByName Method Output:
www.google.com/142.250.192.4
www.google.com/2404:6800:4009:82c:0:0:0:2004
*/







