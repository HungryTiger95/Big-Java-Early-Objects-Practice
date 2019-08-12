package exercise_18;

public class HashSetTest
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet(10);
		
		// Test the add feature
		int[] vals = new int[11];
		for(int i = 0; i < vals.length; i++)
		{
			vals[i] = i + 1;
			set.add(vals[i]);
		}
		
		System.out.println(set.toString() + "\n\n");
		
		// Test the remove feature
		for(int i = 0; i < 8; i++)
		{
			set.remove(i + 1);
			System.out.println(set.toString());
		}
	}
}
