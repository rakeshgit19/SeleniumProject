package Logical_Programming;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPAddress 
{

	public static void main(String[] args) throws UnknownHostException 
	{
		 // prints the IP address of your Computer
	      System.out.println(InetAddress.getLocalHost());

	}

}
