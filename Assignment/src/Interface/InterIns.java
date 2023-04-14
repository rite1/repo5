package Interface;

public class InterIns {

	public static void main(String[] args) {
		phone p1=new kepler();
		p1.m2();
		
		
	}

}
interface phone
{
	public void m2();
	
	
}
class kepler implements phone
{
	public void m2()
	{
		System.out.println("this is method m2");
	}
}