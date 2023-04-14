package constructor;

public class ConstReturn {

	public static void main(String[] args) {
		
		consre ob1=new consre();
		
		

	}

}
class consre
{
	int consre()
	{
		System.out.println("This is int Constructor");
		return 10;
	}
	
	 String consre(String x)
	{
		System.out.println("This is single parametrized Constructor");
		return "hi";
	}
	
	
}
