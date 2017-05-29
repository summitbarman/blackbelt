//1.WAP to print fibonacci series?
package com.java.Blackbelt;

import java.util.Scanner;

public class FibonacciConcept 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int limit=sc.nextInt();
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		c=a+b;
		System.out.println(c);
		while(c<limit)
//		for(int i=0;i<=limit;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}
		sc.close();
	}
}
