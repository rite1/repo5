package fileIO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class BufferInputStream {

	public static void main(String[] args) {
		FileInputStream fi = null;
		try {
			fi=new FileInputStream("C://Users//ritzz//Desktop//New folder//jala.txt");
			BufferedInputStream bf=new BufferedInputStream(fi);
			int b=0;
			while((b=bf.read())!=-1)
			{
				char c=(char)b;
				System.out.print(c);
			}
			bf.close();
			
		} 
		
		
		catch (Exception e) {
			
				e.printStackTrace();
						}
		
	}

}
