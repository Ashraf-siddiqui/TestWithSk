package dSA_Sheet_questions;

public class KadanesAlgorithm_Brute_Force_Method {

	
	
	public static int  ReturnKadanesSum(int []arr)
	{
		
		int max_sum=Integer.MIN_VALUE;
		int CurrentSum;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			
			CurrentSum=0;
			for(int j=i;j<=arr.length-1;j++)
			{
				
				CurrentSum=CurrentSum+arr[j];
				
				if(CurrentSum>max_sum)
				{
					max_sum=CurrentSum;
				}
				
				
			}
			
			System.out.println("Current largest--> "+max_sum);
			
		}
		
		return max_sum;
	}
	
	
	
	
	
	public static void main(String[] args) {
		int []arr=new int[] {74, -72, 94, -53, -59, -3, -66, 36, -13, 22, 73, 15, -52, 75};
		
		
		System.out.println(ReturnKadanesSum(arr));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
