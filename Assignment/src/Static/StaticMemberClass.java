package Static;
class StaticMemberClass
{
	public static void main(String args[])
	{
		
		stat ob=new stat();
		stat.setshow();
		stat.getshow();
		ob.getter();
		ob.setter();
		System.out.println("This is  main method block static variable"+stat.a);
		System.out.println("This is  main method block static variable"+stat.b);
		System.out.println("This is  main method block instance variable"+ob.c);
		System.out.println("This is   main method block instance variable"+ob.d);
	}
	
}
class stat
{
	static int a=10;
	static int b=20;
	int c=10;
	int d=30;
	static void setshow()
	{
		
		stat s=new stat();
		System.out.println("This is setstatic method");
		System.out.println(""+s.c);
		s.setter();
		s.getter();
	}
	static void getshow()
	{
		stat s1=new stat();
		System.out.println("This is getstatic method");
		System.out.println(""+s1.d);
	}
	public void setter()
	{
		getshow();
		setshow();
		System.out.println("This is instance setter method");
		System.out.println("a: "+a);
	}
	public void getter()
	{
		System.out.println("This is instance getter method");
		System.out.println("b: "+b);
	}
	
	
}