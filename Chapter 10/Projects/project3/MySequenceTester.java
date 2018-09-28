package project3;

public class MySequenceTester
{
	public static void main(String[] args)
	{
		MySequence seq = new MySequence();
		
		seq.setUpSequence(1000);
		
		while(seq.hasNext())
		{
			System.out.println(seq.next());
		}
	}
}
