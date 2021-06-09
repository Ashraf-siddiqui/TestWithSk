package practise;

import java.util.Arrays;

public class PeakElementInAnArray {

	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public static int peakElement(int[] arr,int n)
    {
       //add code here.
       int position=-1;
     //  Arrays.sort(arr);
       for(int i=1;i<=arr.length-2;i++)
       {
    	   if(Integer.max(arr[i-1],arr[i])==arr[i])
    	   {
           if(Integer.max(arr[i],arr[i+1])==arr[i])
           {
             return  position=i;
           }
           
           
    	   }
       }
       return position;
       
    }
public static void main(String[] args) {
	int arr[]=new int[] {213 ,509, 129, 898, 766,198, 131};
	
	System.out.println(peakElement(arr, 1));
}
}
