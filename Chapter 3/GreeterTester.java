
public class GreeterTester
{
	public static void main(String[] args)
	{
		Greeter greet = new Greeter("Mayuresh");
		Greeter greet2 = new Greeter("Mr. Miyagi");
		
		System.out.println(greet2.sayHello());
		System.out.println(greet.sayHello());
		
		System.out.println(greet2.sayGoodbye());
		System.out.println(greet.sayGoodbye());
		
		System.out.println(greet2.refuseHelp());
		System.out.println(greet.refuseHelp());
	}
}
