package com.java.Blackbelt;

import java.util.Scanner;

public class FibonacciPrimeNumber 
{
	static int primeCheck(int number)
	{
		int limit=number/2,b=0;
		for(int i=2;i<=limit;i++)
		{
			if(number/i==0)
			{
				b=1;
			}
		}
		return b;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check Fibonacci-Prime");
		int number=sc.nextInt();
		int first=0,second=1,next=1,fibo=0,fibo1=1;
		System.out.println(fibo+" "+fibo1+" ");
		while(first+second<=number)
		{
			next=first+second;
			System.out.println(next+" ");
			first=second;
			second=next;
		}
		int check=primeCheck(number);
		if(next==number && check==1)
		{
			System.out.println("\nThe given number is Fibonacci Prime Number");
		}
		else
		{
			System.out.println("\nThe given number is not Fibonacci Prime Number");
		}
	}
}