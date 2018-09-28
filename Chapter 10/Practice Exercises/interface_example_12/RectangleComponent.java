package interface_example_12;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 * Event Adapters:
 * 
 * When we implement an event listener such as MouseListener or KeyListener, we need to define
 * each of the methods in the interfaces. However, many programs only use a few of the declared
 * methods in the interface. To avoid the tedium of having to define each method in the interface,
 * we can use Event Adapter classes. These classes extend the interfaces so that each method is
 * defined as do nothing methods which you can override in your class by extending the Event Adapter
 * class. This way, each method is technically defined as do nothing, so you only have to define
 * the methods that you want to use. There are classes MouseAdapter and KeyAdapter.
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
