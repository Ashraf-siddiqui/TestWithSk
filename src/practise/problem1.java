package practise;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class problem1 {
	
	//input a string 
	//count the character currency
	//print the max occuring element.
	
	static TreeMap<Character, Integer> countOccurence(String str)
	{
		TreeMap<Character, Integer>map=new TreeMap<Character, Integer>();
		
		char[] arr=str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
			
			
		}
		
		return map;
		
	}
	
	
	
	public static void main(String[] args) {
		
		TreeMap<Character, Integer>map=new TreeMap<Character, Integer>();
		
		
		map=countOccurence("programming");
		int max=Integer.MIN_VALUE;
		map.firstKey();
		for(char i:map.keySet())
		{
			if(map.get(i)>max)
				max=map.get(i);
			
		}
		for(char i:map.keySet())
		{
			if(map.get(i)==max)
			{
				System.out.println("max occuring element is "+i+" occurence is"+map.get(i));
			}
			
		}
		
		
	//	System.out.println("max element is occured "+max );
		
	}

}
