package JavaLogicalProgramsEY;

import java.util.Arrays;

public class ReversingUsingSwapping {

	
	

	static void ReverseUsingSwap(String str)
	{
		char arr[]=str.toCharArray();
		
		for(int i=0,j=arr.length-1;i!=j;i++,--j)
		{
			
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		ReverseUsingSwap("Reverse");
	}
	
	
}
