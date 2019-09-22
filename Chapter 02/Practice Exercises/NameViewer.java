import javax.swing.JFrame;

public class NameViewer
{
	public static void main (String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(300, 400);
		frame.setTitle("Name Viewer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NameComponent name = new NameComponent();
		
		frame.add(name);
		frame.setVisible(true);
	}
}
