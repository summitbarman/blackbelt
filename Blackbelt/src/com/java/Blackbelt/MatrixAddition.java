package com.java.Blackbelt;

public class MatrixAddition 
{
	public static void main(String[] args) 
	{
		int arr1[][]={{10,23,45},{10,23,45},{10,23,45}};
		int arr2[][]={{10,23,45},{10,23,45},{10,23,45}};
		int arrRes[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arrRes[i][j]=arr1[i][j]-arr2[i][j];
				System.out.print(arrRes[i][j]+" ");
			}
			System.out.println();
		}
	}
}
