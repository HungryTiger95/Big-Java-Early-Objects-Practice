package exercise_10;

/**
 * A class that can measure an object that implements Measurable
 * 
 * @author Mayuresh
 *
 * @param <E> any class that extends or implements Measurable
 */
public class Measurer<E extends Measurable<E>> implements Measurable<E>
{
	public double getMeasure(E obj)
	{
		return obj.getMeasure(obj);
	}
}
