//WAP to reverse a string?
package com.java.Blackbelt;
import java.util.Scanner;

public class ReverseAString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to be reversed : ");
		String words=sc.nextLine();
		
		String word=new StringBuffer(words).reverse().toString();
		System.out.println(word);
	}
}
