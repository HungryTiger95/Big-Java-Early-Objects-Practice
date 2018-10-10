package project16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

/**
 * A component that holds the MovingCar object
 * 
 * @author Mayuresh
 *
 */
public class MovingCarComponent extends JComponent
{
	// Instance Variables
	
	private ArrayList<MovingCar> cars;
	
	// Constructors
	/**
	 * Constructs a moving car component
	 */
	public MovingCarComponent()
	{
		cars = new ArrayList<MovingCar>();
	}
	
	// Methods
	/**
	 * Draws the car.
	 * @param g2 the graphics content
	 */
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		for(MovingCar car : cars)
		{
			car.draw(g2);
		}
	}
	
	/**
	 * Adds a new car at a given location using x and y position and a given color
	 * @param x x pos
	 * @param y y pos
	 * @param color color
	 */
	public void addCar(int x, int y, int dx, Color color)
	{
		MovingCar newCar = new MovingCar(x, y, dx, color);
		cars.add(newCar);
		
		repaint();
	}
	
	/**
	 * Gets the x position of all the cars in the component
	 * @return list of all car x values
	 */
	public ArrayList<Integer> getAllCarX()
	{
		ArrayList<Integer> xVals = new ArrayList<Integer>();
		
		for(MovingCar car : cars)
		{
			xVals.add(car.getX());
		}
		
		return xVals;
	}
	
	/**
	 * Gets the width of the car
	 * @return the width
	 */
	public int getCarWidth()
	{
		return 75;
	}
	
	/**
	 * Moves each car by a given x and y value
	 * @param x x value to move by
	 * @param y y value to move by
	 */
	public void moveCarsBy(int x, int y)
	{
		for(MovingCar car : cars)
		{
			car.translate(x, y);
			repaint();
		}
	}
	
	/**
	 * Moves a single car in the component by a given x and y value.
	 * @param x x pos
	 * @param y y pos
	 * @param i index of car
	 */
	public void moveCarBy(int x, int y, int i)
	{
		cars.get(i).translate(x, y);
		repaint();
	}
	
	/**
	 * Moves each car to a given location
	 * @param x the x position
	 * @param y the y position
	 */
	public void moveCarTo(int x, int y)
	{
		for(MovingCar car : cars)
		{
			car.move(x, y);
			repaint();
		}
	}
	
	/**
	 * Gets the number of cars in the component
	 * @return the number of cars
	 */
	public int getAmountOfCars()
	{
		return cars.size();
	}
	
	/**
	 * Gets a car at the given index of the array of cars
	 * @param index the index
	 * @return the car at the given index
	 */
	public MovingCar getCarAt(int index)
	{
		return cars.get(index);
	}
}
