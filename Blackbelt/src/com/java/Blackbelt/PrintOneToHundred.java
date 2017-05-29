package com.java.Blackbelt;

public class PrintOneToHundred 
{
	public static void main(String[] args) 
	{
		int i;
		for(i=1;i<=100;i++)
		{
			if(i%2==0 && i%3==0)
			{
				System.out.println("wasim");
			}
			else
			{
				if(i%2==0)
				{
					System.out.println("Hi");
				}
				else if(i%3==0)
				{
					System.out.println("Bye");
				}
				else
				{
					System.out.println(i);
				}
			}
		}	
	}
}
