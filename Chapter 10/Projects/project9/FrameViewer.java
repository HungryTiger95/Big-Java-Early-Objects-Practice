package project9;

import javax.swing.JFrame;

public class FrameViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new TriangleFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
