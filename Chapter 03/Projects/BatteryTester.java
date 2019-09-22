
public class BatteryTester
{
	public static void main(String[] args)
	{
		Battery aa = new Battery(2500);
		
		aa.drain(300);
		aa.drain(500);
		
		System.out.println(aa.getRemainingCapacity());
		System.out.println("Expected: 1700");
		
		// Recharge the battery
		aa.charge();
		System.out.println(aa.getRemainingCapacity());
		System.out.println("Expected: 2500");
	}
}
