package exercise_06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class ColorButtonsFrame extends JFrame
{
	// Instance Variables
	private static final int FRAME_HEIGHT = 400;
	private static final int FRAME_WIDTH = 400;
	
	private JPanel colorPanel;
	private Color backgroundColor;
	
	// Constructors
	/**
	 * Constructs the color buttons frame
	 */
	public ColorButtonsFrame()
	{
		// Construct the menu
		JMenuBar menuBar = new JMenuBar();
		colorPanel = new JPanel();
		
		setJMenuBar(menuBar);
		
		add(colorPanel, BorderLayout.CENTER);
		menuBar.add(createColorMenu());
		
		
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	// Methods
	/**
	 * Creates a color menu so that you can choose the color of the background
	 * in the menu bar
	 * @return
	 */
	public JMenu createColorMenu()
	{
		JMenu menu = new JMenu("Color");
		menu.add(createColorItem("Red", Color.red));
		menu.add(createColorItem("Green", Color.green));
		menu.add(createColorItem("Blue", Color.blue));
		
		return menu;
	}
	
	/**
	 * Creates a menu item to change the color of the background
	 * @param name the name of the front face
	 * @param color the color that this item represents
	 * @return the menu item
	 */
	public JMenuItem createColorItem(String name, Color color)
	{
		class ColorItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				
				colorPanel.setBackground(color);
			}
		}
		
		JMenuItem item = new JMenuItem(name);
		ActionListener listener = new ColorItemListener();
		item.addActionListener(listener);
		
		return item;
	}
}
