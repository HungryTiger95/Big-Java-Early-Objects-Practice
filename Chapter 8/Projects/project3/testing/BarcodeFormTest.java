package project3.testing;

import org.junit.Test;

import java.util.ArrayList;

import org.junit.Assert;

import project3.BarcodeForm;

public class BarcodeFormTest
{
	@Test
	public void testSetCheckDigit()
	{
		BarcodeForm code = new BarcodeForm(31028);
		BarcodeForm code2 = new BarcodeForm(31028);
		
		code.setCheckDigit(3);
		int calculated = code.getCheckDigit();
		
		Assert.assertEquals(3, calculated);
		
		code2.setCheckDigit();
		calculated = code2.getCheckDigit();
		
		Assert.assertEquals(6, calculated);
	}
	
	@Test
	public void testGetAllDigits()
	{
		BarcodeForm code = new BarcodeForm(31028);
		
		code.getZipCodeSum();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(1);
		list.add(0);
		list.add(2);
		list.add(8);
		
		Assert.assertEquals(list, code.getAllDigits());
	}
	
	@Test
	public void testGetFullBarCode()
	{
		BarcodeForm code = new BarcodeForm(31028);
		code.setCheckDigit();
		
		Assert.assertEquals("|::||::::||||:::::|:||::|::||::|", code.getFullCode());
	}
}
