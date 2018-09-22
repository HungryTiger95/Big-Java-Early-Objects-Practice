package project7.graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

import project6.Cannonball;

public class CannonballComponent extends JComponent
{
	/**
	 * Paints the component
	 */
	public void paintComponent(Graphics g)
	{	
		Graphics2D g2 = (Graphics2D) g;
		
		Cannonball ball = new Cannonball(50, 200);
		
		ball.shoot(65, 45, 0.01);
		
		ball.draw(g2);
	}
}
