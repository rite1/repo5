package Interface;

public class Inter {

	public static void main(String[] args) {
		
			itm it=new itm();
			it.m1();
			
	}

}
 interface In
{
	public void m1();
	
	
}
class itm implements In
 {
	 public void m1()
	 {
		 System.out.println("This is m1");
	 }

	
	
 }
