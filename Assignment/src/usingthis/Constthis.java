package usingthis;

public class Constthis {
	

	public static void main(String[] args) {
		
		
		bb ob=new bb(10);
		
		//ob.display();
		
		
				
	}
}	
class bb
{
	bb()
	{
		
		System.out.println("This is bb constructor");
	}
	bb(int x)
	{
		this();
		System.out.println("This is parameter bb constructor");
	}
}
	

