package exercise_13;

public interface MyQueueIterator
{
	Object next();
	
	boolean hasNext();
	
	void add(Object element);
	
	void remove();
	
	void set(Object element);
}
