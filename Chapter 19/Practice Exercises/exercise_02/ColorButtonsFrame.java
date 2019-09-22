package exercise_02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorButtonsFrame extends JFrame
{
	// Instance Variables
	private static final int FRAME_HEIGHT = 400;
	private static final int FRAME_WIDTH = 400;
	
	private JPanel colorPanel;
	private JButton redButton;
	private JButton blueButton;
	private JButton greenButton;
	private ActionListener listener;
	private Color backgroundColor;
	
	// Constructors
	/**
	 * Constructs the color buttons frame
	 */
	public ColorButtonsFrame()
	{
		// The color panel. This is an empty panel where we simply change the background when a button is clicked
		colorPanel = new JPanel();
		
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
		ImageIcon red = new ImageIcon("charmander2.png");
		ImageIcon blue = new ImageIcon("squirtle2.png");
		ImageIcon green = new ImageIcon("bullbasaur2.png");
		
		// Made a method to carry out creating a JButton and adding a listener to it
		redButton = createButton("", red);
		blueButton = createButton("", blue);
		greenButton = createButton("", green);
		
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
		colorPanel.setBackground(backgroundColor);
	}
	
	/**
	 * Creates a button given the name and color(the color value is used to set what color
	 * the background becomes after the button is pressed)
	 * @param name the name for the button
	 * @param color the color that the button press should set the background to
	 * @return the button
	 */
	public JButton createButton(String name, ImageIcon icon)
	{
		// Construct a JButton and add a listener to it
		JButton colorButton = new JButton(name);
		colorButton.setIcon(icon);
		colorButton.addActionListener(listener);
		
		return colorButton;
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
			if(event.getSource().equals(redButton))
			{
				backgroundColor = Color.red;
			}
			
			if(event.getSource().equals(greenButton))
			{
				backgroundColor = Color.green;
			}
			
			if(event.getSource().equals(blueButton))
			{
				backgroundColor = Color.blue;
			}
			setPanelBackground();
		}
	}
}
