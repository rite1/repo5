package Abstract;
class ChildClassInstCallNonAbsMethod
{
		
	public static void main (String args[])
	{
		
		Newly n1=new Newly();
		n1.call();
		
	}
	
}
abstract class old
{
	abstract void disp();
	public void get() {
		System.out.println("this is old abstract class non abstract method ");
	}
}
class Newly extends old
{
	void call()
	{
		Newly n=new Newly();
		n.get();
	}
	
	public void disp()
	{
		System.out.println("this is parabs abstract method");
	}
	
}