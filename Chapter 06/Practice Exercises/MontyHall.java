
import java.util.Random;

/**
 * E6.19
 * 
 * Marilyn vos Savant described the following problem in a popular magazine:
 * "Suppose you're on a game show, and you're given the choice of three doors: Behind one
 * door is a car; behind the others, goats. You pick a door, say No. 1, and the host, who
 * knows what's behind the doors, opens another door,, say No.3, which has a goat. He then says
 * to you, "Do you want to pick door No. 2?" Is it to your advantage to switch your choice?
 * 
 * Ms. vos Savant proved that it is to your advantage, but many of her readers, including some
 * mathematics professors, disagreed, arguing that the probability would not change because another
 * door was opened.
 * 
 * Your task is to simulate this game show. In each iteration, randomly pick a
 * door number between 1 and 3 for placing the car. Randomly have the player pick a door.
 * Randomly have the game show host pick a door having a goat (but not the door that the
 * player picked). Increment a counter for strategy 1 if the player wins by switching to the
 * third door, and increment a counter for strategy 2 if the player wins by sticking with the
 * original choice. Run 1,000 iterations and print both counters.
 * 
 * @author Mayuresh
 *
 */
public class MontyHall
{
	private static Door door1 = new Door();
	private static Door door2 = new Door();
	private static Door door3 = new Door();
	
	private static Choice playerChoice = new Choice();
	private static Choice hostChoice = new Choice();
	
	private static Random numGen = new Random();
	
	private static int strat1 = 0;								// No change
	private static int strat2 = 0;								// Change
	
	public static void main(String[] args)
	{
		for(int i = 0; i < 1000; i++)
		{
			setDoors();
			setPlayerChoice();
			setHostChoice();
			
			System.out.printf("door1: %s\ndoor2: %s\ndoor3: %s\nValid: %s\nPlayerChoice: %s\nHostChoice: %s\n===============\n",
					door1.getDoorName(), door2.getDoorName(), door3.getDoorName(), checkDoorValid(), playerChoice.getChoiceName(),
					hostChoice.getChoiceName());
			
			// will they win if they stick to their door?
			if(playerChoice.getChoiceName() == "Car")
			{
				strat2++;
			}
			
			// will they win if they switch?
			if(playerChoice.getChoiceDoor() == door1 && hostChoice.getChoiceDoor() == door2)
			{
				playerChoice.setDoor(door3);
				if(door3.getDoorName() == "Car")
				{
					strat1++;
				}
				else
				{
					// do nothing
				}
			}
			else if(playerChoice.getChoiceDoor() == door1 && hostChoice.getChoiceDoor() == door3)
			{
				playerChoice.setDoor(door2);
				if(door2.getDoorName() == "Car")
				{
					strat1++;
				}
				else
				{
					// do nothing
				}
			}
			else if(playerChoice.getChoiceDoor() == door2 && hostChoice.getChoiceDoor() == door1)
			{
				playerChoice.setDoor(door3);
				if(door3.getDoorName() == "Car")
				{
					strat1++;
				}
				else
				{
					// do nothing
				}
			}
			else if(playerChoice.getChoiceDoor() == door2 && hostChoice.getChoiceDoor() == door3)
			{
				playerChoice.setDoor(door1);
				if(door1.getDoorName() == "Car")
				{
					strat1++;
				}
				else
				{
					// do nothing
				}
			}
			else if(playerChoice.getChoiceDoor() == door3 && hostChoice.getChoiceDoor() == door1)
			{
				playerChoice.setDoor(door2);
				if(door2.getDoorName() == "Car")
				{
					strat1++;
				}
				else
				{
					// do nothing
				}
			}
			else if(playerChoice.getChoiceDoor() == door3 && hostChoice.getChoiceDoor() == door2)
			{
				playerChoice.setDoor(door1);
				if(door1.getDoorName() == "Car")
				{
					strat1++;
				}
				else
				{
					// do nothing
				}
			}
			else
			{
				System.out.println("Error");
			}
		}
		
		System.out.printf("Strat1: %d\nStrat2: %d\n", strat1, strat2);
	}
	
	// Methods
	public static void setDoors()
	{	
		/**
		 * Randomly set Values to the three doors
		 */
		int doorNum = numGen.nextInt(3) + 1;
		int randChoice = numGen.nextInt(2);
		
		// Choose a door to set the value for first
		if(doorNum == 1)									// randomly choose car or goat for the first door
		{
			if(randChoice == 0)								// if first door is car, second door and third doors are goats
			{
				door1 .setName("Car");
				door2.setName("Goat");
				door3.setName("Goat");
			}
			else if(randChoice == 1)						// if first door is goat, then randomly choose doors 2 and 3 to be cars, the other goat
			{
				door1.setName("Goat");
				
				randChoice = numGen.nextInt(2);
				if(randChoice == 0)
				{
					door2.setName("Car");
					door3.setName("Goat");
				}
				else
				{
					door3.setName("Car");
					door2.setName("Goat");
				}
			}
		}
		else if(doorNum == 2)								// set value for door2 first
		{
			if(randChoice == 0)								// if second door is car, first door and third doors are goats
			{
				door2.setName("Car");
				door1.setName("Goat");
				door3.setName("Goat");
			}
			else if(randChoice == 1)						// if second door is goat, then randomly choose doors 1 and 3 to be cars, the other goat
			{
				door2.setName("Goat");
				
				randChoice = numGen.nextInt(2);
				if(randChoice == 0)
				{
					door1.setName("Car");
					door3.setName("Goat");
				}
				else
				{
					door3.setName("Car");
					door1.setName("Goat");
				}
			}
		}
		else if(doorNum == 3)								// set value for door3 first
		{
			if(randChoice == 0)								// if third door is car, first door and second doors are goats
			{
				door3.setName("Car");
				door1.setName("Goat");
				door2.setName("Goat");
			}
			else if(randChoice == 1)						// if third door is goat, then randomly choose doors 1 and 2 to be cars, the other goat
			{
				door3.setName("Goat");
				
				randChoice = numGen.nextInt(2);
				if(randChoice == 0)
				{
					door1.setName("Car");
					door2.setName("Goat");
				}
				else
				{
					door1.setName("Car");
					door2.setName("Goat");
				}
			}
		}
		else
		{
			System.out.println("Error: DoorNum");
		}
	}
	
