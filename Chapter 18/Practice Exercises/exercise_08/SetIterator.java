package exercise_08;

public interface SetIterator<E>
{
	boolean hasNext();
	
	E next();
	
	void remove();
}
