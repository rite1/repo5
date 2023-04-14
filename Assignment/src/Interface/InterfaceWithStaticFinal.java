package Interface;

public class InterfaceWithStaticFinal {

	public static void main(String[] args) {
		Final f=new Final();
		f.disp();
	}

}

interface Priv
{
	static final int a=10;
	public void disp();
}
class Final implements Priv
{
	public void disp()
	{
		System.out.println("Final Variable of Interface :"+a);
	}
	
}