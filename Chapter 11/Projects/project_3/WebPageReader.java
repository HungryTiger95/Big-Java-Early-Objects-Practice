package project_3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class WebPageReader
{
	public static void main(String[] args) throws IOException
	{
		String address = "https://en.wikipedia.org/wiki/Arithmetic";
		
		URL pageLocation = new URL(address);
		
		Scanner in = new Scanner(pageLocation.openStream());
		PrintWriter out = new PrintWriter("src\\project_3\\output.txt");
		
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			out.println(line);
		}
		
		out.close();
		in.close();
	}
}
