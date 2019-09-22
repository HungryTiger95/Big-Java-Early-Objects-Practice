package section_02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class InvestmentFrame2 extends JFrame
{
	// Instance Variables
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 250;
	
	private static final int AREA_ROWS = 10;
	private static final int AREA_COLUMNS = 30;
	
	private static final double DEFAULT_RATE = 5;
	private static final double INITIAL_BALANCE = 1000;
	
	private JLabel rateLabel;
	private JTextField rateField;
	private JButton button;
	private JTextArea resultArea;
	private double balance;
	
	// Constructors
	public InvestmentFrame2()
	{
		balance = INITIAL_BALANCE;
		resultArea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
		resultArea.setText(balance + "\n");
		resultArea.setEditable(false);
		
		createTextField();
		createButton();
		createPanel();
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	// Methods
	private void createButton()
	{
		button = new JButton("Add Interest");
		
		ActionListener listener = new AddInterestListener();
		button.addActionListener(listener);
	}
	
	private void createPanel()
	{
		JPanel panel = new JPanel();
		panel.add(rateLabel);
		panel.add(rateField);
		panel.add(button);
		
		JScrollPane scrollPane = new JScrollPane(resultArea);
		panel.add(scrollPane);
		add(panel);
	}
	
	private void createTextField()
	{
		rateLabel = new JLabel("Interest Rate: ");

		final int FIELD_WIDTH = 10;
		rateField = new JTextField(FIELD_WIDTH);
		rateField.setText("" + DEFAULT_RATE);
	}
	
	// Inner Classes
	class AddInterestListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			double rate = Double.parseDouble(rateField.getText());
			double interest = balance * rate / 100;
			balance += interest;
			
			DecimalFormat f = new DecimalFormat("#.##");
			resultArea.append(f.format(balance) + "\n");
		}
		
	}
}
