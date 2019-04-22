package exercise_02;

import java.util.LinkedList;

/**
 * Write a method:
 * 
 * 		public static void reverseList(LinkedList<String> list)
 * 
 * that reverses the entries in a linked list
 * 
 * @author Mayuresh
 *
 */
public class ReverseList
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
		reverseList(employeeNames);
		System.out.println(employeeNames);
	}
	
	/**
	 * Reverses the nodes in a linked list
	 * @param list the list
	 */
	public static void reverseList(LinkedList<String> list)
	{
		int listLength = list.size();
		LinkedList<String> temp = new LinkedList<String>();
		
		for(int i = 0; i < listLength; i++)
		{
			temp.addFirst(list.removeFirst());
		}
		
		list.addAll(temp);
	}
}
