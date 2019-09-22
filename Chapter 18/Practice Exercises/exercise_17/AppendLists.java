package exercise_17;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Modify the method of Exercise 18.16 so that it receives and returns arrays, not array lists. Hint: Arrays.copyOf.
 * 
 * @author Mayuresh
 *
 */
public class AppendLists
{
	public static void main(String[] args)
	{
		Student[] students = new Student[5];
		students[0] = new Student("Payal", "CS");
		students[1] = new Student("Tina", "BIO");
		students[2] = new Student("Nidhi", "CHM");
		students[3] = new Student("Aarti", "HIS");
		System.out.println("Students: " + Arrays.toString(students));
		
		Undergraduate[] underGrads = new Undergraduate[4];
		underGrads[0] = new Undergraduate("Aarohi", "BIO", 2);
		underGrads[1] = new Undergraduate("Rhea", "CS", 4);
		underGrads[2] = new Undergraduate("Aalia", "CHM", 1);
		underGrads[3] = new Undergraduate("Karina", "PHY", 3);
		System.out.println("UnderGrads: " + Arrays.toString(underGrads));
		
		System.out.println("Appended: " + Arrays.toString(append(students, underGrads)));
		
		System.out.println("\n\nOriginals:\nStudents: " + Arrays.toString(students) + "\nUnderGrads: " + Arrays.toString(underGrads));
	}
	
	/**
	 * Given two lists, appends the second onto the end of the first
	 * @param <T> the type of elements in the lists
	 * @param a first list
	 * @param b second list
	 */
	@SuppressWarnings("unchecked")
	public static <T> T[] append(T[] a, T[] b)
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
		
		return (T[]) appendedList.toArray();
	}
}
