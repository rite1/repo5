package usingthis;


class ThisSupMethod
{
	int x=10;
	public static void main(String args[])
	{
		Usesuper us=new Usesuper();
		us.togetsuper();
		
	}
	
}

class Usethis
{
	

	 int x;

	public void togetthis(int x)
	{
		this.x=x;
		System.out.println("This is togetthis method with value of x:"+this.x);
	}
}
class Usesuper extends Usethis
{
	public void togetsuper()
	{
		super.togetthis(10);
		System.out.println("This is gosling constructor");
	}
}