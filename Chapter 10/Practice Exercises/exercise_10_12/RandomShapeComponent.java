package exercise_10_12;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class RandomShapeComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		RandomShape r = new RandomShape();
		
		for (int i = 0; i < 10; i++)
		{
			g2.draw(r.getRandomShape());
		}
	}
}
