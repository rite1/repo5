package fileIO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bufferedoutputstream {

	public static void main(String[] args) throws IOException {
		try {
				FileOutputStream f=new FileOutputStream("C://Users//ritzz//Desktop//New folder//sample.txt");
				BufferedOutputStream bf=new BufferedOutputStream(f);
				String s="this is sample";
				byte b[]=s.getBytes();
				bf.write(b);
				bf.close();
				f.close();
		
		
			} 
		
		
		
		
		catch (FileNotFoundException e) {


			e.printStackTrace();
		}
		

	}

}
