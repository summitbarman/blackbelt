package com.java.Blackbelt;
import java.util.Scanner;

public class PrimeNumberCheckingConcept 
{
	public static void main(String[] args) 
	{
		boolean isPrime=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num=sc.nextInt();
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(num+" is Prime number");
		}
		else
		{
			System.out.println(num+" is not a Prime Number");
		}
	}
}
