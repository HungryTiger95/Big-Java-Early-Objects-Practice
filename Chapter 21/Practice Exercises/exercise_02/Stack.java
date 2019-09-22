package exercise_02;

public interface Stack<E>
{
	/**
	 * Pushes an element onto the stack
	 * @param element the element
	 */
	void push(E element);
	
	/**
	 * Pops an element from the top of the stack
	 * @return the element that was popped off
	 * @throws InterruptedException
	 */
	E pop() throws InterruptedException;
	
	/**
	 * Tests whether the stack is empty
	 * @return true if the stack is empty
	 */
	boolean isEmpty();
	
	/**
	 * Gets the number of elements on the stack
	 * @return the size
	 */
	int size();
}
