package FibonacciPrime;

public class PrimeNumber 
{
	static void prime(int num)
	{
		boolean isPrime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(num+" is Prime Number");
		}
		else
		{
			System.out.println(num+" is not Prime Number");
		}
	}
}
