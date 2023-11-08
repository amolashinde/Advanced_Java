import java.net.*;  
public class InetInstanceDemo
{  
	public static void main(String[] args)throws UnknownHostException
	{   
		InetAddress add=InetAddress.getByName("www.google.com");
		
		//1.getHostAddress()
		System.out.println("Host Address: "+add.getHostAddress());
		
		//2.getHostName()
		System.out.println("Host Name: "+add.getHostName());
		
		//3.isMulticastAddress()
		System.out.println("isMulticastAddress?: "+add.isMulticastAddress());
		
		//4.getAddress()
		byte b[]=add.getAddress();
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}  
 }
 
 
 
 
 
 
 
 
 