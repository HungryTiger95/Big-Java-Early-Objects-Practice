package section_06;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class SelectionSortViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		final int FRAME_WIDTH = 300;
		final int FRAME_HEIGHT = 400;
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final SelectionSortComponent component = new SelectionSortComponent();
		frame.add(component, BorderLayout.CENTER);
		
		frame.setVisible(true);
		component.startAnimation();
	}
}
