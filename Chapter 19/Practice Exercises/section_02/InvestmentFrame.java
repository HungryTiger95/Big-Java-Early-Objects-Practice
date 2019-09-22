package section_02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class InvestmentFrame extends JFrame
{
	private static final int FRAME_WIDTH = 450;
	private static final int FRAME_HEIGHT = 100;
	
	private static final double DEFAULT_RATE = 5;
	private static final double INITIAL_BALANCE = 1000;
	
	private JLabel rateLabel;
	private JTextField rateField;
	private JButton button;
	private JLabel resultLabel;
	private double balance;
	
	public InvestmentFrame()
	{
		balance = INITIAL_BALANCE;
		
		resultLabel = new JLabel("Balance: " + balance);
		
		createTextField();
		createButton();
		createPanel();
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	private void createButton()
	{
		button = new JButton("Add Interest");
		
		ActionListener listener = new AddInterestListener();
		button.addActionListener(listener);
	}
	
	private void createTextField()
	{
		rateLabel = new JLabel("Interest Rate: ");
		
		final int FIELD_WIDTH = 10;
		rateField = new JTextField(FIELD_WIDTH);
		rateField.setText("" + DEFAULT_RATE);
	}
	
	private void createPanel()
	{
		JPanel panel = new JPanel();
		panel.add(rateLabel);
		panel.add(rateField);
		panel.add(button);
		panel.add(resultLabel);
		add(panel);
	}
	
	class AddInterestListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			double rate = Double.parseDouble(rateField.getText());
			double interest = balance * rate / 100;
			balance = balance + interest;
			
			DecimalFormat f = new DecimalFormat("#.##");
			String d = f.format(balance);
			resultLabel.setText("Balance: " + d);
		}
	}
}
