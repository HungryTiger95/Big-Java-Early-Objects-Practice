
public class ChoiceTester
{
	public static void main(String[] args)
	{
		Door door1 = new Door(1);
		Door door2 = new Door("Car");
		Door door3 = new Door(1, "Goat");
		
		Choice playerChoice = new Choice(door1);
		Choice hostChoice = new Choice(door2);
		Choice broChoice = new Choice();
		
		broChoice.setDoor(door3);
		
		System.out.print("=====================\nConstructor Testing\n=====================\n");
		System.out.printf("ChoiceVal: %d\nChoiceName: %s\n", playerChoice.getChoiceVal(), playerChoice.getChoiceName());
		System.out.println("Expected: 1, Goat");
	}
}
