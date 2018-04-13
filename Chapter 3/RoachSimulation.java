
public class RoachSimulation
{
	public static void main(String[] args)
	{
		RoachPopulation roach = new RoachPopulation(10);
		
		System.out.println("First Trial");
		System.out.println("===============================");
		System.out.println("Initial Population: " + roach.getRoachPopulation());
		roach.breed();
		System.out.println("After Breeding: " + roach.getRoachPopulation());
		roach.spray(10);
		System.out.println("After Spraying: " + roach.getRoachPopulation());
		
		System.out.println();
		
		System.out.println("Second Trial");
		System.out.println("===============================");
		System.out.println("Population: " + roach.getRoachPopulation());
		roach.breed();
		System.out.println("After Breeding: " + roach.getRoachPopulation());
		roach.spray(10);
		System.out.println("After Spraying: " + roach.getRoachPopulation());
		
		System.out.println();
		
		System.out.println("Third Trial");
		System.out.println("===============================");
		System.out.println("Population: " + roach.getRoachPopulation());
		roach.breed();
		System.out.println("After Breeding: " + roach.getRoachPopulation());
		roach.spray(10);
		System.out.println("After Spraying: " + roach.getRoachPopulation());
	}
}
