package practise;

import java.util.HashMap;
import java.util.Set;

public class CountDistinctAbsoluteValuesInASortedArray {

	
	
	public static int CountDistinctAbsoluteValues(int []arr)
	{
		HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
		
			if(arr[i]>=0)
			{
				if(!hash.containsValue(arr[i]))
				{
					count++;
					hash.put(i, arr[i]);
				}
				
				
			}
			
			
		}
		
		System.out.println("The total number of distinct absolute values is "+count+" "+hash.values());
		
		return count;
	}
	
	
	public static void main(String[] args) {
		int [] arr=new int[] { -2, -1, 0, 1, 2, 3 };
		
		System.out.println(CountDistinctAbsoluteValues(arr));
	}
	
	
	
	
	
	
	
}
