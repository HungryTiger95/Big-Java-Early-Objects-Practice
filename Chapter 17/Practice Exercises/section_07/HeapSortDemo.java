package section_07;

import java.util.Arrays;

public class HeapSortDemo
{
	public static void main(String[] args)
	{
		int[] a = ArrayUtil.randomIntArray(20, 100);
		System.out.println(Arrays.toString(a));
		
		HeapSorter.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
