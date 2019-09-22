package exercise_01;

public class ReverseDemo
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		
		list.addFirst("Ananya");
		list.addFirst("Aarohi");
		list.addFirst("Payal");
		list.addFirst("Nidhi");
		list.addFirst("Anika");
		
		// Print out the Original Linked List
		System.out.println(list.toString());
		
		list.betterReverse();
		
		// Print out the Reversed Linked List
		System.out.println(list.toString());
	}
}
