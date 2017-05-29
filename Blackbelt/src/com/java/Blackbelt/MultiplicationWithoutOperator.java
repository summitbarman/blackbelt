package com.java.Blackbelt;
import java.util.Scanner;

public class MultiplicationWithoutOperator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st no.");
		int one=sc.nextInt();
		System.out.println("Enter the 2nd no.");
		int two=sc.nextInt();
		int result=mul(one,two);
		System.out.println("Result "+result);
	}
	public static int mul(int a,int b)
	{
		int i=0;
		int temp = a;
		if(a==0)
		{
			return 0;
		}
		else if(b==0)
		{
			return 0;
		}
		else
		{
			while(i<b-1)	//0<4, 1<4, 2<4, 3<4,//0<4 
			{
				a+=temp;
				i++;
			}
			return a;
		}
	}
}