	public static boolean checkDoorValid()
	{	
		if((door1.getDoorName() == "Car" && door2.getDoorName() == "Goat" && door3.getDoorName() == "Goat") ||
				(door2.getDoorName() == "Car" && door1.getDoorName() == "Goat" && door3.getDoorName() == "Goat") ||
				(door3.getDoorName() == "Car" && door1.getDoorName() == "Goat" && door2.getDoorName() == "Goat"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void setPlayerChoice()
	{
		// randomly choose a door
		int randNum = numGen.nextInt(3) + 1;
		
		// Set player choice
		if(randNum == 1)
		{
			playerChoice.setDoor(door1);
		}
		else if(randNum == 2)
		{
			playerChoice.setDoor(door2);
		}
		else
		{
			playerChoice.setDoor(door3);
		}
	}

	public static void setHostChoice()
	{
		int randNum;
		
		// Check what door player has chosen
		if(playerChoice.getChoiceDoor() == door1)
		{
			if(door1.getDoorName() == "Car")
			{
				randNum = numGen.nextInt(2);
				if(randNum == 0)
				{
					hostChoice.setDoor(door2);
				}
				else if(randNum == 1)
				{
					hostChoice.setDoor(door3);
				}
				else
				{
					System.out.println("Error");
				}
			}
			else if(door1.getDoorName() == "Goat")
			{
				randNum = numGen.nextInt(2);
				if(randNum == 0)
				{
					if(door2.getDoorName() == "Goat")
					{
						hostChoice.setDoor(door2);
					}
					else if(door2.getDoorName() == "Car")
					{
						hostChoice.setDoor(door3);
					}
					
				}
				else if(randNum == 1)
				{
					if(door3.getDoorName() == "Goat")
					{
						hostChoice.setDoor(door3);
					}
					else if(door3.getDoorName() == "Car")
					{
						hostChoice.setDoor(door2);
					}
				}
				else
				{
					System.out.println("Error");
				}
			}
			else
			{
				System.out.println("Error");
			}
		}
		else if(playerChoice.getChoiceDoor() == door2)
		{
			if(door2.getDoorName() == "Car")
			{
				randNum = numGen.nextInt(2);
				if(randNum == 0)
				{
					hostChoice.setDoor(door1);
				}
				else if(randNum == 1)
				{
					hostChoice.setDoor(door3);
				}
				else
				{
					System.out.println("Error");
				}
			}
			else if(door2.getDoorName() == "Goat")
			{
				randNum = numGen.nextInt(2);
				if(randNum == 0)
				{
					if(door1.getDoorName() == "Goat")
					{
						hostChoice.setDoor(door1);
					}
					else if(door1.getDoorName() == "Car")
					{
						hostChoice.setDoor(door3);
					}
					else
					{
						System.out.println("Error");
					}
				}
				else if(randNum == 1)
				{
					if(door3.getDoorName() == "Goat")
					{
						hostChoice.setDoor(door3);
					}
					else if(door3.getDoorName() == "Car")
					{
						hostChoice.setDoor(door1);
					}
					else
					{
						System.out.println("Error");
					}
				}
				else
				{
					System.out.println("Error");
				}
			}
			else
			{
				System.out.println("Error");
			}
		}
		else if(playerChoice.getChoiceDoor() == door3)
		{
			if(door3.getDoorName() == "Car")
			{
				randNum = numGen.nextInt(2);
				if(randNum == 0)
				{
					hostChoice.setDoor(door1);
				}
				else if(randNum == 1)
				{
					hostChoice.setDoor(door2);
				}
				else
				{
					System.out.println("Error");
				}
			}
			else if(door3.getDoorName() == "Goat")
			{
				randNum = numGen.nextInt(2);
				if(randNum == 0)
				{
					if(door1.getDoorName() == "Goat")
					{
						hostChoice.setDoor(door1);
					}
					else if(door1.getDoorName() == "Car")
					{
						hostChoice.setDoor(door2);
					}
					else
					{
						System.out.println("Error");
					}
				}
				else if(randNum == 1)
				{
					if(door2.getDoorName() == "Goat")
					{
						hostChoice.setDoor(door2);
					}
					else if(door2.getDoorName() == "Car")
					{
						hostChoice.setDoor(door1);
					}
					else
					{
						System.out.println("Error");
					}
					
				}
			}
		}
		else
		{
			System.out.println("Error");
		}
	}
}
