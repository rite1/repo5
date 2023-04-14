package basics;

public class LocalGlobalVariable {

	public static void main(String[] args) {
		
		lkl l1=new lkl();
		l1.Local();
		l1.global();
	}

}
class lkl
{
	int l=10;
	public void Local()
	{
		int l=60;
		System.out.println("Local and value of l: "+l);
		
	}
	void global()
	{
		System.out.println("global and value of l: "+l);
	}
	
}