package FibonacciPrime;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
		int res=fibo(num);
		if(res%2==0)
		{
			System.out.println(res+" not prime");
		}
		else
		{
			System.out.println(res+" prime number");
		}
	}
	static int fibo(int num)
	{
		int a=0,b=1,c=0;
		while(c<num)
		{
			a=b;
			b=c;
			c=a+b;
		}
		/*if(c%2==0)
		{
			System.out.println(c+" not prime");
		}
		else
		{
			System.out.println(c+" prime number");
		}*/
		/*if(c==num)
		{
			System.out.println("The number is fibonacci number");
		}*/
		return c;
	}
}
