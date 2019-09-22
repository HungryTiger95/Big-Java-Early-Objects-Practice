package exercise_14_15;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Sort an array list of strings by increasing length, and so that strings of the same length are
 * sorted lexicographically. Hint: Supply a Comparator
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
		s.add("ate");
		s.add("eight");
		s.add("bait");
		s.add("late");
		s.add("mate");
		s.add("hate");
		s.add("bay");
		s.add("may");
		s.add("ornate");
		s.add("destiny");
		
		Collections.sort(s, new StringLengthComparator());;
		
		System.out.println(s);
	}
}
