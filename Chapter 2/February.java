
/**
 * P2.6
 * 
 * Using the Day class, write a program that generates a Day object representing
 * February 28 of this year, and three more such objects that represent February
 * 28 of the next three years. Advance each object by one day, and print each object.
 * ALso print the expected values:
 * 
 * 2017-03-01
 * Expected: 2017-03-01
 * 2018-03-01
 * Expected: 2018-03-01
 * 2019-03-01
 * Expected: 2019-03-01
 * 2020-02-29
 * Expected: 2020-02-29
 * 
 * @author Mayuresh
 *
 */
public class February
{
	public static void main(String[] arge)
	{
		Day feb17 = new Day(2017, 02, 28);
		Day feb18 = new Day(2018, 02, 28);
		Day feb19 = new Day(2019, 02, 28);
		Day feb20 = new Day(2020, 02, 28);
		
		//Advance each day by 1 day and print results
		feb17 = feb17.addDays(1);
		feb18 = feb18.addDays(1);
		feb19 = feb19.addDays(1);
		feb20 = feb20.addDays(1);
		
		System.out.println(feb17.getYear() + "-" + feb17.getMonth() + "-" + feb17.getDate());
		System.out.println("Expected: 2017-03-01");
		System.out.println(feb18.getYear() + "-" + feb18.getMonth() + "-" + feb18.getDate());
		System.out.println("Expected: 2018-03-01");
		System.out.println(feb19.getYear() + "-" + feb19.getMonth() + "-" + feb19.getDate());
		System.out.println("Expected: 2019-03-01");
		System.out.println(feb20.getYear() + "-" + feb20.getMonth() + "-" + feb20.getDate());
		System.out.println("Expected: 202-02-29");
	}
}
