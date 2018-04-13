/**
 * E1.17
 * 
 * A test program from the book
 * 
 * @author Mayuresh
 *
 */

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
	public static void main (String[] args) throws Exception
	{
		URL imageLocation = new URL ("http://www.telegraph.co.uk/content/dam/travel/Spark/Cruises/regent-seven-seas-cruises/miami-beach-xlarge.jpg");
		JOptionPane.showMessageDialog(null,  "Florida Beach", "Picture of Beach", JOptionPane.PLAIN_MESSAGE,
				new ImageIcon(imageLocation));
	}
}
