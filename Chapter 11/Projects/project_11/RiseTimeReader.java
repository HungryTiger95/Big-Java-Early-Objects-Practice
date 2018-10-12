package project_11;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

import project_8.BadDataException;

/**
 * The figure at the right shows a plot of the capacitor voltage from the circuit
 * shown in project 10. The capacitor voltage increases from 0 volts to B volts.
 * The "rise time" is defined as the time required for the capacitor voltage to change
 * from
 * 
 * 		v1 = 0.05 * B ---> v2 = 0.95 * B
 * 
 * The file rc.txt contains a list of values of time t and the corresponding capacitor
 * voltage v(t). A time in microseconds and the corresponding voltage in volts are
 * printed on the same line. For example, the line
 * 
 * 		110 7.02261
 * 
 * indicates that the capacitor voltage is 7.02261 volts when the time is 110 microseconds.
 * The time is increasing in the data file.
 * 
 * Write a program that reads the file rc.txt and uses the data to calculate the rise time.
 * Approximate B by the voltage in the last line of the file, and find the data points that
 * are closest to 0.05 * B and 0.95 * B
 * 
 * @author Mayuresh
 *
 */
public class RiseTimeReader
{
	// Instance Variables
	ArrayList<Integer> timeList = new ArrayList<Integer>();
	ArrayList<Double> voltageList = new ArrayList<Double>();
	double bApprox;
	
	// Constructors
	
	// Methods
	public void readFile(String fileName) throws IOException
	{
		File inFile = new File("src\\project_11\\".concat(fileName));
		try(Scanner in = new Scanner(inFile))
		{
			readData(in);
		}
	}
	
	public void readData(Scanner in) throws BadDataException
	{
		while(in.hasNextLine())
		{
			if(!in.hasNextInt())
			{
				throw new BadDataException("Expected Time");
			}
			timeList.add(in.nextInt());
			
			if(!in.hasNextDouble())
			{
				throw new BadDataException("Expected Voltage");
			}
			voltageList.add(in.nextDouble());
		}
		
		bApprox = voltageList.get(voltageList.size() - 1);
		
		NumberFormat formatter = new DecimalFormat("#.##");
		bApprox = Double.valueOf(formatter.format(bApprox));
	}
	
	public int calculateRiseTime()
	{
		double bottomPercentileDifference = Double.MAX_VALUE;
		double topPercentileDifference = Double.MAX_VALUE;
		int botPos = 0;
		int topPos = 0;
		
		for(int i = 0; i < voltageList.size(); i++)
		{
			// Find the closest to the bottom percentile
			if(Math.abs(((bApprox * 0.05) - voltageList.get(i))) < bottomPercentileDifference)
			{
				bottomPercentileDifference = Math.abs(((bApprox * 0.05) - voltageList.get(i)));
				botPos = i;
			}
			
			// Find the closest to the top percentile
			if(Math.abs(((bApprox * 0.95) - voltageList.get(i))) < topPercentileDifference)
			{
				topPercentileDifference = Math.abs(((bApprox * 0.95) - voltageList.get(i)));
				topPos = i;
			}
		}
		
		// Calculate rise time
		int riseTime = timeList.get(topPos) - timeList.get(botPos);
		return riseTime;
	}
}
