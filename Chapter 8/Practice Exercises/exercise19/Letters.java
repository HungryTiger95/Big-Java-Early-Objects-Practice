package exercise19;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Letters
{
	public static void drawH(Graphics2D g2, Point2D.Double p)
	{
		Line2D.Double line1 = new Line2D.Double(p.getX(), p.getY(), p.getX(), p.getY() + 20);
		Line2D.Double line2 = new Line2D.Double(p.getX(), p.getY() + 10, p.getX() + 10, p.getY() + 10);
		Line2D.Double line3 = new Line2D.Double(p.getX() + 10, p.getY(), p.getX() + 10, p.getY() + 20);
		
		g2.draw(line1);
		g2.draw(line2);
		g2.draw(line3);
	}
	
	public static void drawE(Graphics2D g2, Point2D.Double p)
	{
		Line2D.Double line1 = new Line2D.Double(p.getX(), p.getY(), p.getX(), p.getY() + 20);
		Line2D.Double line2 = new Line2D.Double(p.getX(), p.getY(), p.getX() + 10, p.getY());
		Line2D.Double line3 = new Line2D.Double(p.getX(), p.getY() + 10, p.getX() + 10, p.getY() + 10);
		Line2D.Double line4 = new Line2D.Double(p.getX(), p.getY() + 20, p.getX() + 10, p.getY() + 20);
		
		g2.draw(line1);
		g2.draw(line2);
		g2.draw(line3);
		g2.draw(line4);
	}
	
	public static void drawL(Graphics2D g2, Point2D.Double p)
	{
		Line2D.Double line1 = new Line2D.Double(p.getX(), p.getY(), p.getX(), p.getY() + 20);
		Line2D.Double line2 = new Line2D.Double(p.getX(), p.getY() + 20, p.getX() + 10, p.getY() + 20);
		
		g2.draw(line1);
		g2.draw(line2);
	}
	
	public static void drawO(Graphics2D g2, Point2D.Double p)
	{
		Ellipse2D.Double ellipse = new Ellipse2D.Double(p.getX(), p.getY(), 20, 20);
		
		g2.draw(ellipse);
	}
	
}
