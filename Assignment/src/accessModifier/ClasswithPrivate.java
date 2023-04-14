package accessModifier;

public class ClasswithPrivate {
	private int a=10;
	public void show()
	{
		System.out.println("This is private method");
		System.out.println("The Value of a:"+a);
		
	}

	public static void main(String[] args) {
			ClasswithPrivate pr=new ClasswithPrivate();
			System.out.println(pr.a);
		pr.show();
			Clr obj=new Clr();
			obj.get();
	}

}
class Clr extends ClasswithPrivate
{
	public void get()
	{
	
	show();
	}
}