import com.yahoo.mayureshpatel.BankAccount.BankAccount;;

public class BankAccountTester
{
	public static void main(String[] args)
	{
		BankAccount mayuresh = new BankAccount(5000);
		BankAccount payal = new BankAccount();
		
		mayuresh.deposit(400);
		mayuresh.withdraw(1200);
		
		System.out.println("Mayuresh Patel:\nAccount No: " + mayuresh.getAccountNumber() + "\nBalance: " + mayuresh.getBalance());
		
		payal.deposit(6000);
		payal.withdraw(400);
		
		System.out.println("Payal Patel:\nAccount No: " + payal.getAccountNumber() + "\nBalance: " + payal.getBalance());
	}
}
