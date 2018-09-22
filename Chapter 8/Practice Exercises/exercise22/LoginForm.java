package exercise22;

public class LoginForm
{
	// Instance Variables
	private String actualUserName = "";
	private String actualPassword = "";
	private String enteredUserName = "";
	private String enteredPassword = "";
	private boolean loggedIn = false;
	
	// Constructors
	public LoginForm(String userName, String password)
	{
		this.actualUserName = userName;
		this.actualPassword = password;
	}
	// Methods
	/**
	 * Enters the user name
	 * @param text user name
	 */
	public void input(String text, String input)
	{
		if(text.equals("Username"))
		{
			enteredUserName = input;
		}
		else if(text.equals("Password"))
		{
			enteredPassword = input;
		}
		else
		{
			System.out.println("Something Went Wrong: input");
		}
	}
	
	/**
	 * Simulates clicking "submit" or "reset", if clicked submit, it will check whether or not
	 * the entered information is the same as the actual information
	 * @param button button to click, either "submit" or "reset"
	 */
	public void click(String button)
	{
		if(button.equals("Submit"))
		{
			// Check if the entered values are the correct ones
			if(enteredUserName.equals(actualUserName) && enteredPassword.equals(actualPassword))
			{
				loggedIn = true;
			}
			else
			{
				loggedIn = false;
			}
		}
		else if(button.equals("Reset"))
		{
			enteredUserName = "";
			enteredPassword = "";
		}
		else
		{
			System.out.println("Something Went Wrong: click");
		}
	}
	
	/**
	 * Returns whether or not the user is logged in
	 * @return true if the user was successfully logged in, false if not
	 */
	public boolean loggedIn()
	{
		return loggedIn;
	}
}
