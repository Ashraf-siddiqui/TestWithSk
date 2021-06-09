package JavaLogicalProgramsEY;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class StringOccurence {
	
	
	
	
	static void FindOccurence(String Str)
	{
		
		String[] arr=Str.split(" ");
		
		HashMap<String, Integer>map=new HashMap<String, Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
				
			}
			else {
				
				
				map.put(arr[i], 1);
			}
			
			
		}
		
		System.out.println(map);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		//FindOccurence("Earth is Earth is format of format of Earth");
		
		
		LinkedHashMap<String, String> tree_map;
		tree_map
        = new LinkedHashMap();
		tree_map.put("z", "1");tree_map.put("a", "1");
		
		System.out.println(tree_map);
		
		
		
	}

}
