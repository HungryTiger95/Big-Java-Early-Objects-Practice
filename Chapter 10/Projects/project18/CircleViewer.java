package project18;

import javax.swing.JFrame;

public class CircleViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new CircleFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Draw A Circle");
		frame.setVisible(true);
	}
}
