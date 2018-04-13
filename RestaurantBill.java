
public class RestaurantBill
{
	public static void main(String[] args)
	{
		double billTotal, tip, splitBill, tipPercentage;
		int split;
		
		split = 4;
		billTotal = 350.45;
		tipPercentage = 15 / 100.0;
		
		splitBill = billTotal / split;
		tip = splitBill * tipPercentage;
		
		System.out.println("Bill Total: " + billTotal);
		System.out.println("15% Tip = " + (billTotal * tipPercentage));
		System.out.println("Split " + split + " ways");
		System.out.println("Each Person Pays: " + splitBill);
		System.out.println("Tip is " + tipPercentage + "% = " + tip);
		System.out.println("Total Each Person Pays: " + (splitBill + tip));
	}
}
