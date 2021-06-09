package practise;

import java.util.HashMap;
import java.util.HashSet;

public class CheckSubArrayWithKthSumExistOrNotUsingHashMap {
	
	
	
	public static boolean HasDuplicate(int arr[],int sum)
	{
		HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(hash.containsKey(sum-arr[i]))
			{
				System.out.println("Found Pair at position "+hash.get(sum-arr[i])+" and " +i);
			}
			
			hash.put(arr[i], i);
		}
		
		
		return false;
	}
	
	
	
	
	public static void main(String[] args) {
		
		int []arr=new int[] {8, 7, 2, 5, 3, 1};
		
		
		System.out.println(HasDuplicate(arr, 10));
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	

}
