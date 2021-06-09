package dSA_Sheet_questions;

public class UnionAndIntersectionOfTheTwoSortedArrays {

	
	public static int [] Union(int []arr,int arr2[])
	{
		int [] Newarr=new int[arr.length+arr2.length];
		
		int place=0;
		for(int i=0;i<arr.length;)
		{
			for(int j=0;j<arr2.length;)
			{
				if(arr[i]>arr2[j])
				{
					Newarr[place]=arr[i];
					place++;
					i++;
				}
				
				else if(arr[i]<arr2[j])
				{
					Newarr[place]=arr[i];
					place++;
					j++;
				}
				else {
					Newarr[place]=arr[i];
					i++;
					j++;
					place++;
				}
				
				
			}
			
		}
		
		
		
		
		
		
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		
		int arr1[]=new int[] {1,2,3,4,5};
		
		int arr2[]=new int[] {1,2,3,4,5,6,7};
		
		
		System.out.println("Array---> "+Union(arr1, arr2));
		
		
		
	}
	
	
	
}
