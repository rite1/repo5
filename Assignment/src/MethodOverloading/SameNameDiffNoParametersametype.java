package MethodOverloading;

public class SameNameDiffNoParametersametype {

	public static void main(String[] args) {
		
		Noparadiff obj=new Noparadiff();
			obj.getname(10,20);
			obj.getname(30);
			
			

	}
	}
	class Noparadiff
	{
		 public void getname(int z)
		{
			 
			 System.out.print("single parameter \n");
			 System.out.println("value of z is:"+z);
				
			
			
		}
		 
		 public void getname(int y,int x)
			{
				System.out.print("multi parameter \n");
				
				System.out.println("value of x is:"+x);
				System.out.println("value of y is:"+y);
				
				
				
			}
		
	}

	
	

