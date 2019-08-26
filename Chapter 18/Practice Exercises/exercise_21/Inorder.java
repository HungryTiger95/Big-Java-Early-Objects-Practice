package exercise_21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import exercise_16.Student;

public class Inorder
{
	public static void main(String[] args)
	{
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Payal", "CS"));
		students.add(new Student("Tina", "BIO"));
		students.add(new Student("Nidhi", "CHM"));
		students.add(new Student("Aarti", "HIS"));
		System.out.println("Students: " + students.toString());
		System.out.println("In Order: " + isInOrder(students));
		
		Collections.sort(students);
		System.out.println("\n\nStudents: " + students.toString());
		System.out.println("In Order: " + isInOrder(students));
	}
	/**
	 * Checks if the list is ordered from smallest to largest
	 * @param <T> the type of the elements in the list
	 * @param list the list
	 * @return true if the elements are listed in order
	 */
	public static <T extends Comparable<? super T>> boolean isInOrder(List<T> list)
	{
		for(int i = 0; i < list.size() - 1; i++)
		{
			if(list.get(i).compareTo(list.get(i + 1)) < 0)
			{
				continue;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
}
