package oPerator;

public class Arithmeticop {

	public static void main(String[] args) {
		OPer op=new OPer();
		op.add(20,30);
		op.sub(40,30);
		op.mult(20,30);
		op.div(30,3);

	}

}
class OPer
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	void mult(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	void div(int a,int b)
	{
		int c=a/b;
		System.out.println(c);
	}
}