
import exercise15.money.CashRegister;
import exercise15.money.Coin;

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
		register.recordPurchase(3.99);
		register.recordPurchase(14.29);
		register.recordPurchase(15.85);
		
		register.recievePayment(30, DOLLAR);
		register.recievePayment(16, QUARTER);
		register.recievePayment(20, DIME);
		register.recievePayment(40, NICKEL);
		register.recievePayment(400, PENNY);
		
		double change = register.giveChange();
		
		System.out.printf("Change: %.2f\n", change);
		System.out.println("Expected Change: 3.73");
	}
}
