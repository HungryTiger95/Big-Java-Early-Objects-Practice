package section_02;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;

public class CaesarCipher
{
	private int key;
	/**
	 * Constructs a cipher object with a given key
	 * @param aKey the encryption key
	 */
	public CaesarCipher(int aKey)
	{
		key = aKey;
	}
	
	/**
	 * Encrypts the contents of a steam
	 * @param in the input stream
	 * @param out the output steam
	 * @throws IOException if the files cannot be found
	 */
	public void encryptStream(InputStream in, OutputStream out) throws IOException
	{
		boolean done = false;
		while(!done)
		{
			int next = in.read();
			if(next == -1)
			{
				done = true;
			}
			else
			{
				int encrypted = encrypt(next);
				out.write(encrypted);
			}
		}
	}
	
	/**
	 * Encrypts a value
	 * @param b the value to encrypt (between 0 and 255)
	 * @return the encrypted value
	 */
	public int encrypt(int b)
	{
		return (b + key) % 256;
	}
}
