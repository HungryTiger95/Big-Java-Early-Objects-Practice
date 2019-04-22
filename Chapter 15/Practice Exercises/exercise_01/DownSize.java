package exercise_01;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Write a method
 * 
 * 		public static void downsize(LinkedList<String> employeeNames, int n)
 * 
 * that removes every nth employee from a linked list
 * 
 * @author Mayuresh
 *
 */
public class DownSize
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	public static void main(String[] args)
	{
		String[] employees = {"Mark", "Payal", "Raj", "Aarohi", "Mansi", "Karan", "Kiran", "Simran", "Jack", "Simar", "Samar", "Deepika"};
		LinkedList<String> employeeNames = new LinkedList<String>();
		
		for(int i = 0; i < employees.length; i++)
		{
			employeeNames.add(employees[i]);
		}
		
		System.out.println(employeeNames);
		downsize(employeeNames, 2);
		System.out.println(employeeNames);
	}
	
	/**
	 * Downsizes a linked list by removing every nth node
	 * @param employeeNames the list
	 * @param n the nth position
	 */
	public static void downsize(LinkedList<String> employeeNames, int n)
	{
		ListIterator<String> iter = employeeNames.listIterator();
		
		// This is needed because the size of the list changes as elements are removed
		int listSize = employeeNames.size();
		for(int i = 1; i <= listSize; i++)
		{
			iter.next();
			
			if(i % n == 0)
			{
				iter.remove();
			}
		}
	}
}
