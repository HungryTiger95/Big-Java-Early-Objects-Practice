import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class StarComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Draw the object
		Star star1 = new Star(50, 50, 20);
		Star star2 = new Star(150, 100, 40);
		Star star3 = new Star(300, 200, 60);
		
		star1.draw(g2);
		star2.draw(g2);
		star3.draw(g2);
	}
}
