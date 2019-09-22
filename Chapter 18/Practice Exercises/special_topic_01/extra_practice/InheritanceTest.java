package special_topic_01.extra_practice;

import org.junit.Assert;
import org.junit.Test;

public class InheritanceTest
{
	@Test
	public void testPerson()
	{
		Person p = new Person("Mayuresh");
		Assert.assertEquals("Mayuresh", p.getName());
	}
	
	@Test
	public void testStudent()
	{
		Student s = new Student("Mayuresh", "CS");
		Assert.assertEquals("Mayuresh", s.getName());
		Assert.assertEquals("CS", s.getMajor());
	}
	
	@Test
	public void testUndergraduate()
	{
		Undergraduate u = new Undergraduate("Mayuresh", "CS", 3);
		Assert.assertEquals("Mayuresh", u.getName());
		Assert.assertEquals("CS", u.getMajor());
		Assert.assertEquals(3, u.getYear());
	}
	
	@Test
	public void testFaculty()
	{
		Faculty f = new Faculty("Mayuresh", "CS");
		Assert.assertEquals("Mayuresh", f.getName());
		Assert.assertEquals("CS", f.getDepartment());
	}
}
