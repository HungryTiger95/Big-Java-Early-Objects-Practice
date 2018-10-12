package project_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import project_1.RecordReader;

/**
 * Write a program that reads a file in the same format as babynames.txt and prints all names that are both boy and
 * girl names
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
	   //ArrayList<String> sameNames = new ArrayList<String>();
	   
	   try(Scanner in = new Scanner(new File("src\\project_2\\babynames.txt")))
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
	   
	   try(PrintWriter out = new PrintWriter("src\\project_2\\similarnames.txt"))
	   {
		   for(int i = 0; i < boyNames.size(); i++)
		   {
			   for(int j = 0; j < girlNames.size(); j++)
			   {
				   if(boyNames.get(i).equals(girlNames.get(j)))
				   {
					   out.println(boyNames.get(i));
				   }
			   }
		   }
	   }
   }
}	
