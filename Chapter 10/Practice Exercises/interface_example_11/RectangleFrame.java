package interface_example_11;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;

/** 	 	 	 	 	 	
   This frame contains a moving rectangle.
*/
public class RectangleFrame extends JFrame
{
   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 400;

   private RectangleComponent scene;

   class MousePressListener implements MouseListener
   {  
      public void mousePressed(MouseEvent event)
      {  
         int x = event.getX();
         int y = event.getY();
         scene.moveRectangleTo(x, y);
      }

      // Do-nothing methods
      public void mouseReleased(MouseEvent event) {}
      public void mouseClicked(MouseEvent event) {}
      public void mouseEntered(MouseEvent event) {}
      public void mouseExited(MouseEvent event) {}
   }

   class KeyStrokeListener implements KeyListener
   {
      public void keyPressed(KeyEvent event) 
      {
         String key = KeyStroke.getKeyStrokeForEvent(event).toString().replace("pressed ", "");
         final int dx = 2;
         final int dy = 2;
         
         if (key.equals("S"))
         {
            scene.moveRectangleBy(0, dy);
         }
         else if (key.equals("W"))
         {
            scene.moveRectangleBy(0, -dy);            
         }
         else if (key.equals("A"))
         {
            scene.moveRectangleBy(-dx, 0);            
         }
         else if (key.equals("D"))
         {
            scene.moveRectangleBy(dx, 0);            
         }
         
         //System.out.println("Pressed: " + event.getKeyChar());
      }
      
      public void keyTyped(KeyEvent event)
      {
    	  
      }
      public void keyReleased(KeyEvent event)
      {
    	  
      }
   }
         
   public RectangleFrame()
   {
      scene = new RectangleComponent();
      add(scene);

      MouseListener listener = new MousePressListener();
      scene.addMouseListener(listener);

      scene.addKeyListener(new KeyStrokeListener());
      scene.setFocusable(true);

      setSize(FRAME_WIDTH, FRAME_HEIGHT);
   }
} 
