package section_04;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * This program demonstrates a map that maps names to colors. If you use
 * a HashMap, then the output would not be sorted, but if you use a 
 * TreeMap, it will be sorted by key.
 * 
 * @author Mayuresh
 *
 */
public class MapDemo
{
	public static void main(String[] args)
	{
		Map<String, Color> favoriteColors = new HashMap<String, Color>();
		favoriteColors.put("Mayuresh", Color.blue);
		favoriteColors.put("Payal", Color.green);
		favoriteColors.put("Aarohi", Color.black);
		favoriteColors.put("Raj", Color.black);
		favoriteColors.put("Freddie", Color.green);
		
		// Print all keys and values in the map
		Set<String> keySet = favoriteColors.keySet();
		for(String key : keySet)
		{
			Color value = favoriteColors.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
