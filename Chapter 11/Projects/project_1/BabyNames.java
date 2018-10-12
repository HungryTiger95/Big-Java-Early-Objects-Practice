package project_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program that reads in babynames.txt and produces two files, boynames.txt and girlnames.txt, separating
 * the data for the boys and girls.
 * 
 * @author Mayuresh
 *
 */
public class BabyNames
{
   public static final double LIMIT = 1000;

   public static void main(String[] args) throws FileNotFoundException
   {
	  ArrayList<String> boyNames = new ArrayList<String>();
	  ArrayList<String> girlNames = new ArrayList<String>();
	  
      try(Scanner in = new Scanner(new File("src\\project_1\\babynames.txt")))
      {
    	  RecordReader boys = new RecordReader(LIMIT);
    	  RecordReader girls = new RecordReader(LIMIT);
    	  
    	  while (boys.hasMore() || girls.hasMore())
    	  {
    		  int rank = in.nextInt();
    		  
    		  boyNames.add(boys.processName(in));
    		  girlNames.add(girls.processName(in));
    	  }
      }
      
      try(PrintWriter out = new PrintWriter("src\\project_1\\boyNames.txt"))
      {
    	  for(int i = 0; i < boyNames.size(); i++)
    	  {
    		  out.println(boyNames.get(i));
    	  }
      }
      
      try(PrintWriter out = new PrintWriter("src\\project_1\\girlNames.txt"))
      {
    	  for(int i = 0; i < girlNames.size(); i++)
    	  {
    		  out.println(girlNames.get(i));
    	  }
      }
   }
}	
