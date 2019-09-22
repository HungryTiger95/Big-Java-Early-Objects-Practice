
public class BankAccountTester
{
	public static void main(String[] args)
	{
		// BankAccount(initial balance, fee cost, free transactions)
		BankAccount mayo = new BankAccount(1000, 3.25, 5);
		System.out.println("Initial Balance: " + mayo.getBalance());
		
		// Free Transactions
		mayo.deposit(500);
		System.out.println("Balance after $500 deposit: " + mayo.getBalance());
		
		mayo.deposit(1000);
		System.out.println("Balance after $1000 deposit: " + mayo.getBalance());
		
		mayo.withdraw(20);
		System.out.println("Balance after $20 withdrawal: " + mayo.getBalance());
		
		mayo.withdraw(250);
		System.out.println("Balance after $250 withdrawal: " + mayo.getBalance());
		
		mayo.deposit(110);
		System.out.println("Balance after $110 deposit: " + mayo.getBalance());
		
		// Transactions with fees
		mayo.withdraw(150);
		System.out.println("Balance after $150 withdrawal + 3.25 transaction fee: " + mayo.getBalance());
		
		mayo.deposit(600);
		System.out.println("Balance after $600 deposit + 3.25 transaction fee: " + mayo.getBalance());
		
		mayo.deposit(45);
		System.out.println("Balance after $45 deposit + 3.25 transaction fee: " + mayo.getBalance());
		
		mayo.deductMonthlyCharge();
		
		System.out.println("End of Month Balance: " + mayo.getBalance());
	}
}
