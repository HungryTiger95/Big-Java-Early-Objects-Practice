package project_1;

public class Daily extends Appointment
{
	// Instance Variables
	
	// Constructors
	/**
	 * Constructs a daily appointment for one month given a description, a year, month, and a day
	 * @param description the description of the appointment
	 * @param year the year
	 * @param month the month
	 * @param day the day
	 */
	public Daily(String description, int year, int month, int day)
	{
		super(description, year, month, day);
	}
	
	// Methods
	/**
	 * Checks whether or not an appointment is set for this day
	 */
	public boolean occursOn(int year, int month, int day)
	{
		return true;
	}
}
