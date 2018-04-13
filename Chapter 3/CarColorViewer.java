import javax.swing.JFrame;

public class CarColorViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(400, 400);
		frame.setTitle("Cars and Car Colors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CarColorComponent component = new CarColorComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}
