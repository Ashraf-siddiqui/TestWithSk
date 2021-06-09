package HasHMap;

import java.util.HashSet;
import java.util.Hashtable;

public class PairWithGivenSum {
	
	//a+b=sum
	//b=sum-a;
	
	static boolean findPair(int []arr,int sum)
	{
		HashSet<Integer> set=new HashSet<Integer>();
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(sum-arr[i]))
			{
				System.out.println("pair found "+(sum-arr[i])+","+arr[i]);
				return true;
			}
			
		set.add(arr[i]);
			
		}
		
		return false;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		int arr[] = { 8, 7, 2, 5, 3, 1 };
	    int sum = 10;
	    
	    findPair(arr,sum);
	    
	}
	
	
	
	
	
	
	
	
	
	

}
