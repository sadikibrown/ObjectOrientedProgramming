package q3;

import java.util.LinkedList;
import java.util.Scanner;

import java.io.IOException;
import java.io.FileWriter;

public class DataAnalyzerTester {

	public static void main(String[] args)
	{
		/**Creates scanner instance and linked list*/
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		/**Prompts user for file name and stores it in "filename"*/
		System.out.println("Please enter file name you want to write to (Do not include .txt): ");
		String filename = scan.nextLine() + ".txt";
		
		/**Prompts user for first number and adds it to the list.*/
		System.out.println("Please enter the first number: ");
		int n  = scan.nextInt();
		list.add(n);
		
		/**Initialize loop control variable*/
		char cont = 'Y';
		
		/**While loop to continue asking for numbers in the list until user has no more.*/
		while(cont == 'Y')
		{
			System.out.println("Please enter the next number: ");
			n = scan.nextInt();
			list.add(n);
			
			System.out.println("Do you wish to add another? (Y/N)");
			cont = scan.next().charAt(0);
			cont = Character.toUpperCase(cont);
		}
		
		scan.close();
		
		/**Creates DataAnalyzer instance*/
		DataAnalyzer vehicle = new DataAnalyzer(list);

		/**Try-catch to deal with the file writing.*/
		try {
			/**Create file object to write to the file.*/
			FileWriter write = new FileWriter(filename);
			write.write("List: " + list + "\n");
			System.out.println("List: " + list);
			
			/**Writes minimum value.*/
			int minimum = vehicle.min();
			write.write("Min: " + minimum + "\n");
			System.out.println("Min: " + minimum);
			
			/**Writes maximum value.*/
			int maximum = vehicle.max();
			write.write("Max: " + maximum + "\n");
			System.out.println("Max: " + maximum);
			
			/**Writes average value.*/
			int average = vehicle.avg();
			write.write("Avg: " + average + "\n");
			System.out.println("Avg: " + average);
			
		    write.close();
		    
		    System.out.println("Information successfully written to file.");
		}
		catch (IOException e)
		{
			/**Exception handling*/
			System.out.println("An error occurred.");
			return;
		}
	}
}
