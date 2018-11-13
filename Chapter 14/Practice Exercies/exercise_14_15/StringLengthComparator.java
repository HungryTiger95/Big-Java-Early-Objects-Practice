package exercise_14_15;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String>
{
	@Override
	public int compare(String a, String b)
	{
		if(a.length() < b.length())
		{
			return a.length() - b.length();
		}
		else if(a.length() == b.length())
		{
			return a.compareTo(b);
		}
		else
		{
			return 1;
		}
	}
}
