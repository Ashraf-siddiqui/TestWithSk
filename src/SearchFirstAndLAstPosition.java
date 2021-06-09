import java.util.Arrays;

public class SearchFirstAndLAstPosition {

	
	 public static int[] searchRange(int[] nums, int target) {
	        
	        
	        int a[]=new int[]{-1,-1};
	        int i=0,j=nums.length-1;
	        while(i<j)
	        {
	            if(nums[i]==target)
	            {
	               a[0] =i;
	            }
	            else{++i;}
	            if(nums[j]==target)
	            {
	                a[1] =j;
	            }
	        
	            else
	            {
	            --j;
	            }
	        
	        
	        
	        if(a[0]!=-1 && a[1]!=-1)
	        {
	        	
	        	return a;
	        }
	        
	        
	        
	        
	        }
	        
	        return a;
	        
	        
	        
	    }
	
	
	
	public static void main(String[] args) {
		
		int a[]=new int[] {5,7,7,8,8,10};
		
		System.out.println("array---->"+Arrays.toString(SearchFirstAndLAstPosition.searchRange(a,8)));
		
	}
}
