package Interface;

public class PrivateInteraface {

	public static void main(String[] args) {
		prv b1=new prv();
		b1.add();

	}

}
class prv
{
	private interface Pri
	{
		public  int a=10;
		public int b=20;
		public void add();
		
	
	}
	class ppv implements Pri 
	{

	
		public void add() {
			System.out.println("Addition is ");
			
		}
		
		
	}
	public void add() {
		// TODO Auto-generated method stub
		
	}
}
