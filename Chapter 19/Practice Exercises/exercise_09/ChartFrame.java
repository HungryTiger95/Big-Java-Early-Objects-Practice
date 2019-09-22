package exercise_09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChartFrame extends JFrame
{
	// Instance Variables
	private JPanel controlPanel;
	private JButton applyButton;
	private JLabel lengthLabel = new JLabel("Length");
	private JTextField lengthField;
	private JLabel labelLabel = new JLabel("Label");
	private JTextField labelField;
	private JComboBox<String> colorComboBox;
	
	private static final int FRAME_WIDTH = 600;
	private static final int FRAME_WEIGHT = 400;
	
	private ChartComponent scene;
	
	// Constructors
	public ChartFrame()
	{
		// Construct the panel and add all the componenets to it
		createPanel();
		
		setSize(FRAME_WIDTH, FRAME_WEIGHT);
	}
	// Methods
	public void createPanel()
	{
		controlPanel = new JPanel();
		scene = new ChartComponent();
		
		controlPanel.add(lengthLabel);
		controlPanel.add(createLengthField());
		
		controlPanel.add(labelLabel);
		controlPanel.add(createLabelField());
		
		controlPanel.add(createColorComboBox());
		
		controlPanel.add(createApplyButton());
		add(controlPanel, BorderLayout.SOUTH);
		add(scene, BorderLayout.CENTER);
	}
	
	public JTextField createLengthField()
	{
		final int FIELD_WIDTH = 10;
		lengthField = new JTextField(FIELD_WIDTH);
		lengthField.setText("");
		
		return lengthField;
	}
	
	public JTextField createLabelField()
	{
		final int FIELD_WIDTH = 10;
		labelField = new JTextField(FIELD_WIDTH);
		labelField.setText("");
		
		return labelField;
	}
	
	public JButton createApplyButton()
	{
		applyButton = new JButton("Apply");
		ActionListener listener = new ApplyListener();
		applyButton.addActionListener(listener);
		
		return applyButton;
	}
	
	public JComboBox<String> createColorComboBox()
	{
		colorComboBox = new JComboBox<>();
		colorComboBox.addItem("Red");
		colorComboBox.addItem("Blue");
		colorComboBox.addItem("Green");
		colorComboBox.addItem("Yellow");
		colorComboBox.addItem("Black");
		colorComboBox.addItem("Magenta");
		colorComboBox.setEditable(false);
		colorComboBox.setSelectedItem("Red");
		
		return colorComboBox;
	}
	
	class ApplyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			try
			{
				Color color;
				
				int length = Integer.parseInt(lengthField.getText());
				String label = labelField.getText();
				String colorName = (String) colorComboBox.getSelectedItem();
				
				if(colorName.toLowerCase().equals("red"))
				{
					color = Color.red;
				}
				else if(colorName.toLowerCase().equals("green"))
				{
					color = Color.green;
				}
				else if(colorName.toLowerCase().equals("blue"))
				{
					color = Color.blue;
				}
				else if(colorName.toLowerCase().equals("magenta"))
				{
					color = Color.magenta;
				}
				else if(colorName.toLowerCase().equals("yellow"))
				{
					color = Color.yellow;
				}
				else
				{
					color = Color.black;
				}
				
				// Create a bar
				scene.addBar(length, label, color);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Please enter a length");
			}
			catch(NullPointerException e)
			{
				System.out.println("Cannot leave a field empty");
			}
		}
	}
}
