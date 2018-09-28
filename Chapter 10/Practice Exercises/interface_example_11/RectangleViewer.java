package interface_example_11;

import javax.swing.JFrame;

/**
   This program displays a rectangle that can be moved with the mouse or keyboard.
*/
public class RectangleViewer
{  
   public static void main(String[] args)
   {        
      JFrame frame = new RectangleFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
} 
