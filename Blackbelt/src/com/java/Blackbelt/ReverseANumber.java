//7.WAP to reverse a number?
package com.java.Blackbelt;
import java.util.Scanner;

public class ReverseANumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to reverse : ");
		int num=sc.nextInt();
		int rev,sum=0;
		
		while(num>0)
		{
			rev=num%10;
			num=num/10;
			sum=sum*10+rev;
			System.out.print(rev);
		}
		
	}
}
