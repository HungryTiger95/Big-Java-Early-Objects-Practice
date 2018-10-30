package exercise_13_10;

/**
 * Using recursion, compute the area of a polygon. Cut off a
 * triangle and use the fact that a triangle with corners(x1, y1),
 * (x2, y2), (x3, y3) has area:
 * 
 * 		|x1y2 + x2y3 + x3y1 - y1x2 - y2x3 - y3x1| / 2
 * 
 * NOTE: I DONT KNOW HOW THIS WORKS
 * 
 * Solution from: https://github.com/yuxiaosun/Big-Java-Late-Objects
 * 
 * @author Mayuresh
 *
 */
public class PolygonArea
{
	public static void main(String[] args)
	{
		 int[] x = { 2, 7, 3, 6, 4, 9 };
	     int[] y = { 3, 4, 5, 1, 7, 3 };

	     double area = getArea(x, y);
	     System.out.printf("Area of polygon is: %.2f", area);
	}
	
	/**
	 * Gets the area of a polygon
	 * @param x array of x values
	 * @param y array of y values
	 * @return the area
	 */
	public static double getArea(int[] x, int[] y)
	{
		return getArea(x, y, 1, 0);
	}
	
	/**
	 * Gets the area of a polygon
	 * @param x array of x values
	 * @param y array of y values
	 * @param i index
	 * @param area area
	 * @return the area
	 */
	public static double getArea(int[] x, int[] y, int i, double area)
	{
		if(i == x.length - 2 && i == y.length - 2)
		{
			return area;
		}
		else
		{
			area += Math.abs((x[i] * y[i + 1]) +
					(x[i + 1] * y[i + 2]) +
					(x[i + 2] * y[i]) -
					(y[i] * x[i + 1]) -
					(y[i + 1] * x[i + 2]) -
					(y[i + 2] * x[i])) / 2;
			
			return getArea(x, y, i + 1, area);
		}
	}
}
