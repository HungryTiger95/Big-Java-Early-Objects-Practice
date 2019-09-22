/**
 * P1.2
 * 
 * You want to find out which fraction of your car's use is for commuting to work,
 * and which is for personal use. You know the one-way distance from your home to
 * work. Find a particular period, you recorded the beginning and ending mileage on the
 * odometer and the number of work days. Write an algorithm to settle this question.
 * 
 * @author Mayuresh
 *
 */
public class WorkOrPersonal
{
	public static void main(String[] args)
	{
		int workDays, distanceToWork;
		double driveRatio, workDrive, personalDrive, startMileage, endMileage;
		
		workDays = 7;
		distanceToWork = 15;
		startMileage = 12493;
		endMileage = 13090;
		
		workDrive = workDays * distanceToWork;
		personalDrive = endMileage - workDrive - startMileage;
		
		driveRatio = workDrive / personalDrive;
		
		System.out.println("You Drive " + workDrive + " miles to work each week");
		System.out.println(personalDrive + " is how many miles you drive personally");
		System.out.println("Your work:personal drive ratio is: " + driveRatio);
	}
}
