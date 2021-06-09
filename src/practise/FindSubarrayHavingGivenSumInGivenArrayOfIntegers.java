package practise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindSubarrayHavingGivenSumInGivenArrayOfIntegers {

	// Function to check if subarray with the given sum exists in
	    // the array or not
	    public static boolean findSubarray(int[] A, int sum)
	    {
	        // create an empty set
	        Set<Integer> set = new HashSet<>();
	 
	        // insert number 0 into the set to handle the case when a
	        // subarray with the given sum starts from index 0
	        set.add(0);
	 
	        // keep track of the sum of elements so far
	        int sum_so_far = 0;
	 
	        // traverse the given array
	        for (int i: A)
	        {
	            // update `sum_so_far`
	            sum_so_far += i;
	 
	            // if `sum_so_far - sum` is seen before, we have found
	            // the subarray with sum `sum`
	            if (set.contains(sum_so_far - sum)) {
	                return true;
	            }
	 
	            // otherwise, search the sum of elements so far in the set
	            set.add(sum_so_far);
	        }
	 
	        // we reach here when no subarray exists
	        return false;
	    }
	
	
	
	
	public static void main(String[] args) {
		
		// an integer array
        int[] A = {2, 6, 0, 9, 7, 3, 1, 4, 1, 10  };
        int sum = 15;
 
        if (findSubarray(A, sum)) {
            System.out.print("Subarray with the given sum exists");
        }
        else {
            System.out.print("Subarray with the given sum does not exist");
        }
		
	}
	
	
	
	
	
	
	
	
}
