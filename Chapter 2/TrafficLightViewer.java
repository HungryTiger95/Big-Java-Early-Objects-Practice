import javax.swing.JFrame;

public class TrafficLightViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setTitle("Traffic Light");
		frame.setSize(500, 400);
		frame.setLocation(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TrafficLightComponent component = new TrafficLightComponent();
		frame.add(component);
		
		frame.setVisible(true);
		
		
	}
}
