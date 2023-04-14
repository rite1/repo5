package fileIO;



	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;

	public class FileWrite {

		public static void main(String[] args)throws IOException  {
			String path="C://Users//ritzz//Desktop//New folder/jala.txt";
			
			FileWriter file=new FileWriter(path);
			file.write("hey this is me");
			//file.flush();
			file.close();

		}

	}


