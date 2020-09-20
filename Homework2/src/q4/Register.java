package q4;
import java.util.ArrayList;

/**Manage item information*/
public class Register {
	
	/**Constructor - Initialize register with hardcoded values.*/
	public Register() {
        this.items.add(new Item("101", "Snickers bar ", 1.00));
        this.items.add(new Item("102", "Skittles     ", 1.50));
        this.items.add(new Item("103", "Twix         ", 1.75));
        this.items.add(new Item("104", "Gum          ", 2.00));
        this.items.add(new Item("105", "Hershey bar  ", 2.50));
        this.items.add(new Item("106", "Kit Kat      ", 1.50));
        this.items.add(new Item("107", "Nerds        ", 1.00));
        this.items.add(new Item("108", "Butterschotch", 1.50));
        this.items.add(new Item("109", "Starburst    ", 2.00));
        this.items.add(new Item("110", "York Patty   ", 1.75));
    }
	
	/**Search for given UPC and displays info on object if found.*/
	public void SearchandDisplay(String UPC)
	{	
		/**Iterate through all items*/
		for (int i = 0; i < items.size(); i++)
		{
			/**Give "current" the current item in the list of items.*/
			current = items.get(i);
			
			/**If statement - If the given UPC equals the current item's UPC enter*/
			if(UPC.equals(current.UPC))
			{
				/**create namepass to hold the current item's name and then print it*/
				String namepass = current.name;
				System.out.println("Item name: " + current.name);
				
				/**Create UPCpass to hold current item's UPC and then print it*/
				String UPCpass = current.UPC;
				System.out.println("Item UPC: " + current.UPC);
				
				/**Create pricepass to hold current item's price and print it.*/
				double pricepass = current.unitprice;
				System.out.println("Item unit price: $" + current.unitprice);
				
				/**Add item to list of selected items.*/
				selections.add(new Item(UPCpass, namepass, pricepass));
				return;
			}
		}
		
		/**Notify cashier that UPC was not found.*/
		System.out.println("UPC not found");
		return;
		
	}
	
	/**Create array list to hold selected items.*/
	public ArrayList<Item> selections = new ArrayList<Item>();
	
	/**Create array list to hold all items in register*/
	public ArrayList<Item> items = new ArrayList<Item>();
	
	/**Create dummy item object*/
	Item current = new Item("junk", "junk", 0);
}
