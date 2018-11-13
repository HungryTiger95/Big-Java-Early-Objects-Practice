package special_topic_14_3;

/**
 * Quicksort is a commonly used algorithm that has the advantage over merge sort
 * that no temporary arrays are required to sort and merge the partial results.
 * 
 * The quicksort algorithm, like merge sort, is based on the strategy of divide
 * and conquer. To sort a range a[from] ... a[to] of the array a, first rearrange
 * the elements in the range so that no element in the range a[from] ... a[to] of
 * the array a, first rearrange the elements in the range so that no element in
 * the range a[from] ... a[p] is larger than any element in the range a[p + 1] ... a[to].
 * 
 * In the next step, sort each partition, by recursively applying the same algorithm
 * to the two partitions. That sorts the entire range because the largest element
 * in the first partition is at most as large as the smallest element in the
 * second partition.
 * 
 * Let us return to the problem of partitioning a range. Pick an element from the
 * range and call it the pivot. There are several variations of the quicksort
 * algorithm.
 * 
 * Now form two regions a[from] ... a[i], consisting of values at most as large as
 * the pivot and a[j] ... a[to], consisting of values at least as large as the pivot.
 * The region a[i + 1] ... a[j - 1] consists of values that haven't been analyzed yet.
 * At the beginning, both the left and right areas are empty; that is, i = from - 1
 * and j = to + 1. Then keep incrementing i while a[i] < pivot and keep decrementing
 * j while a[j] > pivot. Now swap the values in positions i and j, increasing both
 * areas once more. Keep going while i < j.
 * 
 * On average, the quicksort algorithm is an O(n log(n)) algorithm. There is just
 * one unfortunate aspect to the quicksort algorithm. Its worst-case run-time behavior
 * is O(n^2). Moreover, if the pivot element is chosen as the first element of the
 * region, that worst-case behavior occurs when the input set is already sorted. By
 * selecting the pivot element more clearly, we can make it extremely unlikely for
 * the worst-case behavior to occur. The sort method in the Arrays class uses a
 * quicksort algorithm.
 * 
 * Another improvement that is commonly made in practice is to switch to insertion
 * sort when the array is short, because the total number of operations using insertion
 * sort is lower for short arrays.
 * 
 * @author Mayuresh
 *
 */
public class QuickSort
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	/**
	 * Sorts and array, using quick sort.
	 * @param array the array to sort
	 */
	public static void sort(int[] array)
	{
		sort(array, 0, array.length - 1);
	}
	
	/**
	 * Sorts a portion of an array, using quick sort
	 * @param array the array to sort
	 * @param from the first index of the portion to be sorted
	 * @param to the last index of the portion to be sorted
	 */
	public static void sort(int[] array, int from, int to)
	{
		if(from >= to)
		{
			return;
		}
		
		int p = partition(array, from, to);
		
		sort(array, from, p);
		sort(array, p + 1, to);
	}
	
	/**
	 * Partitions a portion of an array
	 * @param array the array to partition
	 * @param from the first index of the portion to be partitioned
	 * @param to the last index of the portion to be partitioned
	 * @return the last index of the first partition
	 */
	public static int partition(int[] array, int from, int to)
	{
		int pivot = array[from];
		int i = from - 1;
		int j = to + 1;
		
		while(i < j)
		{
			i++;
			while(array[i] < pivot)
			{
				i++;
			}
			
			j--;
			while(array[j] > pivot)
			{
				j--;
			}
			
			if(i < j)
			{
				ArrayUtil.swap(array, i, j);
			}
		}
		
		return j;
	}
}
