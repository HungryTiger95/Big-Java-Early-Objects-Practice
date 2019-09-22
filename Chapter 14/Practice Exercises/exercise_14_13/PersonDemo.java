package exercise_14_13;

import java.util.Arrays;

public class PersonDemo
{
	public static void main(String[] args)
	{
		Person[] p = new Person[10];
		p[0] = new Person("Payal", 21);
		p[1] = new Person("Aarohi", 23);
		p[2] = new Person("Dhruv", 24);
		p[3] = new Person("Raj", 21);
		p[4] = new Person("Nidhi", 23);
		p[5] = new Person("Neel", 25);
		p[6] = new Person("Seema", 23);
		p[7] = new Person("Akash", 25);
		p[8] = new Person("Yash", 21);
		p[9] = new Person("Chintan", 24);
		
		System.out.println("Unsorted: " + Arrays.toString(p));
		Arrays.sort(p, new PersonNameComparator());
		System.out.println("Sorted: " + Arrays.toString(p));
		
		// Get the first name
		System.out.println("First: " + p[0].toString());
		
		// Get the last name
		System.out.println("Last: " + p[p.length - 1].toString());
	}
}
