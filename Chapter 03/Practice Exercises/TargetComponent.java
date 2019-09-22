import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class TargetComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		// Recover the Graphics
		Graphics2D g2 = (Graphics2D) g;
		
		Target target = new Target(0, 0, getWidth(), getHeight());
		target.draw(g2);
	}
}
