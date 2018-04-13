
public class BalloonTester
{
	public static void main(String[] args)
	{
		Balloon balloon = new Balloon();
		
		System.out.printf("Radius: %.3f\n", balloon.getRadius());
		System.out.printf("Volume: %.3f\n", balloon.getVolume());
		System.out.printf("Surface Area: %.3f\n", balloon.getSurfaceArea());
		
		System.out.println();
		
		System.out.println("After Adding 100cm^3 air:");
		balloon.addAir(100);
		
		System.out.printf("Radius: %.3f\n", balloon.getRadius());
		System.out.printf("Volume: %.3f\n", balloon.getVolume());
		System.out.printf("Surface Area: %.3f\n", balloon.getSurfaceArea());

		System.out.println();
		
		System.out.println("After Adding 100cm^3 air:");
		balloon.addAir(100);
		
		System.out.printf("Radius: %.3f\n", balloon.getRadius());
		System.out.printf("Volume: %.3f\n", balloon.getVolume());
		System.out.printf("Surface Area: %.3f\n", balloon.getSurfaceArea());

		System.out.println();
		
		System.out.println("After Adding 100cm^3 air:");
		balloon.addAir(100);
		
		System.out.printf("Radius: %.3f\n", balloon.getRadius());
		System.out.printf("Volume: %.3f\n", balloon.getVolume());
		System.out.printf("Surface Area: %.3f\n", balloon.getSurfaceArea());
	}
}
