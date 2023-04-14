package fileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereader {

	
		public static void main(String[] args)throws IOException {
			String path="C://Users//ritzz//Desktop//New folder/jala.txt";
			
			FileReader file=new FileReader(path);
			int i=0;
			while((i=file.read())!=-1)
			{
				char c=(char)i;
				System.out.print(c);
			}
			
			file.close();

		}

}


