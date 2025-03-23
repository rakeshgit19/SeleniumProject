 package Logical_Programming;

public class ReverseNo
{

	public static void main(String[] args) 
	{
	Integer I = new Integer(1234);
	String s = I.toString();
	char [] ch = s.toCharArray();
	
	for (int i = ch.length-1; i>=0; i--) 
	{
	
		System.out.print(ch[i]);
	}
		

	}

}
