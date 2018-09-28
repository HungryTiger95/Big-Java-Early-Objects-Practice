package project17;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CircleViewer
{
	public static void main(String[] args)
	{
		String xPos = JOptionPane.showInputDialog("Enter x-position");
		String yPos = JOptionPane.showInputDialog("Enter y-position");
		String radius = JOptionPane.showInputDialog("Enter radius");
		
		double circleXPos = Double.valueOf(xPos);
		double circleYPos = Double.valueOf(yPos);
		double circleRadius = Double.valueOf(radius);
		
		JFrame frame = new JFrame("Circle");
		
		CircleComponent circle = new CircleComponent(circleXPos, circleYPos, circleRadius);
		
		frame.add(circle);
		frame.setSize(600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
