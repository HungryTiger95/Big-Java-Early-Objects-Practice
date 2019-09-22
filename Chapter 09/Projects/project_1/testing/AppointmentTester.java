package project_1.testing;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import project_1.Appointment;
import project_1.Daily;
import project_1.Monthly;
import project_1.OneTime;

public class AppointmentTester
{
	@Test
	public void testDailyAppointment()
	{
		Daily dailyAppointment = new Daily("Exercise at 7 am", 2018, 2, 8);
		
		boolean app1 = dailyAppointment.occursOn(2018, 3, 9);
		boolean app2 = dailyAppointment.occursOn(2018, 4, 12);
		boolean app3 = dailyAppointment.occursOn(2018, 5, 20);
		boolean app4 = dailyAppointment.occursOn(2019, 3, 9);
		boolean app5 = dailyAppointment.occursOn(2019, 6, 15);
		
		boolean[] expected = {true, true, true, true, true};
		
		boolean[] actual = new boolean[5];
		actual[0] = app1;
		actual[1] = app2;
		actual[2] = app3;
		actual[3] = app4;
		actual[4] = app5;
		
		for(int i = 0; i < actual.length; i++)
		{
			Assert.assertEquals(expected[i], actual[i]);
		}
	}
	
	@Test
	public void testMonthly()
	{
		Monthly montlyAppointment = new Monthly("Board Meeting", 2018, 1, 15);
		
		boolean app1 = montlyAppointment.occursOn(2018, 3, 15);
		boolean app2 = montlyAppointment.occursOn(2018, 4, 12);
		boolean app3 = montlyAppointment.occursOn(2018, 5, 15);
		boolean app4 = montlyAppointment.occursOn(2019, 3, 9);
		boolean app5 = montlyAppointment.occursOn(2019, 7, 12);
		
		boolean[] expected = {true, false, true, false, false};
		
		boolean[] actual = new boolean[5];
		actual[0] = app1;
		actual[1] = app2;
		actual[2] = app3;
		actual[3] = app4;
		actual[4] = app5;
		
		for(int i = 0; i < actual.length; i++)
		{
			Assert.assertEquals(expected[i], actual[i]);
		}
	}
	
	@Test
	public void testOneTime()
	{
		OneTime oneTimeAppointment = new OneTime("Dentist", 2019, 2, 19);
		
		boolean app1 = oneTimeAppointment.occursOn(2018, 3, 15);
		boolean app2 = oneTimeAppointment.occursOn(2019, 2, 19);
		boolean app3 = oneTimeAppointment.occursOn(2018, 5, 15);
		boolean app4 = oneTimeAppointment.occursOn(2019, 2, 19);
		boolean app5 = oneTimeAppointment.occursOn(2019, 7, 12);
		
		boolean[] expected = {false, true, false, true, false};
		
		boolean[] actual = new boolean[5];
		actual[0] = app1;
		actual[1] = app2;
		actual[2] = app3;
		actual[3] = app4;
		actual[4] = app5;
		
		for(int i = 0; i < actual.length; i++)
		{
			Assert.assertEquals(expected[i], actual[i]);
		}
	}
	
	@Test
	public void testAppointment()
	{
		ArrayList<Appointment> appointments = new ArrayList<Appointment>();
		
		OneTime oT1 = new OneTime("Dentist", 2019, 8, 21);
		OneTime oT2 = new OneTime("Oncologist", 2020, 9, 11);
		OneTime oT3 = new OneTime("Job Interview", 2018, 10, 5);
		OneTime oT4 = new OneTime("Family Reunion", 2019, 11, 10);
		OneTime oT5 = new OneTime("Management Meeting", 2018, 10, 16);
		
		Daily d1 = new Daily("Exercise", 2018, 9, 21);
		Daily d2 = new Daily("Homework", 2018, 9, 21);
		Daily d3 = new Daily("Practice", 2018, 9, 21);
		
		Monthly m1 = new Monthly("Job Performance Meeting", 2018, 10, 10);
		Monthly m2 = new Monthly("Doctors", 2018, 11, 10);
		Monthly m3 = new Monthly("5K Run", 2018, 11, 10);
		Monthly m4 = new Monthly("Dinner Date", 2018, 10, 9);
		
		appointments.add(oT1);
		appointments.add(oT2);
		appointments.add(oT3);
		appointments.add(oT4);
		appointments.add(oT5);
		
		appointments.add(d1);
		appointments.add(d2);
		appointments.add(d3);
		
		appointments.add(m1);
		appointments.add(m2);
		appointments.add(m3);
		appointments.add(m4);
		
		ArrayList<Boolean> answers = new ArrayList<Boolean>();
		for(int i = 0; i < appointments.size(); i++)
		{
			answers.add(appointments.get(i).occursOn(2019, 11, 10));
		}
		
		ArrayList<Boolean> expected = new ArrayList<Boolean>();
		expected.add(false);
		expected.add(false);
		expected.add(false);
		expected.add(true);
		expected.add(false);
		expected.add(true);
		expected.add(true);
		expected.add(true);
		expected.add(true);
		expected.add(true);
		expected.add(true);
		expected.add(false);
		
		for(int i = 0; i < expected.size(); i++)
		{
			Assert.assertEquals(expected.get(i), answers.get(i));
		}
	}
}
