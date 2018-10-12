package project_10;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import project_9.BadDataException;

/**
 * For the explanation of this project you need the textbook.
 * 
 * After the switch in the figure below closes, the voltage(in volts) across the capacitor is represented
 * by the equation:
 * 
 * 		v(t) = B(1 - e^(-t / (RC)))
 * 
 * Suppose the parameters of the electric circuit are B = 12 volts, R = 500 ohms, and C = .25 micro-Farraday.
 * Read a file that contains the parameters B, R, C, and the starting and ending times. Write a file rc.txt
 * of values for the time t and the corresponding capacitor voltage v(t), where t goes from the given starting
 * value to the given ending value in 100 steps. In this example, if t goes from 0 to 1000 microseconds, the
 * twelfth entry in the output file should be:
 * 
 * 		110 7.02261
 * 
 * @author Mayuresh
 *
 */
public class VoltageReader
{
	// Instance Variables
	private ArrayList<Double> voltageList = new ArrayList<Double>();
	private ArrayList<Integer> timeList = new ArrayList<Integer>();
	
	private double b, r, c;
	private int tStart, tEnd;
	
	// Constructors
	
	// Methods
	public ArrayList<Double> readFile(String fileName) throws IOException
	{
		File inFile = new File("src\\project_10\\".concat(fileName));
		try(Scanner in = new Scanner(inFile))
		{
			readData(in);
			return voltageList;
		}
	}
	
	public void readData(Scanner in) throws BadDataException
	{
		while(in.hasNextLine())
		{
			if(!in.hasNextDouble())
			{
				voltageList.clear();
				timeList.clear();
				throw new BadDataException("Expected Value for B");
			}
			this.b = in.nextDouble();
			
			if(!in.hasNextDouble())
			{
				voltageList.clear();
				timeList.clear();
				throw new BadDataException("Expected Value for R");
			}
			this.r = in.nextDouble();
			
			if(!in.hasNextDouble())
			{
				voltageList.clear();
				timeList.clear();
				throw new BadDataException("Expected Value for C");
			}
			this.c = in.nextDouble();
			
			if(!in.hasNextInt())
			{
				voltageList.clear();
				timeList.clear();
				throw new BadDataException("Expected Value for Time Start");
			}
			this.tStart = in.nextInt();
			
			if(!in.hasNextInt())
			{
				voltageList.clear();
				timeList.clear();
				throw new BadDataException("Expected Value for Time End");
			}
			this.tEnd = in.nextInt();
		}
	}
	
	public void calculateVoltage(int deltaTime)
	{
		int t = tStart;
		while(t <= tEnd)
		{
			double voltage = (b * (1 - (Math.pow(Math.E, (-t / (r * c))))));
			voltageList.add(voltage);
			timeList.add(t);
			
			t += deltaTime;
		}
	}
	
	public ArrayList<Double> getVoltages()
	{
		return this.voltageList;
	}
	
	public ArrayList<Integer> getTimes()
	{
		return this.timeList;
	}
}
