import javax.swing.JFrame;

/**
 * Graphics E3.20
 * 
 * Write a program to plot the string "HELLO" , using only lines and circles.
 * Do not call drawString, and do not use System.ou. Make classes LetterH,
 * LetterE, LetterL, and Letter0.
 * 
 * @author Mayuresh
 *
 */
public class PrintLetterViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(400, 400);
		frame.setTitle("HELLO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PrintLetterComponent component = new PrintLetterComponent();
		
		frame.add(component);
		frame.setVisible(true);
	}
}
