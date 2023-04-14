package MethodOverloading;

class SameParaDiffType
{
public static void main(String[] args) {
	m1 obj=new m1();
	obj.getData('Z', 20);
	obj.getData(20,64.54);
	
	
	

}
}

class m1
{
 public void getData(char y,int x)
{
	 System.out.println("value of x is:"+x);
		System.out.println("value of y is:"+y);
	
	
	
}
 
 public void getData(int y,double x)
 {
 	
 	System.out.println("value of x is:"+x);
 	System.out.println("value of y is:"+y);
 	
 	
 	
 }
}
