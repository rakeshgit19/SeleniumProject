package Logical_Programming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashmap {

	public static void main(String[] args) 
	{
		HashMap<Integer,String>map = new HashMap<Integer,String>();
		map.put(2, "rakesh");
		map.put(3, "mama");
		map.put(4, "pooja");
		System.out.println(map.size());
		System.out.println(map.entrySet());
		//now use while loop
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		
		while (itr.hasNext()) 
		{
		
			System.out.println(itr.next());
			
			
		}
		//now use Advance for loop
		for( Map.Entry<Integer,String> entry: map.entrySet()) 
		{
			System.out.println(entry);
		} 
		
		
		
		
		

	}

}
