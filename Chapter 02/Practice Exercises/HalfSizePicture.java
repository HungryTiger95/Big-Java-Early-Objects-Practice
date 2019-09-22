/**
 * E2.15
 * 
 * Using the picture class of Worked Example 2.2, write a HalfSizePicture program that
 * loads a picture and shows it at half the original size, centered in the window.
 * 
 * @author Mayuresh
 *
 */

public class HalfSizePicture
{
	public static void main (String[] args)
	{
		Picture pic = new Picture();
		pic.load("C:\\Users\\Mayuresh\\Pictures\\deepika.jpg");
		
		pic.scale(pic.getWidth() / 2, pic.getHeight() / 2);
		pic.move(pic.getWidth() / 4, pic.getHeight() / 4);
	}
	
	
}
