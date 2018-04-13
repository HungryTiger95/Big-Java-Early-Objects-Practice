import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class CarColorComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		CarColor car1 = new CarColor(10, 10, Color.blue);
		
		int x = getWidth() - 60;
		int y = getHeight() - 30;
		
		CarColor car2 = new CarColor(x, y, Color.green.darker().darker());
		
		car1.draw(g2);
		car2.draw(g2);;
	}
}
