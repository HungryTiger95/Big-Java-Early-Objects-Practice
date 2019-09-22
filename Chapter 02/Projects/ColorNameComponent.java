import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * Graphics P2.10
 * 
 * Write a graphics program that draws 11 strings, one each for the 11 standard colors,
 * each in its own color. Provide a class ColorNameViewer and a class ColorNameComponent.
 * 
 * @author Mayuresh
 *
 */
public class ColorNameComponent extends JComponent
{
	public void paint(Graphics g)
	{
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Draw Stuff
		g2.setColor(Color.BLACK);
		g2.drawString("String 1: ", 350, 50);
		
		g2.setColor(Color.BLUE);
		g2.drawString("String 2: ", 350, 80);
		
		g2.setColor(Color.LIGHT_GRAY);
		g2.drawString("String 3: ", 350, 110);
		
		g2.setColor(Color.CYAN);
		g2.drawString("String 4: ", 350, 140);
		
		g2.setColor(Color.DARK_GRAY);
		g2.drawString("String 5: ", 350, 170);
		
		g2.setColor(Color.GREEN);
		g2.drawString("String 6: ", 350, 200);
		
		g2.setColor(Color.MAGENTA);
		g2.drawString("String 7: ", 350, 230);
		
		g2.setColor(Color.ORANGE);
		g2.drawString("String 8: ", 350, 260);
		
		g2.setColor(Color.PINK);
		g2.drawString("String 9: ", 350, 290);
		
		g2.setColor(Color.RED);
		g2.drawString("String 10: ", 350, 320);
		
		g2.setColor(Color.YELLOW);
		g2.drawString("String 11: ", 350, 350);
	}
}
