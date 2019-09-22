import java.util.Scanner;

/**
 * P4.2
 * 
 * Use the algorithm to find the date that Easter Sunday falls on a certain year.
 * 
 * @author Mayuresh
 *
 */

public class EasterSunday
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a, b, c, d, e, g, h, j, k, m, r, n, p, y;
		
		System.out.print("Please Enter a Year: ");
		y = in.nextInt();
		
		in.close();
		
		a = y % 19;
		b = y / 100;
		c = y % 100;
		d = b / 4;
		e = b % 4;
		g = (8 * b + 13) / 25;
		h = (19 * a + b - d - g + 15) % 30;
		j = c / 4;
		k = c % 4;
		m = (a + 11 * h) / 319;
		r = (2 * e + 2 * j - k - h + m + 32) % 7;
		n = (h - m + r + 90) / 25;
		p = (h - m + r + n + 19) % 32;
		
		System.out.printf("%s = %d", "a", a);
		System.out.printf("%16s = %d", "h", h);
		System.out.printf("%14s = %d", "n", n);
		
		System.out.println();
		
		System.out.printf("%s = %d, %s = %d", "b", b, "c", c);
		System.out.printf("%7s = %d, %s = %d", "j", j, "k", k);
		System.out.printf("%8s = %d", "p", p);
		
		System.out.println();
		
		System.out.printf("%s = %d, %s = %d", "d", d, "e", e);
		System.out.printf("%9s = %d", "m", m);
		
		System.out.println();
		
		System.out.printf("%s = %d", "g", g);
		System.out.printf("%16s = %d", "r", r);
	}
}
