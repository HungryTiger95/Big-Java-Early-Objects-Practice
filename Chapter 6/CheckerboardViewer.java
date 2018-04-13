import javax.swing.JFrame;

public class CheckerboardViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(400, 400);
		frame.setTitle("Checkerboard");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		CheckerboardComponent component = new CheckerboardComponent();
		frame.add(component);
	
		frame.setVisible(true);		
	}
}
