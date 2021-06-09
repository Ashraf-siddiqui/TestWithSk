package dSA_Sheet_questions;

public class KadanesAlgorithm_Using_Liner {

	
	public static int kadane(int arr[])
	{
		int Max_Sum=Integer.MIN_VALUE;
		int current_Sum=arr[0];
		
		for(int i=1;i<=arr.length-1;i++)
		{
			current_Sum=Math.max(arr[i-1]+arr[i], arr[i]);
			Max_Sum=Math.max(current_Sum, Max_Sum);
			System.out.println("-----------> "+Max_Sum);
		}
		
		return Max_Sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  public static void main(String[] args) {
		int arr[]=new int[] {-2,1,-3,4,-1,2,1,-5,4};
		  
		System.out.println(kadane(arr));  
		  
		  
		  
		  
		  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
