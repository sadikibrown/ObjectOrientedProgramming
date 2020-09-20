package q4;

import java.util.Scanner;

/**Cashier class*/
public class Cashier {
	
	/**Constructor*/
	public Cashier() {}
	
	/**Prompts cashier for UPC until the enter N/n indicating they want to exit.*/
	public void getUPC()

	{
		/**Create scanner object.*/
		Scanner scan = new Scanner(System.in);
		
		/**Loop control variable initialization.*/
		char pay = 'N';
		
		/**While loop that prompts cashier for UPC and calls SearchandDisplay to find that item.*/
		while (pay == 'N')
		{
			/**Prompt user for UPC and scan.*/
			System.out.println("Please enter the UPC: ");
			UPC = scan.nextLine();
			
			/**Call Search and Display to find the item and display its information.*/
			register.SearchandDisplay(UPC);
			
			/**Prompt user to update status on loop control variable*/
			System.out.println("Are you ready to pay? (y/n): ");
			pay = scan.next().charAt(0);
			pay = Character.toUpperCase(pay);
			scan.nextLine();
		}
		
		/**Close scanner*/
		scan.close();
	}
	
	/**Calculates total price of selected items.*/
	public double calculateTotal()
	{
		/**Create variable to hold total price and itinitialize to zero.*/
		double total = 0.00;
		
		/**For loop to get total price from each item in list of selections.*/
		for (int i = 0; i < register.selections.size(); i++)
		{
			/**Temp holds current item in list of selections.*/
			temp = register.selections.get(i);
			
			/**Update total with included item price.*/
			total += temp.unitprice;
		}
		
		/**Return total price value*/
		return total;
	}

	/**Print list of selections*/
	public void PrintSelections()
	{
		/**Indicate start of receipt.*/
		System.out.println("\n------------RECEIPT------------");
		
		/**Loop to go through all items in list of selections.*/
		for (int i = 0; i < register.selections.size(); i++)
		{
			/**temp holds current item in list of selections.*/
			temp = register.selections.get(i);
			
			/**Print info on all items in list of selections.*/
			System.out.println(temp.name + "\t" + temp.UPC + "\t$" + temp.unitprice);
		}
	}
	
	/**Holds the UPC from the cashier.*/
	public String UPC;
	
	/**Temp to hold current item in list of items.*/
	Item temp = new Item("junk", "junk", 0);
	
	/**Create register object*/
	Register register = new Register();
}
