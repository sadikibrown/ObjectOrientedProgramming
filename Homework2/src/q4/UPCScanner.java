package q4;

public class UPCScanner {
	
	/**Constructor*/
	public UPCScanner() 
	{
		
	}
	
	/**Calls getUPC.*/
	public void displayItemInfo()
	{	
		user.getUPC();
	}

	/**Calls calculateTotal and prints the total.*/
	public void displayTotal()
	{	
		/**Call calculateTotal and store in variable totalprice.*/
		totalprice = user.calculateTotal();
		
		/**Print totalprice.*/
		System.out.println("Total: $" + totalprice);
	}
	
	/**Displays receipt - Call printSelections and print the total.*/
	public void displayReceipt()
	{
		/**Print array list of selections*/
		user.PrintSelections();
		
		System.out.println("------------");
		
		/**Print total price.*/
		System.out.println("Total: $" + totalprice);
	}
	
	/**Variable to hold the total price once calculated.*/
	public double totalprice;
	
	/**Create new cashier object called user.*/
	private Cashier user = new Cashier();
	
	/**Create item object called current to hold current item when traversing list of items*/
	Item current = new Item("junk", "junk", 0);
	
	public static void main(String[] args) {
		/**Create UPCScanner object*/
		UPCScanner buffer = new UPCScanner();
		
		/**Call displayItemInfo*/
		buffer.displayItemInfo();
		
		/**Call displayTotal*/
		buffer.displayTotal();
		
		/**Call displayReceipt*/		
		buffer.displayReceipt();
	}

}
