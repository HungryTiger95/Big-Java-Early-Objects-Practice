
public class DoorTester
{
	public static void main(String[] args)
	{
		// Test Constructor1
		Door door1 = new Door(0, "Car");
		
		// Test Constructor2
		Door door2 = new Door(1);
		
		// Test Constructor3
		Door door3 = new Door();
		
		// Print what should come out
		System.out.printf("door1: %d, %s\n", door1.getDoorVal(), door1.getDoorName());
		System.out.println("Expetcted: 0, Car");
		
		System.out.printf("door2: %d, %s\n", door2.getDoorVal(), door2.getDoorName());
		System.out.println("Expected: 1, Goat");
		
		System.out.printf("door3: %d, %s\n", door3.getDoorVal(), door3.getDoorName());
		System.out.println("Expected: -1, null");
		
		System.out.println("\n------------------\nMethod Testng\n------------------\n");
		
		door3.setVal(0);
		
		System.out.printf("door3: %d, %s\n", door3.getDoorVal(), door3.getDoorName());
		System.out.println("Expected: 0, Car");
		
		
	}
}
