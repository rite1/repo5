package Abstract;

public class AstractClasswithAbsAndNonAbsMethod {

	public static void main(String[] args) {
		
		b2 ob=new b2();
		ob.get();
	}

}
abstract class b1
{
	abstract public void get();
	public void display()
	{
		System.out.println("this is  abstract class b1 non abstract method ");
	}
}
class b2 extends b1
{
	public void get()
	{
		System.out.println("this is get method");
	}
}