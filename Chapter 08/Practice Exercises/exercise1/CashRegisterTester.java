package exercise1;

public class CashRegisterTester
{
	public static void main (String[] args)
	{
		final Coin DOLLAR = new Coin(1.00, "Dollar");
		final Coin QUARTER = new Coin(0.25, "Quarter");
		final Coin DIME = new Coin(0.10, "Dime");
		final Coin NICKEL = new Coin(0.05, "Nickel");
		final Coin PENNY = new Coin(0.01, "Penny");
		
		CashRegister register = new CashRegister();
		
		register.recordPurchase(2.19);
		register.recordPurchase(1.95);
		register.recordPurchase(10.95);
		register.recordPurchase(8.70);
		
		register.recievePayment(20, DOLLAR);
		register.recievePayment(8, QUARTER);
		register.recievePayment(15, DIME);
		register.recievePayment(10, NICKEL);
		register.recievePayment(40, PENNY);
		
		double change = register.giveChange();
		
		System.out.printf("Change: %.2f\n", change);
		System.out.println("Expected Change: 0.61");
	}
}
