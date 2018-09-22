package project6.testing;

import project6.Cannonball;

public class CannonballTest
{
	public static void main(String[] args)
	{
		Cannonball ball = new Cannonball(0, 0);
		
		System.out.println("Shooting: " + ball.shoot(25, 15.5, .01));
	}
}
