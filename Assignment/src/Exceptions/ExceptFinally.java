package Exceptions;

public class ExceptFinally {

	public static void main(String[] args) {
		
		int a=1;
		int b=0;
		try {
			int c=a/b;				//Arithmetic Exception occured
			System.out.println(c);
	}
	catch(Exception e)
		{
		System.out.println("Exception Raised");
		}
		finally
		{
			System.out.println("this is finally block");
		}
	}

}
