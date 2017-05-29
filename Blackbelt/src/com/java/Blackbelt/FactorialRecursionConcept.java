package com.java.Blackbelt;
import java.util.Scanner;

public class FactorialRecursionConcept 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int res=sc.nextInt();
		System.out.println(fact(res));
		sc.close();
	}
	public static int fact(int num)
	{
		if(num==0)
		{
			return 1;
		}
		return num*fact(num-1);
	}
}
