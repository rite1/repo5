package Exceptions;

public class ThrowExc {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		if(a<b)
		{
			throw new ArithmeticException("this is user created");
		}
	}

}
