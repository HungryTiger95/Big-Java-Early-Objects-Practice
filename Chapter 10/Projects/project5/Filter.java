package project5;

/**
 * Declare an interface Filter as follows:
 * 
 * 		public interface Filter
 * 		{
 * 			boolean accept(Object x);
 * 		}
 * 
 * Modify the implementation of the Data class from section 10.4 to use both a Measurer and a Filter object.
 * Only objects that the filter accepts should be processed. Demonstrate your modification by processing a
 * collection of bank accounts, filtering out all accounts with balances less than $1,000.
 * 
 * @author Mayuresh
 *
 */
public interface Filter
{
	boolean accept(Object x);
}
