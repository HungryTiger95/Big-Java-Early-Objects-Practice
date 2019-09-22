package section_02;

import javax.swing.JFrame;

public class InvestmentViewer2
{
	public static void main(String[] args)
	{
		JFrame frame = new InvestmentFrame2();
		frame.setTitle("Investment Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
