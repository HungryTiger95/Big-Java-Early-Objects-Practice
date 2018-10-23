package exercise_12_5;

import java.io.IOException;
import java.util.Scanner;

public class EmaiLSimulator
{
	public static void main(String[] args)
	{
		EmailSystem emailSys;
		EmailDatabase db = new EmailDatabase();
		
		try
		{
			db.readUsers("src\\exercise_12_5\\users.txt");
			emailSys = new EmailSystem(db);
		}
		catch(IOException e)
		{
			System.out.println("Error Opening Users File");
			return;
		}
		
		Scanner in = new Scanner(System.in);
		
		while(true)
		{
			int state = emailSys.getState();
			
			if(state == EmailSystem.START)
			{
				System.out.print("Enter User Name: ");
				String userName = in.next();
				
				emailSys.setUserUsername(userName);
			}
			else if(state == EmailSystem.PASSWORD)
			{
				System.out.print("Enter Password: ");
				String password = in.next();
				
				emailSys.selectUser(password);
			}
			else if(state == EmailSystem.EMAIL_ACTIONS)
			{
				System.out.print("A=Read Message, B=Send Message, C=Quit: ");
				String command = in.next();
				
				if(command.equalsIgnoreCase("A"))
				{
					emailSys.selectEmailAction(EmailSystem.READ);
				}
				else if(command.equalsIgnoreCase("B"))
				{
					emailSys.selectEmailAction(EmailSystem.SEND);
				}
				else if(command.equalsIgnoreCase("C"))
				{
					emailSys.reset();
				}
				else
				{
					System.out.println("Illegl Input!");
				}
					
			}
			else if(state == EmailSystem.READ_MESSAGES)
			{
				if(emailSys.getCurrentUser().getMailbox().getMessages().size() == 0)
				{
					System.out.println("You have no mail yet!");
					emailSys.back();
				}
				else
				{
					// Print out all the messages that this person has in their mailbox
					System.out.printf("%-15s%-15s%-15s\n", "Number", "Sent By", "Message");
					for(int i = 0; i < emailSys.getCurrentUser().getMailbox().getMessages().size(); i++)
					{
						System.out.printf("%-15d%-15s%-15s\n", i + 1, emailSys.getCurrentUser().getMessageAt(i).getSender(),
								emailSys.getCurrentUser().getMessageAt(i).getMessage());
					}
				
					// Select A message to Read and then go back, or just go back
					System.out.print("Enter Message Number to Read, B=Back: ");
					if(in.hasNextInt())
					{
						int choice = in.nextInt() - 1;
						emailSys.displayMessage(choice);
						
						emailSys.back();
					}
					else
					{
						emailSys.back();
					}
				}
			}
			else if(state == EmailSystem.SEND_MESSAGE)
			{
				// Ask for the name of the person to send to (recipient)
				System.out.print("Send To?: ");
				String recipient = in.next();
				
				// Ask what the message you want to send
				System.out.println("Enter the message: ");
				String message = in.next();
				// Make a message object
				Message m = new Message(recipient, emailSys.getCurrentUserName(), message);
				
				// call the send method of the emailSys object
				emailSys.sendMessage(m);
				
				// go back
				emailSys.back();
			}
		}
	}
}
