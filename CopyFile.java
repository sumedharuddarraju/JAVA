/*Copy one file to another  */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyFile
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream r =new FileInputStream("Read.txt");
		FileOutputStream w =new FileOutputStream("Write.txt");
		int i;
		while((i=r.read())!=-1)
		{
			w.write((char)i);
			System.out.print((char)i);
		}
	}
}