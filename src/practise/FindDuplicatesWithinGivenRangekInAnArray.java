package practise;

import java.util.HashSet;

public class FindDuplicatesWithinGivenRangekInAnArray {

	public static void findDuplicatesWithInRange(int []arr,int k)
	{
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(set.contains(arr[i]))
			{
				System.out.println("Duplicate found.");
				if(i<=k)
				{
					
					System.out.println("element "+arr[i]+" repeats at a distance "+i+" which is <="+k);
				}
				else {
					System.out.println("element "+arr[i]+" repeats at a distance "+i+" which is >="+k);	
				}
				return;
			}
			
			set.add(arr[i]);
		}
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		int arr[]=new int[] {5, 6, 5, 2, 4, 6, 9 };
		
		findDuplicatesWithInRange(arr, 4);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
