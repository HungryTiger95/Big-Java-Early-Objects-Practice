import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class OlympicRingsComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		//Recover Graphics
		Graphics2D g2 = (Graphics2D) g;
		
		// Draw
		OlympicRings ring = new OlympicRings(10, 10);
		
		ring.draw(g2);
		
		ring.moveTo(95, 10);
		ring.draw(g2);
		
		ring.moveTo(180, 10);
		ring.draw(g2);
		
		ring.moveTo(52, 40);
		ring.draw(g2);
		
		ring.moveTo(136, 40);
		ring.draw(g2);
	}
}
