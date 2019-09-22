package exercise_07;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class RectanglesFrame extends JFrame
{
	// Instance Variables
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 400;
	private JPanel panel;
	private JMenuBar menuBar;
	private RectangleComponent scene;
	
	// Constructors
	/**
	 * Constructs the frame
	 */
	public RectanglesFrame()
	{
		// Construct the menu bar and panel
		menuBar = new JMenuBar();
		panel = new JPanel();
		
		// Add the menu bar, panel to the frame
		setJMenuBar(menuBar);
		add(panel, BorderLayout.CENTER);
		
		// Add the menu bar items to the menu bar
		menuBar.add(createMenuItems());
		
		// Add the rectangles to the frame
		scene = new RectangleComponent();
		add(scene);
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	// Methods
	/**
	 * Creates the menu items
	 * @return the menu
	 */
	public JMenu createMenuItems()
	{
		JMenu menu = new JMenu("Add/Remove");
		menu.add(createFewerItem());
		menu.add(createMoreItem());
		
		return menu;
	}
	
	/**
	 * Creates the "Fewer" menu item which will reduce the number
	 * of rectangles in the frame by half
	 * @return the menu item
	 */
	public JMenuItem createFewerItem()
	{
		class FewerItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				// What to do when this item is clicked
				if(scene.getRects().size() > 1)
				{
					scene.removeHalf();
				}
			}
		}
		
		JMenuItem item = new JMenuItem("Fewer");
		ActionListener listener = new FewerItemListener();
		item.addActionListener(listener);
		
		return item;
	}
	
	/**
	 * Creates the "More" menu item which will double the number
	 * of rectangles in the frame.
	 * @return the menu item
	 */
	public JMenuItem createMoreItem()
	{
		class FewerItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				// What to do when this item is clicked
				if(scene.getRects().size() == 0)
				{
					scene.addFirst();
				}
				else
				{
					scene.doubleRects();
				}
			}
		}
		
		JMenuItem item = new JMenuItem("More");
		ActionListener listener = new FewerItemListener();
		item.addActionListener(listener);
		
		return item;
	}
	
}
