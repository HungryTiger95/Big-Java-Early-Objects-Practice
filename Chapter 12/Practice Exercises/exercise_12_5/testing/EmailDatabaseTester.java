package exercise_12_5.testing;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import exercise_12_5.EmailDatabase;
import exercise_12_5.User;

public class EmailDatabaseTester
{
	@Test
	public void testReadUsers()
	{
		EmailDatabase db = new EmailDatabase();
		
		try
		{
			db.readUsers("src\\exercise_12_5\\users.txt");
		}
		catch(IOException e)
		{
			System.out.println("Error: Could Not Find File");
		}
		
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("mayuresh_95", "pass1"));
		users.add(new User("anila_62", "pass2"));
		users.add(new User("jitendra_58", "pass3"));
		users.add(new User("karina_00", "pass4"));
		users.add(new User("diya_05", "pass5"));
		users.add(new User("karan_03", "pass6"));
		
		if(users.size() == db.getUsers().size())
		{
			for(int i = 0; i < db.getUsers().size(); i++)
			{
				Assert.assertEquals(users.get(i).getUserName(), db.getUser(i).getUserName());
			}
		}
	}
	
	@Test
	public void testAddUsers()
	{
		EmailDatabase db = new EmailDatabase();
		
		try
		{
			db.readUsers("src\\exercise_12_5\\users.txt");
		}
		catch(IOException e)
		{
			System.out.println("Error: Could Not Find File");
		}
		
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("mayuresh_95", "pass1"));
		users.add(new User("anila_62", "pass2"));
		users.add(new User("jitendra_58", "pass3"));
		users.add(new User("karina_00", "pass4"));
		users.add(new User("diya_05", "pass5"));
		users.add(new User("karan_03", "pass6"));
		users.add(new User("plana_9", "pass7"));
		
		db.addUser(new User("plana_9", "pass7"));
		
		if(users.size() == db.getUsers().size())
		{
			for(int i = 0; i < db.getUsers().size(); i++)
			{
				Assert.assertEquals(users.get(i).getUserName(), db.getUser(i).getUserName());
			}
		}
	}
	
	@Test
	public void testFindUser1()
	{
		EmailDatabase db = new EmailDatabase();
		
		try
		{
			db.readUsers("src\\exercise_12_5\\users.txt");
		}
		catch(IOException e)
		{
			System.out.println("Error: Could Not Find File");
		}
		
		Assert.assertEquals("karan_03", db.findUser("karan_03").getUserName());
	}
	
	@Test
	public void testFindUser2()
	{
		EmailDatabase db = new EmailDatabase();
		
		try
		{
			db.readUsers("src\\exercise_12_5\\users.txt");
		}
		catch(IOException e)
		{
			System.out.println("Error: Could Not Find File");
		}
		
		Assert.assertEquals(null, db.findUser("karan_03", "pass7"));
		Assert.assertEquals("karan_03", db.findUser("karan_03", "pass6").getUserName());
	}
	
	@Test
	public void testCheckUserName()
	{
		EmailDatabase db = new EmailDatabase();
		
		try
		{
			db.readUsers("src\\exercise_12_5\\users.txt");
		}
		catch(IOException e)
		{
			System.out.println("Error: Could Not Find File");
		}
		
		Assert.assertEquals(false, db.checkUserName("marco_4"));
		Assert.assertEquals(true, db.checkUserName("mayuresh_95"));
		Assert.assertEquals(true, db.checkUserName("diya_05"));
		Assert.assertEquals(false, db.checkUserName("shiv_09"));
	}
}
