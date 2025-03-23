package Logical_Programming;

public class Reverse {

	public static void main(String[] args) 
	{
		String [] str = "rakesh kumar dalai".split(" ");
		
		//StringBuilder sb = new StringBuilder();
		for (String s1 : str) 
		{
			System.out.print(new StringBuilder(s1).reverse()+" "); 
			
		}
		
		
//		StringBuilder sb = new StringBuilder();
//		sb.append(str).reverse();
//		System.out.println(sb);
	}

}
