package JavaLogicalProgramsEY;

import java.util.Arrays;

public class ArrangeNegativeAndPositive {

	
	
	
	static int[] arrange(int []arr)
	{
		
		//{18,9,0,7,-2,0,-1,9,-6}
	int	size=arr.length;
		for(int i=0;i<size;i++)
		{
			if(arr[i]<0)
			{
				int temp=arr[i];
				arr[i]=arr[size-1];
				arr[size-1]=temp;
				size--;
				i--;
			}
			
			
		}
		
		
		
		
		return arr;
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int arr[]={18,9,0,7,-2,0,-1,9,-6};
		
		System.out.println(Arrays.toString(arrange(arr)));
		
		
	}
}
