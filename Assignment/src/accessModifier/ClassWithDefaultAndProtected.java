package accessModifier;

public class ClassWithDefaultAndProtected {

	public static void main(String[] args) {
				
		One o1=new One();
		o1.Defa();

	}

}
class One
{
	String b="Visibility";
	protected int p=70;
	void Defa()
	{
		System.out.println("This is class one Function with Default Identifier");
	}
	protected void Prot()
	{
		System.out.println("This is class one Function with Protected Identifier");
	}
}
