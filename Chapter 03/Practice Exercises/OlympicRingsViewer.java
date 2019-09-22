import javax.swing.JFrame;

public class OlympicRingsViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(500, 500);
		frame.setTitle("Olympic Rings");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		OlympicRingsComponent component = new OlympicRingsComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}
