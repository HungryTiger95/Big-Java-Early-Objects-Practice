/**
 * P3.1/ P3.2
 * 
 * Support computing sales tax in the CashRegister class. The tax rate should be supplied
 * when constructing a CashRegister object. Add recordTaxablePurchase and getTotalTax
 * methods. Amounts added with recordPurchase are not taxable. The giveChange
 * method should correctly reflect the sales tax that is charged on taxable items.
 * 
 * @author Mayuresh
 *
 */

public class CashRegisterTaxable
{
	public static void main (String[] args)
	{
		CashRegister reg = new CashRegister(7);		// Creates an object CashRegister with 7 percent sales tax
		
		reg.recordTaxablePurchase(59.99);
		reg.recordPurchase(10.00);
		reg.recievePayment(100);
		reg.printReceipt();
		
		System.out.println("Change: " + reg.giveChange());
		
	}
}
