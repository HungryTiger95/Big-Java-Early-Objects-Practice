package project_1;

public class Monthly extends Appointment
{
	// Instance Variables
	
	// Constructors
	/**
	 * Constructs a monthly appoint with a given description and a date
	 * @param description the appointment description
	 * @param year year
	 * @param month month
	 * @param day day
	 */
	public Monthly(String description, int year, int month, int day)
	{
		super(description, year, month, day);
	}
	
	// Methods
	/**
	 * Checks whether or not the appointment is set for this day of the month
	 * @param year year
	 * @param month month
	 * @param day day
	 */
	public boolean occursOn(int year, int month, int day)
	{
		return super.getDay() == day;
	}
}
