package HasHMap;

import java.util.HashMap;
import java.util.HashSet;

public class FindArrayContainsDuplicateOrNot {

	
	
	public static boolean UsingHashMapToFindDuplicate(int arr[])
	{
		HashSet<Integer> set=new HashSet(); 
		HashMap<Integer,Integer> hash=new HashMap<Integer, Integer>();
		hash.get("");
		for(int x:arr)
		{
			if(set.contains(x)) return true;
			set.add(x);
		}
		
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3};
		
		System.out.println(UsingHashMapToFindDuplicate(arr));
		
		
		
		
	}
	
	
	
}
