//WAP to print pascal triangle?
package com.java.Blackbelt;

public class PascalTriangle 
{
	public static void main(String[] args) 
	{
		int odd=1;
		int space=3;
		for(int i=1;i<=4;i++)
		{
			int k=0;
			for(int l=1;l<=space;l++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=odd;j++)
			{
				if(j<=i)
				{
					k=k+1;
				}
				else
				{
					k=k-1;
				}
				System.out.print(k);
			}
			System.out.println();
			odd=odd+2;
			space=space-1;
		}
		
	}
}
