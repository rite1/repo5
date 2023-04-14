package usingthis;

public class ArguementCons {

	public static void main(String[] args) {
		bb1 b=new bb1();
		

	}

}
class bb1
{
	bb1()
	{
		this(10);
		System.out.println("This is bb1 constructor");
	}
	bb1(int x)
	{
		
		System.out.println("This is parameter bb1 constructor");
	}
}
	
