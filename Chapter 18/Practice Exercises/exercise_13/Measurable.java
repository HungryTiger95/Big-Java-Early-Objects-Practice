package exercise_13;

/**
 * Make the Measurer interface from Chapter 10 into a generic class. Provide a static method T max(T[] value, Measurer<T> meas).
 * 
 * @author Mayuresh
 *
 * @param <E> the type of element
 */
public interface Measurable<E>
{
	double getMeasure(E element);
}
