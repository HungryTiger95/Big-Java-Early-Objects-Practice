package project8;

import javax.swing.JFrame;

public class ScrollingMessageViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new ScrollingMessageFrame("I love to eat Taco Bell");
		frame.setTitle("Scrolling Message");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
