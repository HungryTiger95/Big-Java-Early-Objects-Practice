package project4;

public class CustomerTesting
{
	public static void main(String[] args)
	{
		Customer mayo = new Customer();
		
		mayo.makePurchase(24.99);
		mayo.makePurchase(15.00);
		mayo.makePurchase(35.81);
		
		System.out.println("Spent: " + mayo.getSumOfPurchases() + " Discount Reached?: " + mayo.isDiscountReached());
		
		mayo.makePurchase(45.00);
		System.out.println("Spent: " + mayo.getSumOfPurchases() + " Discount Reached?: " + mayo.isDiscountReached());
		
		mayo.completePurchase();
		
		System.out.println("Spent: " + mayo.getSumOfPurchases() + " Discount Available?: " + mayo.discountAvailable());
		
		mayo.makePurchase(45.34);
		mayo.useDiscount();
		
		System.out.println("Spent: " + mayo.getSumOfPurchases() +
				" \nDiscount Reached?: " + mayo.isDiscountReached() +
				"\nDiscount Available: " + mayo.discountAvailable());
	}
}
