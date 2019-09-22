
public class CashRegisterTester
{
	public static void main (String[] args)
	{
		CashRegister register = new CashRegister();
		
		register.recordPurchase(5.00);
		register.recordPurchase(10.00);
		
		register.giveChange();
		
		register.recordPurchase(15.00);
		register.recordPurchase(7.95);
		
		register.giveChange();
		
		register.recordPurchase(10.95);
		register.recordPurchase(9.99);
		register.recordPurchase(11.49);
		
		register.giveChange();
		
		System.out.println("Sales Count: " + register.getSalesCount());
		System.out.println("Expected: 7");
		
		System.out.println("Total Sales: " + register.getSalesTotal());
		System.out.println("Expected: 70.38");
	}
}
