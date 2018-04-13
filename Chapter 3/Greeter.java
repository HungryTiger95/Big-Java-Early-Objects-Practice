/**
 * P3.10
 * 
 * This project explores an object-oriented alternative to the "Hello, World" program.
 * Begin with a simple Greeter class that has a single method, sayHello. That method
 * should return a string, not print it. Create two objects of this class and invoke
 * their sayHello methods. Of course, both objects return the same answer.
 * 
 * Enhance the Greeter class so that each object produces a customized greeting. For
 * example, the object constructed as new Greeter("Dave") should say "Hello, Dave".
 * 
 * Add a method sayGoodbye to the Greeter class.
 * 
 * Finally, add a method refuseHelp to the Greeter class. It should return a string
 * such as "I am sorry, Dave. I am afraid I can't do that."
 * 
 * Write a tester program
 * 
 * @author Mayuresh
 *
 */

public class Greeter
{
	// Instance Variables
	private String name;
	private String hello = "Hello";
	private String goodbye = "Goodbye";
	
	// Constructors
	public Greeter(String name)
	{
		this.name = name;
	}
	
	// Methods
	public String sayHello()
	{
		return hello.concat(", " + name + "!");
	}
	
	public String sayGoodbye()
	{
		return goodbye.concat(", " + name + "!");
	}
	
	public String refuseHelp()
	{
		return ("I am sorry, ".concat(name).concat(". I am afraid I can't do that."));
	}
}
