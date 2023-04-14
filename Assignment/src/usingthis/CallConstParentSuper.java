package usingthis;

public class CallConstParentSuper {

	public static void main(String[] args) {
		Gosling g=new Gosling();
		//James j=new James();

	}

}
class James
{
	James()
	{
		System.out.println("This is James constructor");
	}
}
class Gosling extends James
{
	Gosling()
	{
		super();
		System.out.println("This is gosling constructor");
	}
}