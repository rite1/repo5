package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedreaderWriter {

	public static void main(String[] args) throws IOException {
		
		
		filerw f=new filerw();
		f.writeFile();
	//	f.readFile();
		
		
	}

}
class filerw
{
	String	d="C://Users//ritzz//Desktop//New folder/new3.txt";
	public void writeFile() throws IOException
	{
	
	BufferedWriter bw=new BufferedWriter(new FileWriter(d));
	try {
		bw.write("THis is uffered writer file(output)");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Writes Successfully");
	//bw.close();
	}
	
	/*public void readFile()
	{
		try {
			BufferedReader br=new BufferedReader(new FileReader(d));
			int b=0;
			while((b=br.read())!=-1)
			{
				char c=(char)b;
				System.out.println(c);
				
				
			}
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}*/
}