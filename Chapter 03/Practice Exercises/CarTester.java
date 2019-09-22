
public class CarTester
{
	public static void main(String[] args)
	{
		Car myHybrid = new Car(50);		// 50 mpg
		myHybrid.addGas(20);			// Tank 20 gallons
		myHybrid.drive(500);			// Drive 100 miles
		
		System.out.println(myHybrid.getGasInTank());
		System.out.println("Expected: 10");
	}

}
