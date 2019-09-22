package section_01;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FilledFrame extends JFrame
{
	private JButton button;
	private JLabel label;
	
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 100;
	
	public FilledFrame()
	{
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	private void createComponents()
	{
		button = new JButton("Click Me!");
		label = new JLabel("Hello, World!");
		
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		add(panel);
	}
}
