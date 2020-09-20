package q4;

/**Class to define item*/
public class Item {
	
	/**Universal Product Number variable*/
	public String UPC;
	
	/**Constructor - Initialize class fields with input from parameters.*/
	public Item(String UPC, String name, double unitprice) 
	{
		this.UPC = UPC;
		this.name = name;
		this.unitprice = unitprice;
		this.quantity = 0;
	}
	
	/**Add method to use to add another item to the list of items.*/
	public void add()
	{
		/**Increase quantity of of list*/
		this.quantity = this.quantity + 1;
	}
	
	/**Item name*/
	public String name;
	
	/**Item unit price*/
	public double unitprice;
	
	/**Quanitity of items in list of items*/
	private int quantity;
}
