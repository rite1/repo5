package Interface;

public class InterfaceWithSameMethod {

	public static void main(String[] args) {
		it01 it01=new impel();
		it02 it02=new impel();
		it01.multi(10,20);
		it02.multi(50,60);

	}

}
interface it01
{
	public void multi(int a,int b);
}

interface it02
{
	public void multi(int a,int b);
}
class impel implements it01,it02
{
	public void multi(int a,int b)
	{
		
		System.out.println("Multiplication of a and b is"+a*b );
	}
	
}