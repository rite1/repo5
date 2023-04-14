package Exceptions;

import java.io.File;
import java.io.FileReader;

class FileNotFoundException
{
	public static void main(String args[])
	{
		File f=new File("C://Users//ritzz//Desktop");
		try {
			FileReader fr=new FileReader(f);
		} catch (java.io.FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
}