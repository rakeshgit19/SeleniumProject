package Logical_Programming;

import java.util.Scanner;

public class PrimeNo 
{
	
	

	public static void main(String[] args) 
	{
		    int num, count=0;
		    int i = 2;
	        Scanner s = new Scanner(System.in);
			
	        System.out.println("Enter a number: ");
	        num = s.nextInt();
			
	       
	            if(num%i == 0)
	            {
	                count++;
	                //break;
	            }
	        
	        if(count == 0)
	        {
	            System.out.println("This is a Prime Number");
	        }
	        else
	        {
	            System.out.println("This is not a Prime Number");
	        }
		

	}

}
