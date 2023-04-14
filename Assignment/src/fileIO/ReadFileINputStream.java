package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileINputStream {

	public static void main(String[] args) {
		FileInputStream fi = null;
		try {
			fi=new FileInputStream("C://Users//ritzz//Desktop//New folder//hii.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int b=0;
		while(!(b==-1))
		{
			char c=(char)b;
			System.out.print(c);
			try {
				b=fi.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
