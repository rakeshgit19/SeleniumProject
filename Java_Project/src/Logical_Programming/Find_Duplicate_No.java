package Logical_Programming;

import java.util.HashSet;
import java.util.Set;

public class Find_Duplicate_No {

	public static void main(String[] args)
	{
		int[] i = { 1, 2, 3, 2, 5, 5 };
		Set<Integer> hs = new HashSet();
		for (int no : i) 
		{
			if (hs.add(no) == false) 
			{
				System.out.println(no);
			}

		}
	}
}
