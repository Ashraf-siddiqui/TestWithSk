package dSA_Sheet_questions;

import java.util.Arrays;

public class MovingAlltheNegativeElementsToASideInAnArray {

	public static void Move(int []arr)
	{
	
	
	int start=0,end=arr.length-1;
	
	while(start<end)
	{
		
		if(arr[start]<0)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		//	start++;
			end--;
		}
		else {start++;}
		
		
		
	}
	System.out.println("Array--->"+Arrays.toString(arr));	
	
	}
	
	public static void main(String[] args) {
		
		int arr[]=new int[] {0,-1,2,1,-5,-3,8,-4};
		MovingAlltheNegativeElementsToASideInAnArray.Move(arr);
	}
	
	
}
