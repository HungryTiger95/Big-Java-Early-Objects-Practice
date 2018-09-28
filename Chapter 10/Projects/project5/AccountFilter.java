package project5;

public class AccountFilter implements Filter
{
	@Override
	/**
	 * Returns whether or not accept a bank account object based on its balance
	 */
	public boolean accept(Object anObject)
	{
		BankAccount account = (BankAccount) anObject;
		
		if(account.getBalance() >= 1000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
