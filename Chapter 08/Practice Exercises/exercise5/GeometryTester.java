package exercise5;

import java.util.Scanner;

public class GeometryTester
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please give a Radius: ");
		double radius = in.nextDouble();
		
		System.out.print("Please give a Height: ");
		double height = in.nextDouble();
		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.printf("Volume of a Cube: %20.2f\n", Geometry.cubeVolume(height));
		System.out.printf("Surface Area of a Cube: %14.2f\n", Geometry.cubeSurface(height));
		System.out.printf("Volume of a Sphere: %18.2f\n", Geometry.sphereVolume(radius));
		System.out.printf("Surface Area of a Sphere: %12.2f\n", Geometry.sphereSurface(radius));
		System.out.printf("Volume of a Cylinder: %16.2f\n", Geometry.cylinderVolume(radius, height));
		System.out.printf("Surface Area of a Cylinder: %10.2f\n", Geometry.cylinderSurface(radius, height));
		System.out.printf("Volume of a Cone: %20.2f\n", Geometry.coneVolume(radius, height));
		System.out.printf("Surface Area of a Cone: %14.2f\n", Geometry.coneSurface(radius, height));
		
		in.close();
	}
}
