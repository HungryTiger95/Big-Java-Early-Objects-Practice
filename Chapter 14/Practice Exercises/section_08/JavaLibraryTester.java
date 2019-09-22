package section_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaLibraryTester
{
	public static void main(String[] args)
	{
		// Make a random array of integer values and print it out
		int[] values = {1, 4, 9, 1, 6, 2, 5, 3, 6, 4, 9, 6, 4, 8, 1};
		System.out.println(Arrays.toString(values));
		
		// Sort the array and then print it out
		Arrays.sort(values);
		System.out.println(Arrays.toString(values));
		
		// Search for a value in the array
		int pos = Arrays.binarySearch(values, 4);
		System.out.println("Position of 4: " + pos);
		
		// Search for another value in the array
		pos = Arrays.binarySearch(values, 7);
		System.out.println("Position for inserting 7: " + (-pos - 1));
		
		// Construct 3 Countries
		Country c1 = new Country("Belgium", 30510);
		Country c2 = new Country("Thailand", 514000);
		Country c3 = new Country("Uruguay", 176220);
		
		ArrayList<Country> countries = new ArrayList<Country>();
		countries.add(c1);
		countries.add(c2);
		countries.add(c3);
		System.out.println(countries);
		
		Collections.sort(countries);
		System.out.println(countries);
		
		
	}
}
