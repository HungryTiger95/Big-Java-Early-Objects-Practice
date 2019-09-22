
public class BalloonTester
{
	public static void main(String[] args)
	{
		Balloon balloon = new Balloon();
		
		balloon.inflate(4);
		System.out.println("Volume: " + balloon.getVolume());
	}
}
