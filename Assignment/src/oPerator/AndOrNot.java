package oPerator;


public class AndOrNot {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		if(a<b&&b>30)//truue or false
		{
			System.out.println("And success");
		}
		else
		{
			if(a>b||b>a)
			{
				System.out.println("OR success");
			}
			
			
		}
		if(a!=b)
		{
			System.out.println("not success");
		}
		
		

}
}
