import javax.swing.JFrame;

public class StarViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(400, 400);
		frame.setTitle("House");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		StarComponent component = new StarComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}
