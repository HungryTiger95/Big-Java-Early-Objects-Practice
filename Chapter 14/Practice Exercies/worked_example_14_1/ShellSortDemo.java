package worked_example_14_1;

import java.util.Arrays;

public class ShellSortDemo
{
	public static void main(String[] args)
	{
		int[] a = ArrayUtil.randomIntArray(20, 100);
		System.out.println(Arrays.toString(a));
		
		ShellSorter.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
