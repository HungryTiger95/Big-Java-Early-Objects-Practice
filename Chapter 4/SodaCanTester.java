
public class SodaCanTester
{
	public static void main(String[] args)
	{
		SodaCan can = new SodaCan(10, 4);
		
		System.out.printf("SodaCan Volume: %.2f\n", can.getVolume());
		System.out.printf("SodaCan Surface Area: %.2f\n", can.getSurfaceArea());
	}
}
