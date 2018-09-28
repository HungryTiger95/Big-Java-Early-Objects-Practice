package exercise_10_20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Scanner;

import javax.swing.Timer;

/**
 * Write a program that uses a timer to print the current time once a second. Hint the following code prints the current time.
 * 
 * 			Date now = new Date();
 * 			System.out.println(now);
 * 
 * @author Mayuresh
 *
 */
public class CurrentTime implements ActionListener
{	
	final int DELAY = 100;
	private Timer t;
	
	/**
	 * Constructs a current time object with a timer object set up with a 1000 ms delay
	 * and an actionListener and then start the timer.
	 */
	public CurrentTime()
	{
		t = new Timer(DELAY, this);
		t.start();
	}
	
	public void actionPerformed(ActionEvent event)
	{
		Date now = new Date();
		System.out.println(now);
	}
	
	public static void main(String[] args)
	{
		new CurrentTime();
		Scanner scan = new Scanner(System.in);
		
		scan.next();
		
		scan.close();
	}
}
