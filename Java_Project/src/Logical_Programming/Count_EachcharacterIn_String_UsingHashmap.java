package Logical_Programming;

import java.util.HashMap;
import java.util.Scanner;

public class Count_EachcharacterIn_String_UsingHashmap 
{

	public static void main(String[] args) 
	{
		String str ;
		int count;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");  
		str = scan.nextLine();
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for(Character ch : str.toCharArray())
		{
			if(map.containsKey(ch))
			{
				count = map.get(ch);
				map.put(ch, count+1);
				
			}
			else 
			{
			
				map.put(ch, 1);
			}
			
		}
		System.out.println(map);

	}

}
