package project3;

/**
 * Add a method hasNext to the Sequence interface of Worked Example 10.1 that returns false if
 * the sequence has no more values. Implement a class MySequence producing a sequence of real
 * data of your choice, such as populations of cities or countries, temperatures, or stock prices.
 * Obtain the data from the Internet and reformat the values so that they are placed into an array.
 * Return one value at a time in the next method, until you reach the end of the data. Your SequenceDemo
 * class should display the distribution of the last digits of all sequence values.
 * 
 * @author Mayuresh
 *
 */
public interface Sequence
{
	int next();
	
	boolean hasNext();
}
