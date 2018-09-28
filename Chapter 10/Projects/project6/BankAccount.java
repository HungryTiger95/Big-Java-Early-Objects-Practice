package project6;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Formattable;
import java.util.Formatter;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
   
   The System.out.printf method has predefined formats for printing integers, floating-point
   numbers, and other data types. But it is also extensible. If you use the S format, you
   can print any class that implements the Formattable interface. The interface has a
   single method:
   
   		void formatTo(Formatter formatter, int flags, int width, int precision)
   		
   In this exercise, you should make the BankAccount class implement the Formattable interface.
   Ignore the flags and precision and simply format the bank balance, using the given width.
   In order to achieve this task, you need to get an Appendable reference like this:
   
   		Appendable a = formatter.out();
   
   Appendable is another interface with a method
   
   		void append(CharSequence sequence)
   		
   CharSequence is yet another interface that is implemented by (among others) the String
   class. Construct a string by first converting the bank balance into a string and then
   padding it with spaces so that it has the desired width. Pass that string to the append method.
   
*/
public class BankAccount implements Formattable
{  
	private String name;
	private double balance;
	
	/**
	   Constructs a bank account with a zero balance.
    */
	public BankAccount()
	{   
		this.name = "";
		this.balance = 0;
	}

	/**
      	Constructs a bank account with a given balance.
      	@param initialBalance the initial balance
	 */
	public BankAccount(String name, double initialBalance)
	{   
		this.name = name;
		this.balance = initialBalance;
	}

	/**
      	Deposits money into the bank account.
      	@param amount the amount to deposit
	 */
	public void deposit(double amount)
	{  
		balance = balance + amount;
	}

	/**
      	Withdraws money from the bank account.
      	@param amount the amount to withdraw
	 */
	public void withdraw(double amount)
	{   
		balance = balance - amount;
	}

	/**
      	Gets the current balance of the bank account.
      	@return the current balance
	 */
	public double getBalance()
	{   
		return balance;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	@Override
	/**
	 * Formats a bank account when using System.out.printf using %s.
	 * This method will format the width and precision of the bank balance
	 */
	public void formatTo(Formatter formatter, int flags, int width, int precision)
	{
		Appendable a = formatter.out();
		
		// Precision Modifier
		String formatPattern = "#0.";
		for(int i = 0; i < precision; i++)
		{
			formatPattern = formatPattern.concat("0");
		}
		
		NumberFormat numFormat = new DecimalFormat(formatPattern);
		
		String bankBalance = numFormat.format(getBalance());
		String padding = "";
		
		// Padding Modifier
		if(bankBalance.length() > width)
		{
			// Ignore the width modifier
		}
		else
		{
			// Add padding
			int padWidth = width - bankBalance.length();
			for(int i = 0; i < padWidth; i++)
			{
				padding = padding.concat(" ");
			}
		}
		bankBalance = padding.concat(bankBalance);
		
		try
		{
			a.append(bankBalance);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
