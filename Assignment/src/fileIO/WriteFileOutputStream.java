package fileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteFileOutputStream {

	public static void main(String[] args) {
		
		try {
			FileOutputStream ot=new FileOutputStream("C://Users//ritzz//Desktop//New folder//hii.txt");
			byte b[]= {'j','o','h','n','n','y'};
			ot.write(b);
			ot.close();
			
			
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
