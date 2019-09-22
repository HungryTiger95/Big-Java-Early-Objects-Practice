import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

public class SequenceTester
{
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		
		Sequence seq1 = new Sequence(5);
		Sequence seq2 = new Sequence(5);
		Sequence seq3 = new Sequence(5);
		Sequence seq4 = new Sequence(5);
		Sequence seq5 = new Sequence(6);
		
		for(int i = 0; i < seq1.getSize(); i++)
		{
			seq1.set(i, i);
			seq2.set(i, i);
			seq3.set(i, i * i);
			seq4.set(i, i * 2);
			seq5.set(i, ((i * 3) + (i + 8) - (8 * i)));
		}
		
		System.out.println("=============================\nTesting Constructor and Set + Print Method\n=============================\n");
		System.out.print("Sequence 1: [");
		seq1.print();
		System.out.print("]\n");
		
		System.out.print("Sequence 2: [");
		seq2.print();
		System.out.print("]\n");
		
		System.out.print("Sequence 3: [");
		seq3.print();
		System.out.print("]\n");
		
		System.out.print("Sequence 4: [");
		seq4.print();
		System.out.print("]\n");
		
		System.out.print("Sequence 5: [");
		seq5.print();
		System.out.print("]\n");
		
		System.out.println("=============================\nTesting Equals Method\n=============================\n");
		System.out.println("Sequence 1 + 2 equal?: " + seq1.equals(seq2));
		System.out.println("Sequence 1 + 3 equal?: " + seq1.equals(seq3));
		System.out.println("Sequence 1 + 4 equal?: " + seq1.equals(seq4));
		System.out.println("Sequence 1 + 5 equal?: " + seq1.equals(seq5));
		
		System.out.println("Sequence 2 + 3 equal?: " + seq2.equals(seq3));
		System.out.println("Sequence 2 + 4 equal?: " + seq2.equals(seq4));
		System.out.println("Sequence 2 + 5 equal?: " + seq2.equals(seq5));
		
		System.out.println("Sequence 3 + 4 equal?: " + seq3.equals(seq4));
		System.out.println("Sequence 3 + 5 equal?: " + seq3.equals(seq5));
		
		System.out.println();
		
		System.out.println("=============================\nTesting removeDuplicate Method\n=============================\n");
		Sequence seq6 = new Sequence(10);
		seq6.set(0, 1);
		seq6.set(1, 2);
		seq6.set(2, 7);
		seq6.set(3, 4);
		seq6.set(4, 5);
		seq6.set(5, 5);
		seq6.set(6, 3);
		seq6.set(7, 4);
		seq6.set(8, 5);
		seq6.set(9, 2);
		
		System.out.println("Original Array: ");
		seq6.print();
		System.out.println();
		
		System.out.println("Sorted Array");
		Arrays.sort(seq6.getValues());
		seq6.print();
		System.out.println();
		
		System.out.println("Removing Duplicates...");
		seq6.removeDuplicate();
		seq6.print();
		System.out.println();
		
		System.out.println("\n");
		
		Sequence seq7 = new Sequence(7);
		seq7.set(0, 1);
		seq7.set(1, 2);
		seq7.set(2, 3);
		seq7.set(3, 4);
		seq7.set(4, 5);
		seq7.set(5, 3);
		seq7.set(6, 7);
		
		System.out.println("Original Array: ");
		seq7.print();
		System.out.println();
		
		System.out.println("Sorted Array");
		Arrays.sort(seq7.getValues());
		seq7.print();
		System.out.println();
		
		System.out.println("Removing Duplicates...");
		seq7.removeDuplicate();
		seq7.print();
		System.out.println();
		
		System.out.println("=============================\nTesting sameValues Method\n=============================\n");
		seq6.print();
		System.out.println();
		seq7.print();
		System.out.println();
		System.out.println("Checking if Same Numbers...");
		System.out.println(seq6.sameValues(seq7));
		
		System.out.println();
		
		System.out.println("=============================\nTesting isPermutation Method\n=============================\n");
		Sequence seq8 = new Sequence(9);
		seq8.set(0, 1);
		seq8.set(1, 4);
		seq8.set(2, 9);
		seq8.set(3, 16);
		seq8.set(4, 9);
		seq8.set(5, 7);
		seq8.set(6, 4);
		seq8.set(7, 9);
		seq8.set(8, 11);
		
		Sequence seq9 = new Sequence(9);
		seq9.set(0, 11);
		seq9.set(1, 1);
		seq9.set(2, 4);
		seq9.set(3, 9);
		seq9.set(4, 16);
		seq9.set(5, 9);
		seq9.set(6, 7);
		seq9.set(7, 4);
		seq9.set(8, 9);
		
		seq8.print();
		System.out.println();
		
		seq9.print();
		System.out.println();
		
		System.out.println("Are the two sequences permutations of each other?..." + seq8.isPermutation(seq9));
		System.out.println("\n");
		
		System.out.println("=============================\nTesting Appending Method\n=============================\n");
		System.out.println("Sequence 1: ");
		seq3.print();
		System.out.println();
		
		System.out.println("Sequence 2: ");
		seq5.print();
		System.out.println("\n");
		
		System.out.println("Appending Seq1 and Seq2...");
		seq3.append(seq5).print();
		System.out.println("\n");
		
		System.out.println("=============================\nTesting Merging Method\n=============================\n");
		System.out.println("Sequence 1: ");
		seq3.print();
		System.out.println();
		
		System.out.println("Sequence 2: ");
		seq5.print();
		System.out.println();
		
		System.out.println("Sequence 3: ");
		seq4.print();
		System.out.println("\n");
		
		System.out.println("Merging Seq1 and Seq2...");
		seq3.alternateMerge(seq5).print();
		System.out.println();
		System.out.println("Merging Seq2 and Seq1...");
		seq5.alternateMerge(seq3).print();
		System.out.println();
		System.out.println("Merging Seq1 and Seq3...");
		seq3.alternateMerge(seq4).print();
		System.out.println();
		System.out.println("Merging Seq3 and Seq1...");
		seq4.alternateMerge(seq3).print();
		System.out.println();
		System.out.println("Merging Seq2 and Seq3...");
		seq5.alternateMerge(seq4).print();
		System.out.println();
		System.out.println("Merging Seq3 and Seq2...");
		seq4.alternateMerge(seq5).print();
		System.out.println("\n");
		
		System.out.println("=============================\nTesting sortedMerge Method\n=============================\n");
		System.out.println("Sequence 1: ");
		seq2.print();
		System.out.println();
		
		System.out.println("Sequence 2: ");
		seq6.print();
		System.out.println();
		
		System.out.println("Sequence 3: ");
		seq9.print();
		System.out.println("\n");
		
		System.out.println("Merging and Sorting Seq1 and Se2");
		seq2.sortedMerge(seq6).print();
		System.out.println();
		System.out.println("Merging and Sorting Seq1 and Se3");
		seq2.sortedMerge(seq9).print();
		System.out.println();
		System.out.println("Merging and Sorting Seq2 and Se3");
		seq6.sortedMerge(seq9).print();
		System.out.println("\n");
		
		long endTime = System.currentTimeMillis();
		NumberFormat formatter = new DecimalFormat("#0.00");
		long totalTime = (endTime - startTime);
		System.out.println("\nElapsed Program Time: " + formatter.format(totalTime) + " milliseconds");
	}
}
