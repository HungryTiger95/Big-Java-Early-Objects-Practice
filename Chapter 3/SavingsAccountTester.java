
public class SavingsAccountTester
{
	public static void main (String[] args)
	{
		SavingsAccount account = new SavingsAccount(1000, 10);
		account.addInterest();
		
		System.out.println(account.getBalance());
		System.out.println("Expected: 1100.0");
	}
}
