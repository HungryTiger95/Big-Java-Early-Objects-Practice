import javax.swing.JFrame;

public class TargetViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(500, 500);
		frame.setTitle("Target");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TargetComponent component = new TargetComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}
