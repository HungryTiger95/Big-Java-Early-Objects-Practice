/**
 * 
 */
package section_02;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Mayuresh
 *
 */
public class ListDemo
{
	public static void main(String[] args)
	{
		LinkedList<String> staff = new LinkedList<String>();
		staff.addLast("Diana");
		staff.addLast("Harry");
		staff.addLast("Romeo");
		staff.addLast("Tom");
		
		// | in the comments indicates the iterator position
		ListIterator<String> iterator = staff.listIterator();	// |DHRT
		iterator.next();										// D|HRT
		iterator.next();										// DH|RT
		
		// Add two more elements after the second element
		iterator.add("Juliet");									// DHJ|RT
		iterator.add("Nina");									// DHJN|RT
		
		iterator.next();										// DHJNR|T
		
		// Remove the last traversed element
		iterator.remove();										// DHJN|T
		
		// Print all elements
		System.out.println(staff);
		System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");
	}
}
