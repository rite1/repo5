package inheritance;


class Inheritance
{
	public static void main(String args[])
	{
		A oa=new A();
		oa.addA();
		oa.subA();
		oa.display();
		B ob=new B();
		ob.addB();
		ob.subB();
		ob.display();
		C oc=new C();
		oc.addc();
		oc.subc();
		oc.display();
	}
	
	
}
class A
{
	int a=20;
	int b=10;
	void addA()
	{
		
		System.out.println("this is class A Method name AddA"+"\n");
		System.out.println("Addition of a and b : "+(a+b)+"\n"); 
	}
	
	void subA()
	{
		System.out.println("this is class A Method name SubA"+"\n");
		System.out.println("Substraction of a and b : "+(a-b)+"\n"); 
	}
	void display()
	{
		System.out.println("this is class A Display Method "+"\n");
	}
	
}
class B extends A
{
	int c=20;
	int d=10;
	void addB()
	{
		
		System.out.println("this is class B Method name addB"+"\n");
		System.out.println("Addition of c and d : "+(c+d)); 
	}
	
	void subB()
	{
		System.out.println("this is class B Method name SubB"+"\n");
		System.out.println("Substraction of a and b : "+(c-d)+"\n"); 
	}
	void display()
	{
		super.display();
		System.out.println("this is class B Display Method "+"\n");
	}
}
class C extends B
{
	int e=10;
	int f=20;
	void addc()
	{
		
		System.out.println("this is class C Method name addc"+"\n");
		System.out.println("Addition of f and e : "+(f+e)+"\n"); 
	}
	
	void subc()
	{
		System.out.println("this is class C Method name Subc"+"\n");
		System.out.println("Substraction of f and e : "+(f-e)+"\n"); 
	}
	void display()
	{
		super.display();
		System.out.println("this is class C Display Method "+"\n");
	}
}
	
