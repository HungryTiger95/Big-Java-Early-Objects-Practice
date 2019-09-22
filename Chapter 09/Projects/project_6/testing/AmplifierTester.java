package project_6.testing;

import org.junit.Test;

import project_6.InvertingAmplifier;
import project_6.NoninvertingAmplifier;
import project_6.VoltageDividerAmplifier;

import org.junit.Assert;

public class AmplifierTester
{
	@Test
	public void testInvertingAmplifier()
	{
		InvertingAmplifier amp = new InvertingAmplifier(15.2, 24.5);
		
		amp.calculateGain();
		double expected = -1.611842105;
		
		Assert.assertEquals(expected, amp.getGain(), 1E-6);
	}
	
	@Test
	public void testNoninvertingAmplifier()
	{
		NoninvertingAmplifier amp = new NoninvertingAmplifier(15.2, 24.5);
		
		amp.calculateGain();
		double expected = 2.611842105;
		
		Assert.assertEquals(expected, amp.getGain(), 1E-6);
	}
	
	@Test
	public void testVoltageDividerAmplifier()
	{
		VoltageDividerAmplifier amp = new VoltageDividerAmplifier(15.2, 24.5);
		
		amp.calculateGain();
		double expected = .617128463;
		
		Assert.assertEquals(expected, amp.getGain(), 1E-6);
	}
}
