package exercise19;

import javax.swing.JFrame;

public class LetterViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(500, 600);
		frame.setTitle("Letters");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LetterComponent component = new LetterComponent();
		frame.add(component);
		frame.setVisible(true);
	}
}
