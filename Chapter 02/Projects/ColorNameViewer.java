import javax.swing.JFrame;

public class ColorNameViewer
{
	public static void main(String[] args)
	{
		JFrame  frame = new JFrame();
		
		frame.setSize(800, 800);
		frame.setTitle("12 Color Names");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ColorNameComponent colName = new ColorNameComponent();
		frame.add(colName);
		
		frame.setVisible(true);
	}
}
