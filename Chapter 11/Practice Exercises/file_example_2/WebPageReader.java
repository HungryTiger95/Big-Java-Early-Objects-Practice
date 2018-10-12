package file_example_2;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebPageReader
{
	public static void main(String[] args) throws IOException
	{
		String address = "http://horstmann.com/index.html";
		
		URL pageLocation = new URL(address);
		
		Scanner in = new Scanner(pageLocation.openStream());
		
		while(in.hasNext())
		{
			String line = in.next();
			
			if(line.contains("Scheyen"))
			{
				int from = line.indexOf("S");
				int to = line.lastIndexOf("n");
				
				System.out.println(line.substring(from, to + 1));
			}
		}
		
		in.close();
	}
}
