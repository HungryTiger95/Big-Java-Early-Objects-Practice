package exercise_04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorButtonsFrame extends JFrame
{
	// Instance Variables
	private static final int FRAME_HEIGHT = 400;
	private static final int FRAME_WIDTH = 400;
	
	private JPanel colorPanel;
	private JCheckBox redButton;
	private JCheckBox blueButton;
	private JCheckBox greenButton;
	private ActionListener listener;
	
	// Constructors
	/**
	 * Constructs the color buttons frame
	 */
	public ColorButtonsFrame()
	{
		// The color panel. This is an empty panel where we simply change the background when a button is clicked
		colorPanel = new JPanel();
		
		// Constructs an action listener that is used by all check boxes
		listener = new ClickListener();
		
		// This is the control panel, which consists of all of the buttons
		createControlPanel();
		
		// Set the background to black so that we don't start out with a white background
		setPanelBackground();
		
		// Add the color panel to the frame
		add(colorPanel, BorderLayout.CENTER);
		
		// Sets the size of the frame
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	// Methods
	/**
	 * Creates the control panel that holds all the buttons
	 */
	public void createControlPanel()
	{
		// Made a method to carry out creating a JButton and adding a listener to it
		redButton = createCheckBox("Red");
		blueButton = createCheckBox("Blue");
		greenButton = createCheckBox("Green");
		
		// This is the control panel, and we set the layout of it as a grid
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(1, 3));
		
		// Add the buttons to the control panel
		controlPanel.add(redButton);
		controlPanel.add(blueButton);
		controlPanel.add(greenButton);
		
		// Add the control panel to the frame, and set the layout to South on a border layout
		add(controlPanel, BorderLayout.SOUTH);
	}
	
	/**
	 * Sets the panel color
	 * @param color the color
	 */
	public void setPanelBackground()
	{
		int red = 0;
		int blue = 0;
		int green = 0;
		if(redButton.isSelected()) { red += 255; }
		if(blueButton.isSelected()) { blue += 255; }
		if(greenButton.isSelected()) { green += 255; }
		
		Color newColor = new Color(red, green, blue);
		
		colorPanel.setBackground(newColor);
	}
	
	/**
	 * Creates a check box given its name
	 * @param name name of the check box
	 * @return the JCheckBox
	 */
	public JCheckBox createCheckBox(String name)
	{
		JCheckBox chkbx = new JCheckBox(name);
		chkbx.addActionListener(listener);
		
		return chkbx;
	}
	
	// Classes
	/**
	 * The click listener. Whenever a button that has this listener is clicked,
	 * it will set the background of the color panel to the specified color
	 *
	 */
	class ClickListener implements ActionListener
	{	
		public void actionPerformed(ActionEvent event)
		{
			setPanelBackground();
		}
	}
}
