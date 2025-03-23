package Logical_Programming;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateCharacterInString 
{

	public static void main(String[] args) 
	{
		String s =  "hgjvjvjkjjjjjgvj" ;   
		char[] ch = s.toCharArray();
		
		Set<Character> s1 = new HashSet<Character>();
		
		for (Character c:ch) 
		{
			if (s1.add(c)==false) {
				
				System.out.println(c);
			}
		}
		

	}

}
