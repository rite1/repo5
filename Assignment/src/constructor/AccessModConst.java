package constructor;

public class AccessModConst {

	public static void main(String[] args) {
		
//cant acces private  conaccess ob1=new conaccess();
		conaccess ob2=new conaccess(10);
		conaccess ob3=new conaccess(10.0);
		conaccess ob4=new conaccess(10,20);
		

	}

}
class conaccess
{
	private conaccess()
	{
		System.out.println("This is private Constructor");
		
	}
	
	 protected conaccess(int x)
	{
		System.out.println("This is protected parametrized Constructor");
		
	}
	 public conaccess(double y)
	 {
		 System.out.println("This is public parametrized Constructor");
	 }
	 conaccess(int x,int y)
	 {
		 System.out.println("This is default parametrized Constructor");
	 }
	
	
}
