package MethodOverloading;

public class SamenameSameParaAndType {

	public static void main(String[] args) {
		
		NoSame n=new NoSame();
		n.show('v');
	}

}
class Allsame
{
 public void show(char y)
{
	 
		System.out.println("value of y is:"+y);
	
	
	
}
}
 class NoSame extends Allsame
 {
	 public void show(char z)
	 {
		 super.show(z);;
		 System.out.println("value of x is:"+z);
 	
 	
 	
 	
 	}
 }