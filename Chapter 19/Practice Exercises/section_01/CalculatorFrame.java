package section_01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * This frame contains a panel that displays buttons
 * for a calculator and a panel with a text field to
 * specify the result of calculation. The operator
 * buttons don't do anything as of this program.
 * 
 * @author Mayuresh
 *
 */
public class CalculatorFrame extends JFrame
{
	private JLabel display;
	
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 300;
	
	/**
	 * Constructs a calculator frame
	 */
	public CalculatorFrame()
	{
		display = new JLabel("0");
		add(display, BorderLayout.NORTH);
		createButtonPanel();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	/**
	 * Constructs the button panel for the calculator
	 */
	private void createButtonPanel()
	{
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 4));
		
		buttonPanel.add(makeDigitButton("7"));
		buttonPanel.add(makeDigitButton("8"));
		buttonPanel.add(makeDigitButton("9"));
		buttonPanel.add(makeOperatorButton("/"));
		buttonPanel.add(makeDigitButton("4"));
		buttonPanel.add(makeDigitButton("5"));
		buttonPanel.add(makeDigitButton("6"));
		buttonPanel.add(makeOperatorButton("*"));
		buttonPanel.add(makeDigitButton("1"));
		buttonPanel.add(makeDigitButton("2"));
		buttonPanel.add(makeDigitButton("3"));
		buttonPanel.add(makeOperatorButton("-"));
		buttonPanel.add(makeDigitButton("0"));
		buttonPanel.add(makeDigitButton("."));
		buttonPanel.add(makeOperatorButton("="));
		buttonPanel.add(makeOperatorButton("+"));
		
		add(buttonPanel, BorderLayout.CENTER);
	}
	
	/**
	 * Makes a button representing a digit of a calculator
	 * @param digit the digit of the calculator
	 * @return the button of the calculator
	 */
	public JButton makeDigitButton(String digit)
	{
		JButton button = new JButton(digit);
		
		ActionListener listener = new DigitButtonListener(digit);
		button.addActionListener(listener);
		return button;
	}
	
	/**
	 * Makes a button representing an operator of a calculator
	 * @param op the operator of the calculator
	 * @return the button of the calculator
	 */
	public JButton makeOperatorButton(String op)
	{
		JButton button = new JButton(op);
		return button;
	}
	
	/**
	 * A listener class that listens for a button press
	 * on a digit on the calculator
	 * @author Mayuresh
	 *
	 */
	class DigitButtonListener implements ActionListener
	{
		private String digit;
		
		public DigitButtonListener(String aDigit)
		{
			digit = aDigit;
		}
		
		public void actionPerformed(ActionEvent event)
		{
			display.setText(display.getText() + digit);
		}
	}
}
