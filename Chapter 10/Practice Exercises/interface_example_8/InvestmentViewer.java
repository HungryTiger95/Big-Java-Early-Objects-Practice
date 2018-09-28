package interface_example_8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import interface_example.BankAccount;

/**
 * Whenever the user of a graphical program types characters or uses the mouse anywhere inside one of the windows of the program,
 * the Java windowing toolkit sends a notification to the program that an event has occurred. However,
 * most programs don't want to be flooded by irrelevant events. Rather than receiving all these mouse events, a program can indicate
 * that it only cares about menu selections, not about the underlying mouse events.
 * 
 * Every program must indicate which events it needs to receive. It does that by installing event listener objects. An even listener
 * object belongs to a class that you provide. To install a listener, you need to know the event source. The event source is the
 * user-interface component that generates a particular event. You add an event listener object to the appropriate event sources.
 * 
 * Button listeners must belong to a class that implements the ActionListener interface:
 * 
 * 		public interface ActionListener
 * 		{
 * 			void actionPerformed(ActionEvent event);
 * 		}
 * 
 * It is your job to supply a class whose actionPerformed method contains the instructions that you wnat executed whenever the source is
 * triggered.
 * 
 * For this Button example:
 * 
 * Once the listener class has been declared, we need to construct an object of the class and add it to the button:
 * 	
 * 		ActionListener listener = new ClickListener();
 * 		button.addActionListener(listener);
 * 
 * Whenever the button is clicked, it calls:
 * 
 * 		listener.actionPerformed(event);
 * 
 * You can think of the actionPerformed method as another example of a callback, similar to the measure method of the Measurer class.
 * The windowing toolkit calls the actionPerformed method whenever the button is pressed, whereas the Data class calls the emasure method
 * whenever it needs to measure an object.
 * 
 * 
 * 
 * @author Mayuresh
 *
 */
public class InvestmentViewer
{
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 300;
	
	private static final double INTEREST_RATE = 10;
	private static final double INITIAL_BALANCE = 1000;
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		JButton button = new JButton("Add Interest");
		
		final BankAccount account = new BankAccount(INITIAL_BALANCE);
		
		NumberFormat formatter = new DecimalFormat("#0.00"); 
		final JLabel label = new JLabel("Balance: " + Double.valueOf(formatter.format(account.getBalance())));
		
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(button);
		frame.add(panel);
		
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				double interest = account.getBalance() * INTEREST_RATE / 100;
				account.deposit(interest);
				
				label.setText("Balance: " + Double.valueOf(formatter.format(account.getBalance())));
			}
		}
		
		ActionListener listener = new AddInterestListener();
		button.addActionListener(listener);
		
		frame.setSize(500, 300);
		frame.setLocation(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
