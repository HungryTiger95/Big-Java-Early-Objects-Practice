
public class MothTester
{
	public static void main(String[] args)
	{
		Moth moth = new Moth(10);
		
		moth.moveToLight(50);
		
		System.out.println(moth.getPosition());
		System.out.println("Expected: 35");
		
		moth.moveToLight(100);
		
		System.out.println(moth.getPosition());
		System.out.println("Expected: 85");
	}
}
