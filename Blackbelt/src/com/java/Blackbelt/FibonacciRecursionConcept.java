package com.java.Blackbelt;
import java.util.Scanner;

public class FibonacciRecursionConcept 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of Fibonacci Series");
		int hati=sc.nextInt();
		for(int i=0;i<hati;i++)
		{
			System.out.println(fibo(i));
		}
		
	}
	public static int fibo(int num)
	{
		if(num==0)
		{
			return 0;
		}
		if(num==1)
		{
			return 1;
		}
		return fibo(num-1)+fibo(num-2);
	}
}

