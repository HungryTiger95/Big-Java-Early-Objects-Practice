package project5;

public class FilterTester
{
	public static void main(String[] args)
	{
		BankAccount[] account = new BankAccount[5];
		account[0] = new BankAccount(1500);
		account[1] = new BankAccount(200);
		account[2] = new BankAccount(2000);
		account[3] = new BankAccount(500);
		account[4] = new BankAccount(1000);
		
		AccountMeasurer meas = new AccountMeasurer();
		AccountFilter filt = new AccountFilter();
		
		BankAccount myAccount = new BankAccount(100);
		System.out.println("Balance: " + myAccount.getBalance());
		System.out.println(filt.accept(myAccount));
		System.out.println("Expected: false");
		
		myAccount.deposit(500);
		System.out.println("Balance: " + myAccount.getBalance());
		System.out.println(filt.accept(myAccount));
		System.out.println("Expected: false");
		
		myAccount.deposit(800);
		System.out.println("Balance: " + myAccount.getBalance());
		System.out.println(filt.accept(myAccount));
		System.out.println("Expected: true\n\n");
		
		
		
		System.out.println("Average Bank Balance (w/out filter): " + Data.average(account, meas));
		System.out.println("Expected: 1040");
		
		System.out.println("Average Bank Balance (w/filter): " + Data.average(account, meas, filt));
		System.out.println("Expected: 1500");
	}
}
