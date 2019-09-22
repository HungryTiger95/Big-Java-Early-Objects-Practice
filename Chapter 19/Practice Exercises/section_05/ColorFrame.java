package section_05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class ColorFrame extends JFrame
{
	// Instance Variables
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;
	
	private JPanel colorPanel;
	private JSlider redSlider;
	private JSlider greenSlider;
	private JSlider blueSlider;
	
	// Constructors
	public ColorFrame()
	{
		colorPanel = new JPanel();
		
		add(colorPanel, BorderLayout.CENTER);
		createControlPanel();
		setSampleColor();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	// Methods
	
	public void createControlPanel()
	{
		ChangeListener listener = new ColorListener();
		
		redSlider = new JSlider(0, 255, 255);
		redSlider.addChangeListener(listener);
		
		greenSlider = new JSlider(0, 255, 175);
		greenSlider.addChangeListener(listener);
		
		blueSlider = new JSlider(0, 255, 175);
		blueSlider.addChangeListener(listener);
		
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(3, 2));
		
		controlPanel.add(new JLabel("Red"));
		controlPanel.add(redSlider);
		
		controlPanel.add(new JLabel("Green"));
		controlPanel.add(greenSlider);
		
		controlPanel.add(new JLabel("Blue"));
		controlPanel.add(blueSlider);
		
		add(controlPanel, BorderLayout.SOUTH);
	}
	
	public void setSampleColor()
	{
		// Read slider values
		int red = redSlider.getValue();
		int green = greenSlider.getValue();
		int blue = blueSlider.getValue();
		
		// Set panel background to slected color
		colorPanel.setBackground(new Color(red, green, blue));
		colorPanel.repaint();
	}
	
	// Classes
	class ColorListener implements ChangeListener
	{
		public void stateChanged(ChangeEvent event)
		{
			setSampleColor();
		}
	}
}
