package exercise_12_5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmailDatabase
{
	// Instance Variables
	private ArrayList<User> users;
	
	// Constructors
	/**
	 * Creates an email system that has an array list of users
	 */
	public EmailDatabase()
	{
		users = new ArrayList<User>();
	}
	
	// Methods
	/**
	 * Reads a list of users in a file in the format of userName password
	 * @param fileName the name of the user file
	 * @throws IOException
	 */
	public void readUsers(String fileName) throws IOException
	{
		Scanner in = new Scanner(new File(fileName));
		while(in.hasNextLine())
		{
			String userName = in.next();
			String password = in.next();
			
			User u = new User(userName, password);
			addUser(u);
		}
		in.close();
	}
	
	public void readMessages(String fileName) throws IOException
	{
		// Construct a scanner object to read a file
		Scanner in = new Scanner(new File(fileName));
		
		// Read through each line in the file to get the contents
		while(in.hasNextLine())
		{
			Scanner line = new Scanner(in.nextLine());
			
			String recipient = line.next();
			String sender = line.next();
			String message = "";
			
			while(line.hasNext())
			{
				message.concat(line.next() + " ");
			}
			line.close();
			
			// See if there is a user in the system with the recipient name and
			// add the message to that users mailbox
			for(int i = 0; i < users.size(); i++)
			{
				if(users.get(i).getUserName().equals(recipient))
				{
					users.get(i).getMailbox().addMessage(recipient, sender, message);
				}
			}
		}
		in.close();
	}
	
	/**
	 * Adds a user to the email system
	 * @param u the user to add
	 */
	public void addUser(User u)
	{
		users.add(u);
	}
	
	/**
	 * Gets a user from the array of users
	 * @param i index
	 * @return the user
	 */
	public User getUser(int i)
	{
		return users.get(i);
	}
	
	/**
	 * Gets a user given the user name to search for
	 * @param userName the user name to search for
	 * @return the user
	 */
	public User getUser(String userName)
	{
		return findUser(userName);
	}
	
	/**
	 * Finds a user in the email system
	 * @param userName a user name
	 * @param password a password
	 * @return the matching user, or null if no user matches
	 */
	public User findUser(String userName, String password)
	{
		for(int i = 0; i < this.users.size(); i++)
		{
			if(this.users.get(i).getUserName().equals(userName) && this.users.get(i).getPassword().equals(password))
			{
				return this.users.get(i);
			}
		}
		
		return null;
	}
	
	/**
	 * Finds a user in the database based on only its user name
	 * @param userName the user name to check for
	 * @return the user if found, or null if no user matches
	 */
	public User findUser(String userName)
	{
		for(int i = 0; i < this.users.size(); i++)
		{
			if(this.users.get(i).getUserName().equals(userName))
			{
				return this.users.get(i);
			}
		}
		
		return null;
	}
	
	/**
	 * Checks whether or not the given user name matches any user name in
	 * the database
	 * @param userName the user name to check
	 * @return true if the user name matches any user name in the database
	 */
	public boolean checkUserName(String userName)
	{
		boolean isAvail = false;
		for(User u : users)
		{
			if(u.matchUserName(userName))
			{
				isAvail = true;
			}
		}
		
		return isAvail;
	}
	
	/**
	 * Gets the list of users in this database
	 * @return the list of users
	 */
	public ArrayList<User> getUsers()
	{
		return this.users;
	}
}
