package section_02.regular_class;

public class PairDemo
{
	public static void main(String[] args)
	{
		String[] names = {"Tom", "Diana", "Harry"};
		Pair result = firstContaining(names, "a");
		System.out.println(result.getFirst());
		System.out.println("Expected: Diana");
		System.out.println(result.getSecond());
		System.out.println("Expected: 1");
	}
	
	public static Pair firstContaining(String[] strings, String sub)
	{
		for(int i = 0; i < strings.length; i++)
		{
			if(strings[i].toLowerCase().contains(sub))
			{
				return new Pair(strings[i], i);
			}
		}
		return new Pair(null, -1);
	}
}
