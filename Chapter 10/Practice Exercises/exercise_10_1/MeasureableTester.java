package exercise_10_1;

public class MeasureableTester
{
	public static void main(String[] args)
	{
		Measureable[] accounts = new Measureable[3];
		accounts[0] = new BankAccount(4000);
		accounts[1] = new BankAccount(17525);
		accounts[2] = new BankAccount(19200);
		
		double averageBalance = Data.average(accounts);
		System.out.println("Average balance: " + averageBalance);
		System.out.println("Expected: 13575");
		
		double largestBalance = Data.max(accounts);
		System.out.println("Largest Balance: " + largestBalance);
		System.out.println("Expected: 19200");
	}
}