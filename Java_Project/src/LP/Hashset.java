package LP;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) 
	{
		String[] s = "Rakesh kumar dalai".split(" ");
	   
		for(String str:s)
	    {
	    	System.out.print(new StringBuilder(str).reverse()+" " );
	    }
		
	}

}
