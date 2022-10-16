//1. Program to check whether the given integer number is multiple of 5
//2. Check if a list of integers contains only odd numbers
//3. How to remove leading and trailing whitespaces from a string
//import java.util.*;
//import java.util.Scanner;
//class Multiplefive
//{
//	public static void main(String args[])
//	{
		//int n;
		//Scanner sc= new Scanner(System.in);
		//System.out.println("Enter the value:");
		//n=sc.nextInt();
		//System.out.printf("Your entered value is: %d ", n);
		//if(n==int)
		//{
			
		//}		
	//}
//}
import java.util.Scanner;
public class Multiplefive 
{ 
	public static void main(String[] args)   
	{ 
		Scanner sc = new Scanner(System.in);   
		if(sc.hasNextInt()) {
		   System.out.println(sc.nextInt()+" is valid Integer");
		}
		else
		{
			 System.out.println(sc.nextInt()+" is valid Integer");
		}
		sc.close();
	} 
}