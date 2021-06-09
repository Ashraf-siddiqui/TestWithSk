package practise;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateINAnArrayUsingSlidingWindow {

	public static ArrayList<Integer> duplicates(int[] arr, int n, int s) {
		//ArrayList<Integer> list = new ArrayList<Integer>();

		 ArrayList<Integer> list=new ArrayList<Integer>(2);
	        // Your code here
	        int currentSum=arr[0];
	        int MaxSum=currentSum;
	        for(int i=0,j=1;j<=arr.length-1;)
	        {
	            if(s>currentSum)
	            {
	                currentSum=currentSum+arr[j];
	                j++;
	            }
	             if(s<currentSum)
	            {
	               currentSum= currentSum-arr[i];
	                i++;
	            }
	            
	             if(s==currentSum){
	                list.add(i);
	                list.add(j-1);
	                Math.max(a, b)
	                return list;
	            }
	            
	        }
	        
	        return list;
	        
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,7,5};
		System.out.println(duplicates(arr, 2,6));

	}

}
