package section_05;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo
{
	public static void main(String[] args)
	{
		Queue<String> jobs = new LinkedList<String>();
		
		jobs.add("Joe: Expense Report #1");
		jobs.add("Cathy: Meeting Memo");
		
		System.out.println("Printing: " + jobs.remove());
		
		jobs.add("Cathy: Purchase Order #1");
		jobs.add("Joe: Expense Report #2");
		jobs.add("Joe: Weekly Report");
		
		System.out.println("Printing: " + jobs.remove());
		
		jobs.add("Cathy: Purchase Order #2");
		
		while(jobs.size() > 0)
		{
			System.out.println("Printing: " + jobs.remove());
		}
	}

}
