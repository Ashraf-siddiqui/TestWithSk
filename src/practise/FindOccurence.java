package practise;

import java.util.HashMap;

public class FindOccurence {
	
	
	//programming
	
	
	public static HashMap<Character, Integer> ReturnOccurnceofAll(String sample)
	{
		char arr[]=sample.toCharArray();
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int val= map.get(arr[i])+1;
				map.put(arr[i],val);
			}
			else {
			map.put(arr[i], 1);
		}}
		
		return map;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(FindOccurence.ReturnOccurnceofAll("ababavabvabvabvab"));
		
		
		//highest occuring letter.
		
		for(Character letter:FindOccurence.ReturnOccurnceofAll("ababavabvabvabvab").keySet())
		{
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
