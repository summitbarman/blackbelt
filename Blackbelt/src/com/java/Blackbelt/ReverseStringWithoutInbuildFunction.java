package com.java.Blackbelt;

import java.util.Scanner;
public class ReverseStringWithoutInbuildFunction 
{
	public static void main(String[] args) 
	{
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String org=sc.nextLine();
		int length=org.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		System.out.print("The Reverse String is : "+rev);
	}
}
