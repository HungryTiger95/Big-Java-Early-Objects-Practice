package section_05;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackQueueDemo
{
	public static void main(String[] args)
	{
		System.out.println("Stack: ");
		
		Stack<String> s = new Stack<String>();
		s.push("Tom");
		s.push("Diana");
		s.push("Harry");
		
		while(s.size() > 0)
		{
			System.out.println(s.pop());
		}
		
		System.out.println("\nQueue: ");
		Queue<String> q = new LinkedList<String>();
		q.add("Tom");
		q.add("Diana");
		q.add("Harry");
		
		while(q.size() > 0)
		{
			System.out.println(q.remove());
		}
		
		System.out.println("\nPriority Queue: ");
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Tom");
		pq.add("Alphonse");
		pq.add("Diana");
		pq.add("Harry");
		
		while(pq.size() > 0)
		{
			System.out.println(pq.remove());
		}
	}
}
