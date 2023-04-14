package array;

public class EvenAndOddInArray {

	public static void main(String[] args) {
		int brr[]= {1,2,3,5,6,7,8,33,45,6,7};
		int Even = 0;
		int Odd = 0;
		for(int i=0;i<brr.length;i++)
		{
			System.out.print(brr[i]+",");
		}
		System.out.print("\n");
		for(int i=0;i<brr.length;i++)
		{
			if(brr[i]%2==0)
			{
				Even=Even+1;
				
			}
			else
			{
				Odd=Odd+1;
			}
			
		}
		System.out.println("Total Even  no : "+Even);
		System.out.print("Total Odd  no : "+Odd);
	}

}
