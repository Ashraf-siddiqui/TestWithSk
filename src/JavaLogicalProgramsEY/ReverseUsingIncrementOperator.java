package JavaLogicalProgramsEY;

import java.util.Arrays;

public class ReverseUsingIncrementOperator {

	
	
	static void reverse(String str)
	{
		char arr[]=str.toCharArray();
		
		for(int i=0;i<arr.length/2;i++)
		{
			char temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		reverse("Reverse");
		
		
		
		
		
		
		
		

	}

}
