package project_2.testing;

import java.util.Scanner;

import project_2.AppointmentBook;

public class AppointmentTester
{
	public static void main(String[] args)
	{
		AppointmentBook book = new AppointmentBook();
		Scanner in = new Scanner(System.in);
		
		boolean running = true;
		while(running)
		{
			System.out.print("Would you like to add an appointment? ");
			String addAppt = in.next();
			
			if(!(addAppt.equals("Y") || addAppt.equals("y") || addAppt.equals("N") || addAppt.equals("n")))
			{
				System.out.println("Wrong Input: Only Use Y or N");
				continue;
			}
			else if(addAppt.equals("Y") || addAppt.equals("y"))
			{
				System.out.print("Please Enter the type of appointment to add: \n1) Daily Appointment\n2) Monthly Appointment\n3) One Time Appointment\nInput: ");
				int apptType = in.nextInt();
				
				System.out.print("\nEnter the Descritpion: ");
				String description = in.next();
				
				System.out.print("Enter the Date (YYYYMMDD): ");
				String date = in.next();
				
				// Get the year, month, day
				int year = Integer.parseInt(date.substring(0, 4));
				int month = Integer.parseInt(date.substring(4, 6));
				int day = Integer.parseInt(date.substring(6, date.length()));
				
				book.addAppointment(apptType, description, year, month, day);
			}
			else
			{
				{
					running = false;
				}
			}
		}
		
		// Return all of the appointments
		System.out.print(book.getAppointments());
		
		in.close();
	}
}
