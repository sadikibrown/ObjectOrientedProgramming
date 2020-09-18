package q5;

import java.util.ArrayList;

public class PrimeFactorizer {
	/**Initialize the object with target number n.*/
	  public PrimeFactorizer(int n) 
	  { 
	    number = n;
	  } 
	  
	  /**Compute factorization. Do not repeat operation if it was called before.*/
	  public void compute()
	  {
		  int count;
	        
		  for (int i = 2; i<=(number); i++) 
		  {
	            count = 0;
	            while (number % i == 0) 
	            {
	                number /= i;
	                count++;
	                if (count == 0) 
	                {
	                    continue;
	                }
	            }
	            
	            if(count != 0) 
	            {
	            	base.add(i);
		            tothepowerof.add(count);
	            }
		  }
		  
	  }
	  
	  /**
	   * Return the factors and exponents in two arraylists. Call compute() first, if necessary.
	   * For instance, if n=60, primes=[2,3,5], and exponents=[2,1,1].
	   * This function overwrites the 'n' parameter passed to the constructor.
	   */
	  public void getFactorsAndExponents(int n, ArrayList<Integer> primes, ArrayList<Integer> exponents) 
	  {
		  this.compute();
		  number = n;
		  
		  primes = base;
		  exponents = tothepowerof;
		  
		  System.out.println(primes);
		  System.out.println(exponents);
	  }
	  
	  
	  /**Return a string with the "pretty" representation of the prime factorization. 
	   * For instance, if n is 60, then toString() for the PrimeFactorizer(60) object 
	   * *should be "60 = 2^2*3*5". Call compute() if not done before.
	   */
	  public String toString() {
		  String holder = "";
		  
		  holder = number + " = ";
		  
		  for(int i = 0; i < base.size(); i++)
		  {
			  holder += "(" + base.get(i) + "^" + tothepowerof.get(i) + ")";
		  }
		  
		  return holder;
	  }
	  
	  public int number;
	  public ArrayList<Integer> base = new ArrayList<Integer>();
	  public ArrayList<Integer> tothepowerof = new ArrayList<Integer>();
};
