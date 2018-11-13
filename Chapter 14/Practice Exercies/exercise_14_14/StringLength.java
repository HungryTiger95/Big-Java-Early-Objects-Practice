package exercise_14_14;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Sort an array list of strings by increasing length. Hint: Supply a Comparator
 * 
 * @author Mayuresh
 *
 */
public class StringLength
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	public static void main(String[] args)
	{
		ArrayList<String> s = new ArrayList<String>();
		s.add("Hello");
		s.add("Hi");
		s.add("Hola");
		s.add("Allo");
		s.add("Namaste");
		
		Collections.sort(s, new StringLengthComparator());;
		
		System.out.println(s);
	}
}
