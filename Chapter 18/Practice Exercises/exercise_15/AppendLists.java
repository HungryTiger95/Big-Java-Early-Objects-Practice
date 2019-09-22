package exercise_15;

import java.util.ArrayList;

/**
 * Modify the method of Exercise 18.14 so that the second array list can contain elements of a subclass. For example,
 * if people is an ArrayList<Person> and students is an ArrayList<Student>, then append(people, students) should compile
 * but append(students, people) should not.
 * 
 * @author Mayuresh
 *
 */
public class AppendLists
{
	public static void main(String[] args)
	{
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Payal", "CS"));
		students.add(new Student("Tina", "BIO"));
		students.add(new Student("Nidhi", "CHM"));
		students.add(new Student("Aarti", "HIS"));
		System.out.println("Students: " + students.toString());
		
		ArrayList<Undergraduate> underGrads = new ArrayList<>();
		underGrads.add(new Undergraduate("Aarohi", "BIO", 2));
		underGrads.add(new Undergraduate("Rhea", "CS", 4));
		underGrads.add(new Undergraduate("Aalia", "CHM", 1));
		underGrads.add(new Undergraduate("Karina", "PHY", 3));
		System.out.println("UnderGrads: " + underGrads.toString());
		
		append(students, underGrads);
		System.out.println("Appended: " + students.toString());
	}
	
	/**
	 * Given two lists, appends the second onto the end of the first
	 * @param <T> the type of elements in the lists
	 * @param a first list
	 * @param b second list
	 */
	public static <T> void append(ArrayList<T> a, ArrayList<? extends T> b)
	{
		for(T element : b)
		{
			a.add(element);
		}
	}
}
