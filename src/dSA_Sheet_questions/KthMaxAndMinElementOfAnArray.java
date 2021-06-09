package dSA_Sheet_questions;

import java.util.Arrays;

//Find the "Kth" max and min element of an array 
public class KthMaxAndMinElementOfAnArray {

	
	public static int KthMaxELement(int []array, int k)
	{
		
		
		for(int i=0;i<=array.length-1;i++)
		{
			for(int j=i+1;j<array.length-i-1;j++)
			{
				if(array[j]<array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(array));
		return array[array.length-1-k];
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int array[]=new int[] {5,6,10,17,2,8};
		
		
		
		System.out.println("Max----> "+KthMaxELement(array, 2));
		
		
		
		
	}
	
	
	
	
	
}
