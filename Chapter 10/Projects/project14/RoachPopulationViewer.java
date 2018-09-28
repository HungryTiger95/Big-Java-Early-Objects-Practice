package project14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RoachPopulationViewer
{
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 300;
	
	private static final double INITIAL_POPULATION = 2;
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		JButton button = new JButton("Double Population");
		
		final RoachPopulation pop = new RoachPopulation(INITIAL_POPULATION);
		
		final JLabel label = new JLabel("Balance: " + pop.getPopulation());
		
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(button);
		frame.add(panel);
		
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				pop.doublePopulation();
				label.setText("Balance: " + pop.getPopulation());
			}
		}
		
		ActionListener listener = new AddInterestListener();
		button.addActionListener(listener);
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setLocation(400, 300);
		frame.setTitle("Roach Popultion Doubler");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
