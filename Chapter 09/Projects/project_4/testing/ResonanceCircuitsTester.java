package project_4.testing;

import org.junit.Assert;
import org.junit.Test;

import project_4.ParallelResonantCircuit;
import project_4.SeriesResonantCircuit;

public class ResonanceCircuitsTester
{
	@Test
	public void testParallelResonantCircuit()
	{
		ParallelResonantCircuit c1 = new ParallelResonantCircuit();
		//double EPSILON = .0000001;
		
		c1.setGainAtResonantFrequency(15.2);
		c1.setBandwidth(25);
		c1.setResonantFrequency(100);
		
		c1.designCircuit();
		
		double expectedRes = 15.2;
		double expectedCap = .002631579;
		double expectedInd = .037999999;
		
		Assert.assertEquals(expectedRes, c1.getResistance(), 1E-6);
		Assert.assertEquals(expectedCap, c1.getCapacity(), 1E-6);
		Assert.assertEquals(expectedInd, c1.getInductance(), 1E-6);
		
		System.out.print(c1.getClass().getName() + "\n");
		c1.display();
	}
	
	@Test
	public void testSeriesResonantCircuit()
	{
		SeriesResonantCircuit c1 = new SeriesResonantCircuit();
		//double EPSILON = .0000001;
		
		c1.setGainAtResonantFrequency(15.2);
		c1.setBandwidth(25);
		c1.setResonantFrequency(100);
		
		c1.designCircuit();
		
		double expectedRes = .065789474;
		double expectedCap = .037999999;
		double expectedInd = .002631579;
		
		Assert.assertEquals(expectedRes, c1.getResistance(), 1E-6);
		Assert.assertEquals(expectedCap, c1.getCapacity(), 1E-6);
		Assert.assertEquals(expectedInd, c1.getInductance(), 1E-6);
		
		System.out.print(c1.getClass().getName() + "\n");
		c1.display();
	}
}
