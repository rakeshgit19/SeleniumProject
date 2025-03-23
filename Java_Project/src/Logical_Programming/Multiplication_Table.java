package Logical_Programming;

import java.util.Scanner;

public class Multiplication_Table 
{

	public static void main(String[] args)
	{
		int num;int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter num");
		
		num = scan.nextInt();
		n=num;
		for (int i = 0; i <=10; i++) 
		{
		
			System.out.println(n+ "*" +i+ "=" +n*i );
		}

	}

}
