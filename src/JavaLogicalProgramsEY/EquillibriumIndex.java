package JavaLogicalProgramsEY;

public class EquillibriumIndex {

	
	public static int findPoint(int []arr)
	{
		
		
		for(int i=1;i<arr.length-1;i++)
		{int prevsum=0,forwardsum=0;
			
				//backwardtrack
				
				for(int z=i-1;z>=0;z--)
				{
					prevsum=arr[z]+prevsum;
				}
				
				
				
		
			
			
				for(int z=i+1;z<arr.length;z++)
				{
					forwardsum=arr[z]+forwardsum;
				}
				
				
				
		
			
			if(prevsum==forwardsum)
			{
				System.out.println("index is "+i+" element is "+arr[i]);
				return i;
			}
			
			
		}
		
		
		
		
		
		return 0;
	}	
	
	public static void main(String[] args) {
		int array[] = {9, 3, 7, 6, 8, 1, 10};  
		findPoint(array);
		
		
	}
	
	
}
