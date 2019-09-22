package exercise_11;

/**
 * Write a generic static method print that prints the elements of any object that implements the
 * Iterable<E> interface. The elements should be separated by commas. Place your method into an
 * appropriate utility class.
 * 
 * @author Mayuresh
 *
 */
public class IterablePrinter
{
	/**
	 * Prints all the elements that are in an object that implements the
	 * Iterable interface
	 * @param <T> The type of the elements in the iterableObject
	 * @param <E> The type of the iterableObject
	 * @param iterableObject the iterable object
	 * @return comma separated list of all the elements
	 */
	public static <T, E extends Iterable<T>> String print(E iterableObject)
	{
		StringBuilder s = new StringBuilder();
		for(T element : iterableObject)
		{
			s.append(element.toString() + ", ");
		}
		
		return s.substring(0, s.length() - 2).trim();
	}
}
