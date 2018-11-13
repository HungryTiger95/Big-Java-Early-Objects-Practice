package exercise_14_5.testing;

import org.junit.Test;
import org.junit.Assert;

import exercise_14_5.TelephoneEntry;

public class TelephoneEntryTester
{
	@Test
	public void testGetName()
	{
		TelephoneEntry t = new TelephoneEntry("Ginny", 1234567890);
		String name = "Ginny";
		
		Assert.assertEquals(name, t.getName());
	}
	
	@Test
	public void testGetNumber()
	{
		TelephoneEntry t = new TelephoneEntry("Ginny", 1234567890);
		long number = 1234567890;
		
		Assert.assertEquals(number, t.getNumber());
	}
	
	@Test
	public void testToString()
	{
		TelephoneEntry t = new TelephoneEntry("Ginny", 1234567890);
		String r = "exercise_14_5.TelephoneEntry[name=Ginny][number=1234567890]";
		
		Assert.assertEquals(r, t.toString());
	}
}
