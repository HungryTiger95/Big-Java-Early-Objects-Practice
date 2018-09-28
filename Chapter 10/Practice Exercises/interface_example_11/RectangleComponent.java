package interface_example_11;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 * Keyboard events:
 * 
 * If you program a game, you may want to process keystrokes, such as the arrow keys.
 * Add a key listener to the component on which you draw the game scene. The KeyListener
 * interface has three methods. As with a mouse listener, you are most interested in key
 * press events, and you can leave the other two methods empty. The call
 * KeyStroke.getKeyStrokeForEvent(event).toString() turns the event object into a text
 * description of the key, such as "pressed LEFT". In the next line, we eliminate the
 * "pressed " prefix. The remainder is a string such as "LEFT" or "A" that describes the
 * key that was pressed. You can find a list of all key names in the API documentation of
 * the KeyStroke class. As always, remember to attach the listener to the event source:
 * 
 * 			KeyListener listener = new MyKeyListener();
 * 			scene.addKeyListener(listener);
 * 
 * In order to receive key events, your component must call scene.setFocusable(true);
 * 
 * @author Mayuresh
 *
 */
public class RectangleComponent extends JComponent
{
   private static final int BOX_X = 100;
   private static final int BOX_Y = 100;
   private static final int BOX_WIDTH = 20;
   private static final int BOX_HEIGHT = 30;

   private Rectangle box;

   public RectangleComponent()
   {  
      // The rectangle that the paintComponent method draws 
      box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);         
   }

   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      g2.draw(box);
   }

   /**
      Moves the rectangle to the given location.
      @param x the x-position of the new location
      @param y the y-position of the new location
   */
   public void moveRectangleTo(int x, int y)
   {
      box.setLocation(x, y);
      repaint();      
   }

   /**
      Moves the rectangle by a given amount. 
      @param dx the amount to move in the x-direction 
      @param dy the amount to move in the y-direction 
   */
   public void moveRectangleBy(int dx, int dy)
   {
      box.translate(dx, dy);
      repaint();      
   }
}
