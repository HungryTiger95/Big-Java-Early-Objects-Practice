package section_01;

public class Square
{
	// Instance Variables
	private int width;
	
	// Constructors
	public Square(int width)
	{
		this.width = width;
	}
	
	// Methods
	public int getArea()
	{
		if(this.width <= 0)
		{
			return 0;
		}
		else if(this.width == 1)
		{
			return 1;
		}
		else
		{
			Square smallerSquare = new Square(width - 1);
			int smallerArea = smallerSquare.getArea();
			
			return smallerArea + this.width + this.width - 1;
		}
	}
}
