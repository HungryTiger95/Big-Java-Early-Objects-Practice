/**
 * Testing E3.3/ E3.4
 * 
 * Write a BankAccountTester class whose main method constructs a bank account, deposits
 * 1000, withdraws 500, and then withdraws another 400, and then prints the remaining
 * balance. Also print the expected result.
 * 
 * Add a method to BankAccount addInterest(double rate) that adds interest at the given rate.
 * @author Mayuresh
 *
 */
public class BankAccountTester
{
	public static void main (String[] args)
	{
		BankAccount mySavings = new BankAccount();
		mySavings.deposit(1000);
		mySavings.withdraw(400);
		mySavings.withdraw(500);
		
		System.out.println(mySavings.getBalance());
		System.out.println("Expected: 100");
		
		BankAccount myChecking = new BankAccount(1000);
		myChecking.addInterest(10);
		
		System.out.println(myChecking.getBalance());
		System.out.println("Expected: 1100");
	}
}
