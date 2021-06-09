package dSA_Sheet_questions;

public class DuplicateinanarrayofNPlus1Integers {

	
	
	public static int UsingN(int []arr)
	{
		 for(int i=0;i<=arr.length-1;i++)
	        {
	         
	     int index=Math.abs(arr[i])-1;
	            if(arr[index]<0)
	            {
	                return Math.abs(arr[i]);
	            }
	        arr[index]=-arr[index];
	        
	        
	    }
	       return 0; 
	    }
	
	
	
	
public static int UsingNSquare(int []nums)
{

	  for(int i=0;i<=nums.length-1;i++)
      {
       
          for(int j=i+1;j<=nums.length-1;j++)
          {
              if(nums[i]==nums[j])
              {
                  return nums[i];
              }
          }
          
          
          
      }
      
      return 0;


}
	
	
	public static void main(String[] args) {
		int arr[]=new int[] {1,3,4,2,2};
		
		System.out.println(UsingN(arr));
		
		//System.out.println(UsingNSquare(arr));
		
	}
	
	
	
	
	
}
