package worked_example_01;

import java.io.File;

public class FileFinder2
{
   public static void main(String[] args)
   {
      File startingDirectory = new File("C:\\Users\\Mayuresh");
      find(startingDirectory, ".java");
   }

   /**
      Prints all files whose names end in a given extension.
      @param aFile a file or directory
      @param extension a file extension (such as ".java")
   */
   public static void find(File aFile, String extension)
   {            
      if (aFile.isDirectory())
      {
         for (File child : aFile.listFiles())
         {
            find(child, extension);
         }
      }
      else
      {
         String fileName = aFile.toString();
         if (fileName.endsWith(extension))
         {
            System.out.println(fileName);
         }
      }
   }
}
