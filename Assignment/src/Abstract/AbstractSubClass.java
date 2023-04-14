package Abstract;

public class AbstractSubClass {

	public static void main(String[] args) {
		AbsChild c=new AbsChild();
				c.absMethod();
	}

}
abstract class AbsParent
{
	abstract void absMethod();
			public void nonAbsMethod() {
				System.out.println("This is  non Abstract Method");
			}
	
	
}
class AbsChild extends AbsParent
{
	
		
	
		
		//return p1;
	
	public void absMethod()
	{
		AbsParent p1=new AbsChild();
		p1.nonAbsMethod();
	}
	
}