import javax.swing.JFrame;

public class WindowEllipseViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(400, 400);
		frame.setTitle("Ellipse in Entire Window");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		WindowEllipseComponent component = new WindowEllipseComponent();
		
		frame.add(component);
		frame.setVisible(true);
	}

}
