package exercise_12;

public class HeapDemo
{
	public static void main(String[] args)
	{
		MinHeap<Integer> q = new MinHeap<>();
		q.add(45);
		q.add(100);
		q.add(78);
		q.add(90);
		q.add(1);
		q.add(39);
		q.add(29);
		
		while (!q.empty())
		{
			System.out.println(q.remove());      
		}
		
		MinHeap<String> s = new MinHeap<>();
		s.add("Payal");
		s.add("Aarti");
		s.add("Bhumi");
		s.add("Warina");
		s.add("Alia");
		s.add("Vaani");
		s.add("Maanvi");
		
		while (!s.empty())
		{
			System.out.println(s.remove());      
		}
	}
	
}
