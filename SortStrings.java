// Java Program to Sort Names in an Alphabetical Order
import java.io.*;

class SortStrings
 {
	public static void main(String[] args)
	{
		int n = 4;
		
		// create string array called names
		String names[]= { "Priya","Adhvik","Tanvi","Sakshi" };
		String temp;
		for (int i = 0; i < n; i++)
		 {
			for (int j = i + 1; j < n; j++)
			 {
				if (names[i].compareTo(names[j]) > 0)
				 {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		System.out.println("The names in alphabetical order are: ");
		for (int i = 0; i < n; i++) 
		{
			System.out.println(names[i]);
		}
	}
}
