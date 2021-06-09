
public class SelectionSort {

	
	public static int SeconHighestNumber(int []array)
	{
		int Highest=Integer.MIN_VALUE;
		int Second_Highest_Number=Integer.MIN_VALUE;
		
		
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>Highest)
			{
				Highest=array[i];
				
				if(Second_Highest_Number>Highest)
				{
					
					
				}
				
			}
			
			
			
		}
		
		
		
		return Second_Highest_Number;
	}
	
	public static void main(String[] args) {
		
		int []arr=new int[] {9,11,2,7,9,2};
		
		
		System.out.println("Second Highest Number is "+SeconHighestNumber(arr));
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}
	
}
