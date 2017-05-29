//WAP to print factorial of a number?
package com.java.Blackbelt;
import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to get the factorial : "+"\n");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(num+" factorial is "+fact); 
		
	}
}
