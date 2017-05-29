package com.java.Blackbelt;

public class PrintOneToHundredWithoutLoop 
{
	public static void main(String[] args) 
	{
		print(1);
	}
	public static void print(int n)
	{
		if(n<=100)
		{
			System.out.println(n);
			print(n+1);
		}
	}
}
