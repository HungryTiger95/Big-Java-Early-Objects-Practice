import javax.swing.JFrame;

public class FaceViewer {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setSize(500, 500);
		frame.setTitle("Face Viewer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FaceComponent component = new FaceComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}
