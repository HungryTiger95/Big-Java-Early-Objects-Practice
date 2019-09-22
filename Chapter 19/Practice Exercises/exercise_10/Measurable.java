package exercise_10;

/**
 * An interface that defines a method to measure an object
 * @author Mayuresh
 *
 * @param <E> the type of element
 */
public interface Measurable<E>
{
	double getMeasure(E element);
}
