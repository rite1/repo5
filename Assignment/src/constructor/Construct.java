package constructor;

public class Construct {

	public static void main(String[] args) {
		cons ob=new cons();
		cons ob1=new cons(10);
		cons ob2=new cons(10,20);
		

	}

}
class cons
{
	cons()
	{
		System.out.println("This is Default Constructor");
	}
	
	cons(int x)
	{
		System.out.println("This is single parametrized Constructor");
	}
	cons(int x,int y)
	{
		System.out.println("This is multiple parametrized Constructor");
	}
	
}
