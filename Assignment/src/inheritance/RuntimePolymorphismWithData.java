package inheritance;

public class RuntimePolymorphismWithData {

	public static void main(String[] args) {
		
		CC c=new CC();
		c.PrintC();
	}

}
class AA
{
	int a=20;
	void PrintA()
	{
		System.out.println("classAA "+a);
	}
}
class BB extends AA
{
	int a=30;
	void PrintB()
	{
		System.out.println("classBB "+super.a);
	}
}
class CC extends BB
{
	int a=50;
	void PrintC()
	{
		
		System.out.println("classCC "+super.a);
	}
}
