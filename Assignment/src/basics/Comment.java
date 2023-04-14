package basics;

public class Comment {

	public static void main(String[] args) {
		c2 obj=new c2();
	//	obj.comment();
		obj.multiline();
	}

}
class c2
{
	public void comment()
	{
		System.out.print("This is Single");
	}
	public void multiline()
	{
		/*System.out.print("This is Multi");
		System.out.print("We can give Comments");*/
		System.out.print("This is  Multiline function");
		
	}

}