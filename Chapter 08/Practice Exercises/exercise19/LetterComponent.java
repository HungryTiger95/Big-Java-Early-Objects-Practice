package exercise19;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class LetterComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		Point2D.Double letter1 = new Point2D.Double(10, 10);
		Point2D.Double letter2 = new Point2D.Double(25, 10);
		Point2D.Double letter3 = new Point2D.Double(40, 10);
		Point2D.Double letter4 = new Point2D.Double(55, 10);
		Point2D.Double letter5 = new Point2D.Double(70, 10);
		
		Letters.drawH(g2, letter1);
		Letters.drawE(g2, letter2);
		Letters.drawL(g2, letter3);
		Letters.drawL(g2, letter4);
		Letters.drawO(g2, letter5);
	}
}
