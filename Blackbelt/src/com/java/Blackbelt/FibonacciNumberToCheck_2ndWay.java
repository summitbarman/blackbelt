package com.java.Blackbelt;

import java.util.Scanner;

public class FibonacciNumberToCheck_2ndWay 
{	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check");
		int num=sc.nextInt();
		
		if(num<0)
		{
			System.out.println("Enter positive number");
		}
		else
		{
			int a=0,b=1,c=0;
			while(c<num)
			{
				a=b;
				b=c;
				c=a+b;
			}
			if(c==num)
			
				System.out.println(num+" is a Fibonacci Number");
			
			else
			
				System.out.println(num+" is not a Fibonacci number");
			
		}
		sc.close();
	}
}
