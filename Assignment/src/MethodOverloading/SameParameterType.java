package MethodOverloading;

public class SameParameterType {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.getData('Z', 20);
		Parent b1=new Parent();
		
		

}
}
class Parent
{
	 public void getData(char y,int x)
	{
		 System.out.println("value of x is:"+x);
			System.out.println("value of x is:"+y);
		
		
		
	}
}
class Child
{
	public void getData(char y,int x)
	{
		System.out.print("multi parameter \n");
		
		System.out.println("value of x is:"+x);
		System.out.println("value of y is:"+y);
		
		
		
	}
}
