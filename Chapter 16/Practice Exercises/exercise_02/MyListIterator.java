package exercise_02;

/**
 * A list iterator allows access to a position in a linked list.
 * This interface contains a subset of the methods of the
 * standard java.util.ListIterator interface. The methods for
 * backwards traversal are not included.
 * 
 * @author Mayuresh
 *
 */
public interface MyListIterator
{
	/**
	 * Moves the iterator past the next element
	 * @return the traversed element
	 */
	Object next();
	
	/**
	 * Tests if there is an element after the iterator position.
	 * @return true if there is an element after the iterator position
	 */
	boolean hasNext();
	
	/**
	 * Adds an element before the iterator position and moves the iterator past the inserted element.
	 * @param element the element to add
	 */
	void add(Object element);
	
	/**
	 * Removes the last traversed element. This method may only be called after a call to the next method.
	 */
	void remove();
	
	/**
	 * Sets the last traversed element to a different value.
	 * @param element the element to set
	 */
	void set(Object element);
}