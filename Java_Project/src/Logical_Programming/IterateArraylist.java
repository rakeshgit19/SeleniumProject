package Logical_Programming;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArraylist 
{

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("20");
		list.add("10");
		list.add("15");
		list.add("12");
		System.out.println(list);
		
		System.out.println("using while loop");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("using for each loop");
		for(String obj: list)
		{
		
			System.out.println(obj);
		}


		System.out.println("using for loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		

		
	}

}
