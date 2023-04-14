package array;

public class CopyArray {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5};
		int br[]=new int[5];
		br=ar.clone();
		for(int i=0;i<5;i++)
		{
			System.out.println(+br[i]);
		}
		
		
	}

}
