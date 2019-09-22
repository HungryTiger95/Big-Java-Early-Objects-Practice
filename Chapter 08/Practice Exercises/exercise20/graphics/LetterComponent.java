package exercise20.graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

import exercise20.letters.LetterE;
import exercise20.letters.LetterH;
import exercise20.letters.LetterL;
import exercise20.letters.LetterO;

public class LetterComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		Point2D.Double h = new Point2D.Double(10, 10);
		Point2D.Double e = new Point2D.Double(25, 10);
		Point2D.Double l1 = new Point2D.Double(40, 10);
		Point2D.Double l2 = new Point2D.Double(55, 10);
		Point2D.Double o = new Point2D.Double(70, 10);
		
		LetterH letterH = new LetterH(10, 10, g2);
		letterH.draw();
		
		LetterE letterE = new LetterE(25, 10, g2);
		letterE.draw();
		
		LetterL letterL = new LetterL(40, 10, g2);
		letterL.draw();
		letterL.setLocation(55, 10);
		letterL.draw();
		
		LetterO letterO = new LetterO(70, 10, g2);
		letterO.draw();
	}
}
