package Interface;

public class InterfaceWithFieldAndMethods {

	public static void main(String[] args) {
		
		interf i=new Method();
		i.add();
	}

}
interface interf
{
	public int a=10;
	public int b=20;
	public void add() ;
		
	
}
class Method implements interf
{
	public void add()
	{
		System.out.println(a+b);
	}
	
}