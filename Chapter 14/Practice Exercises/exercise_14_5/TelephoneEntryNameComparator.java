package exercise_14_5;

import java.util.Comparator;

/**
 * A comparator class to compare objects of TelephoneEntry by the name variable
 * associated with the TelephoneEntry object.
 * 
 * @author Mayuresh
 *
 */
public class TelephoneEntryNameComparator implements Comparator<TelephoneEntry>
{
	@Override
	/**
	 * Compares two TelephoneEntry objects by the name variable
	 * return -1 if the first parameter comes before the
	 * second, 0 if both parameters are the same, 1 if the first
	 * parameter comes after the second
	 */
	public int compare(TelephoneEntry a, TelephoneEntry b)
	{
		if(a.getName().compareTo(b.getName()) <= -1)
		{
			return -1;
		}
		else if(a.getName().compareTo(b.getName()) == 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}
