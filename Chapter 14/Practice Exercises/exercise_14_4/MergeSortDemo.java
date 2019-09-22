package exercise_14_4;

public class MergeSortDemo
{
	public static void main(String[] args)
	{
		// Create an array of strings
		String[] strings = new String[10];
		strings[0] = "Hello Mayuresh";
		strings[1] = "Charizard";
		strings[2] = "Blastoise";
		strings[3] = "Embrava";
		strings[4] = "Sev";
		strings[5] = "Fortune Favors the Brave";
		strings[6] = "Maha Utsav";
		strings[7] = "Lettering Numbers";
		strings[8] = "Big Java";
		strings[9] = "Little Java";
		
		// Print all the Strings
		for(int i = 0; i < strings.length; i++)
		{
			System.out.printf("[string=%s]\n", strings[i]);
		}
		System.out.println();
		
		// Merge sort the array
		MergeSorter.sort(strings);
		
		// Print the strings again
		for(int i = 0; i < strings.length; i++)
		{
			System.out.printf("[string=%s]\n", strings[i]);
		}
		System.out.println();
	}
}
