package project6;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Cannonball
{
	// Instance Variables
	private double xPos, yPos, initialXPos, initialYPos;
	private double currentVelocity, alpha, time = 0;
	
	private final double g = 9.81;
	
	private ArrayList<Point2D.Double> positionList = new ArrayList<Point2D.Double>();
	private Point2D.Double currentPosition = new Point2D.Double();
	
	private NumberFormat formatter = new DecimalFormat("#0.000");
	
	// Constructors
	/**
	 * Constructs a Cannonball object with a  given initial x position and y position
	 * @param initialXPos
	 */
	public Cannonball(double initialXPos, double initialYPos)
	{
		// Set the initial x and y coordinates
		this.initialXPos = initialXPos;
		this.initialYPos = initialYPos;
		
		xPos = initialXPos;
		yPos = initialYPos;
	}
	
	// Methods
	/**
	 * Moves the cannonball by a given time period
	 * @param deltaSec (Delta T): the time period to update time (seconds)
	 */
	public void move(double deltaSec)
	{
		// Horizontal Motion Calculation
		xPos = ((currentVelocity * Math.cos(alpha)) * time) + initialXPos;
		
		// Vertical Motion Calculation
		yPos = (((currentVelocity * Math.sin(alpha)) * (time)) - (0.5 * g * Math.pow(time, 2))) + (initialYPos);
		
		// Do some conversion to only print the values with 2 decimal points
		xPos = Double.valueOf(formatter.format(xPos));
		yPos = Double.valueOf(formatter.format(yPos));
		
		// Set the current position to these new values
		currentPosition.setLocation(xPos, yPos);
		
		// Add this position to the array
		Point2D.Double newPoint = new Point2D.Double(xPos, yPos);
		positionList.add(newPoint);
		
		// Update time by deltaSec
		time += deltaSec;
		
		// Print coordinates
		System.out.printf("[%.2f, %.2f]\n", newPoint.getX(), newPoint.getY());
	}
	
	/**
	 * Gets the location of the current position of the cannonball
	 * @return current position of the cannonball
	 */
	public Point2D.Double getLocation()
	{
		return currentPosition;
	}
	
	/**
	 * Shoots the cannonball given an angle, velocity, and the time period to update the position of the cannonball
	 * @param alpha angle of the shot
	 * @param velocity initial velocity of the cannonball
	 * @param deltaSec the change in time (delta t) to periodically update the time variable which is used
	 * to calculate the position of the cannonball
	 * @return an array of all of the points of the trajectory of the cannonball after it is fired
	 * until it hits the ground. The ground is level with the initial ground position.
	 */
	public ArrayList<Point2D.Double> shoot(double alpha, double velocity, double deltaSec)
	{
		// Assign values of theta and the initial velocity
		this.alpha = Math.toRadians(alpha);
		this.currentVelocity = velocity;
		
		// Move the canonball by deltaSec
		while(yPos >= initialYPos)
		{
			move(deltaSec);
		}
		
		// Return the array of positions
		return positionList;
	}
	
	/**
	 * Draws the trajectory of the cannonball in flight
	 * @param g2 graphics component
	 */
	public void draw(Graphics2D g2)
	{
		for(int i = 0; i < positionList.size() - 1; i++)
		{
			double xPositionOfPoint = positionList.get(i).getX();
			double yPositionOfPoint = positionList.get(i).getY();
			
			Rectangle2D.Double point = new Rectangle2D.Double();
			
			if(i == 0 || i == positionList.size() - 1)
			{
				point.setFrame(xPositionOfPoint, yPositionOfPoint, 3, 3);
			}
			else
			{
				point.setFrame(xPositionOfPoint, yPositionOfPoint - (2 * (positionList.get(i).getY() - initialYPos)), 3, 3);
			}
			
			
			g2.draw(point);
		}
	}
}
