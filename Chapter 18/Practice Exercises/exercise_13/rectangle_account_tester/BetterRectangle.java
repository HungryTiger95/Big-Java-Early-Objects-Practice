package exercise_13.rectangle_account_tester;

import exercise_13.*;

public class BetterRectangle implements Measurable<BetterRectangle>
{
	// Instance Variables
	private int width;
	private int height;
	
	// Constructors
	/**
	 * Constructs a rectangle with given width, and height
	 * @param width width
	 * @param height height
	 */
	public BetterRectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}

	// Methods
	@Override
	public double getMeasure(BetterRectangle rect)
	{
		return rect.height * rect.width;
	}
	
	public String toString()
	{
		return "[width=" + width + ",height=" + height + "]";
	}
}
