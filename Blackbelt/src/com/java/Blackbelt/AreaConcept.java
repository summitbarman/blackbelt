package com.java.Blackbelt;
import java.util.Scanner;

public class AreaConcept 
{
	public static void main(String[] args) 
	{
		//Find the Area of Circle
	/*	
		double PI=3.1416, area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double r=sc.nextDouble();
		area=PI*r*r;
		System.out.println("The Are is : "+area);
		sc.close();
	*/
		//Find the Area Square 
	/*	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Width : ");
		double w=sc.nextDouble();
		double res=w*w;
		System.out.print("The Area of Square is : "+res);
	*/
		//Find the Area Rectangle
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length :");
		double len=sc.nextDouble();
		System.out.println("Enter the Width :");
		double wid=sc.nextDouble();
		double res=len*wid;
		System.out.println("The Area of Rectangle is : "+res);
	}
}
