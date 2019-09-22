package project5.testing;

import project5.Customer;
import project5.Shop;

public class CustomerTest
{
	public static void main(String[] args)
	{
		Customer mayo = new Customer();
		
		mayo.makePurchase(350.99, Shop.AEROPOSTALE);
		mayo.makePurchase(15.99, Shop.ADIDAS);
		mayo.makePurchase(25.99, Shop.GAP);
		
		System.out.println(mayo.getPurchaseListFrom(Shop.AEROPOSTALE));
		System.out.println(mayo.getPurchaseListFrom(Shop.ADIDAS));
		System.out.println(mayo.getPurchaseListFrom(Shop.GAP));
		
		System.out.println(mayo.isDiscountReached());
		System.out.println(mayo.discountAvailable());
		
		
	}
}
