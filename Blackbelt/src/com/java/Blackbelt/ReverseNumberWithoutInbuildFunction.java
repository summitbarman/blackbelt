package com.java.Blackbelt;
import java.util.Scanner;

public class ReverseNumberWithoutInbuildFunction 
{
	public static int rev(int n)
	{
		int result=0;
		int rem;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			result=result*10+rem;
		}
		return result;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int org=sc.nextInt();
		int result=rev(org);
		System.out.println(result);
		sc.close();
	}
}
