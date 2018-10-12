package file_example_3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 * This program shows the first nine lines of a file that was
 * selected with a file chooser.
 * 
 * Explanation:
 * 
 * In a program with a graphical user interface, you will want to use a file dialog box whenever the users
 * need to pick a file. The JFileChooser class implements a file dialog box for the Swing user-interface
 * toolkit. The JFileChoooser class has many options to fine-tune the display of the dialog box, but in its
 * most basic form it is quite simple: Construct a file chooser object; then call the showOpenDialog or
 * showSaveDialog method. Both methods show the same dialog box, but the button for selecting a file is
 * labeled "Open" or "Save", depending on which method you call. The showOpenDialog and showSaveDialog
 * methods return either JFileChooser.APPROVE_OPTION, if the user has chosen a file, or
 * JFileChooser.CANCEL_OPTION, if the user canceled the selection. If a file was chose, then you call the
 * getSelectedFile method to obtain a File object that describes the file.
 * 
 * @author Mayuresh
 *
 */
public class FileChooserDemo 
{
   public static void main(String[] args) throws IOException
   {
      JFileChooser chooser = new JFileChooser();
      Scanner in = null;
      
      if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
      {
         File selectedFile = chooser.getSelectedFile();
         
         in = new Scanner(selectedFile);
         int lineNumber = 1;
         final int MAX_LINES = 9;
         
         while (in.hasNextLine() && lineNumber <= MAX_LINES)
         {
            String line = in.nextLine();
            System.out.println(lineNumber + ": " + line);
            lineNumber++;
         }
         
         if (in.hasNextLine())
         {
        	 System.out.println("...");
         }
      }
   }
}
