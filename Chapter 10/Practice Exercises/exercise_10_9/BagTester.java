package exercise_10_9;

public class BagTester
{
	public static void main(String[] args)
	{
		Bag bag = new Bag();
		bag.add("A");
		bag.add("B");
		bag.add("C");
		bag.add("A");
		bag.add("B");
		bag.add("D");
		bag.add("A");
		bag.add("D");
		bag.add("A");
		
		Bag bag2 = new Bag();
		bag2.add("C");
		bag2.add("A");
		bag2.add("D");
		bag2.add("B");
		bag2.add("B");
		bag2.add("D");
		bag2.add("A");
		bag2.add("D");
		bag2.add("A");
		
		// Bag 1
		System.out.println("Number of \"A's\" in the Bag: " + bag.count("A"));
		System.out.println("Expected: 4");
		
		System.out.println("***********************************************************************");
		
		System.out.println("Number of \"B's\" in the Bag: " + bag.count("B"));
		System.out.println("Expected: 2");
		
		System.out.println("***********************************************************************");
		
		System.out.println("Number of \"C's\" in the Bag: " + bag.count("C"));
		System.out.println("Expected: 1");
		
		System.out.println("***********************************************************************");
		
		System.out.println("Number of \"D's\" in the Bag: " + bag.count("D"));
		System.out.println("Expected: 2\n\n");
		
		// Bag 2
		System.out.println("Number of \"A's\" in the Bag: " + bag2.count("A"));
		System.out.println("Expected: 3");
		
		System.out.println("***********************************************************************");
		
		System.out.println("Number of \"B's\" in the Bag: " + bag2.count("B"));
		System.out.println("Expected: 2");
		
		System.out.println("***********************************************************************");
		
		System.out.println("Number of \"C's\" in the Bag: " + bag2.count("C"));
		System.out.println("Expected: 1");
		
		System.out.println("***********************************************************************");
		
		System.out.println("Number of \"D's\" in the Bag: " + bag2.count("D"));
		System.out.println("Expected: 3");
	}
}
