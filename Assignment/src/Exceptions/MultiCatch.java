package Exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		
		
		int a=1;
		int b=0;
		
		try {	
		int c=a/b;				//Arithmetic Exception occured
			
			String s=null;
			System.out.println(s.length());//interrupted Exception
		}
		catch(ArithmeticException e)
		{
			System.out.print("ArithmeticException");
		}
		catch(NullPointerException e)
		{
			System.out.print("NullPointerException Exception");
		}


	}

}
