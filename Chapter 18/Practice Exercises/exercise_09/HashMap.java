package exercise_09;

import java.util.ArrayList;

public class HashMap<K, V>
{
	// Instance Variables
	private HashSet<Pair<K, V>> set;
	
	// Constructors
	/**
	 * Constructs an empty HashSet object
	 */
	public HashMap()
	{
		this.set = new HashSet<>(10);
	}
	
	// Methods
	/**
	 * Gets the number of mappings
	 * @return the number of mappings
	 */
	public int getSize()
	{
		return this.set.size();
	}
	
	/**
	 * Gets the internal hashset
	 * @return the hasset
	 */
	public HashSet<Pair<K, V>> getSet()
	{
		return this.set;
	}
	
	/**
	 * Checks if the hashmap is empty
	 * @return true if it is empty, otherwise false
	 */
	public boolean isEmpty()
	{
		return this.set.size() == 0;
	}
	
	/**
	 * Checks if the map contains a given key 
	 * @param key the key to check for
	 * @return true if the map contains the key, otherwise false
	 */
	public boolean containsKey(K key)
	{
		for(Pair<K, V> p : set)
		{
			if(p.getKey().equals(key))
			{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Checks if the map contains a given value
	 * @param value the value to check for
	 * @return true if the value is in the mapping
	 */
	public boolean containsValue(V value)
	{
		for(Pair<K, V> p : set)
		{
			if(p.getValue().equals(value))
			{
				return true;
			}
		}
		return true;
	}
	
	/**
	 * Adds a mapping to the hashmap
	 * @param key the key
	 * @param value the value
	 * @return true if the key-value pair is a unique mapping, meaning that it was added, false otherwise
	 */
	public boolean put(K key, V value)
	{
		return set.add(new Pair<>(key, value));
	}
	
	/**
	 * Removes a key-value mapping from the map
	 * @param key the key to remove
	 * @return true if the key-value mapping was removed, otherwise false
	 */
	public boolean remove(K key)
	{
		for(Pair<K, V> p : set)
		{
			if(p.getKey().equals(key))
			{
				return set.remove(p);
			}
		}
		return false;
	}
	
	/**
	 * Gets a key-value pair given the key
	 * @param key the key
	 * @return the key-value pair
	 */
	public Pair<K, V> get(K key)
	{
		for(Pair<K, V> p : set)
		{
			if(p.getKey().equals(key))
			{
				return p;
			}
		}
		return null;
	}
	
	/**
	 * Returns a list of all the keys
	 * @return a list of keys
	 */
	public ArrayList<K> keySet()
	{
		ArrayList<K> keySet = new ArrayList<>();
		for(Pair<K, V> p : set)
		{
			keySet.add(p.getKey());
		}
		return keySet;
	}
	
	/**
	 * Returns a list of all the values
	 * @return a list of values
	 */
	public ArrayList<V> valueSet()
	{
		ArrayList<V> valSet = new ArrayList<>();
		for(Pair<K, V> p : set)
		{
			valSet.add(p.getValue());
		}
		return valSet;
	}
}
