package MethodOverloading;



class SameParaDiffRet
{
	public static void main(String[] args) {
		
		Same2 s=new Same2();
		s.same(true);
		  s.same(10);
	
				}
}
class Same2
{
	int same(int a)
    {
		System.out.println("same with int return type");
		return 0;
   	 
   	 
    }
	boolean same(boolean b)
	{
		System.out.println("same with boolean return type");
		return true;
	}
	
}