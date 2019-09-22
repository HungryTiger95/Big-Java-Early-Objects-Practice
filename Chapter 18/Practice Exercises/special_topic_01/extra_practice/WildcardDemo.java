package special_topic_01.extra_practice;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class WildcardDemo
{
	/*
	 * The addAll method will add all the elements from the second array list to the the first one. There is a condition placed however.
	 * The second array list can only be of type <E> or a subclass of type <E>. This method basically says that we want
	 * to add a list of undergraduates to a list of students. This makes sense because an undergraduate is a student.
	 * 
	 * If we would have called the second array list ArrayList<? super E> other, we would have gotten a compiler error on line
	 * 16 because we cannot add an element of type Student to an array list of Undergraduate elements. The error on the method
	 * basically says that we cannot add a list of students to a list of undergraduates. This is because an undergraduate is a student, but
	 * a student is not an undergraduate (i.e. an undergraduate is a student, but a student doesn't necessarily have to be an undergraduate)
	 */
	public static <E> void addAll(ArrayList<E> lst, ArrayList<? extends E> other)
	{
		for(E e : other)
		{
			lst.add(e);
		}
	}
	
	/*
	 * The syntax in this method may seem complex. However, it reads as such, "If the array list
	 * has elements of type E, then we require E or its superclass, or any
	 * superclass in the class hierarchy, to implement the Comparable interface". This is supplied
	 * in the type variable, before the return type. Here, the return type is E, meaning we will
	 * return the a object of type E.
	 */
	public static <E extends Comparable<? super E>> E max(ArrayList<E> a)
	{
		E largest = a.get(0);
		for(int i = 0; i < a.size(); i++)
		{
			if(a.get(i).compareTo(largest) > 0)
			{
				largest = a.get(i);
			}
		}
		return largest;
	}
	
	@Test
	public void testAddAll()
	{
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Fred", "CS"));
		students.add(new Student("Maya", "Bio"));
		students.add(new Student("Sue", "Chem"));
		
		ArrayList<Undergraduate> underGrads = new ArrayList<>();
		underGrads.add(new Undergraduate("Harry", "EGR", 2));
		
		addAll(students, underGrads);

		ArrayList<Student> expected = new ArrayList<>();
		expected.add(new Student("Fred", "CS"));
		expected.add(new Student("Maya", "Bio"));
		expected.add(new Student("Sue", "Chem"));
		expected.add(new Undergraduate("Harry", "EGR", 2));
		
		Assert.assertEquals(expected.toString(), students.toString());
	}
	
	@Test
	public void testAddAll1()
	{
		ArrayList<Person> people = new ArrayList<>();
		people.add(new Person("Payal"));
		people.add(new Person("Preeti"));
		people.add(new Person("Anjali"));
		
		ArrayList<Faculty> teachers = new ArrayList<>();
		teachers.add(new Faculty("Arjun", "Biology"));
		teachers.add(new Faculty("Geeta", "Chemistry"));
		
		addAll(people, teachers);
		
		ArrayList<Person> expected = new ArrayList<>();
		expected.add(new Person("Payal"));
		expected.add(new Person("Preeti"));
		expected.add(new Person("Anjali"));
		expected.add(new Faculty("Arjun", "Biology"));
		expected.add(new Faculty("Geeta", "Chemistry"));
		
		Assert.assertEquals(expected.toString(), people.toString());
	}
	
	@Test
	public void testMax()
	{
		ArrayList<Person> people = new ArrayList<>();
		people.add(new Person("Payal"));
		people.add(new Person("Preeti"));
		people.add(new Person("Anjali"));
		
		Assert.assertEquals("Preeti", max(people).getName());
	}
	
	@Test
	public void testMax2()
	{
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Payal", "CS"));
		students.add(new Student("Anjali", "Bio"));
		students.add(new Student("Bhumi", "Chem"));
		students.add(new Student("Lisa", "Econ"));
		
		Assert.assertEquals("Payal", max(students).getName());
	}
}
