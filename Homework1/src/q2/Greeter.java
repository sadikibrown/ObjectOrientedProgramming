package q2;

/**A class for producing simple greetings.*/
public class Greeter 
{
	/**Constructs a Greeter object that can greet a person or entity.*/
	public Greeter(String aName)
	{
		name = aName;
	}
	
	/**Greet with a "Hello" message.*/
	public String sayHello()
	{
		return "Hello, " + name + "!";
	}
	
	/**Sets this greeter's name to the given name.*/
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**Swaps the names of this greeter and another instance.*/
	public void swapNames(Greeter other)
	{
		String temp = this.name;
		
		this.name = other.name;
		
		other.name = temp;
	}
	
	/**Returns a new Greeter object with its name being the qualifier string followed by " " and 
	 * the executing greeter's name (i.e. this.name).*/
	public Greeter createQualifiedGreeter(String qualifier)
	{
		/**Creates new instance of Greeter object*/
		Greeter placehold = new Greeter("placehold");
		
		/**Sets name field to the qualifier plus the name of the current instance.*/
		placehold.name = qualifier + " " + this.name;
		
		/**return instance*/
		return placehold;
		
	}
	
	public String name;
}
