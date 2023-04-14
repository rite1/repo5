package fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	
			public static void main(String[] args) throws IOException {
				String path="E:/IMP document/eclipse-workspace/Assignment/config.properties";
				Properties pro=new Properties();
				
					FileInputStream fi = null;
					try {
						fi = new FileInputStream(path);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					pro.load(fi);
					String url=(String) pro.get("url");
					String message=(String) pro.get("msg");
					System.out.println(url);
					System.out.println(message);
					
				
				

			}

		}

	


