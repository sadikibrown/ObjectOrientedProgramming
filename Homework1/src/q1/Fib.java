package q1;

import java.util.Scanner;

/**A class for calculation the Fibonacci sequence.*/
public class Fib {
	
	/**Constructor that creates a Fib object.*/
	public Fib(int f0, int f1)	
	{
		enminusone = 1;
		enminusone = 0;
	}
	
	/**Computes F(n) using an ***iterative*** algorithm.*/
	public int f(int n) {
		int current = 0;
		
		if(n==0)
		{
			enminustwo = 0;
			return enminustwo;
		}
		
		if(n==1)
		{
			enminusone = 1;
			return enminusone;
		}
		
		if(n>1)
		{
			enminustwo = 0;
			enminusone = 1;
			
			for(int i = 2; i <= n; i++)
			{
				current = enminusone + enminustwo;
				
				enminustwo = enminusone;
				enminusone = current;
				
				if(i == n)
				{
					break;
				}
			}	
		}
		
		return current;
	}

	/**Computes F(n) using a ***recursive*** algorithm.*/
	public int fRec(int n) {
		
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		else
		{
			int sol = fRec(n-1) + fRec(n-2);
			return sol;
		}
	}
	
	public static void main(String[] args) 
	{
		/**Creating Scanner object.*/
		Scanner scan = new Scanner(System.in);
		
		/**Getting F(0) from user.*/
		System.out.println("Enter the first value in the sequence: ");
		int f0 = scan.nextInt();
		
		/**Getting F(1) from user.*/
		System.out.println("Enter the second value in the sequence: ");
		int f1 = scan.nextInt();
		
		/**Gets n from the user*/
		System.out.println("F(_)? : ");
		int n = scan.nextInt();
		scan.close();
		
		/**Try-catch to see if n is a negative number. If so, a message is printed and program terminates.*/
		try
		{
			if(n<0)
			{
				throw new IllegalArgumentException();
			}
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("Number is less than zero.");
			System.exit(0);
		}
		
		/**Creates a Fib object.*/
		Fib FibObject = new Fib(f0,f1);

		/**Calculates the sequence recursively up until n and displays it.*/
		System.out.println("---Now testing recursive method---");
		for(int i = 0; i <= n; i++)
		{
			System.out.println(FibObject.fRec(i));
		}
		
		/**Calculates the sequence iteratively up until n and displays it.*/
		System.out.println("---Now testing iterative method---");
		for(int i = 0; i <= n; i++)
		{
			System.out.println(FibObject.f(i));
		}
	}

	/**instance variables store F(0) and F(1)*/
	public int enminusone;
	public int enminustwo;
};
