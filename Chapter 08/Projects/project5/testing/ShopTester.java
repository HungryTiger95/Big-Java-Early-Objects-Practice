package project5.testing;

import project5.Shop;

public class ShopTester
{
	public static void main(String[] args)
	{
		Shop shop1 = Shop.AEROPOSTALE;
		Shop shop2 = Shop.JORDAN;
		
		shop1.recordPurchase(40.00);
		
		System.out.println("Aeropostal Purchases: " + shop1.getPurchaseList().toString());
		
		shop2.recordPurchase(125.00);
		shop2.recordPurchase(50.99);
		System.out.println("Jordan Purchases: " + shop2.getPurchaseList().toString());
		
	}
}
