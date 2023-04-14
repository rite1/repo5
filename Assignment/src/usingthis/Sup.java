package usingthis;

public class Sup  {
	
	public static void main(String[] args) { 
		
		n s=new n();
		s.disp();
		
		

	}

}
class m 
{
	public int a=10;
	
	public void show(int a)
	{
		
		System.out.println(a);
	}
	
}
class n extends m
{
	public void disp()
	{
		super.show(30);
		
		
	}
	
}
