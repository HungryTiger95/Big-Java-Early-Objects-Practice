package project6;

public class FormatTester
{
	public static void main(String[] args)
	{
		BankAccount account = new BankAccount("Hrithik Roshan", 1500);
		BankAccount account2 = new BankAccount("Deepika Padukone", 1523.34982);
		
		System.out.printf("%8.2s\n", account2);
		System.out.printf("%8.2s\n", account);
		System.out.printf("%.1f", 45.36);
	}
}
