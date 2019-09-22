package exercise6;

import java.util.Scanner;


public class ClassTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please Enter a radius: ");
		double radius = in.nextDouble();
		
		System.out.print("Please Enter a height: ");
		double height = in.nextDouble();
		
		
		Sphere sphere = new Sphere(radius);
		Cone cone = new Cone(radius, height);
		Cube cube = new Cube(height);
		Cylinder cylinder = new Cylinder(radius, height);
		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.printf("Volume of a Cube: %20.2f\n", cube.getVolume());
		System.out.printf("Surface Area of a Cube: %14.2f\n", cube.getSurfaceArea());
		System.out.printf("Volume of a Sphere: %18.2f\n", sphere.getVolume());
		System.out.printf("Surface Area of a Sphere: %12.2f\n", sphere.getSurfaceArea());
		System.out.printf("Volume of a Cylinder: %16.2f\n", cylinder.getVolume());
		System.out.printf("Surface Area of a Cylinder: %10.2f\n", cylinder.getSurfaceArea());
		System.out.printf("Volume of a Cone: %20.2f\n", cone.getVolume());
		System.out.printf("Surface Area of a Cone: %14.2f\n", cone.getSurfaceArea());
		
		in.close();
	}
}
