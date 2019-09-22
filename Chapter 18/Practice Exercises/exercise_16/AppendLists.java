package exercise_16;

import java.util.ArrayList;

/**
 * Modify the method of Exercise 18.14 so that it leaves the first array list unchanged and
 * returns a new array list containing the elements of both array lists.
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
		
		System.out.println("Appended: " + append(students, underGrads).toString());
		
		System.out.println("\n\nOriginals:\nStudents: " + students.toString() + "\nUnderGrads: " + underGrads.toString());
	}
	
	/**
	 * Given two lists, appends the second onto the end of the first
	 * @param <T> the type of elements in the lists
	 * @param a first list
	 * @param b second list
	 */
	public static <T> ArrayList<T> append(ArrayList<T> a, ArrayList<? extends T> b)
	{
		ArrayList<T> appendedList = new ArrayList<>();
		for(T element : a)
		{
			appendedList.add(element);
		}
		
		for(T element : b)
		{
			appendedList.add(element);
		}
		
		return appendedList;
	}
}
