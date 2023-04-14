package Exceptions;

public class ExceptThrows {

	public static void main(String[] args)throws InterruptedException
	{
		
		B ob=new B();
		ob.except();

	}
	
}
class B{
	public static void except()throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Throws to calling method");
		
	}

}
