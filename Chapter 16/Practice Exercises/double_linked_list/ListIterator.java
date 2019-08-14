package double_linked_list;

public interface ListIterator
{
	/**
	 * Tests if there is an element after the iterator position.
	 * @return true if there is an element after the iterator position
	 */
	boolean hasNext();
	
	/**
	 * Moves the iterator past the next element
	 * @return the traversed element
	 */
	Object next();
	
	/**
	 * Adds an element before the iterator position and moves the iterator
	 * past the inserted element
	 * @param element the element to add
	 */
	void add(Object element);
	
	/**
	 * Removes the last traversed element. This method may only be called
	 * after a call to hasNext()
	 */
	void remove();
	
	/**
	 * Sets the last traversed element to a different value
	 * @param element the element to set
	 */
	void set(Object element);
	
	/**
	 * Tests if there is an element before the iterator position
	 * @return true if there is an element before the iterator position
	 */
	boolean hasPrevious();
	
	/**
	 * Moves the iterator to the element before the current position
	 * @return the traversed element
	 */
	Object previous();
	
	/**
	 * Returns the current position node.
	 * This method is strictly meant for debugging purposes
	 * @return the current position
	 */
	String getPosition();
	
	/**
	 * Returns the previous position node
	 * This method is strictly meant for debugging purposes
	 * @return the previous position
	 */
	String getPrevious();
}
