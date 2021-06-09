package dSA_Sheet_questions;

import java.util.Arrays;

public class SortO_1And_2_Without_Any_Sorting_Algo {

	
	public  static void SOrt(int []arr)
	{
		int start=0,last=arr.length-1;
		int mid =(start+last)/2;
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr[start]=0;
				start++;
			}
			else if(arr[i]==1)
			{
				arr[mid]=1;
				mid--;
			}
			else
			{
				arr[last]=2;
				last--;
			}
			
			
		}
		
		
		System.out.println("Desired Array---> "+Arrays.toString(arr));
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		int []arr=new int[] {0,1,0,2,2,0,1,1,1,2,0,0,1,1};
		
		SortO_1And_2_Without_Any_Sorting_Algo.SOrt(arr);
		
		
	}
	
	
	
	
	
	
	
	
	
}
