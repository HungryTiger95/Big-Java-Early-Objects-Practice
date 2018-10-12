package file_example_8;

/**
   Describes a value that is associated with a country
*/
public class CountryValue
{
   private String country;
   private double value;

   /**
      Constructs a CountryValue from an input line.
      @param line a line containing a country name, followed by a value
   */
   public CountryValue(String line)
   {
      int i = 0; // Locate the start of the first digit
      while (!Character.isDigit(line.charAt(i)))
      {
    	  i++;
      }
      
      int j = i - 1; // Locate the end of the preceding word
      while (Character.isWhitespace(line.charAt(j)))
      { 
    	  j--;
      }
      
      country = line.substring(0, j + 1); // Extract the country name
      value = Double.parseDouble(line.substring(i).trim()); // Extract the value
   }

   /**
      Gets the country name.
      @return the country name
   */
   public String getCountry()
   { 
	   return country;
   }

   /**
      Gets the associated value.
      @return the value associated with the country
   */
   public double getValue()
   {
	   return value;
   }
}
