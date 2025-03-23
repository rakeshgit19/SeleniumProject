package Logical_Programming;

import java.util.Scanner;

public class ArmstrongNo 
{

	public static void main(String[] args) 
	{
		int n, number, sum=0, rem;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter any Positive Number : ");
        n = scan.nextInt();
		
        number = n;
		
        while(number != 0)
        {
            rem = number%10;
            number = number/10;
            sum = sum + rem*rem*rem;
        }
        if(sum == n)
        {
            System.out.print("Armstrong Number");
        }
        else
        {
            System.out.print("Not an Armstrong Number");
        }

	}

}
