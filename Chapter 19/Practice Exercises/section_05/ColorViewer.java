package section_05;

import javax.swing.JFrame;

public class ColorViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new ColorFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Color Chooser");
		frame.setVisible(true);
	}
}
