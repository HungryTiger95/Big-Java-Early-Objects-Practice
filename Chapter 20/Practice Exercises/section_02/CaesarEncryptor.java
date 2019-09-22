package section_02;

import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CaesarEncryptor
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		try
		{
			System.out.print("Input File: ");
			String inFile = in.next();
			
			System.out.print("Output File: ");
			String outFile = in.next();
			
			System.out.print("Encryption Key: ");
			int key = in.nextInt();
			
			InputStream inStream = new FileInputStream(inFile);
			OutputStream outStream = new FileOutputStream(outFile);
			
			CaesarCipher cipher = new CaesarCipher(key);
			cipher.encryptStream(inStream, outStream);
			
			inStream.close();
			outStream.close();
		}
		catch(IOException e)
		{
			System.out.println("Error Processing File: " + e);
		}
		finally
		{
			in.close();
		}
	}
}
