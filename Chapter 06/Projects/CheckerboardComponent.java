import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class CheckerboardComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		// Recover the graphics
		Graphics2D g2 = (Graphics2D) g;
		
		// Draw the Checkerboard
		Checkerboard board = new Checkerboard(10, 10);
		
		board.draw(g2);
	}
}
