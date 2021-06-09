package practise;

public class MaxSubArrayOfSizeTwo {

	public static int MaxSum(int []arr)
	{ int max=Integer.MIN_VALUE;
		for(int i=0,j=1;i<=arr.length-2;i++,j++)
		{
			
			max=Integer.max(max, arr[i]+arr[j]);	
		}
		
		return max;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		int []arr=new int[] {-1,2,3,1,-3,2};
		
		System.out.println(MaxSum(arr));
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
