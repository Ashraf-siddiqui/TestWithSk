import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	
	public ArrayList<Integer> removeduplicates(int []arr )
	{
		 ArrayList<Integer> list=new ArrayList<Integer>();
         
	        for(int i=0;i<arr.length;i++)
	        {
	            
	            
	            int index=(Math.abs(arr[i]))-1;
	            if(arr[index]<0)
	            {
	            	System.out.println("added item "+arr[i]);
	                list.add(Math.abs(arr[i]));
	            }
	            
	            
	            
	            arr[index]=-arr[index];
	            
	            
	            
	        }
	        
	          return list;  
	            
	            
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
 public static void main(String[] args) {

		int[] intArray = new int[] { 1, 2, 3, 1, 3, 6, 6 };

		Solution pg = new Solution();

		;
		
		System.out.println(pg.removeduplicates(intArray));
		
		

	}

}
