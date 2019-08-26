package exercise_11;

import java.util.ArrayList;
import java.util.LinkedList;

public class IterablePrinterDemo
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<>();
		names.add("Payal");
		names.add("Aarti");
		names.add("Aarohi");
		names.add("Radha");
		names.add("Riya");
		names.add("Maria");
		names.add("Sonu");
		names.add("Pooja");
		names.add("Shraddha");
		
		System.out.println(IterablePrinter.print(names));
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		
		System.out.println(IterablePrinter.print(nums));
		
		LinkedList<String> lastNames = new LinkedList<>();
		lastNames.add("Patel");
		lastNames.add("Rao");
		lastNames.add("Shinde");
		lastNames.add("Shah");
		lastNames.add("Patil");
		
		System.out.println(IterablePrinter.print(lastNames));
	}
}
