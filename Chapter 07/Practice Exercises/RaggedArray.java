
/**
 * 2D arrays with variable row lengths
 * 
 * @author Mayuresh
 *
 */
public class RaggedArray
{
	public static void main(String[] args)
	{
		int[][] b = new int[8][];
		
		// allocate each row separately
		for(int i = 0; i < b.length; i++)
		{
			b[i] = new int[i + 1];
		}
		
		// Initialize the array
		int count = 0;
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b[i].length; j++)
			{
				b[i][j] = count++;
			}
		}
		
		// Prints the Array
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < b[i].length; j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
}
