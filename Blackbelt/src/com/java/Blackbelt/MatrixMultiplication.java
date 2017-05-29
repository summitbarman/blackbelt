package com.java.Blackbelt;

public class MatrixMultiplication 
{
	public static void main(String[] args) 
	{
		int mat1[][]={{2,3,4},{2,4,6}};
		int mat2[][]={{2,3},{2,4},{4,5}};
		int resMat[][]=new int[2][2];
		int sum=0;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<3;k++)
				{
					sum=sum+mat1[i][k]*mat2[k][j];
				}
				resMat[i][j]=sum;
				sum=0;
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(resMat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
