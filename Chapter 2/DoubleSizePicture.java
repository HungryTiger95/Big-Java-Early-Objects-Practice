/**
 * E2.16
 * 
 * Using the Picture class of Worked Example 2.2, write a DoubleSizePictue program
 * that loads a picture, doubles its size, and shows the center of the picture in the
 * window.
 * 
 * @author Mayuresh
 *
 */

public class DoubleSizePicture
{
	public static void main (String[] args)
	{
		Picture pic = new Picture();
		pic.load("C:\\Users\\Mayuresh\\Pictures\\deepika.jpg");
		pic.scale(pic.getWidth() * 2, pic.getHeight() * 2);
		
		pic.move(pic.getWidth() / 4, pic.getHeight() / 4);
	}
}
