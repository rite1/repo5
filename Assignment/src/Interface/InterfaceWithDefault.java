package Interface;

public class InterfaceWithDefault {

	public static void main(String[] args) {
		def d1=new metdf();
		d1.show();
		
	}

}
interface def
{
	default void show()
	{
		
	}
	
}
class metdf implements def
{
	
}