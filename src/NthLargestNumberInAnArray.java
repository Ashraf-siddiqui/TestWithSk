import java.util.Arrays;

public class NthLargestNumberInAnArray {

	public static int getNthLargestNumberInAnArray(int []array,int k)
	{
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<array.length-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			
				System.out.println("array after each jth iteration. "+Arrays.toString(array) );
			}
			System.out.println("---------------------------------------------------------------------------------------------------------");
			System.out.println("array after each largest swap to right "+Arrays.toString(array) );
		}
		
		return array[array.length-k];
		
	}
	
	public static void main(String[] args) {
		
		
		
		
		int []array =new int[] {0,2,7,3,7,4,11,8};
		
		
		
		System.out.println("3 rd largest number is "+NthLargestNumberInAnArray.getNthLargestNumberInAnArray(array, array.length));
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
