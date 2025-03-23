package Logical_Programming;

public class Remove_White_Spaces 
{

	public static void main(String[] args) 
	{
		String str = "my name is john";
		
		/*str = str.replace(" ", "");
		System.out.println(str+" ");
	...	.................................
	    str =str.replaceAll("\\s+", ""); 
		System.out.println(str);*/
	//....................................	
		
		for(char ch:str.toCharArray())
		{
			if(!Character.isWhitespace(ch))
				System.out.print(ch);
			
		}
	}

}
