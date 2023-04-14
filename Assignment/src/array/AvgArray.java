package array;

public class AvgArray {

	public static void main(String[] args) {
		int av[]= {1,2,3,4,5};
		int temp=av[0];
		int avg=0;
		for(int i=0;i<av.length;i++)
		{
			avg=avg+av[i];
			
		}
		int res=avg/5;
		System.out.print("Average of array : "+res);
	}

}
