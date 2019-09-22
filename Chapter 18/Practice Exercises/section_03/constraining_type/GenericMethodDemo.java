package section_03.constraining_type;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class GenericMethodDemo
{
	public static <E extends Measurable> double average(ArrayList<E> objs)
	{
		if(objs.size() == 0)
		{
			return 0;
		}
		
		double sum = 0;
		for(E obj : objs)
		{
			sum += obj.getMeasure();
		}
		
		return sum / objs.size();
	}
	
	public static <E extends Measurable> E max(ArrayList<E> obj)
	{
		E largest = obj.get(0);
		for(int i = 0; i < obj.size(); i++)
		{
			if(obj.get(i).getMeasure() > largest.getMeasure())
			{
				largest = obj.get(i);
			}
		}
		
		return largest;
	}
	
	public static <E extends Measurable> E min(ArrayList<E> obj)
	{
		E smallest = obj.get(0);
		for(int i = 0; i < obj.size(); i++)
		{
			if(obj.get(i).getMeasure() < smallest.getMeasure())
			{
				smallest = obj.get(i);
			}
		}
		return smallest;
	}
	
	@Test
	public void testAverage()
	{
		ArrayList<BankAccount> accounts = new ArrayList<>();
		accounts.add(new BankAccount(1400));
		accounts.add(new BankAccount(2100));
		accounts.add(new BankAccount(1800));
		accounts.add(new BankAccount(4000));
		accounts.add(new BankAccount(1400));
		accounts.add(new BankAccount(1500));
		
		Assert.assertEquals(2033.33, average(accounts), 0.01);
	}
	
	@Test
	public void testMax()
	{
		ArrayList<BankAccount> accounts = new ArrayList<>();
		accounts.add(new BankAccount(1400));
		accounts.add(new BankAccount(2100));
		accounts.add(new BankAccount(1800));
		accounts.add(new BankAccount(4000));
		accounts.add(new BankAccount(1400));
		accounts.add(new BankAccount(1500));
		
		Assert.assertEquals(new BankAccount(4000), max(accounts));
	}
	
	@Test
	public void testMin()
	{
		ArrayList<BankAccount> accounts = new ArrayList<>();
		accounts.add(new BankAccount(1400));
		accounts.add(new BankAccount(2100));
		accounts.add(new BankAccount(1800));
		accounts.add(new BankAccount(4000));
		accounts.add(new BankAccount(1400));
		accounts.add(new BankAccount(1500));
		
		Assert.assertEquals(new BankAccount(1400), min(accounts));
	}
	
	@Test
	public void testCountry()
	{
		ArrayList<Country> countries = new ArrayList<Country>();
		countries.add(new Country("Spain", 25000));
		countries.add(new Country("Argentina", 30000));
		countries.add(new Country("Australia", 100000));
		countries.add(new Country("Russia", 150000));
		
		// Doesn't works because the Country class does not implement Measurable average(countries);
	}
}
