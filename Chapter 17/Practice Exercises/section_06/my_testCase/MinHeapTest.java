package section_06.my_testCase;
import section_06.MinHeap;;

public class MinHeapTest
{
	public static void main(String[] args)
	{
		MinHeap q = new MinHeap();
		q.add(90);
		q.add(84);
		q.add(60);
		q.add(70);
		q.add(50);
		q.add(101);
		
		q.remove();
		System.out.println(q.toString());
	}
	
}
