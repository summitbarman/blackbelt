package com.java.Blackbelt;
import java.util.Scanner;

public class MatrixThreeIntoThree 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int mat[][]={
						{10,20,30},
						{10,20,30},
						{10,20,30},
					};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(mat[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
