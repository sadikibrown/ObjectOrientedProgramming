package q5;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> primes = new ArrayList<Integer>(); 
		ArrayList<Integer> exponents = new ArrayList<Integer>();
		
		Scanner scan = new Scanner(System.in);
		  
		System.out.println("Please enter a positive integer: ");
		
		int n = scan.nextInt();
		
		scan.close();
		
		try 
		{
			if(n<1)
			{
				throw new IllegalArgumentException();
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Number is not a positive integer.");
			return;
		}	
		 
		PrimeFactorizer factor = new PrimeFactorizer(n);
		
		factor.getFactorsAndExponents(n, primes, exponents);
		
		String pretty = factor.toString();
		
		System.out.println(pretty);
	}

}
