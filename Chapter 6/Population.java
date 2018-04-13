import java.util.Scanner;

/**
 * P6.12
 * 
 * In a predator-prey simulation, you compute the populations of predators and prey, using the following equations:
 * 
 * 		prey[n + 1] = prey[n] * (1 + A - B * pred[n])
 * 		prey[n + 1] = pred[n] * (1 - C + D * prey[n])
 * 
 * Here, A is the rate at which prey birth exceeds natural death, B is the rate of predation, C is the rate
 * at which predator deaths exceed births without food, and D represents predator increase in the presence of
 * food.
 * 
 * Write a program that prompts the users for these rates, the initial population sizes, and the number of
 * periods. Then print the populations for the given number of periods. As inputs, try A = 0.1, B = C = 0.01,
 * and D = 0.00002 with initial prey and predator populations of 1000 and 20.
 * 
 * @author Mayuresh
 *
 */
public class Population
{
	public static void main(String[] args)
	{
		double A, B, C, D;
		double preyN, predN;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Initial Predator Population: ");
		predN = in.nextInt();
		
		System.out.print("Enter Initial Prey Population: ");
		preyN = in.nextInt();
		
		System.out.print("Enter A: ");
		A = in.nextDouble();
		
		System.out.print("Enter B: ");
		B = in.nextDouble();
		
		System.out.print("Enter C: ");
		C = in.nextDouble();
		
		System.out.print("Enter D: ");
		D = in.nextDouble();
		
		in.close();
		
		for(int i = 1; i <= 1000; i++)
		{
			preyN = preyN * (1 + A - (B * predN));
			predN = predN * (1 - C + (D * preyN));
			
			System.out.println("Prey Pop [" + i + "]: " + preyN);
			System.out.println("Pred Pop [" + i + "]: " + predN);
			System.out.println("----------------------------");
		}
	}
}
