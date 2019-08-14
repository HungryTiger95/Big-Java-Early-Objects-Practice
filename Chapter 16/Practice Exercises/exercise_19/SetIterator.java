package exercise_19;

public interface SetIterator
{
	boolean hasNext();
	
	Object next();
	
	void remove();
	
	String getPosition();
	
	String getPrevious();
}
