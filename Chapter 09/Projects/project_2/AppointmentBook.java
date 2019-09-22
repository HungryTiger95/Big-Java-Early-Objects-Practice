package project_2;

import java.util.ArrayList;

public class AppointmentBook
{
	// Instance Variables
	private ArrayList<Appointment> appts;
	
	// Constructors
	/**
	 * Constructs an appointment book that holds all of the appointments for a person
	 */
	public AppointmentBook()
	{
		appts = new ArrayList<Appointment>();
	}
	
	// Methods
	/**
	 * Adds an appointment to the list of appointments
	 * @param apptType the type of appointment to add: 1 for Daily Appointment, 2 for Monthly Appointment, or 3 for One Time Appointment
	 * @param description appointment description
	 * @param year year
	 * @param month month
	 * @param day day
	 */
	public void addAppointment(int apptType, String description, int year, int month, int day)
	{	
		if(apptType == 1)
		{
			Daily d1 = new Daily(description, year, month, day);
			
			appts.add(d1);
		}
		else if(apptType == 2)
		{
			Monthly m1 = new Monthly(description, year, month, day);
			
			appts.add(m1);
		}
		else if(apptType == 3)
		{
			OneTime oT1 = new OneTime(description, year, month, day);
			
			appts.add(oT1);
		}
		else
		{
			return;
		}
	}
	
	/**
	 * Gets all of the appointments in this book
	 * @return the appointment list
	 */
	public ArrayList<Appointment> getAppointments()
	{
		return appts;
	}
}
