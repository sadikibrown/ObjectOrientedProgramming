package q3;

import java.util.LinkedList;

public class DataAnalyzer {
	
	/**Constructor*/
	public DataAnalyzer(LinkedList<Integer> numList)
	{
		classlist = numList;
	}
	
	/**Finds the minimum value in the list.*/
	public int min() 
	{
		if(classlist == null)
		{
			System.exit(0);
		}
		
		/**Declare and initialize variable with first element value in the list.*/
		int min = classlist.get(0);
		
		int eye;
		
		/**For loop to find minimum value.*/
		for(int i = 1; i < classlist.size(); i++)
		{
			eye = classlist.get(i);
			
			if(eye < min)
			{
				min = eye;
			}
				
		}
		
		return min;
	}
	
	/**Finds the maximum value in the list*/
	public int max()
	{
		if(classlist == null)
		{
			System.exit(0);
		}
		
		/**Declare and initialize variable with value of first element.*/
		int max = classlist.get(0);
		
		int eye;
		
		/**Loop to find maximum value in the list.*/
		for(int i = 1; i < classlist.size(); i++)
		{
			eye = classlist.get(i);
			
			if(eye > max)
			{
				max = eye;
			}
		}
		
		return max;
	}
		
	/**Finds the average of the numbers in the list*/
	public int avg()
	{
		if(classlist == null)
		{
			System.exit(0);
		}
		
		/**Initialize variable tot with value from first element in list.*/
		int tot = classlist.get(0);

		int eye;
		
		/**Compute total of element values.*/
		for(int i = 1; i < classlist.size(); i++)
		{
			eye = classlist.get(i);
			
			tot += eye;
			
		}
		
		/**Compute average*/
		int avg = tot/classlist.size();
		
		return avg;
	}
	
	/**Linked list declaration for classlist*/
	LinkedList<Integer> classlist = new LinkedList<Integer>();
}
