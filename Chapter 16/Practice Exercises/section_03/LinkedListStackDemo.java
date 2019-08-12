package section_03;

public class LinkedListStackDemo
{
	public static void main(String[] args)
	{
		LinkedListStack s = new LinkedListStack();
		
		s.push("Payal");
		s.push("Aarohi");
		s.push("Nidhi");
		s.push("Anika");
		
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
	}
}
