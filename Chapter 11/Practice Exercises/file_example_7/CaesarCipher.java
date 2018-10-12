package file_example_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   This program encrypts a file using the Caesar cipher.
   
   Command Line Arguments:
   
   You can invoke the program from the command line. When you use this method, you must of course type the name of the program,
   but you can also type in additional information that the program can use. These additional strings are called command line arguments.
   It is customary to interpret strings starting with a hyphen as program options.
   
   Should you support command line arguments for your programs, or should you prompt users, perhaps with a graphical user
   interface? For casual and infrequent prompt users, an interactive user interface is a better choice. For a frequent user,
   a command line interface has a major advantage; it is easy to automate. If you need to process hundreds of files every day,
   you could spend all your time typing file names into file chooser dialog boxes. However, by using batch files or shell
   scripts, you can automatically call a program many times with different command line arguments.
   
   Your program receives its command line arguments in the args paramter of the main method:
   
   		public static void main(String[] args)
   		
   When using the command prompt, if the file is in a package, then you must be in the folder
   holding the package. For example, make yourself to this place in the directory:
   
   		C:\Users\Mayuresh\Documents\Programming Stuff\Languages\Java\Eclipse\Workspaces\Practice\Chapter 11 Practice Exercises\src
   		
   Then, compile the java program by:
   
   		javac <package name>.<class name>.java
   		
   Then, run the program using:
   
   		java <package name>.<class name> [flag] [args]
   		
   If the arguments are files and the files are located in the same package type this for the file argument:
   
   		<package name>/<file name>
   
   
   For example, to run this class on my computer I would place myself in this directory:
   
   		C:\Users\Mayuresh\Documents\Programming Stuff\Languages\Java\Eclipse\Workspaces\Practice\Chapter 11 Practice Exercises\src
   		
   Then type:
   
   		javac file_example_7\CaesarCipher.java to compile the program
   		java file_example_7.CaesarCipher -d file_example_7\encrypt.txt file_example_7\decrypt.txt
   		
   		
   
*/
public class CaesarCipher
{  
   public static void main(String[] args) throws FileNotFoundException
   {  
      final int DEFAULT_KEY = 3;
      int key = DEFAULT_KEY;
      
      String inFile = "";
      String outFile = "";
      
      int files = 0; // Number of command line arguments that are files

      for (int i = 0; i < args.length; i++)
      {  
         String arg = args[i];
         
         if (arg.charAt(0) == '-')
         {  
            // It is a command line option
            char option = arg.charAt(1);
            
            if (option == 'd')
            {
            	key = -key;
            }
            else if(option == 'k')
            {
            	key = Integer.parseInt(args[i].substring(2));
            }
            else
            {
            	usage(); return;
            }
         }
         else
         {  
            // It is a file name
            files++;
            
            if (files == 1)
            {
            	inFile = arg;
            }
            else if (files == 2)
            {
            	outFile = arg;
            }
         }
      }
      
      if (files != 2)
      { 
    	  usage(); return;
    	  
      }

      Scanner in = new Scanner(new File(inFile));
      in.useDelimiter(""); // Process individual characters
      PrintWriter out = new PrintWriter(outFile);

      while (in.hasNext())
      {
         char from = in.next().charAt(0);
         char to = encrypt(from, key);
         out.print(to);
      }
      
      in.close();
      out.close();               
   }   

   /**
      Encrypts upper- and lowercase characters by shifting them
      according to a key.
      @param ch the letter to be encrypted
      @param key the encryption key
      @return the encrypted letter      
   */
   public static char encrypt(char ch, int key)
   {
      int base = 0;
      
      if ('A' <= ch && ch <= 'Z')
      {
    	  base = 'A';
      }
      else if ('a' <= ch && ch <= 'z')
      {
    	  base = 'a';
    	  
      }
      else // Not a letter
      {
    	  return ch;
    	  
      }
      
      int offset = ch - base + key;
      final int LETTERS = 26; // Number of letters in the Roman alphabet
     
      if (offset > LETTERS)
      {
    	  offset = offset - LETTERS;
      }
      else if (offset < 0)
      {
    	  offset = offset + LETTERS;
      }
      
      return (char) (base + offset);
   }

   /**
      Prints a message describing proper usage.
   */
   public static void usage()
   {  
      System.out.println("Usage: java CaesarCipher [-dk] infile outfile");
   }
}
