package JavaLogicalProgramsEY;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	
	static void RemoveDuplicates(int arr[])
	{
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					
					for(int k=j;k<size-1;k++)
					{
						arr[k]=arr[k+1];
						
					}
					
					--j;
					--size;
					
				}
			}
			
			
			
			
		}
		for(int i=0;i<size;i++)
		{
		System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		
		
		int arr[]= {10,20,10,30,30,30,40,20,10};
		RemoveDuplicates(arr);
		
		
	}
}
