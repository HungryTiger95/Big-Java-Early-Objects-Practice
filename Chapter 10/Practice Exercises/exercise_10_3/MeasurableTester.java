package exercise_10_3;

public class MeasurableTester
{
	public static void main(String[] args)
	{
		Measurable[] people = new Person[5];
		people[0] = new Person(150, "Melissa");
		people[1] = new Person(135, "Jasmine");
		people[2] = new Person(174, "Marcus");
		people[3] = new Person(176, "Tia");
		people[4] = new Person(174, "Jason");
		
		double averageHeight = Data.average(people);
		System.out.println("Average Height: " + averageHeight);
		System.out.println("Expected: 161.4");
		
		Person tallestPerson = (Person) Data.max(people);
		
		System.out.println("Tallest Person: " + tallestPerson.getName());
		System.out.println("Expected: Tia");
	}
}
