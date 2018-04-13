import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class HouseComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		//Draw
		House house = new House(150, 150, 150, 130);
		House house2 = new House(50, 100, 80, 100);
		House house3 = new House(320, 50, 50, 70);
		
		house3.draw(g2);
		house2.draw(g2);
		house.draw(g2);
	}
}
