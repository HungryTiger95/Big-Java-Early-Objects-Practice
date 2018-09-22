package project3;

public class BardcodeTesting
{
	public static void main(String[] args)
	{
		BarcodeForm barcode = new BarcodeForm(31028);
		
		System.out.println("Digit Array: " + barcode.getAllDigits());
		
		System.out.println("Zipcode: " + barcode.getZipCode());
		System.out.println("Digit Array: " + barcode.getAllDigits());
		
		barcode.setCheckDigit();
		System.out.println("Check Digit: " + barcode.getCheckDigit());
		System.out.println("Digit Array: " + barcode.getAllDigits());
		
		System.out.println("Full Barcode: " + barcode.getFullCode());
		System.out.println("Digit Array: " + barcode.getAllDigits());
	}
}
