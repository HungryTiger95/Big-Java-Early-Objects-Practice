import javax.swing.JFrame;

public class LineDistanceViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Line Segment Testing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LineDistanceComponent component = new LineDistanceComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}
