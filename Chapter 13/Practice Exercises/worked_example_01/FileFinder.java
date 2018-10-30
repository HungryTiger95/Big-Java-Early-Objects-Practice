package worked_example_01;

import java.io.File;

public class FileFinder
{
   private File[] children;

   /**
      Constructs a file finder for a given directory tree.
      @param startingDirectory the starting directory of the tree
   */
   public FileFinder(File startingDirectory)
   {
      this.children = startingDirectory.listFiles();
   }

   /**
      Prints all files whose names end in a given extension.
      @param extension a file extension (such as ".java")
   */
   public void find(String extension)
   {      
      for (File child : children)
      {
         String fileName = child.toString();
         if (child.isDirectory())
         {
            FileFinder finder = new FileFinder(child);
            finder.find(extension);
         }
         else if (fileName.endsWith(extension))
         {
            System.out.println(fileName);
         }
      }
   }
}
