package Exceptions;

public class ArithWithExcepHandle {

	public static void main(String[] args) {
		
		int a=1;
		int b=0;
		
		try {	
		int c=a/b;				//Arithmetic Exception occured
			System.out.print(c);
		}
		catch(Exception e)
		{
			System.out.print("Arithmetic Exception");
		}

	}

}
