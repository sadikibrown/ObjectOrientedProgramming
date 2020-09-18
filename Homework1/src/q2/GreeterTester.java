package q2;

public class GreeterTester {

	public static void main(String[] args) 
	{		
		/**Message indidcating swapNames test*/
		System.out.println("---Now testing swapNames---");
		
		/**Initializes two different instances with names.*/
		System.out.println("Preswap:");
		Greeter g1 = new Greeter("Tom");
		Greeter g2 = new Greeter("Jerry");
		
		/**Prints current names*/
		System.out.println("g1: " + g1.name);
		System.out.println("g2: " + g2.name);
		
		/**Swap*/
		g1.swapNames(g2);
		
		/**Prints names againt to show successful swap.*/
		System.out.println("Postswap:");
		System.out.println("g1: " + g1.name);
		System.out.println("g2: " + g2.name);
		
		/**Message to indidcate createQualifiedGreeter test*/
		System.out.println("---Now testing createQualifiedGreeter---");
		
		/**Create new instances of Greeter and initialize.*/
		Greeter g4 = new Greeter("world");
		Greeter g5 = g4.createQualifiedGreeter("beautiful");
		
		System.out.println(g5.name);
	}

}
