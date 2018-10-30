package section_01;

/**
 * A recursive computation solves a problem by using the solution to the same problem with simpler inputs.
 * 
 * Here is an illustration of what happens when we compute the area of a triangle of width 4:
 * 
 * 		- The getArea method makes a smaller triangle of width 3
 * 		- It calls getArea on that triangle
 * 			- That method makes a smaller triangle of width 2
 * 			- It calls getArea on that triangle
 * 				- That method makes a smaller triangle of width 1
 * 				- It calls getArea on that triangle
 * 					- That method returns 1
 * 				- The method returns smallerArea + width = 1 + 2 = 3
 * 			- The method returns smallerArea + width = 3 + 3 = 6
 * 		- The method returns smallerArea + width = 6 + 4 = 10
 * 
 * To solve the area problem for a triangle of a given width, we use the fact that we can solve the same
 * problem for a lesser width. This is called a recursive solution.
 * 
 * The call pattern of a recursive method looks complicated, and the key to the successful design of a
 * recursive method is not to think about it.
 * 
 * There are two key requirements to make sure that the recursion is successful:
 * 
 * 		- Every recursive call must simplify the computation in some way
 * 		- There must be special cases to handle the simplest computations directly
 * 
 * The getArea method calls itself again with smaller and smaller width values. Eventually the width must
 * reach 1, and there is a special case for computing the area of a triangle with width 1. Thus, the
 * getArea method always succeeds.
 * 
 * Many simple recursions can be computed as loops. However, loop equivalents for more complex recursions
 * can be complex.
 * 
 * @author Mayuresh
 *
 */
public class Triangle
{
	// Instance Variables
	private int width;
	
	// Constructors
	/**
	 * Constructs a triangle with a given width
	 * @param width the width (and height) of the triangle
	 */
	public Triangle(int width)
	{
		this.width = width;
	}
	
	// Methods
	/**
	 * Computes the area of the triangle
	 * @return the area
	 */
	public int getArea()
	{
		if(this.width <= 0)
		{
			return 0;
		}
//		else if(width == 1)
//		{
//			return 1;
//		}
		else
		{
			Triangle smallerTriangle = new Triangle(this.width - 1);
			int smallerArea = smallerTriangle.getArea();
			return smallerArea + this.width;
		}
	}
	
}
