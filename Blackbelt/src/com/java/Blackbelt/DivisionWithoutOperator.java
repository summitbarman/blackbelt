package com.java.Blackbelt;
import java.util.Scanner;

public class DivisionWithoutOperator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value : ");
		double a=sc.nextDouble();
		System.out.println("Enter the 2nd value : ");
		double b=sc.nextDouble();
		double res=div(a,b);
		System.out.println("Result is "+res);
	}
	public static double div(double one,double two)
	{
		if(one<two)
		{
			return 0;
		}
		else
		{
			return 1+div(one-two,two);
		}
	}
}
/*
56
8

56-8=48
48,8..........1
48-8=40
40,8..........2
40-8=32
32,8..........3
32-8=24
24,8..........4
24-8=16
16,8..........5
16-8=8
8,8...........6
1+6=7 is the result.
*/