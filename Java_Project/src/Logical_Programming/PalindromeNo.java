package Logical_Programming;

import java.util.Scanner;

public class PalindromeNo 
{

	public static void main(String[] args) 
	{
		int num,n ,rem,sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any no");
		num = scan.nextInt();
		n=num;
		while(num>0)
		{
			rem = num % 10;
			num = num / 10;
			sum = sum *10 + rem;
		}
		if(n==num)
		{
			System.out.println("its a palindrome no");
		}
		else 
		{
		
			System.out.println("its not a palindrome no");
		}

	}

}
