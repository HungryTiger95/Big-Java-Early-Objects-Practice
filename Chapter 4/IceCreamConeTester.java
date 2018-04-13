
public class IceCreamConeTester
{
	public static void main(String[] args)
	{
		IceCreamCone cone = new IceCreamCone(4, 7);
		
		System.out.printf("Surface area of ice cream cone: %.2f\n", cone.getSurfaceArea());
		System.out.printf("Volume of ice cream cone: %.2f\n", cone.getVolume());
	}
}
