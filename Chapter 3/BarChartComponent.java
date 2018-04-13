import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

/**
 * Graphics E3.22
 * 
 * Make a bar chart to plot the following data set. Label each bar. Make the bars horizontal
 * for easier labeling. Provide a class BarChartViewer and a class BarChartComponent.
 * 
 * 		 Bridge Name	      | Longest Span (ft)
 * 			Golden Gate       | 	4,200
 * 			Brooklyn          | 	1,595
 * 			Delaware Memorial | 	2,150
 * 			Mackinac          | 	3,800
 * 
 * 
 * @author Mayuresh
 *
 */
public class BarChartComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		// Recover graphics
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle gg = new Rectangle(10, 10, 20, 200);
		Rectangle b = new Rectangle(30, 130, 20, 80);
		Rectangle dm = new Rectangle(50, 110, 20, 100);
		Rectangle m = new Rectangle(70, 50, 20, 160);
		
		g2.setColor(Color.BLACK);
		g2.draw(gg);
		g2.draw(b);
		g2.draw(dm);
		g2.draw(m);
	}
}
