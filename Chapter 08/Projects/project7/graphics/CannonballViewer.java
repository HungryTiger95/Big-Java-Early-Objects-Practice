package project7.graphics;

import javax.swing.JFrame;

public class CannonballViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(400, 400);
		frame.setTitle("Cannonball Trajectory");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CannonballComponent component = new CannonballComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}
