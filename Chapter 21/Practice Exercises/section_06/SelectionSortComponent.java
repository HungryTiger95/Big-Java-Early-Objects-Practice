package section_06;

import java.awt.Graphics;
import javax.swing.JComponent;

public class SelectionSortComponent extends JComponent
{
	private SelectionSorter sorter;
	
	/**
	 * Constructs the component
	 */
	public SelectionSortComponent()
	{
		int[] values = ArrayUtil.randomIntArray(90, 300);
		sorter = new SelectionSorter(values, this);
	}
	
	public void paintComponent(Graphics g)
	{
		sorter.draw(g);
	}
	
	/**
	 * Starts a new animation thread
	 */
	public void startAnimation()
	{
		class AnimationRunnable implements Runnable
		{
			public void run()
			{
				try
				{
					sorter.sort();
				}
				catch(InterruptedException e) {}
			}
		}
		
		Runnable r = new AnimationRunnable();
		Thread t = new Thread(r);
		t.start();
	}
}
