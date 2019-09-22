package section_04;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * This frame has a menu with commands to change the font of a text
 * sample.
 * 
 * @author Mayuresh
 *
 */
@SuppressWarnings("serial")
public class FontFrame extends JFrame
{
	// Instance Variables
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;
	
	private JLabel label;
	private String faceName;
	private int fontStyle;
	private int fontSize;
	
	// Constructors
	/**
	 * Constructs the frame
	 */
	public FontFrame()
	{
		// Construct text sample
		label = new JLabel("Big Java");
		add(label, BorderLayout.CENTER);
		
		// Construct menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.add(createFileMenu());
		menuBar.add(createFontMenu());
		
		faceName = "Serif";
		fontStyle = Font.PLAIN;
		fontSize = 24;
		
		setLabelFont();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	// Methods
	/**
	 * Creates the File menu
	 * @return the menu
	 */
	public JMenu createFileMenu()
	{
		JMenu menu = new JMenu("File");
		JMenuItem exitItem = new JMenuItem("Exit");
		
		ActionListener listener = new ExitItemListener();
		exitItem.addActionListener(listener);
		menu.add(exitItem);
		
		return menu;
	}
	
	/**
	 * Creates the Font submenu
	 * @return the menu
	 */
	public JMenu createFontMenu()
	{
		JMenu menu = new JMenu("Font");
		menu.add(createFaceMenu());
		menu.add(createSizeMenu());
		menu.add(createStyleMenu());
		
		return menu;
	}
	
	/**
	 * Creates the Face menu
	 * @return the menu
	 */
	public JMenu createFaceMenu()
	{
		JMenu menu = new JMenu("Face");
		menu.add(createFaceItem("Serif"));
		menu.add(createFaceItem("Sans Serif"));
		menu.add(createFaceItem("Monospaced"));
		menu.add(createFaceItem("Calibri"));
		menu.add(createFaceItem("Times New Roman"));
		
		return menu;
	}
	
	/**
	 * Creates the Size submenu
	 * @return the menu
	 */
	public JMenu createSizeMenu()
	{
		JMenu menu = new JMenu("Size");
		menu.add(createSizeItem("Smaller", -1));
		menu.add(createSizeItem("Larger", 1));
		
		return menu;
	}
	
	/**
	 * Creates the Style submenu
	 * @return the menu
	 */
	public JMenu createStyleMenu()
	{
		JMenu menu = new JMenu("Style");
		menu.add(createStyleItem("Plain", Font.PLAIN));
		menu.add(createStyleItem("Bold", Font.BOLD));
		menu.add(createStyleItem("Italic", Font.ITALIC));
		menu.add(createStyleItem("Bold Italic", Font.BOLD + Font.ITALIC));
		
		return menu;
	}
	
	/**
	 * Creates a menu item to change the font face and set its action listener
	 * @param name the name of the font face
	 * @return the menu item
	 */
	public JMenuItem createFaceItem(String name)
	{	
		class FaceItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				faceName = name;
				setLabelFont();
			}
		}
		
		JMenuItem item = new JMenuItem(name);
		ActionListener listener = new FaceItemListener();
		item.addActionListener(listener);
		
		return item;
	}
	
	/**
	 * Creates a menu item to change the font size and set its action listener
	 * @param name the name of the menu item
	 * @param increment the amount by which to change the size 
	 * @return the menu item
	 */
	public JMenuItem createSizeItem(String name, int increment)
	{
		class SizeItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				fontSize += increment;
				setLabelFont();
			}
		}
		
		JMenuItem item = new JMenuItem(name);
		ActionListener listener = new SizeItemListener();
		item.addActionListener(listener);
		
		return item;
	}
	
	/**
	 * Creates a menu item to change the font style and set its action listener
	 * @param name the name of the menu item
	 * @param style the new font style
	 * @return the menu item
	 */
	public JMenuItem createStyleItem(String name, int style)
	{
		class StyleItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				fontStyle = style;
				setLabelFont();
			}
		}
		
		JMenuItem item = new JMenuItem(name);
		ActionListener listener = new StyleItemListener();
		item.addActionListener(listener);
		
		return item;
	}
	
	/**
	 * Sets the font of the text sample
	 */
	public void setLabelFont()
	{
		Font f = new Font(faceName, fontStyle, fontSize);
		label.setFont(f);
	}
	
	// Classes
	class ExitItemListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			System.exit(0);
		}
	}
}
