/**
 * P1.1
 * 
 * You want to decide whether you should drive your car to work or take the train.
 * You know the one-way distance from your home to your place of work, and the
 * fuel efficiency of your car (in mpg). You also know the one-way price of a train
 * ticket. You assume the cost of gas at 4 dollars per gallon, and car maintenance
 * at 5 cents per mile. Write an algorithm to decide which commute is cheaper.
 * 
 * @author Mayuresh
 *
 */
public class TrainOrCar
{
	public static void main(String[] args)
	{		
		double mpg, drivingCost, trainCost, gasCost, carMaintCost;
		int distance;
	
		mpg = 19.3;
		distance = 50;
		trainCost = 35.70;
		gasCost = 4.00;
		carMaintCost = .05;
	
		System.out.println(distance/mpg);
		drivingCost = ((distance/mpg) * (gasCost)) + (distance * carMaintCost);
		System.out.println("Driving Cost: " + drivingCost);
		System.out.println("Train Ticket Cost: " + trainCost);
	}
}
