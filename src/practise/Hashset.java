package practise;

import java.util.HashSet;

public class Hashset {

	
	
	public static void  CountDuplicate(String str)
	{
		
		char arr[]=str.toCharArray();
		
		HashSet<Character> set=new HashSet<Character>();
		
		
		for(char c:arr)
		{
			if(!set.add(c)==true)
			{
				System.out.println("element is duplicate "+c);
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Hashset.CountDuplicate("programming");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
