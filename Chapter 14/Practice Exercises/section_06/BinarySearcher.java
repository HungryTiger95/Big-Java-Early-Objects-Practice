package section_06;

/**
 * Consider the following sorted array a. The data set is:
 * 
 * 		1 4 5 8 9 12 17 20 24 32
 * 
 * We would like to see whether the value 15 is in the data set. Let's narrow our search
 * by finding whether the value is in the first or second half of the array. The last value
 * in the first half of the data set, a[4] is 9, which is smaller than the value we are looking
 * for. Hence, we should look in the second half of the array for a match, that is, in the
 * sequence:
 * 
 * 		12 17 20 24 32
 * 
 * The middle element of this sequence is 20; hence, the value must be located in the
 * sequence:
 * 
 * 		12 17
 * 
 * The last value of the first half of this very short sequence is 12, which is smaller then
 * the value that we are searching, so we must look in the second half:
 * 
 * 		17
 * 
 * This search process is called a binary search, because we cut the size of the search in
 * half in each step. That cutting in half works only because we know that the sequence
 * of values is sorted.
 * 
 * This example is a recursive version of the binary search.
 * 
 * Now let's determine the number of visits to array elements required to carry out a
 * binary search. Because we look at the middle element, which counts as one visit, and
 * then search either the left or the right subarray, we have
 * 
 * 		T(n) = T(n / 2) + 1
 * 
 * Using the same equation,
 * 
 * 		T(n / 2) = T(n / 4) + 1
 * 
 * By plugging this result into the original equation, we get
 * 
 * 		T(n) = T(n / 4) + 4
 * 
 * That generalizes to
 * 
 * 		T(n) = T(n / 2^k) + k
 * 
 * As in the analysis of merge sort, we make the simplifying assumption that n is a power
 * of 2, n = 2^m, where m = log2(n). Then we obtain
 * 
 * 		T(n) = 1 + log2(n)
 * 
 * Therefore, the binary search is an O(log(n)) algorithm.
 * 
 * Because a binary search is so much faster than a linear search is it worthwhile to
 * sort an array first and then use a binary search? It depends. If you search the array
 * only once, then it is more efficient to pay for an O(n) linear search than for an
 * O(n log(n)) sort and an O(log(n)) binary search. But if you will be making many
 * searches in the same array, then sorting it is definitely worthwhile.
 * 
 * @author Mayuresh
 *
 */
public class BinarySearcher
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	/**
	 * Finds a value in a range of a sorted array, using the binary search algorithm
	 * @param array the array to search through
	 * @param low the low index of the range
	 * @param high the high index of the range
	 * @param valueToFind the value to find
	 * @return the index at which the value occurs, or -1 if it does not occur in the array
	 */
	public static int search(int[] array, int low, int high, int valueToFind)
	{
		if(low <= high)
		{
			int mid = (low + high) / 2;
			
			if(array[mid] == valueToFind)
			{
				return mid;
			}
			else if(array[mid] < valueToFind)
			{
				return search(array, mid + 1, high, valueToFind);
			}
			else
			{
				return search(array, low, mid - 1, valueToFind);
			}
		}
		else
		{
			return -1;
		}
	}
}
