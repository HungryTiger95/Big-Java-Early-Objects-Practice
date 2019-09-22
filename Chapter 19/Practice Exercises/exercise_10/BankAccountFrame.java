package exercise_10;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class BankAccountFrame extends JFrame
{
	// Instance Variables
	private BankAccount bankAccount;
	private static final int FRAME_HEIGHT = 400;
	private static final int FRAME_WIDTH = 500;
	
	private JPanel inputPanel;
	private JPanel outputPanel;
	private JRadioButton withdrawButton;
	private JRadioButton depositButton;
	private JLabel amountLabel;
	private JTextField amountText;
	private JLabel balanceLabel;
	private JTextField balanceText;
	private JButton computeButton;
	
	// Constructors
	public BankAccountFrame()
	{
		bankAccount = new BankAccount(1000);
		
		createInputPanel();
		createOutputPanel();
		
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	/**
	 * Creates the output panel that displays the current balance
	 */
	public void createOutputPanel()
	{
		// Construct the output panel
		this.outputPanel = new JPanel();
		
		// Construct the balance label and balance text
		this.balanceLabel = new JLabel("Current Balance");
		this.balanceText = new JTextField(10);
		this.balanceText.setText(Double.toString(this.bankAccount.getBalance()));
		this.balanceText.setEditable(false);
		
		// Add everything to the panel
		this.outputPanel.add(this.balanceLabel);
		this.outputPanel.add(this.balanceText);
		this.outputPanel.setBorder(new TitledBorder(new EtchedBorder(), "Output"));
		
		// return the panel
		add(this.outputPanel, BorderLayout.CENTER);
	}
	
	/**
	 * Creates the input panel
	 */
	public void createInputPanel()
	{
		// Construct the input panel
		this.inputPanel = new JPanel();
		
		// Construct the amount text field and label
		this.amountText = new JTextField(10);
		this.amountText.setEditable(true);
		this.amountLabel = new JLabel("Amount");
		
		// Construct the radio buttons for withdrawing and depositing
		this.withdrawButton = new JRadioButton("Withdraw");
		this.depositButton = new JRadioButton("Deposit");
		
		// Add the radio buttons to button group
		ButtonGroup group = new ButtonGroup();
		group.add(this.withdrawButton);
		group.add(this.depositButton);
		
		// Construct the compute button
		this.computeButton = createComputeButton();
		
		// Add everything to the panel
		this.inputPanel.add(this.amountLabel);
		this.inputPanel.add(this.amountText);
		this.inputPanel.add(this.withdrawButton);
		this.inputPanel.add(this.depositButton);
		this.inputPanel.add(this.computeButton);
		this.inputPanel.setBorder(new TitledBorder(new EtchedBorder(), "Input"));
		
		// return the panel
		add(this.inputPanel, BorderLayout.SOUTH);
	}
	
	/**
	 * Creates the compute button
	 * @return the compute button
	 */
	public JButton createComputeButton()
	{
		class ComputeListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				double amount = 0;
				/**
				 * when the button is clicked, we want to read the "amount" input. if we input anything
				 * other than a decimal value, we catch a NumberFormatException
				 */
				try
				{
					amount = Double.parseDouble(amountText.getText());		// can throw an exception
				}
				catch(NumberFormatException e)
				{
					System.out.println("Amount Input Incorrect: " + amountText.getText() + "\nNeeds to be a double value");
				}
				
				/**
				 * Now compute the result balance by withdrawing or depositing the amount
				 * based on the radio button that is selected.
				 */
				if(depositButton.isSelected())
				{
					bankAccount.deposit(amount);
				}
				else if(withdrawButton.isSelected())
				{
					bankAccount.withdraw(amount);
				}
				
				/**
				 * Update the balance text field and reset the amount field to ""
				 */
				DecimalFormat f = new DecimalFormat("#.##");
				
				balanceText.setText((f.format(bankAccount.getBalance())));
				amountText.setText("");
			}
		}
		
		JButton b = new JButton("Compute");
		b.addActionListener(new ComputeListener());
		
		return b;
	}
	
	// Methods
	/**
	 * Returns the bank account
	 * @return the bank account
	 */
	public BankAccount getAccount()
	{
		return this.bankAccount;
	}
	
}
