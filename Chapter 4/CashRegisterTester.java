
public class CashRegisterTester
{
	public static void main(String[] args)
	{
		CashRegister reg = new CashRegister();
		
		reg.recordPurchase(450.95);
		
		reg.enterDollars(550);
		reg.enterQuarters(3);
		reg.enterDimes(2);
		
		System.out.printf("Change: %5.2f", reg.giveChange());
		
	}
}
