import java.util.Arrays;

public class BinarySearch {
	
	
	public static int binarysearch(int arr[], int n, int k){
        // code here
        
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==k) return mid;
            
            else if(arr[mid]>k)
            {
                right=mid-1;
            }
            
            else{left=mid+1;}
            
        }
        
        return -1;
        
        
        
        
    }
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int arr[]=new int[] {1, 2, 5, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 22, 23, 24, 26, 28, 31, 33, 34, 36, 37, 38, 39, 40, 42, 43, 44, 46, 47, 48, 49, 50, 54, 55, 59, 60, 62, 63, 64, 65, 66, 68, 69, 70, 71, 72, 73, 75, 77, 79, 80, 82, 86, 87, 88, 92, 93, 94, 96, 97, 98, 99, 100};
	
	System.out.println("answer--->"+BinarySearch.binarysearch(arr, 14, 14));
	
	
	
	
	}

 
	
}
