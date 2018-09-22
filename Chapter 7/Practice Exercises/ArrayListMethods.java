import java.util.ArrayList;

public class ArrayListMethods
{
	// Instance Variables
	ArrayList<Integer> list = new ArrayList<>();
	
	// Constructors
	public ArrayListMethods(ArrayList<Integer> list)
	{
		this.list = list;
	}
	// Methods
	public void add(int num)
	{
		this.list.add(num);
	}
	
	public void remove(int index)
	{
		this.list.remove(index);
	}
	
	
}
