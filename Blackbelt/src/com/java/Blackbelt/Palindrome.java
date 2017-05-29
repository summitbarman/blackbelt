//WAP to print palindrome?
package com.java.Blackbelt;
import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check");
		int num=sc.nextInt();
		int rev,sum=0;
		int	pal=num;
		while(num>0)
		{
			rev=num%10;
			num=num/10;
			sum=sum*10+rev;
		}
		if(pal==sum)
		{
			System.out.println(pal+" is  palindrome");
		}
		else
		{
			System.out.println(pal+" is not palindrome");
		}
	}
}
