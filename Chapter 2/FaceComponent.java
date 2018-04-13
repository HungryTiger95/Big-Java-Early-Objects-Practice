import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class FaceComponent extends JComponent {
	
	public void paint(Graphics g) {
		
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Draw Head
		Ellipse2D.Double head = new Ellipse2D.Double(150, 130, 200, 200);
		g2.draw(head);;
		
		// Draw Eyes
		Ellipse2D.Double eye1 = new Ellipse2D.Double(200, 190, 30, 30);
		g2.draw(eye1);
		
		Ellipse2D.Double eye2 = new Ellipse2D.Double(275, 190, 30, 30);
		g2.draw(eye2);
		
		// Draw Mouth (x, y, width, height, start, extent, type)
		Arc2D.Double mouth = new Arc2D.Double(200, 200, 100, 100, 0, -180, Arc2D.CHORD);
		g2.draw(mouth);
	}
}
