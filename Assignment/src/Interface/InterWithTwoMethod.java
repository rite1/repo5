package Interface;

public class InterWithTwoMethod {

	public static void main(String[] args) {
		nmti it=new nmti();
		it.m2();
		
		
		
		
	}

}
interface InMethod
{
	public void m1();
	public void m2();
	
	
	
}
abstract class itmn implements InMethod
{
	
	 public void m1()
	 {
		System.out.println("This is m1");
	 }
}
class nmti extends itmn
{
	
	
	public void m2()
	{
		System.out.println("This is m2");
		nmti nm=new nmti();
		nm.m1();
	}
	
	
}