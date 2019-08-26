package exercise_09;

public class Pair<K, V>
{
	// Instance Variables
	private K key;
	private V value;
	
	// Constructors
	/**
	 * Constructs a key-value pair
	 * @param key the key
	 * @param value the value
	 */
	public Pair(K key, V value)
	{
		this.key = key;
		this.value = value;
	}
	
	// Methods
	/**
	 * Gets the key
	 * @return the key
	 */
	public K getKey()
	{
		return this.key;
	}
	
	/**
	 * Gets the value
	 * @return the value
	 */
	public V getValue()
	{
		return this.value;
	}
	
	@Override
	public int hashCode()
	{
		// Ternary operator acts as an if-else statement
		int h1 = this.key == null ? 0 : this.key.hashCode();
		int h2 = this.value == null ? 0 : this.value.hashCode();
		return 31 * h1 + h2;
		
//		Could also calculate like this:
//		return (31 * (this.key == null ? 0 : this.key.hashCode()) +
//				(this.value == null ? 0 : this.value.hashCode()));
	}
	
	@Override
	public boolean equals(Object other)
	{
		// If the other object is null, return false
		if(other == null) { return false; }
		// If the other objects class is not the same as this class, return false
		if(getClass() != other.getClass()) { return false; }
		
		// We check if the key/value pair is in the right order through the hashcode calculation
		
		// Construct a Pair object by casting Pair on the passed object
		@SuppressWarnings("unchecked")
		Pair<K, V> otherPair = (Pair<K, V>) other;
		
		// Compare the two objects through their hashcodes
		if(this.key.hashCode() == otherPair.getKey().hashCode() &&
				this.value.hashCode() == otherPair.getValue().hashCode())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
