
public class TriangleTester
{
	public static void main(String[] args)
	{
		Triangle shape = new Triangle(4, 12, 10, 5, 2, 4);
		
		System.out.printf("Length of a: %.2f\n", shape.getALength());
		System.out.printf("Length of b: %.2f\n", shape.getBLength());
		System.out.printf("Length of c: %.2f\n", shape.getCLength());
		System.out.printf("Perimeter of Triangle: %.2f\n", shape.getPerimeter());
		System.out.printf("Area of Triangle: %.2f\n", shape.getArea());
		System.out.printf("Angle A: %.2f\n", shape.getAngleA());
		System.out.printf("Angle B: %.2f\n", shape.getAngleB());
		System.out.printf("Angle C: %.2f\n", shape.getAngleC());
	}
}
