package Interface;

public class MultilevelInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Low l=new medium();
		l.get();
		l.set();

	}

}
interface High
{
	public void get();
	
	
	
}
interface Low extends High
{
	public void set();
}
class medium implements Low
{
	
	
	

	
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("get method");	
	}

	
	public void set() {
		// TODO Auto-generated method stub
		System.out.println("set method");
	}
	
}