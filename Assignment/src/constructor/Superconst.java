package constructor;

public class Superconst {

	public static void main(String[] args) {
		conchild ob=new conchild();
		
		

	}

}
class conssup
{
	conssup()
	{
		System.out.println("This is conssup Default Constructor");
	}
	
	conssup(int x)
	{
		System.out.println("This is conssup parametrized Constructor");
	}
	
	
}
class conchild
{
	conchild()
	{
		conssup obj=new conssup();
		conssup obj1=new conssup(10);
	}
	
	
	
}