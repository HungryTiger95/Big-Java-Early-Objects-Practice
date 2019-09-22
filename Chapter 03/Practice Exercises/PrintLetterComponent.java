import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class PrintLetterComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		// Recover Graphics
		Graphics2D g2 = (Graphics2D) g;
		
		// Draw
		LetterH h = new LetterH(10, 10);
		LetterE e = new LetterE(90, 10);
		LetterL l = new LetterL(170, 10);
		LetterO o = new LetterO(330, 10);
		
		h.draw(g2);
		e.draw(g2);
		l.draw(g2);
		
		l.moveTo(250, 10);
		l.draw(g2);
		
		o.draw(g2);
	}

	
}
