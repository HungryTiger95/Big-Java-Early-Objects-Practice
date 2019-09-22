package exercise_14_5;

import java.util.Comparator;

public class TelephoneEntryNumberComparator implements Comparator<TelephoneEntry>
{
	@Override
	/**
	 * Compares two TelephoneEntry objects based on their number variable
	 * return -1 if the first parameter comes before the
	 * second, 0 if both parameters are the same, 1 if the first
	 * parameter comes after the second
	 */
	public int compare(TelephoneEntry a, TelephoneEntry b)
	{
		if(a.getNumber() < b.getNumber())
		{
			return -1;
		}
		else if(a.getNumber() == b.getNumber())
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}
