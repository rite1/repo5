package Abstract;
class ChildClassInstCallAbstractMethod
{
		
	public static void main (String args[])
	{
		childabs c=new childabs();
		c.call();
		
	}
	
}
abstract class Parabs
{
	abstract void show();
}
class childabs extends Parabs
{
	void call()
	{
		childabs ch=new childabs();
		ch.show();
	}
	
	
	public void show()
	{
		System.out.println("this is parabs abstract method");
	}
	
}