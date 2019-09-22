package project_2;

import java.time.LocalDate;

/**
 * Improve the appointment book program. Give the user the option to add new appointments. The user
 * must specify the type of the appointment, the description, and the date.
 * 
 * @author Mayuresh
 *
 */
public class Appointment
{
	// Instance Variables
	private String description;
	private LocalDate date;
	
	// Constructors
	/**
	 * Constructs an Appointment without a description or a date
	 */
	public Appointment(String description, int year, int month, int day)
	{
		this.description = description;
		this.date = LocalDate.of(year, month, day);
	}
	
	// Methods
	/**
	 * Sets the description of this appointment
	 * @param appointmentDescription the description of the appointment
	 */
	public void setDescription(String appointmentDescription)
	{
		this.description = appointmentDescription;
	}
	
	/**
	 * Gets the description of this appointment
	 * @return description
	 */
	public String getDescription()
	{
		return this.description;
	}
	
	/**
	 * Sets the date for this appointment
	 * @param date the date
	 */
	public void setDate(LocalDate date)
	{
		this.date = date;
	}
	
	/**
	 * Gets the date for this appointment
	 * @return
	 */
	public LocalDate getDate()
	{
		return this.date;
	}
	
	/**
	 * Gets the year for this appointment
	 * @return the year of this appointment
	 */
	public int getYear()
	{
		return this.date.getYear();
	}
	
	/**
	 * Gets the integer value of the month for this appointment
	 * @return the integer value of the month (1 - 12)
	 */
	public int getMonth()
	{
		return this.date.getMonthValue();
	}
	
	/**
	 * Gets the day of the month
	 * @return the day of the month
	 */
	public int getDay()
	{
		return this.date.getDayOfMonth();
	}
	
	/**
	 * Checks whether or not an appointment has been set on the given date
	 * @param year the year
	 * @param month the month
	 * @param day the day
	 * @return true if the appointment is set for the given date, false if not
	 */
	public boolean occursOn(int year, int month, int day)
	{
		LocalDate newDate = LocalDate.of(year, month, day);
		
		if(getDate().equals(newDate))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Returns the String representation of this class
	 */
	public String toString()
	{
		return getClass().getName() + "[description=" + getDescription() + "][" + getDate() + "]";
	}
}
