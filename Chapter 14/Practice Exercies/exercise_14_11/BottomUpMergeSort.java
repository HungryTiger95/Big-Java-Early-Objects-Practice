package exercise_14_11;

import java.util.Arrays;

/**
 * From: http://www.mathcs.emory.edu/~cheung/Courses/171/Syllabus/7-Sort/merge-sort5.html
 * 
 * Bottom up merge sort works with array sizes of 2^n
 * 
 * @author Mayuresh
 *
 */
public class BottomUpMergeSort
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	private static void merge(int[] a, int iLeft, int iMiddle, int iRight, int[] tmp)
	{
		int i, j, k;

		i = iLeft;
		j = iMiddle;
		k = iLeft;

		while ( i < iMiddle || j < iRight )
		{
			if (i < iMiddle && j < iRight)
			{  
				// Both array have elements
				if(a[i] < a[j])
				{
					tmp[k++] = a[i++];
				}
				else
				{
					tmp[k++] = a[j++];
				}	
			}
			else if(i == iMiddle)
			{
				tmp[k++] = a[j++];     // a is empty
			}
			else if(j == iRight)
			{
				tmp[k++] = a[i++];     // b is empty
			}	
		}
	}
	
	public static void sort(int[] a, int[] tmp)
	{
		int width;

		for (width = 1; width < a.length; width = 2*width)
		{
			// Combine sections of array a of width "width"
			int i;

			for (i = 0; i < a.length; i = i + 2*width)
			{
				int left, middle, right;

				left = i;
				middle = i + width;
				right  = i + 2*width;

				merge(a, left, middle, right, tmp);

			}

			for (i = 0; i < a.length; i++)
			{
				a[i] = tmp[i];
			}
			
			System.out.println("After " + width + "  iter: " + Arrays.toString(a) );
		}
	}
}
